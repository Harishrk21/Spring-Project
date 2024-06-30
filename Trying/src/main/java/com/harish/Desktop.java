package com.harish;

public class Desktop implements Computer
{
    public Desktop()
    {
        System.out.println("Obj created");
    }
    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
