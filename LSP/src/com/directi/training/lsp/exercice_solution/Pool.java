package com.directi.training.lsp.exercice_solution;

public class Pool
{
    public void run()
    {
       Duck donaldRealDuck = new RealDuck();
       Duck electricRealDuck = new ElectronicDuck();
       quack(donaldRealDuck, electricRealDuck);
       swim(donaldRealDuck, electricRealDuck);
    }

    private void quack(Duck... Ducks)
    {
        for (Duck Duck : Ducks) {
            Duck.quack();
        }
    }

    private void swim(Duck... Ducks)
    {
        for (Duck Duck : Ducks) {
            Duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
