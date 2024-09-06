
# Documentação do Projeto: Iphone

Descrição Geral
O projeto Iphone é um exemplo básico de aplicação em Java que demonstra o uso de classes e objetos para simular funcionalidades de um dispositivo móvel. A aplicação permite a seleção de diferentes funcionalidades (telefone, navegador ou reprodutor musical) e executa ações específicas com base na escolha do usuário.

### Funcionalidades
Celular:

Descrição: Simula as funções básicas de um celular, como atender chamadas, realizar chamadas e iniciar correio de voz.

Métodos:
atender(): Simula o atendimento de uma chamada.

ligar(): Simula a realização de uma chamada.

iniciarCorreiodeVoz(): Simula o início do correio de voz.

### Navegador:

Descrição: Permite a escolha entre dois navegadores, Chrome ou Safari.

Métodos:

1. Chrome:

exibirPagina(): Simula a exibição de uma página.

adicionarNovaAba(): Simula a adição de uma nova aba.

atualizarPagina(): Simula a atualização da página.

2. Safari:

exibirPagina(): Simula a exibição de uma página.

adicionarNovaAba(): Simula a adição de uma nova aba.

atualizarPagina(): Simula a atualização da página.

### Reprodutor Musical:

Descrição: Simula a reprodução de músicas.

Métodos:

tocar(): Simula a reprodução de uma música.

pausar(): Simula a pausa da música.

escolhendoMusica(): Simula a seleção de uma música.

- Estrutura do Código
O código principal (Iphone) implementa um método main que oferece uma interface simples para o usuário interagir com o aplicativo. Dependendo da opção selecionada pelo usuário (cel, nav, ou mus), o programa instancia a classe correspondente e executa os métodos apropriados.

- Pilares da Programação Orientada a Objetos (POO) Utilizados
Encapsulamento:

O encapsulamento é utilizado para esconder os detalhes de implementação das classes e expor apenas os métodos necessários para a interação. Cada classe (Celular, Chrome, Safari, AppleMusic) possui seus próprios métodos que são chamados pelo Iphone sem que o usuário precise conhecer a implementação interna dessas classes.
Herança:

O exemplo não utiliza herança explícita, mas poderia ser estendido para incluir uma classe base comum para Celular, Chrome, Safari, e AppleMusic se houvesse métodos ou atributos compartilhados. Isso permitiria definir um comportamento comum em uma classe base e especializar as subclasses.
Polimorfismo:

O polimorfismo poderia ser utilizado ao criar uma interface ou classe base comum para as funcionalidades dos navegadores e do reprodutor musical. Assim, o método principal (main) poderia chamar métodos de uma interface comum sem precisar saber qual implementação específica está sendo utilizada. No código atual, o polimorfismo é implícito na forma como diferentes métodos são chamados com base nas escolhas do usuário.
Abstração:

A abstração é demonstrada ao criar classes que representam conceitos concretos (telefone, navegador, reprodutor musical) e permitir que o usuário interaja com essas abstrações sem se preocupar com os detalhes específicos da implementação. As ações específicas dos navegadores e do reprodutor musical são encapsuladas dentro das suas respectivas classes.
Exemplo de Uso
Selecionar Celular:

Se o usuário escolher "cel" como a função, a classe Celular é instanciada, e seus métodos atender, ligar, e iniciarCorreiodeVoz são chamados.
Selecionar Navegador:

Se o usuário escolher "nav", ele é solicitado a escolher entre Chrome ou Safari. Com base na escolha, a classe correspondente é instanciada, e os métodos exibirPagina, adicionarNovaAba, e atualizarPagina são chamados.
Selecionar Reprodutor Musical:

Se o usuário escolher "mus", a classe AppleMusic é instanciada, e seus métodos tocar, pausar, e escolhendoMusica são chamados.


![Untitled diagram-2024-09-06-171703](https://github.com/user-attachments/assets/573f4d49-1d40-400a-ad12-d74dfef0bc73)
