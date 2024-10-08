package Principal;

import java.util.ArrayList;
import java.util.List;

public class Controle {private List<Funcionario> funcionarios;
    private List<Departamento> departamentos;

    
    class VendasDepartamento {
        private String idDepartamento;
        private double valorVendas;

        public VendasDepartamento(String idDepartamento, double valorVendas) {
            this.idDepartamento = idDepartamento;
            this.valorVendas = valorVendas;
        }

        public String getIdDepartamento() {
            return idDepartamento;
        }

        public double getValorVendas() {
            return valorVendas;
        }
    }

    public Controle(List<Funcionario> funcionarios, List<Departamento> departamentos) {
        if (funcionarios == null || departamentos == null || funcionarios.isEmpty() || departamentos.isEmpty()) {
            throw new IllegalArgumentException("Código 1: Tabelas de entrada estão vazias");
        }
        this.funcionarios = funcionarios;
        this.departamentos = departamentos;
    }

    public int calcularBonus() {
        List<VendasDepartamento> vendasPorDepartamento = new ArrayList<>();
        
        
        for (Departamento d : departamentos) {
            vendasPorDepartamento.add(new VendasDepartamento(d.getId(), d.getValorVendas()));
        }

        double maiorVenda = 0;
        for (VendasDepartamento vd : vendasPorDepartamento) {
            if (vd.getValorVendas() > maiorVenda) {
                maiorVenda = vd.getValorVendas();
            }
        }

        List<String> departamentosMaiorVenda = new ArrayList<>();
        for (VendasDepartamento vd : vendasPorDepartamento) {
            if (vd.getValorVendas() == maiorVenda) {
                departamentosMaiorVenda.add(vd.getIdDepartamento());
            }
        }

        if (departamentosMaiorVenda.isEmpty()) {
            return 2;
        }

        boolean algumFuncionarioElegivel = false;
        List<Funcionario> funcionariosAtualizados = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (departamentosMaiorVenda.contains(f.getDepartamento().getId())) {
                algumFuncionarioElegivel = true;
                double bonus = 2000;
                if (f.getCargo().equals("Gerente") || f.getSalario() >= 150000) {
                    bonus = 1000;
                }
                f.setSalario(f.getSalario() + bonus);
                funcionariosAtualizados.add(f);
            }
        }

        if (!algumFuncionarioElegivel) {
            return 2;
        }

        exibirResultados(departamentosMaiorVenda.get(0), funcionariosAtualizados);
        return 0;
    }

    private void exibirResultados(String departamentoId, List<Funcionario> funcionariosAtualizados) {
        System.out.println("Departamento com mais vendas: " + departamentoId+"!!!");
        for (Funcionario f : funcionariosAtualizados) {
            System.out.printf("Funcionario ID: %s, Novo Salario: %.2f%n", f.getId(), f.getSalario());
            System.out.println("Mais a comissao do Vendedor equivalente a 10% do valor das vendas do Departamento: " + ((Vendedor) f).getComissao());
          
        }
    }
}
    

