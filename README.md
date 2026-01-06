# 📌 Projeto Java – Desafio (Conta Bancária Simples)

Este projeto é um exercício introdutório em **Java**, desenvolvido durante estudos no curso da **Alura**, com o objetivo de praticar:

* Entrada de dados via terminal (`Scanner`)
* Estruturas de decisão (`switch` / `if-else`)
* Estruturas de repetição (`while`)
* Manipulação de variáveis
* Simulação de regras simples de negócio

O programa simula um **sistema bancário básico em linha de comando**.

---

## 🧠 Descrição do Funcionamento

Ao iniciar o programa, o sistema apresenta um **menu inicial** com os dados do cliente:

* Nome do cliente
* Tipo de conta (Corrente)
* Saldo inicial

Em seguida, é exibido um menu interativo que permite ao usuário escolher entre diferentes operações bancárias.

---

## 📋 Funcionalidades Disponíveis

O sistema oferece as seguintes opções:

### 1️⃣ Consultar saldo

Exibe o saldo atual disponível na conta.

### 2️⃣ Receber valor

Permite adicionar um valor ao saldo da conta (simulando um depósito).

### 3️⃣ Transferir valor

Permite transferir um valor para outra conta.

* O sistema valida se há saldo suficiente
* Caso não haja, exibe uma mensagem de erro

### 4️⃣ Sair

Encerra o programa com uma mensagem de confirmação.

---

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 8+)**
* **Terminal / Linha de comando**
* Classe `Scanner` para leitura de dados do usuário

---

## ▶️ Como Executar o Projeto

### 1. Clone ou acesse o diretório do projeto

```bash
cd Java-course/First-project
```

### 2. Compile o arquivo Java

```bash
javac src/Desafio.java
```

### 3. Execute o programa

```bash
java -cp src Desafio
```

---

## 📂 Estrutura do Projeto

```text
First-project/
├── src/
│   └── Desafio.java
└── README.md
```

---

## 🧪 Exemplo de Menu no Terminal

```text
1 - Consultar saldo
2 - Receber Valor
3 - Transferir valor
4 - Sair
```

---

## 📚 Observações

* O saldo é armazenado apenas em memória (não há persistência de dados)
* O projeto tem fins **educacionais**
* Ideal para iniciantes em Java

---

## ✍️ Autor

**Alfrades Catala**
Estudante de Programação | Java | Backend

---

🚀 Projeto desenvolvido como parte da jornada de aprendizado em Java.
