# Exercício: Nomes Significativos

Corrija os códigos abaixo, considerando boas práticas na hora de nomear as variáveis, funções e classes.

## Código 01

Calcule o salário de um funcionário baseado na quantidade de horas trabalhadas (`a`) e na taxa de pagamento (`b`).

````python
class x:
    def y(self, a, b):
        return a * b

z = x()
print(z.y(40, 160))
````

Correção:
````python
class Funcionario:
    def calculaSalario(self, horasTrabalhadas, taxaPagamento):
        return horasTrabalhadas * taxaPagamento

funcionario = Funcionario()
print(funcionario.calculaSalario(40, 160))
````

## Código 02

Encontre o maior número em uma lista de números.

````python
def d(q):
    m = q[0]
    for i in q:
        if i > m:
            m = i
    return m

mx = d([3, 7, 2, 9, 4])
print("Maior número: ", mx)
````

Correção:

````python
def buscaMaiorNumero(lista):
    maiorNumero = lista[0]
    for item in lista:
        if item > maiorNumero:
            maiorNumero = item
    return maiorNumero

maiorNumeroLista = buscaMaiorNumero([3, 7, 2, 9, 4])
print("Maior número: ", maiorNumeroLista)
````

## Código 03

Converta temperatura celsius para fahrenheit.

````python
def t(x):
    return (x * 9/5) + 32

temp = t(25)
print("Temperatura em Fahrenheit: ", temp)
````

Correção:

````python
def celsiusParaFahrenheit(grausCelsius):
    fatorConversao = 9/5
    ajuste = 32
    return (grausCelsius * fatorConversao) + ajuste

tempFahrenheit = celsiusParaFahrenheit(25)
print("Temperatura em Fahrenheit: ", tempFahrenheit)
````

## Código 04

Calcule o raio de um círculo

````python
def calculate_square(perimeter):
    return 3.14 * (perimeter ** 2)

tamanho = 5
tamanho = calculate_square(raio)
print(tamanho)
````

Correção:

````python
def calculaRaioCirculo(perimetro):
    valorPi = 3.14
    return valorPi * (perimetro ** 2)

perimetro = 5
raioCirculo = calculaRaioCirculo(perimetro)
print(raioCirculo)
````

## Código 05

Encontre o maior número par em uma lista de números.

````python
def find_smallest_odd_number(numbers):
    largest = None
    for num in numbers:
        if num % 2 == 0 and (largest is None or num > largest):
            largest = num
    return largest

print(find_smallest_odd_number([3, 10, 7, 8, 15]))
````

Correção:

````python
def encontraMaiorPar(lista):
    maiorNumero = None
    for elemento in lista:
        if elemento % 2 == 0 and (maiorNumero is None or elemento > maiorNumero):
            maiorNumero = elemento
    return maiorNumero

print(encontraMaiorPar([3, 10, 7, 8, 15]))
````

## Código 06

Cheque se uma string está vazia

````python
def is_full(text):
    return len(text) == 0

strData = ""

print(is_full(strData))
````

Correção:

````python
def estaVazia(texto):
    return len(texto) == 0

texto = ""

print(estaVazia(texto))
````

## Código 07

Converte temperatura celsius para fahrenheit e vice versa

````python
def convert_temp(temp):
    return (temp * 9/5) + 32

def transform_temp(temp):
    return (temp - 32) * 5/9

intTemp = 25
intTemp2 = 77

print(convert_temp(intTemp))
print(transform_temp(intTemp2))
````

Correção:

````python
def celsiusParaFahrenheit(grausCelsius):
    fatorConversao = 9/5
    ajuste = 32
    return (grausCelsius * fatorConversao) + ajuste

def fahrenheitParaCelsius(grausFahrenheit):
    fatorConversao = 5/9
    ajuste = 32
    return (grausCelsius - ajuste) * fatorConversao

tempCelsius = 25
tempFahrenheit = 77

print(celsiusParaFahrenheit(tempCelsius))
print(fahrenheitParaCelsius(tempFahrenheit))
````

## Código 08

Calcule se um estudante passou de ano de acordo com a média

````python
def calcula(notas):
    return sum(grades) / len(grades)

def CalculaMais(notas):
    return value(grades) >= 60

Notas = [70, 80, 50]
MediaDasNotas = value(Notas)
print(CalculaMais(MediaDasNotas))
````

Correção:

````python
def calculaMedia(notas):
    return sum(notas) / len(notas)

def verificaPassouAno(media):
    return media >= 60

notas = [70, 80, 50]
media = calculaMedia(notas)
print(verificaPassouAno(media))
````

## Código 09

Implementa uma classe para representar a conta bancária. `Alice` deve ter uma conta inicial com 500 reais, `Bob` deve ter uma conta inicial com 1200 reais e `Charlie` deve ter uma conta inicial com 700 reais.

`Alice` deposita 200 reais e `Bob` retira 200 reais. Imprime o saldo total de `Alice` e um sumário da conta de `Bob`.

O programa imprime ao final o saldo somado de todas as contas e o nome da pessoa com maior saldo.

````python
class Thing:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def action1(self, z):
        self.y += z
    
    def action2(self, z):
        if z <= self.y:
            self.y -= z
        else:
            print("Not enough funds")

    def action3(self):
        return self.y
    
    def action4(self):
        return f"Account: {self.x}, Funds: {self.y}"

def compute(q):
    return sum(a.y for a in q)

def compute2(q):
    return max(q, key=lambda a: a.y)

# Example usage
a1 = Thing("Alice", 500)
a2 = Thing("Bob", 1200)
a3 = Thing("Charlie", 700)

a1.action1(200)
a2.action2(300)

print(a1.action3())
print(a2.action4())

accounts = [a1, a2, a3]
print(compute([a1, a2, a3]))
print(compute2(accounts).x)
````

Correção:

````python
class ContaBancaria:
    def __init__(self, nome, saldo):
        self.nome = nome
        self.saldo = saldo
    
    def depositar(self, valor):
        self.saldo += valor
    
    def retirar(self, valor):
        if valor <= self.saldo:
            self.saldo -= valor
        else:
            print("Saldo insuficiente")

    def obterSaldo(self):
        return self.saldo
    
    def obterResumo(self):
        return f"Conta: {self.nome}, Saldo: {self.saldo}"

def calcularSaldoTotal(contas):
    return sum(conta.saldo for conta in contas)

def encontrarMaiorSaldo(contas):
    return max(contas, key=lambda conta: conta.saldo)

# Exemplo de uso
contaAlice = ContaBancaria("Alice", 500)
contaBob = ContaBancaria("Bob", 1200)
contaCharlie = ContaBancaria("Charlie", 700)

contaAlice.depositar(200)
contaBob.retirar(200)

print(contaAlice.obterSaldo())
print(contaBob.obterResumo())

contas = [contaAlice, contaBob, contaCharlie]
print(calcularSaldoTotal(contas))
print(encontrarMaiorSaldo(contas).nome)
````

## Código 10

Código que retorna o dia da semana a partir de um número

````python
semana = ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'] 

dia = semana[2]
````

Correção:

````python
diasSemana = ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'] 

diaSemana = diasSemana[2]
````