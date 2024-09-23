O módulo BONUS deve ser implementado para gerenciar o cálculo de bonificações salariais dos funcionários de uma empresa, com base no desempenho dos departamentos em termos de vendas. O funcionamento esperado do módulo é descrito a seguir.
Funcionalidade Principal:
O objetivo do módulo BONUS é aumentar o salário de todos os funcionários que pertencem ao(s) departamento(s) com o maior valor de vendas. O bônus salarial padrão é de $2.000.
No entanto, existem algumas exceções para esse aumento:
Funcionários com salário igual ou superior a $150.000: Caso o funcionário já tenha um salário maior ou igual a $150.000, o bônus aplicado será reduzido para $1.000.
Gerentes: Independentemente do salário, funcionários que possuem o cargo de gerente também recebem um bônus de $1.000.
Entradas:
O módulo recebe como entrada as seguintes informações:
Tabela de Funcionários: Contém dados sobre cada funcionário, incluindo:
Identificação única do funcionário.
Salário atual.
Cargo (para determinar se o funcionário é gerente ou não).
Código do departamento ao qual o funcionário pertence.
Tabela de Departamentos: Contém dados sobre cada departamento, incluindo:
Identificação única do departamento.
Valor total de vendas realizadas pelo departamento.
Saídas:
O módulo BONUS deve retornar os seguintes códigos de erro, dependendo do resultado da execução (utilizem exception):

Código 1: Retornado se qualquer uma das tabelas de entrada (Funcionários ou Departamentos) estiver vazia, ou seja, sem dados.
Código 2: Retornado se não houver nenhum funcionário elegível nos departamentos com maior valor de vendas.



Caso o modulo execute com sucesso deve retornar o valor 0.
Regras de Negócio:
O módulo deve identificar o(s) departamento(s) com o maior valor de vendas.
Apenas funcionários que pertencem ao(s) departamento(s) identificado(s) como os de maior valor de vendas são elegíveis para o bônus.
Para cada funcionário elegível, o valor do bônus deve ser adicionado ao salário, respeitando as exceções descritas:
Funcionários com salário >= $150.000 ou que possuem o cargo de gerente recebem apenas $1.000 de aumento.
Se não houver nenhum funcionário nos departamentos de maior venda, o módulo deve retornar o código de erro apropriado (código 2).


 
