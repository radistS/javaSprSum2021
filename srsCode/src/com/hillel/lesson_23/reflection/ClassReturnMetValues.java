package com.hillel.lesson_23.reflection;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Arrays;

public class ClassReturnMetValues {
    public static void main(String[] args) throws NoSuchMethodException {
        Class boo = new Boo().getClass();

        Method method = boo.getMethod("print");

        System.out.println(method.getReturnType());

        Annotation[] annotations = method.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        annotations = boo.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        Class<?>[] exceptionTypes = method.getExceptionTypes();
        System.out.println(Arrays.toString(exceptionTypes));
    }
}

@Data
@Builder
@EqualsAndHashCode
@Deprecated
class Boo {
    @Deprecated
    public String print() throws SQLException, ArithmeticException {
        return "null";
    }
}
