package Principal;


public class Vendedor extends Funcionario {
   private double comissao;
   private int qtdVendas;

    public Vendedor(String id, double salario, double comissao, Departamento departamento) {
        super(id, salario, "Vendedor", departamento);
        this.comissao = comissao;
        this.qtdVendas = qtdVendas;
        this.comissao = calcularComissao();
           }
    
    
    public double calcularComissao() {
        return this.getDepartamento().getValorVendas() * 0.10;
    }
    
    public double getComissao() {
        return this.comissao;
    }
        
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
         
    public double calcularBonus() {
            return super.calcularBonus() + comissao;
        }

    public double calcularSalarioTotal() {
        return getSalario() + comissao;
    }
    public int getQtdVendas() {
        return this.qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}

    
