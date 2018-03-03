package it.iiscorni.alternanza;

import ro.pippo.core.Pippo;

public class PippoLauncher
{
    public static void main(String[] args)
    {
        Pippo pippo = new Pippo(new PippoApplication());
        pippo.start();
    }
}