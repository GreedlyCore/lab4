package dependency_injector_framework;

import dependency_injector_framework.learning.AccessingAllClassesInPackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

//TODO сделать его синглетоном или добавить статический фабричный метод
//TODO сделать абстрактную фабрику для внедрения разных зависимостей
public class Injector {

    Object clientObject;

    List<LocationObject> locationObjects;

    private static Injector INSTANCE;

    private Injector() {
    }

    public static Injector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Injector();
        }
        return INSTANCE;
    }

    public ArrayList<LocatedInside> getListClassesAnnotatedWithLocatedInside() {
        AccessingAllClassesInPackage instance = new AccessingAllClassesInPackage();
        ArrayList<LocatedInside> result = new ArrayList<>();
        Set<Class> classes = instance.findAllClassesUsingClassLoader(
                "dependency_injector_framework");

        for (Class<?> clazz : classes) {
            if (Injector.checkAnnotatedWithLocatedInside(clazz)) {
                try {
                    result.add((LocatedInside) clazz.newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    System.out.println("got a problem there");
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    public void injectTo(Object clientObject) {
        Annotation[] annotations = clientObject.getClass().getAnnotations();
        String clientObjectName = null;
        for (Annotation annotation : annotations) {
            if (annotation instanceof Location) {
                clientObjectName = ((Location) annotation).name();
            }
        }
        if (clientObjectName == null || clientObjectName.equals("")) {
            throw new NoSuchElementException("this object don't have requesed annotation" +
                    "or have empty argument. Please add it");
        }


        List<LocatedInside> list = getListClassesAnnotatedWithLocatedInside();
        for (LocatedInside obj : list) {
            if (obj.clientName() == clientObjectName) {
                inject((Object) obj);
            }

        }

    }

    private void inject(Object obj) {
        try {

            Field[] allFields = clientObject.getClass().getDeclaredFields();
            for (Field field : allFields) {
                if (field.getType().equals(obj.getClass())) {
                    field.setAccessible(true);
                    field.set(clientObject, obj);
                }
            }


        } catch (IllegalAccessException e) {
            throw new RuntimeException("Нельзя сюда почему-то попадать...");
        }

    }

    public static boolean checkAnnotatedWithLocatedInside(Class<?> obj) {
        for (Annotation annotation : obj.getAnnotations()) {
            if (annotation instanceof LocatedInside) {
                return true;
            }
        }
        return false;
    }
}
