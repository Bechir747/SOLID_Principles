package com.directi.training.dip.exercice_solution;


import java.io.IOException;

public class EncodingModule
{
    IEncoding encodeStrategy ;

    public EncodingModule(IEncoding encode){
        this.encodeStrategy = encode;
    }
    public void encode() throws IOException {
        encodeStrategy.encode();
    }
}

