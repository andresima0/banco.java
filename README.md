# banco.java

OOP program, using Java as the language and NetBeans as the platform

An example of performing some simple banking operations such as withdrawals, deposits, and transfers. Each account has an associated client and a balance that can be manipulated by the performed operations.

The `Account` class presented in the code is a simplified representation of a bank account. The class has the attributes `client` and `balance`, and methods to display the balance, perform withdrawals, deposits, and transfers between accounts:

- The `displayBalance()` method prints the client's name and the current balance of the account.
- The `withdraw(double amount)` method subtracts the specified amount from the account's balance.
- The `deposit(double amount)` method adds the specified amount to the account's balance.
- The `transfer(Account destination, double amount)` method performs a transfer of a specified amount from the current account to another account specified as the destination. This method utilizes the `withdraw()` and `deposit()` methods to adjust the balances of the accounts involved in the transfer.

##

### Portuguese version

Um exemplo de realização de algumas operações bancárias simples, como saques, depósitos e transferências. Cada conta possui um cliente associado e um saldo, que pode ser manipulado pelas operações realizadas.

A classe `Conta` apresentada no código é uma representação simplificada de uma conta bancária. A classe possui os atributos `cliente` e `saldo`, e métodos para exibir o saldo, realizar saques, depósitos e transferências entre contas:

- O método `exibirSaldo()` imprime na tela o nome do cliente e o saldo atual da conta.
- O método `saque(double valor)` subtrai o valor especificado do saldo da conta.
- O método `deposita(double valor)` adiciona o valor especificado ao saldo da conta.
- O método `transferir(Conta destino, double valor)` realiza uma transferência de um valor da conta atual para outra conta especificada como destino. Esse método utiliza os métodos `saque()` e `deposita()` para ajustar os saldos das contas envolvidas na transferência.
