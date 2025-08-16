package com.mycompany.hash.hash;

public class Hash {
    public enum Estado {
        LIVRE, OCUPADO, REMOVIDO
    }

    public double item;
    public Estado estado;

    public Hash() {
        estado = Estado.LIVRE;
    }
}