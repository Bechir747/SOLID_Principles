package com.directi.training.lsp.exercice_solution;


public class ElectronicDuck implements Duck
{
    private boolean _on = false;

    public void quack()
    {
        turnOn();
        System.out.println("Electronic duck quack...");
        turnOff();
    }

    public void swim()
    {
        turnOn();
        System.out.println("Electronic duck swim...");
        turnOff();
    }

    public void turnOn()
    {
        _on = true;
        System.out.println("The Electronic duck have been Turned on !");
    }

    public void turnOff()
    {
        _on = false;
        System.out.println("The Electronic duck have been Turned off !");
    }
}
