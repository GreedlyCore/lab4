package annotations;

import jdk.jfr.Relational;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.CLASS) - default - only bytecode, but not runtime
//@Retention(RetentionPolicy.RUNTIME) - in runtime check
//@Retention(RetentionPolicy.SOURCE) - only source code
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.MODULE})
public @interface Relationship {
    boolean isFriendly() default true;
}


