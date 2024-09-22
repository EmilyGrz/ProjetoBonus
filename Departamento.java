
package com.mycompany.projetobonus;

public class Departamento {
    
   private String id;
    private double valorVendas;

    public Departamento(String id, double valorVendas) {
        this.id = id;
        this.valorVendas = valorVendas;
    }

    public String getId() {
        return this.id;
    }

    public double getValorVendas() {
        return this.valorVendas;
    }
}
