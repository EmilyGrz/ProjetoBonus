package Principal;

public class Gerente extends Funcionario {
    
     public Gerente(String id, double salario, Departamento departamento) {
         
        super(id, salario, "Gerente", departamento);
    }
}

