
package com.mycompany.projetobonus;

import java.util.ArrayList;
import java.util.List;

public class ProjetoBonus {

    public static void main(String[] args) { 
        
        Departamento d1 = new Departamento("Setor de Venda de Vidro temperado", 40000);
        Departamento d2 = new Departamento("Setor de Venda de vidro comum", 80000);
        Departamento d3 = new Departamento("Setor de Venda de vidro laminado", 10000);

        Vendedor v1 = new Vendedor("Vendedor1", 150000, 100, d1);
        Vendedor v2 = new Vendedor("Vendedor2", 150000, 100, d1);
        Gerente g1 = new Gerente("Gerente1", 140000, d1);

        Vendedor v3 = new Vendedor("Vendedor3", 120000, 100, d2);
        Vendedor v4 = new Vendedor("Vendedor4", 160000, 100, d2);
        Gerente g2 = new Gerente("Gerente2", 140000, d2);

        Vendedor v5 = new Vendedor("Vendedor5", 120000, 100, d3);
        Vendedor v6 = new Vendedor("Vendedor6", 115000, 100, d3);
        Gerente g3 = new Gerente("Gerente3", 140000, d3);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(v1);
        funcionarios.add(v2);
        funcionarios.add(g1);
        funcionarios.add(v3);
        funcionarios.add(v4);
        funcionarios.add(g2);
        funcionarios.add(v5);
        funcionarios.add(v6);
        funcionarios.add(g3);

        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(d1);
        departamentos.add(d2);
        departamentos.add(d3);

        Controle controle = new Controle(funcionarios, departamentos);
        int resultado = controle.calcularBonus();

        if (resultado == 0) {
            System.out.println("Bonus calculado com sucesso!");
        } else if (resultado == 1) {
            System.out.println("Código 1: Tabelas de entrada estão vazias");
        } else if (resultado == 2) {
            System.out.println("Codigo 2: Nenhum funcionário elegível");
        }
    }
}
