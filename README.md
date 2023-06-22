# banco.java

### Portuguese version

Um exemplo de realização de algumas operações bancárias simples, como saques, depósitos e transferências. Cada conta possui um cliente associado e um saldo, que pode ser manipulado pelas operações realizadas.

A classe `Conta` apresentada no código é uma representação simplificada de uma conta bancária. A classe possui os atributos `cliente` e `saldo`, e métodos para exibir o saldo, realizar saques, depósitos e transferências entre contas:

- O método `exibirSaldo()` imprime na tela o nome do cliente e o saldo atual da conta.
- O método `saque(double valor)` subtrai o valor especificado do saldo da conta.
- O método `deposita(double valor)` adiciona o valor especificado ao saldo da conta.
- O método `transferir(Conta destino, double valor)` realiza uma transferência de um valor da conta atual para outra conta especificada como destino. Esse método utiliza os métodos `saque()` e `deposita()` para ajustar os saldos das contas envolvidas na transferência.
