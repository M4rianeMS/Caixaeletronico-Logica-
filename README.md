#  Simulador de Caixa Eletrônico (ATM)

Este é um projeto em **Java** desenvolvido para praticar os pilares da **Programação Orientada a Objetos** e a manipulação de arquivos de texto para persistência de dados. O sistema simula operações bancárias essenciais em um ambiente de console.

##  Funcionalidades

* **Cadastro de Contas:** Permite adicionar novas contas com titular, número e saldo inicial.
* **Persistência em TXT:** As contas são carregadas de um arquivo `.txt` ao iniciar e salvas ao finalizar o programa.
* **Pesquisa Dinâmica:** Localiza contas específicas dentro de uma lista de objetos na memória.
* **Operações Bancárias:**
    * **Depósito:** Incrementa o saldo da conta selecionada.
    * **Saque com Validação:** Realiza saques apenas se houver saldo suficiente, utilizando exceções personalizadas.
    * **Exibição de Saldo:** Consulta rápida dos dados da conta.

##  Tecnologias e Conceitos Aplicados

* **Java SE:** Linguagem principal utilizada.
* **Encapsulamento:** Uso de atributos privados e métodos getters/setters na classe `Conta`.
* **Tratamento de Exceções:** Implementação da `SaldoInsuficienteException` para controle de fluxo de erros.
* **Java I/O:** Uso de `BufferedReader` e `PrintWriter` para leitura e escrita de arquivos.
* **Collections:** Gerenciamento de múltiplas contas através de `ArrayList`.

##  Estrutura do Projeto

* `Conta.java`: Classe de modelo que representa a entidade bancária.
* `Caixaeletronico.java`: Classe de serviço contendo a lógica de negócio e manipulação de arquivos.
* `SaldoInsuficienteException.java`: Exceção personalizada para regras de saque.
* `Main.java`: Ponto de entrada do sistema com o menu interativo.
* `contas.txt`: Base de dados simples em formato de texto.

##  Como Executar

### Pré-requisitos
* **JDK 17+** instalado.

### Passo a Passo
1. Clone o repositório ou baixe os arquivos `.java`.
2. Certifique-se de que o arquivo `contas.txt` existe na raiz do projeto com o seguinte formato:
   ```text
   numero;titular;saldo
   123;Fulano de Tal;1000.0
3. Compile e execute a classe `.main`
