package Principal;

public class Funcionario {
     private String id;
    private double salario;
    private String cargo;
    private Departamento departamento;

    public Funcionario(String id, double salario, String cargo, Departamento departamento) {
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getId() {
        return this.id;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public double calcularBonus() {
        return 2000;  
    }

}
    


