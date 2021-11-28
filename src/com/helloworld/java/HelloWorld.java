package com.helloworld.java;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String [] args)
    {
        System.out.println("Hello World!!");
        ArrayList List = new ArrayList();
        String[] array = new String []{"likefan","wanghaipeng","wuguoliang","luanshuai"};
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        for (String s : array) {
            System.out.println(s);
        }

        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            System.out.println(s);
        }
        ArrayList list2 = new ArrayList();
        list2.add(123);
        list2.add(456);
        list2.add(678);

    }

    public void method()
    {

    }
}
