package di_framework;


import di_framework.learning.AccessingAllClassesInPackage;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Injector {

    Object clientObject;

    List<Location> locations;



    Injector(Object clientObject) {
        this.clientObject = clientObject;
        this.locations = createInstances();
    }



    public Set<Class> getClassesAnnotated() {
        AccessingAllClassesInPackage instance = new AccessingAllClassesInPackage();

        Set<Class> classes = instance.findAllClassesUsingClassLoader(
                "di_framework");

        for (Class<?> clazz : classes) {
            if (!Injector.checkAnnotated(clazz)){
                classes.remove(clazz);
            }
        }
        return classes;

    }
// to easy - want to without additional library
//    public Set<Class<?>> getClassesAnnotated() {
//        return new Reflections("di_framework").getTypesAnnotatedWith(LocatedInside.class);
//
//    }

    public ArrayList<Location> createInstances() {
        Set<Class> set = getClassesAnnotated();
        ArrayList<Location> result = new ArrayList<>();
        for (Class<?> clazz : set) {
            try{
                result.add((Location) clazz.newInstance());
            }catch ( InstantiationException | IllegalAccessException e){
                System.out.println("got a problem there");
                e.printStackTrace();
            }
        }
        return result;
    }

    public void injectAll() {
        for (Location location : locations) {
            inject(location);
        }

    }

    private void inject(Location location) {
        try {

            Field[] allFields = clientObject.getClass().getDeclaredFields();
            for(Field field: allFields){
                if (field.getType().equals(location.getClass())){
                    field.setAccessible(true);
                    field.set(clientObject, location);
                }
            }

//            Field field = clientObject.getClass().
//                    getDeclaredField(fieldName);
//
//            System.out.println(field.getType().getName());
//            field.set(clientObject, location);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Нельзя сюда почему-то попадать...");
        }

    }

    public static  boolean checkAnnotated(Class<?> obj){
        for(Annotation annotation: obj.getAnnotations()){
            if (annotation instanceof LocatedInside){
                return true;
            }
        }
        return false;
    }
}
