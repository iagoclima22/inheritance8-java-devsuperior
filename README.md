# Cálculo de Imposto de Contribuintes
 
Programa em Java que lê os dados de **N contribuintes** (informado pelo usuário), calcula o imposto pago por cada um e exibe o **total arrecadado**.
 
Cada contribuinte pode ser **pessoa física** ou **pessoa jurídica**.
 
## Regras de cálculo
 
**Pessoa física** (nome, renda anual, gastos com saúde):
- Renda abaixo de 20000.00 → 15% de imposto
- Renda igual ou acima de 20000.00 → 25% de imposto
- 50% dos gastos com saúde são abatidos do imposto
> Ex.: renda 50000.00 e 2000.00 em saúde → (50000 × 25%) − (2000 × 50%) = **11500.00**
 
**Pessoa jurídica** (nome, renda anual, número de funcionários):
- 16% de imposto
- Mais de 10 funcionários → 14% de imposto
> Ex.: renda 400000.00 e 25 funcionários → 400000 × 14% = **56000.00**
 
## Exemplo de execução
 
```
Enter the number of tax payers: 3
Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00
...
 
TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00
 
TOTAL TAXES: $ 97000.00
```
