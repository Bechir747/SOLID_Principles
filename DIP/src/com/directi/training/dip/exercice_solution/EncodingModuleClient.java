package com.directi.training.dip.exercice_solution;

import com.directi.training.dip.exercice_solution.EncodingModule;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule(new EncodingWithFiles());
        encodingModule.encode();
    }
}
