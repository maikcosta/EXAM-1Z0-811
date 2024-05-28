# Exam-1Z0-811

### Algumas questões estão comentadas para conseguir rodar o projeto e verificar as saídas no console.



## Preparatório Certificação JAVA Foundations 1Z0-811

### O que são as siglas JDK, JVM e JRE ?

**JDK (Java Development Kit)** - é o Kit de Desenvolvimento Java responsável por compilar código-fonte (.java) em bytecode (.class).

**JVM (Java Virtual Machine)** - é a Máquina Virtual do Java responsável por executar o bytecode (.class)

**JRE (Java Runtime Environment)** - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa.

### O que é programação orientada a objetos?

Não importa a leitura que você faça sobre o que é POO, você sempre encontrará referência aos 4 pilares desse paradigma. Quer saber quais são eles? Veja a seguir.

**Herança**: como o próprio nome diz, a herança passa de “pai” para “filho” na escrita do código. Portanto, no objeto principal há vários atributos e métodos que podem originar-se de um atual objeto (pai) para a geração de um novo código (filho).
**Polimorfismo**: nesse pilar, um objeto se passa por outro em determinadas circunstâncias, conforme as decisões do próprio Dev que está executando o projeto.
**Encapsulamento**: na prática, o encapsulamento esconde detalhes da implementação do código, conforme os interesses de cada projeto.
**Abstração**: nesse pilar, representa-se o objeto de forma abstrata, embora muitos também considerem a abstração como uma união entre os conceitos de encapsulamento e de polimorfismo.


### Compilação

Compilador **java***c* mais o nome de classe
Exemplo;

**javac** teste.java

Na compilação é gerado um novo arquivo *teste.class* em bytecode que será interpretado pela jvm.

Execução

java mais nome do programa

Exemplo;
java teste


### Tipos Primitivos
## Wrapper

São 8 tipos primitivos,são eles;


|  Primitivo | Wrapper  | Valores  |
| ------------ | ------------ | ------------ |
| boolean | Boolean  | false;true  |
| byte | Byte  | -128;127  |
| short  | Short  | 32767  |
| int  | Interger  | 2147483647  |
| char  | Character  | 'a'  |
| long  | Long  | 214783648L  |
| double  | Double  | 214783647.45  |
| float  | Float  | 214783647.45f  |

## Inicialização

| Tipo da variável  | Valor default de inicialização  |
| ------------ | ------------ |
| boolean  | false  |
| byt,short, int e long  | 0 (Tamanho em bits do tipo)  |
| float e double  | 0.0 (Tamanho em bits do tipo)  |
| chard  | '\u0000'(NUL)  |
| Referencia a objetos  | null  |

## Ordem elementos na classe

| Elemento  | Obrigatório?  | Onde?  |
| ------------ | ------------ | ------------ |
| package a.b.c.d  | Não  | Primeira linha  |
| import java.util.*  |  Não  | Logo após o package  |
| public class A  | Sim  | logo após o import  |
| variavel int Valor  | Não  | Qualquer lugar dentro da classe  |
| método getValor()  | Não  | Qualqer lugar dentro da classe  |


## Converter Wrapper para o tipo Primitivo

variável.setValue();

Exemplo :
Long l1 = new Long (“123”);
long l2 = l1.setValue();

## Converter do Primitivo para Wrapper

Exemplo:
Double.parseDouble(“123.6”)

Classe X método

Não é obrigatório o arquivo ter o mesmo nome que a classe, somente é obrigatório caso o método ser public.

Exemplo

Veiculo.java

[imagem veiculo]

Já alterando a visibilidade da classe apresenta os alertas indicando que a classe publica não pode ter o nome diferente do nome do arquivo no exemplo abaixo.


[imagem veiculo]

Podemos dentro da mesma classe public ter mais classes, porém, somente uma poderá ser pública.


## Main

Como os parâmetros devem ser declarados de forma **correta** na classe com o Main.

public static void main(String[] args) {}  ✅

public static void main(String args[]) {}  ✅

public static void main(String ...args) {  ✅

public static void main(String args...) {  ❌

## Ordem de Inicialização

**PIC** = Package->Import->Class

Como são iniciadas as sequência de leitura do programa.

Atributos e Blocos inicializadores da instância são executados na ordem que aparecem no arquivo.
O Construtor é executado somente após a execução do item anterior.

[imagem Ordem Inicialização]



## Garbage Collection

Liberar a memória (RAM)
System.gc 


## Operadores Java

### Unários

int y = 4;

### Binários

double x = 3 + 2

### Ternários

Operações ternárias retornar SEMPRE um boolean, ou seja, o método ou a variável deve ser Boolean

Exemplos:

Boolean valid = 5 ? true : false ;  ✅

String valid = 5 ? true : false ; ❌

### Ordem de precedência

A primeira regra é realizar o cálculo considerando a precedência, em seguida realizar o cálculo da esquerda para a direita.

| Operador  | Símbolos  | Operador  | Símbolos                                          |
| ------------ | ------------ | ------------ |---------------------------------------------------|
| Post-unary operators  | x++, x - -   | Relational operators  | <, >, <=, >=, Instanceof                          |
| Pre-unary operators  | ++x, - -x  | Equal/ not equal  | ==, !=                                            |
| Other unary operator  | +, - ,!  | Logical Operator  | &, ^, PIPE                                        |
| Multi/Division/Modulus  | *, /, %  | Short-Circuit L.O  | &&, DOUBLE PIPE                                   |
| Addition/Subtraction  | +, -  | Ternary operations  | boolean e ? e1 : e2                               |
| Shift operator  | <<, >>, >>>  | Assignment operators  | =, +=, -=, *=. /=, %=, &=, ^=, !=, <<=, >>=, >>>= |


**Exemplos**

int p1= 2 * 5 + 3 * 4 - 8;

int p1= 10 + 12 -8

int p1= 22 - 8

int p1= 14

------------

int p2 =  2 * ((5+3)* 4 - 8);

int p2 =  2 * ((8)* 4 - 8);

int p2 =  2 * (32 - 8);

int p2 =  2 * 24;

int p2 =  48;

------------

int x = 3;

int y = ++x * 5 / x-- + --x;

int y = 4 * 5 / 4 + 2;

int y = 20 / 4 + 2;

int y = 5 + 2;

int y = 7;


## Promoção Numérica

Se dois valores tem diferentes tipos de dados, o Java irá automática promover o valor com o tipo menor para o maior


## While



## For

Tipos de dados pegadinhas prova de certificação

Compatíveis : no caso abaixo o tipo é o mesmo.

[image 1]


Incompatíveis: No caso abaixo temos tipos diferentes

[Imagem2]


## Strings

### Imutabilidade de Strings

Um objeto imutável é um objeto que não pode ser modificado após a sua criação.
Em Java todas as Strings são imutáveis.


### Métodos de Strings


length() - Não recebe valor e retorna o tamanho da String. ***Somente na string é um método.

charAt(int Index) -  Recebe valor int e Retornar o char da posição.

indexOf(char c) - Recebe valor char e retorna posição do index

indexOf(char c, int fromIndex) - Recebe valor char e retorna posição a partir do fromIndex

indexOf(String s) - Recebe valor String e retorna posição do index

indexOf(String s, int fromIndex) -   Recebe valor String e retorna posição a partir do fromIndex

substring(int Index) - Corta a string a partir do index informado como parâmetro do método.

substring(int beginIndex, int endIndex) - Corta a string a partir do beginIndex até o endIndex  informado como parâmetros do método.

toLowerCase(String str) - Recebe uma string e ajusta a string para minuscula.

toUpperCase(String str) - Recebe uma string e ajusta a string para maiúscula.

equals(String str) - Recebe uma string e verifica se o conteúdo é igual na comparação retornando um boolean.

equalsIgnoreCase(String str) - Recebe uma string e ignora se a string está em minúscula ou maiúscula.

contains(String str) - Recebe a String e retorna um boolean caso encontre o valor.

replace (char oldChar, char newChar) - Recebe os valor antigos e novos para a substituição dos valores.

trim() - Não recebe nada e remove espaços na string


## StringBuilder

A diferença entre string e stringBuilder é que na string ela é imutável já no stringBuilder conseguimos realizar operações como append, remove na mesma string sem a necessidade de criar uma nova string.

Métodos específicos StringBuilder

sb.append(?) - No caso ira atribuir a string o valor passado no “?” conforme o seu tipo.

sb.insert(int Index, String str) - Recebe a posição qual será inserido o conteúdo e o valor a ser inserido.

sb.delete (int start, int end) - Recebe as posições de inicio e fim para realizar o delete.

sb.deleteCharAt (int index) - Recebe a posição qual deverá ser excluída a informação.


## StringBuilder vs StringBuffer

Diferenças entre elas é basicamente que o StringBuffer trabalha com SingleThread já StringBuffer trabalha com ThreadSafe os objetos são marcados como synchronized  é uma garantia que o objeto não será utilizado enquanto estiver sendo manipulado pelo stringBuffer

StringBuffer tem todos os métodos do StringBuilder

## Array

O array é **estático**


## ArrayList

O arrayList é **dinâmico**

O arraylist Integer com Wrapper pode receber o valor null já no primitivo não pode.


## Arrays MultiDimensionais

Embora seja permitido deixar indefinido o tamanho das últimas dimensões, o tamanho da primeira é obrigatório.


## Autoboxing

Conversão do tipo primitivo para objeto ou vice-versa.


## Dates

LocalDate: Somente a data

LocalTime: somente o horário

LocalDateTime: data e tempo sem zona.

data e hora no momento utilizamos o método .now()

Atenção: não é possível instanciar os Date&Time.

### Metódos data

withDayOfYear(13) -> Dentre os 365 dias do ano ele irá retornar o dia 13 do ano no caso 2024/01/13


## Sobrecarga de métodos

Exemplos

public void fly(int numMiles){}

public void fly (short numFeet){}

public boolean fly (){return false;}

## Ordem de inicialização

Sequência de execução.

1.Herança

2.Static

3.Instância

4.Construtor

## Encapsulamento (Modificadores de Acesso).

**public** - pode ser invocado em qualquer classe.

**private** - apenas dentro da classe onde foi criado

**protected** - em classes do mesmo pacote ou nas subclasses

**Default** - apenas classes do mesmo pacote


## Especificadores opcionais

**static** - pode ser chamado pela classe.

**abstract** - não tem o corpo {}, somente “;”.

**final** - não pode ser alterado.

## Lambdas

São métodos anônimos que implementam uma interface funcional.
Exemplo


[imagem]

## Métodos e assinaturas

[imagem]


## Vargas
O vargas deve ser sempre o último parâmetro do método e só poderá ter um em cada método.

Exemplos:

public void walk (int … nums){} ✅
public void walk1 (int start , int … nums){} ✅
public void walk (int… nums, int start){} ❌
public void walk (int …start, int… nums){} ❌

## O que é o super()

A palavra-chave super em java é uma variável de referência usada para referir objetos da classe pai. A palavra-chave “super” entrou em cena com o conceito de Herança. Basicamente, essa forma de super é usada para inicializar variáveis ​​da superclasse quando não há nenhum construtor presente na superclasse. Por outro lado, geralmente é usado para acessar a variável específica de uma superclasse.

A chamada super() deve ser a primeira e única do método.

## Exceções

A declaração da exceção sempre será throwS, com “S” no final.

o throw é quando vamos lançar a exceção.
