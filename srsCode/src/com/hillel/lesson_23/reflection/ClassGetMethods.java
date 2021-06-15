package com.hillel.lesson_23.reflection;

import java.lang.reflect.Method;

public class ClassGetMethods {
    public static void main(String[] args) {
        Two obj = new Two();
        Class<?> cls = obj.getClass();
        Method[] methods = cls.getMethods();
//        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method name : " + method.getName());
            System.out.println("Return type : " +
                    method.getReturnType().getName());

            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (Class<?> paramType : params) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();

        }
        System.out.println("-----------");
    }
}

class One{
    public void oneMethod1(String val){};
    public void oneMethod2(Boolean val){};
    public void oneMethod3(Integer val, String var){};
}

class Two extends One{
    public Integer twoMethod1(){return  1;};
    public void twoMethod2(){};
    private void twoMethod3(){};
}
