package com.directi.training.ocp.exercice_solution;

public  interface ResourceStrategy {
    int allocate();
    void free(int resourceId);
}
