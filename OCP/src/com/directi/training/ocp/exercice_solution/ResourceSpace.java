package com.directi.training.ocp.exercice_solution;

public class ResourceSpace implements ResourceStrategy {
    @Override
    public int allocate() {
        int resourceId;
        resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }
    private void markSpaceSlotFree(int resourceId)
    {
    }


    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }


}
