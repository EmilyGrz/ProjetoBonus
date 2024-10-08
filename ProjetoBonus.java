/**
A ideia é uma vidracaria. Nela contem três departamentos: venda de vidro temperado, venda de vidro comum e venda de vidro laminado. 
Em cada departamento temos dois vendedores e um gerente.

Optei por contabilizar a comissão como sendo 10% do valor total de vendas do departamento.
 */

package Principal;

import java.util.ArrayList;
import java.util.List;

public class ProjetoModuloBonus {
 public static void main(String[] args) { 
        
    
        Departamento dep1 = new Departamento("Setor de Venda de Vidro temperado", 40000);
        Departamento dep2 = new Departamento("Setor de Venda de vidro comum", 80000);
        Departamento dep3 = new Departamento("Setor de Venda de vidro laminado", 10000);
        
        
        Vendedor vend1 = new Vendedor("Vendedor1", 150000, 100, dep1);
        Vendedor vend2 = new Vendedor("Vendedor2", 150000, 100, dep1);
        Gerente ger1 = new Gerente("Gerente1", 140000, dep1);

        Vendedor vend3 = new Vendedor("Vendedor3", 120000, 100, dep2);
        Vendedor vend4 = new Vendedor("Vendedor4", 160000, 100, dep2);
        Gerente ger2 = new Gerente("Gerente2", 140000, dep2);

        Vendedor vend5 = new Vendedor("Vendedor5", 120000, 100, dep3);
        Vendedor vend6 = new Vendedor("Vendedor6", 115000, 100, dep3);
        Gerente ger3 = new Gerente("Gerente3", 140000, dep3);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(vend1);
        funcionarios.add(vend2);
        funcionarios.add(ger1);
        funcionarios.add(vend3);
        funcionarios.add(vend4);
        funcionarios.add(ger2);
        funcionarios.add(vend5);
        funcionarios.add(vend6);
        funcionarios.add(ger3);

        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(dep1);
        departamentos.add(dep2);
        departamentos.add(dep3);

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

