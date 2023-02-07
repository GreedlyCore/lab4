package dependency_injector_framework;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Animal {
    public static void main(String[] args) {
        Field[] fields = MyClass.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Annotation declaredAnnotation = fields[i].getAnnotation(Resource.class);
            if(declaredAnnotation!=null){
                System.out.println(fields[i].getName());
            }
        }
    }

    class MyClass{
        int a;
        @Resource
        int v;
        private int b;
        @Resource
        private int c;
        private int l;
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Resource{

    }
}
