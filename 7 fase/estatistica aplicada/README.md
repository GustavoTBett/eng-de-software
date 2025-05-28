# Introdução à Estatística Aplicada  

## 📊 A Ciência Estatística  
- A palavra **Estatística** foi formalizada por **Gottfried Achenwall**, considerado o pai da estatística.  
- Estatística é usada para coletar, analisar e interpretar dados em diversas áreas.  

---

## 📈 Conceito de Estatística  
- "A estatística é a arte de torturar os dados até que eles digam a verdade." – Autor desconhecido.  
- Segundo o **IBGE (2023)**, estatística envolve:  
  - Planejamento do experimento.  
  - Coleta e inferência de dados.  
  - Processamento e análise.  
  - Disseminação da informação.  

---

## 📊 Estatística Aplicada  
- Relaciona dados a problemas, fornecendo informações relevantes para **tomada de decisões**.  
- É utilizada na **Engenharia de Computação/Software** para processar grandes volumes de dados, como logs e métricas.  

### 💡 **Exemplos de Aplicações:**  
- **Análise de desempenho de software**  
- **Estimativa de tempo e esforço em projetos**  
- **Testes de usabilidade**  
- **Análise de logs**  
- **Previsão de demanda e escalonamento de recursos**  

---

## 🔢 Estatística Descritiva e Inferencial  
### **População e Amostra**  
- **População**: Conjunto total de elementos estudados.  
- **Amostra**: Subconjunto representativo da população.  

### **Técnicas de Amostragem**  
1. **Amostragem Aleatória Simples**  
2. **Amostragem Sistemática**  
3. **Amostragem por Conglomerados**  
4. **Amostragem Estratificada**  

---

## 📊 Dados Absolutos e Relativos  
- **Dados Absolutos**: Obtidos diretamente da fonte, sem manipulação.  
- **Dados Relativos**: Obtidos por comparações entre dados absolutos.  
  - Exemplos: Porcentagens, Índices, Coeficientes, Taxas.  

---

## 📊 Distribuição de Frequência  
- **Distribuição de frequência**: Organização dos dados em intervalos, mostrando a frequência de ocorrência.  
- **Construção de Tabelas de Frequência**:  
  - Classificação dos dados em intervalos.  
  - Cálculo de frequências absolutas e relativas.  

---

## 📏 Medidas de Posição e Dispersão  
- **Medidas de Posição**: Média, Mediana e Moda.  
- **Medidas de Dispersão**: Desvio Padrão, Variância e Amplitude.  
  - **Exemplo**: Avaliação do tempo médio de resposta de um sistema.  

---

## 🔄 Distribuição Estatística  
- **Função Densidade de Probabilidade** e **Função de Distribuição Acumulada**.  
  - **Exemplo**: Análise de tempos de resposta de um software.  

---

## 🎲 Probabilidade e Teorema do Produto  
- **Espaço amostral** e **probabilidade de eventos**.  
- **Teorema do Produto**: Probabilidade conjunta de eventos independentes.  
  - **Exemplo**: Probabilidade de um erro de software ocorrer em diferentes fases do projeto.  

---

## 📊 Independência Estatística e Teorema de Bayes  
- **Eventos independentes vs. dependentes**.  
- **Teorema de Bayes**: Atualização de probabilidades com novas informações.  
  - **Exemplo**: Probabilidade de um bug ser crítico ou não, dado seu tipo.  

---

## 🔬 Teste de Hipóteses e Intervalos de Confiança  
- **Conceito de teste de hipóteses** na Engenharia de Software.  
- **Exemplo**: Comparação do desempenho de dois algoritmos de busca.  

---

## 📈 Correlação e Regressão Estatística  
- **Correlação**: Relação entre variáveis.  
- **Regressão Linear**: Previsão baseada em tendências.  
  - **Exemplo**: Relação entre tamanho do código e número de defeitos em software.  

---

# **Python Fundamentos – Biblioteca Pandas e NumPy – Parte 01**  
### **Disciplina: Estatística Aplicada à Engenharia de Software**  
#### **Prof. Me. Max Gabriel Steiner**  

---

## **1. Introdução à Biblioteca Pandas e NumPy**  

### **Pandas**  
- Utilizado para ler e manipular dados, como arquivos CSV.  
- **Estruturas principais:**  
  - **Series**: Estrutura unidimensional que pode conter qualquer tipo de dado.  
  - **DataFrame**: Estrutura bidimensional semelhante a uma planilha.  
  - **Index**: Estrutura que fornece rótulos para as linhas e colunas.  

### **NumPy**  
- Suporte para **arrays multidimensionais** e **operações matemáticas** eficientes.  

#### **Exemplo de criação de uma matriz NumPy e operação:**  

```
import numpy as np

# Criando uma matriz NumPy
matriz = np.array([[1, 2, 3], [4, 5, 6]])

# Multiplicação por 2
resultado = matriz * 2

print(matriz)
print(resultado)
```  

---

## **2. Biblioteca Pandas**  

- **Pandas e NumPy não são módulos built-in** do Python.  
- Podem ser instalados manualmente ou através do **Anaconda**.  

### **Importando o Pandas:**  
```
import pandas as pd
from pandas import Series, DataFrame
```  

---

## **3. Estrutura Series**  

- **Series** é um array unidimensional com dados e rótulos (índices).  

#### **Exemplo de criação de uma Series:**  

```
from pandas import Series

Obj = Series([4, 7, -5, 3])
print(Obj)
```  

#### **Verificando o tipo da variável:**  
```
type(Obj)  # Retorna <class 'pandas.core.series.Series'>
```  

#### **Obtendo valores e índices:**  
```
print(Obj.values)  # Retorna os valores da série
print(Obj.index)   # Retorna os índices
```  

#### **Criando uma Series com índices nomeados:**  
```
Obj2 = Series([10, 20, 30, 40], index=['a', 'b', 'c', 'd'])
print(Obj2)
```  

#### **Filtrando valores na Series:**  
```
print(Obj2[Obj2 > 15])  # Retorna apenas valores maiores que 15
```  

#### **Verificando se um índice existe:**  
```
print('d' in Obj2)  # Retorna True
```  

#### **Criando uma Series a partir de um dicionário:**  
```
dados = {'Futebol': 5200, 'Basquete': 3000, 'Vôlei': 4000}
Obj3 = Series(dados)
print(Obj3)
```  

---

## **4. Estrutura DataFrame**  

- Representa uma **estrutura tabular** semelhante a uma planilha do Excel.  
- Cada coluna pode ter um tipo de dado diferente.  

#### **Criando um DataFrame a partir de um dicionário:**  
```
data = {
    'Estado': ['SP', 'RJ', 'MG', 'RS'],
    'Ano': [2000, 2001, 2002, 2003],
    'População': [1.5, 2.0, 3.0, 4.5]
}

frame = DataFrame(data)
print(frame)
```  

#### **Verificando o tipo da variável:**  
```
type(frame)  # Retorna <class 'pandas.core.frame.DataFrame'>
```  

#### **Acessando colunas específicas:**  
```
print(frame['Estado'])  # Retorna apenas a coluna "Estado"
```  

#### **Criando uma nova coluna no DataFrame:**  
```
frame['Débito'] = [100, 200, 300, 400]
print(frame)
```  

---

## **5. Manipulação de Dados com Pandas**  

### **Concatenando Séries de Dados:**  
```
serie1 = Series([5200, 3000, 4000], index=['Futebol', 'Basquete', 'Vôlei'])
serie2 = Series([5200, 3000, 4000], index=['Futebol', 'Basquete', 'Vôlei'])

resultado = serie1 + serie2
print(resultado)
```  

- Os valores das séries são **somados** onde os índices são iguais.  

### **Nomeando índices e colunas:**  
```
Obj3.name = "População"
Obj3.index.name = "Esporte"
print(Obj3)
```  

---

## **Conclusão**  

- **Pandas** é essencial para análise e manipulação de dados estruturados.  
- **NumPy** é útil para cálculos numéricos e operações matriciais.  
- **Series** são como arrays unidimensionais com índices.  
- **DataFrames** são tabelas bidimensionais semelhantes ao Excel.  

Este documento apresentou conceitos fundamentais para começar a utilizar as bibliotecas **Pandas** e **NumPy** em Python. 🚀


# **Python Fundamentos – Biblioteca Pandas e NumPy – Parte 02**  
### **Disciplina: Estatística Aplicada à Engenharia de Software**  
#### **Prof. Me. Max Gabriel Steiner**  

---

## **1. Introdução ao NumPy e Pandas**  

- Para utilizar a biblioteca **NumPy**, precisamos importá-la no Python.  
- O Pandas permite visualizar e manipular dados em um **DataFrame**.  

---

## **2. Resumo Estatístico com Pandas**  

- O método **describe()** gera um resumo do DataFrame, incluindo:  
  - **count**: número total de elementos em cada coluna.  
  - **mean**: média dos elementos.  
  - **std**: desvio padrão.  
  - **min**: valor mínimo.  
  - **25%, 50%, 75%**: quartis dos dados.  
  - **max**: valor máximo.  

#### **Exemplo de uso do método describe():**  
```
import pandas as pd

# Criando um DataFrame de exemplo
data = {
    'Ano': [2001, 2002, 2003, 2004],
    'População': [1.5, 2.0, 3.0, 4.5]
}

df = pd.DataFrame(data)
print(df.describe())
```  

---

## **3. Verificação de Tipos de Dados**  

Podemos verificar os tipos de valores presentes no Dataset.  
Exemplo de tipos de colunas:  
- **Ano**: tipo **inteiro (int)**.  
- **Estado**: tipo **string (str)**.  
- **População**: tipo **float**.  

#### **Exemplo de verificação dos tipos das colunas:**  
```
print(df.dtypes)
```  

---

## **4. Índices e Estruturas do DataFrame**  

Podemos acessar informações importantes do DataFrame:  

#### **Visualizando os índices:**  
```
print(df.index)
```  

#### **Visualizando as colunas:**  
```
print(df.columns)
```  

#### **Visualizando os valores:**  
```
print(df.values)
```  

---

## **5. Fatiamento (Slice) de Dados**  

### **Selecionando apenas uma coluna:**  
```
print(df['População'])
```  

### **Selecionando um intervalo de linhas (slice):**  
Selecionando até a linha **2** (Python usa indexação baseada em zero).  
```
print(df[:3])
```  

---

## **6. Criação de DataFrames**  

Podemos criar um **DataFrame** a partir de um dicionário.  

#### **Exemplo de criação de um DataFrame:**  
```
web_stats = {
    'Dias': [1, 2, 3, 4, 5],
    'Visitantes': [100, 200, 300, 400, 500],
    'Taxas': [10, 20, 30, 40, 50]
}

df_web = pd.DataFrame(web_stats)
print(df_web)
```  

### **Definindo um índice personalizado:**  
Podemos definir uma coluna específica como índice do DataFrame.  

#### **Exemplo:**  
```
df_web = df_web.set_index('Dias')
print(df_web)
```  

---

## **7. Manipulação Avançada de DataFrames**  

### **Fatiamento por colunas específicas:**  
Selecionando apenas a coluna **Visitantes**:  
```
print(df_web['Visitantes'])
```  

### **Fatiamento de múltiplas colunas:**  
Selecionando **Visitantes** e **Taxas**:  
```
print(df_web[['Visitantes', 'Taxas']])
```  

---

## **Conclusão**  

- O Pandas e NumPy são ferramentas poderosas para manipulação e análise de dados.  
- O método **describe()** fornece um resumo estatístico rápido do DataFrame.  
- Podemos acessar informações como tipos de dados, índices e colunas do DataFrame.  
- É possível realizar **fatiamentos** para selecionar partes específicas dos dados.  
- Podemos criar **DataFrames** personalizados e definir índices específicos.  

Esse documento trouxe exemplos práticos para facilitar o uso das bibliotecas **Pandas** e **NumPy** em Python! 🚀  


# 📘 **Resumo: Amostragem Aleatória Simples**

## 📌 **Conceitos abordados**
- **Censo:** coleta de dados de toda a população. Exemplo: verificar o peso de pacotes em uma fábrica, quando possível medir todos.
- **Técnicas de Amostragem:**
  - Amostragem Aleatória Simples (AAS)
  - Amostragem Sistemática
  - Amostragem por Conglomerados
  - Amostragem Estratificada

## 🎯 **Amostragem Aleatória Simples (AAS)**
- Todos os elementos da população têm a mesma chance de serem escolhidos.
- Pode ser feita com:
  - **TNA** (Tabela de Números Aleatórios)
  - **Calculadora**
  - **Python**
  - **Excel** com `=ALEATÓRIOENTRE()`

## 🧠 **Exemplos Práticos**
1. **Empresa com 32 funcionários** → Seleção de 5 para pesquisa de atividade física.
2. **Escola com 1000 alunos** → Seleção de 100 para medição de estatura.
3. **Agência de viagens com 200 clientes** → Seleção de 10 para pesquisa de satisfação.

## 💻 **Uso de Python para AAS**
Python pode ser usado para automatizar a escolha de amostras, evitando o uso manual de TNA.

---

## 🧑‍💻 **Código Python**

```python
import random

# Exemplo: selecionar 5 pessoas de uma população de 32
populacao = [
    "Aristóteles", "Anastácia", "Arnaldo", "Bartolomeu", "Bernardino",
    "Cardoso", "Carlito", "Cláudio", "Ermílio", "Hercílio",
    "Ernestino", "Endevaldo", "Francisco", "Felício", "Fabrício",
    "Geraldo", "Gabriel", "Getúlio", "Hiraldo", "João da Silva",
    "Joana", "Joaquim", "Joaquina", "José da Silva", "José de Souza",
    "Josefa", "Josefina", "Maria José", "Ma Cristina", "Mauro",
    "Paula", "Paulo César"
]

# Tamanho da amostra
n = 5

# Seleciona uma amostra aleatória sem reposição
amostra = random.sample(populacao, n)

print("Amostra selecionada:", amostra)
```


# 📘 **Resumo: Amostragem Estratificada**

## 🧮 **Definição**
A amostragem estratificada é uma técnica onde a população é dividida em subgrupos (estratos) com características semelhantes, e uma amostra proporcional é retirada de cada estrato.

## 📊 **Exemplo Prático**
- **População total:** 100 pessoas
  - **Homens:** 60 (60%)
  - **Mulheres:** 40 (40%)
- **Amostra desejada:** 10% da população → 10 pessoas
  - **Homens na amostra:** 6
  - **Mulheres na amostra:** 4

Essa divisão proporcional respeita a estrutura da população, garantindo uma representação justa de cada grupo.

## 💻 **Código Python para Amostragem Estratificada**

```python
import random

# População dividida por estrato
homens = ["Homem" + str(i) for i in range(1, 61)]
mulheres = ["Mulher" + str(i) for i in range(1, 41)]

# Tamanho da amostra por estrato
amostra_homens = random.sample(homens, 6)
amostra_mulheres = random.sample(mulheres, 4)

# Amostra final
amostra_final = amostra_homens + amostra_mulheres
random.shuffle(amostra_final)

print("Amostra estratificada selecionada:", amostra_final)
```



# 📘 **Resumo: Amostragem Sistemática**

## 🧮 **Definição**
A amostragem sistemática é uma técnica em que se seleciona um ponto de partida aleatório e, a partir dele, os elementos são escolhidos com um intervalo constante (k).

## 📊 **Exemplo Prático**
- **População (N):** 122
- **Amostra (n):** 10
- **Intervalo (k):** N/n = 122/10 ≈ 12

### 🔢 Procedimento:
1. Sortear aleatoriamente um número entre 1 e 12 → por exemplo, 8
2. Adicionar 12 a cada passo:  
   8, 20, 32, 44, 56, 68, 80, 92, 104, 116

---

## 💻 **Código Python para Amostragem Sistemática**

```python
import random

# Definição da população
populacao = list(range(1, 123))  # População de 1 a 122

# Tamanho da amostra
n = 10
N = len(populacao)

# Cálculo do intervalo k
k = N // n

# Seleciona ponto de partida aleatório entre 1 e k
inicio = random.randint(1, k)

# Gera amostra sistemática
amostra = [populacao[i] for i in range(inicio - 1, N, k)][:n]

print("Amostra sistemática selecionada:", amostra)
```


# Amostragem por Grupos  

## Definição

**Amostragem por Grupos (ou Amostragem Cluster)** é uma técnica em que a população é dividida em grupos (clusters), e **um ou mais grupos são selecionados aleatoriamente** para formar a amostra.

---

## Exemplo

- **População total:** 28 indivíduos (neste caso, "28 narutos")
- **Divisão em grupos:** 4 grupos (identificados como 0, 1, 2 e 3)
- **Procedimento:** Selecionar **aleatoriamente um dos grupos** para representar toda a população.

---

## Observações

- Utilizada quando é difícil ou caro coletar dados de toda a população.
- É importante que os grupos sejam **heterogêneos entre si** e **homogêneos internamente**.
- A representatividade depende da **qualidade da divisão dos grupos**.

---

## Vantagens

- Redução de custos e tempo na coleta de dados.
- Simplicidade operacional.

## Desvantagens

- Menor precisão comparada à amostragem aleatória simples, caso os grupos não sejam bem definidos.

---

## Aplicações

- Pesquisas geográficas ou em regiões isoladas.
- Estudos educacionais por turmas ou escolas.
