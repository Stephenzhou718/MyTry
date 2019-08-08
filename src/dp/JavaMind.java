package dp;

import java.io.*;
import java.util.*;

/**
 * @author ming
 * @date 2019/5/14 14:59
 */

class Animal{
    String name = "Animal";
//    Animal(int i){
//        System.out.println("Animal" + i);
//    }

   void hello(){
        System.out.println("Hello from animal");
    }
}

class Dog extends Animal{
    String name = "Dog";
    int i;
//    char a;
//    long j;

//    Dog(int i){
//        super(i+1);
//        System.out.println("dog" + i);
//    }

    void hello(){
        System.out.println("Hello from dog");
    }
}
public class JavaMind {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1);

        String s = String.format("%d + %s", 250, "吗？");
        System.out.println(s);
}

}
