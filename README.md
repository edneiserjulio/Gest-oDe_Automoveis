# 🚗 Sistema de Gestão de Oficina Automóvel

## 📖 Descrição

O **Sistema de Gestão de Oficina Automóvel** é uma aplicação desktop desenvolvida em **Java Swing** que permite efetuar o registo de clientes, veículos e tipos de reparação realizados numa oficina.

A aplicação disponibiliza uma interface gráfica intuitiva para inserção de dados, validação de informações e consulta do histórico de registos efetuados.

Este projeto foi desenvolvido com o objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)**, **Interfaces Gráficas (GUI)** e **Gestão de Eventos** em Java.

---

## ✨ Funcionalidades

### 👤 Gestão de Clientes

* Registo do nome do cliente.
* Registo do email.
* Registo do telefone.

### 🚘 Gestão de Veículos

* Matrícula.
* Marca.
* Modelo.
* Ano de fabrico.

### 🔧 Gestão de Reparações

* Seleção do tipo de reparação através de lista suspensa:

  * Mudança de Óleo
  * Travões
  * Pintura
  * Diagnóstico
  * Motor

### 📋 Histórico

* Armazenamento dos registos na área de histórico.
* Visualização organizada das informações introduzidas.

### ✅ Validações

* Verificação de campos obrigatórios.
* Validação básica de email.
* Validação do número de telefone.

### ⚙️ Operações

* Guardar dados.
* Apagar histórico.
* Encerrar aplicação.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia  | Finalidade                    |
| ----------- | ----------------------------- |
| Java        | Linguagem principal           |
| Swing       | Interface gráfica             |
| AWT         | Gestão de componentes visuais |
| JFrame      | Janela principal              |
| JPanel      | Organização dos painéis       |
| JTextField  | Entrada de dados              |
| JComboBox   | Seleção do tipo de reparação  |
| JTextArea   | Histórico de registos         |
| JOptionPane | Mensagens e alertas           |

---

## 📂 Estrutura da Aplicação

```text
Carro.java
│
├── Painel Superior
│   └── Título da Aplicação
│
├── Painel de Dados
│   ├── Nome
│   ├── Email
│   ├── Telefone
│   ├── Matrícula
│   ├── Marca
│   ├── Modelo
│   ├── Ano
│   └── Tipo de Reparação
│
├── Painel de Histórico
│   └── Registos Efetuados
│
└── Painel de Controlo
    ├── Guardar Dados
    ├── Apagar Histórico
    └── Sair
```

---

## 🚀 Como Executar

### Pré-requisitos

* Java JDK 8 ou superior

Verificar instalação:

```bash
java -version
javac -version
```

### Compilar

```bash
javac Carro.java
```

### Executar

```bash
java Carro
```

---

## 🖥️ Interface da Aplicação

```text
+-------------------------------------------------------------+
|       Sistema de Gestão de Oficina Automóvel                |
+-------------------------+-----------------------------------+
| Nome                    |                                   |
| Email                   |                                   |
| Telefone                |                                   |
| Matrícula               |         Histórico de Registos     |
| Marca                   |                                   |
| Modelo                  |                                   |
| Ano                     |                                   |
| Tipo de Reparação       |                                   |
|                         |                                   |
+-------------------------+-----------------------------------+
| Guardar Dados | Apagar Histórico | Sair                     |
+-------------------------------------------------------------+
```

---

## 🔍 Validações Implementadas

### Campos Obrigatórios

Todos os campos devem ser preenchidos antes do registo.

### Validação de Email

O sistema verifica a existência do caractere:

```text
@
```

### Validação de Telefone

O número de telefone apenas pode conter dígitos numéricos.

---

## 📋 Exemplo de Registo

```text
Cliente: João Silva
Email: joao@email.com
Telefone: 912345678

Veículo:
Matrícula: 00-AA-00
Marca: Toyota
Modelo: Corolla
Ano: 2020

Tipo de Reparação:
Mudança de Óleo
```

---

## 🎯 Objetivos Académicos

Este projeto demonstra a aplicação prática dos seguintes conceitos:

* Programação Orientada a Objetos (POO)
* Interfaces Gráficas com Java Swing
* Manipulação de Eventos
* Validação de Dados
* Layout Managers
* Gestão de Componentes Visuais
* Organização de Interfaces Desktop

---

## 🔄 Melhorias Futuras

* Persistência de dados em ficheiro.
* Ligação a base de dados MySQL.
* Pesquisa de clientes.
* Edição de registos.
* Remoção individual de registos.
* Sistema de autenticação.
* Exportação para PDF.
* Gestão de agendamentos.
* Dashboard estatístico.

---

## 👨‍💻 Autor

Projeto desenvolvido para fins académicos e aprendizagem de Java Swing.

**Autor:** [O teu nome]

---

## 📄 Licença

Este projeto é disponibilizado para fins educativos e académicos.
