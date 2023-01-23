package di_framework.learning;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;

@RetentionAnnotation
@Deprecated
public class AnnotatedClass {


    public static void main(String[] args) {
        AnnotatedClass anAnnotatedClass = new AnnotatedClass();
        Annotation[] annotations = anAnnotatedClass.getClass().getAnnotations();

        System.out.println("Общее кол-во аннотаций времени исполнения(Runtime)");
        System.out.println("1: " + annotations[0]);
        System.out.println("2: " + annotations[1]);
    }
}
