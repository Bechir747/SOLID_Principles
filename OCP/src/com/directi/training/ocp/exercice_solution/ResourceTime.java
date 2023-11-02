package com.directi.training.ocp.exercice_solution;

public class ResourceTime implements ResourceStrategy{
    @Override
    public int allocate() {
        int resourceId;
        resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }
    private void markTimeSlotFree(int resourceId)
    {
    }

    private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }

}
