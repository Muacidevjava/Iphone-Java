# Projeto iPhone

Este projeto simula algumas das funcionalidades do iPhone, incluindo reprodutor musical, aparelho telefônico e navegador na internet. O código foi desenvolvido em Java e utiliza Programação Orientada a Objetos (POO) e interfaces.

## Funcionalidades

### Reprodutor Musical
Interface: `ReprodutorMusical`
Classe: `IPhoneReprodutorMusical`

Métodos disponíveis:
- `tocar()`: Inicia a reprodução da música.
- `pausar()`: Pausa a reprodução da música.
- `parar()`: Para a reprodução da música.
- `proximaFaixa()`: Avança para a próxima faixa.
- `faixaAnterior()`: Volta para a faixa anterior.

### Aparelho Telefônico
Interface: `Telefone`
Classe: `IPhoneTelefone`

Métodos disponíveis:
- `fazerChamada(String numero)`: Faz uma chamada para o número especificado.
- `encerrarChamada()`: Encerra a chamada em andamento.
- `atenderChamada()`: Atende uma chamada recebida.
- `rejeitarChamada()`: Rejeita uma chamada recebida.

### Navegador na Internet
Interface: `NavegadorWeb`
Classe: `IPhoneNavegadorWeb`

##Métodos disponíveis:
- `abrirPagina(String url)`: Abre a página web especificada pela URL.
- `atualizarPagina()`: Atualiza a página web atual.
- `adicionarFavorito(String url)`: Adiciona a página web atual aos favoritos.
- `voltar()`: Navega para a página anterior.
- `avancar()`: Navega para a próxima página.


## Como Executar

1. **Clone o repositório:**

   https://github.com/Muacidevjava/Iphone-Java.git
   cd ProjetoIPhone
   
2.**Compile os arquivos Java: **
 cd src
javac Main.java musica/*.java telefone/*.java web/*.java

3.Execute o programa:
java Main

## Uso do Sistema
Uso do Sistema
Ao executar o programa, um menu interativo será exibido, permitindo que você escolha qual
funcionalidade deseja testar. Cada ação será seguida por uma pausa, esperando que você pressione Enter para continuar, 
permitindo ver o passo a passo das operações.

## Exemplo de Execução
Escolha uma funcionalidade para testar:
1. Reprodutor Musical
2. Aparelho Telefônico
3. Navegador na Internet
0. Sair

Testando Reprodutor Musical:
Tocando música no iPhone
Pressione Enter para continuar...

Pausando música no iPhone
Pressione Enter para continuar...

Parando música no iPhone
Pressione Enter para continuar...

Próxima faixa no iPhone
Pressione Enter para continuar...

Faixa anterior no iPhone
Pressione Enter para continuar...

# Escolha a funcionalidade desejada e siga as instruções para testar cada uma delas.

