package com.directi.training.ocp.exercice_solution;

import com.directi.training.ocp.exercise.ResourceType;

public class ResourceAllocator
{
    private ResourceStrategy strategy;
    public ResourceAllocator(ResourceStrategy strategy){
        this.strategy = strategy;
    }
    public int allocate()
    {
        return strategy.allocate();
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        strategy.free(resourceId);
    }

}
