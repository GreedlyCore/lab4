package dependency_injector_framework.learning;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@JavaFileInfo("2")
public class DemoClass {
    @JavaFileInfo(name = "Greedly Core", value = "1")
    public void printSmth() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<DemoClass> demoClazz = DemoClass.class;
        readAnnotationOn(demoClazz);
        readAnnotationOn(demoClazz.getMethod("printSmth"));
    }

    static void readAnnotationOn(AnnotatedElement el) {

        System.out.println("Searching for an annotation in " + el.getClass().getName());
        Annotation[] annotations = el.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof JavaFileInfo fileInfo) {
                System.out.println("Author: " + fileInfo.name() + "\n" +
                        "Version: " + fileInfo.value());
            }
        }

    }
}
