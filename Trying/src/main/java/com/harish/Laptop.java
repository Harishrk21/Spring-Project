package com.harish;

public class Laptop implements Computer {
//    public Laptop()
//    {
//        System.out.println("Cons lap is created");
//    }
    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}
