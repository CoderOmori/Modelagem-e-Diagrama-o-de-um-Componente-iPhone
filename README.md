# 📱 Modelagem e Diagramação de um Componente iPhone

Este projeto tem como objetivo modelar e implementar as principais funcionalidades do primeiro iPhone, conforme apresentado por Steve Jobs em 2007.  
A proposta é aplicar os conceitos de **Programação Orientada a Objetos (POO)** em **Java**, utilizando **interfaces** para representar as seguintes capacidades:

- 🎵 **Reprodutor Musical**  
- 📞 **Aparelho Telefônico**  
- 🌐 **Navegador de Internet**

---

## 🧩 Diagrama UML

A estrutura do projeto foi baseada no seguinte diagrama de classes UML, utilizando **Mermaid** para representação (compatível com o GitHub):

ReprodutorMusical <|.. iPhone
AparelhoTelefonico <|.. iPhone
NavegadorInternet <|.. iPhone

class ReprodutorMusical {
    <<interface>>
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
}

class AparelhoTelefonico {
    <<interface>>
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
}

class NavegadorInternet {
    <<interface>>
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
}



---

## 🚀 Funcionalidades

A classe `iPhone` implementa as três interfaces, contendo os seguintes métodos:

### 🎵 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador de Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/CoderOmori/Modelagem-e-Diagrama-o-de-um-Componente-iPhone

2. ""Abra o projeto em sua IDE Java favorita:""
(Ex: VS Code, IntelliJ ou Eclipse)

3. ""Execute a classe Main.java:""
A execução do projeto é feita através do método main, que instancia o objeto iPhone e demonstra suas funcionalidades.

---

🛠 Tecnologias Utilizadas

Linguagem: Java

POO: Interfaces, Herança, Polimorfismo

Diagramação: Mermaid.js (suportado pelo GitHub)
