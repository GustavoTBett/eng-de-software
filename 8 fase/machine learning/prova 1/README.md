---

# 🧠 Guia de Estudo: Inteligência Artificial e Machine Learning

Este guia resume os conceitos essenciais apresentados nas aulas, cobrindo desde os fundamentos da Inteligência Artificial até o pipeline de desenvolvimento de Machine Learning.

---

## 🤖 **Capítulo 1: O Universo da Inteligência Artificial (IA)**

A Inteligência Artificial é um ramo vasto da ciência da computação focado na criação de máquinas inteligentes que podem executar tarefas que, tradicionalmente, requerem inteligência humana. A faísca inicial do campo é frequentemente atribuída à pergunta de Alan Turing em 1950:

> *"As máquinas podem pensar?"*

### 🔹 **Tipos de IA**
* **IA Fraca (Weak AI):** Sistemas projetados para realizar uma tarefa específica e bem definida. Pense em assistentes virtuais ou reconhecimento de imagens.
* **IA Forte (Strong AI):** Uma IA teórica com consciência e capacidade intelectual indistinguível da humana, muito explorada na ficção científica.

### 🔹 **Aplicações Práticas**
A IA já transforma diversos setores:
* 🩺 **Saúde e Medicina**
* 📈 **Negócios**
* 🎓 **Educação**
* 🛡️ **Segurança**
* 🏭 **Indústria**

---

## ⚙️ **Capítulo 2: Mergulhando em Machine Learning (ML)**

> Machine Learning (ML) é uma técnica de ciência de dados usada para extrair padrões dos dados, permitindo que os computadores identifem dados relacionados e prevejam resultados, comportamentos e tendências futuros.

Em essência, o ML usa **dados** para **fazer previsões** ou **identificar relações importantes**.

### 🔹 **IA, ML e Deep Learning: Qual a Relação?**
* **Inteligência Artificial (IA):** O campo mais amplo, focado em criar máquinas que podem aprender e raciocinar como humanos.
* **Machine Learning (ML):** Uma aplicação da IA que permite que sistemas aprendam com dados sem serem explicitamente programados.
* **Deep Learning (DL):** Um subconjunto do ML que utiliza redes neurais artificiais para aprender a partir de grandes volumes de dados.

---

## 📊 **Capítulo 3: Tipos de Aprendizado de Máquina**

O aprendizado de máquina é geralmente dividido em três grandes categorias:

### **1. Aprendizado Supervisionado**
Utiliza dados previamente rotulados para treinar o modelo. O objetivo é aprender uma função de mapeamento para prever a saída (Y) a partir de novos dados de entrada (x).

* **Classificação**: Prever uma categoria.
    * *Exemplos*: Diagnósticos médicos (doença vs. sem doença), filtragem de spam, classificação de resíduos.
* **Regressão**: Prever um valor numérico contínuo.
    * *Exemplos*: Previsão de preços de imóveis, estimativa de expectativa de vida, previsão do tempo.

### **2. Aprendizado Não Supervisionado**
O modelo trabalha com dados não rotulados para encontrar estruturas e padrões ocultos por conta própria.

* **Clusterização (Clustering)**: Descobrir agrupamentos naturais nos dados.
    * *Exemplo*: Segmentação de clientes com base no comportamento de compra.
* **Associação**: Encontrar regras que descrevem grandes porções dos dados.
    * *Exemplo*: Descobrir que clientes que compram o produto X também tendem a comprar o produto Y.

### **3. Aprendizado por Reforço**
Um agente aprende a tomar decisões interagindo com um ambiente. Ele é treinado usando um sistema de recompensas e punições, aprendendo sem intervenção humana a maximizar sua recompensa total.

---

## 🚀 **Capítulo 4: O Pipeline de Desenvolvimento de ML**

Construir um modelo de ML é um processo estruturado com várias etapas-chave:

1.  **Coleta de Dados**: A qualidade e a quantidade das informações coletadas são cruciais para o sucesso do modelo.
2.  **Feature Engineering**: Prepara o conjunto de dados para o algoritmo e melhora o desempenho dos modelos. Inclui pré-processamento, extração e seleção de *features*.
3.  **Construção dos Modelos**:
    * **Seleção**: Escolher o algoritmo (Classificação, Regressão, Clusterização, etc.) que melhor se alinha aos objetivos do projeto.
    * **Treinamento e Avaliação**: O treinamento aprimora as habilidades do modelo, enquanto a avaliação testa se ele está capacitado para a tarefa.
4.  **Deployment**: A etapa final, onde o modelo é colocado em produção para ser ativamente utilizado e resolver um problema real.

---

## ⚠️ **Capítulo 5: Desafios e Terminologia**

### 🔹 **Termos Essenciais**
* **Linha (Observação, Amostra, Entidade)**: Uma única entrada no conjunto de dados.
* **Coluna (Feature, Atributo)**: Uma propriedade ou característica de uma entidade.
* **Algoritmo vs. Modelo**:
    * `Algoritmo`: É o processo de aprendizagem.
    * `Modelo`: É a representação específica aprendida a partir dos dados.
    * `Modelo = Algoritmo(dados)`

### 🔹 **Principais Desafios**
As duas principais fontes de erro são "algoritmo ruim" e "dados ruins".
* Quantidade insuficiente de dados de treinamento.
* Dados de treinamento não representativos.
* Dados de baixa qualidade e features irrelevantes.
* **Overfitting**: O modelo se ajusta demais aos dados de treino e perde a capacidade de generalizar.
* **Underfitting**: O modelo é muito simples para capturar a estrutura dos dados.

---

## 📚 **Capítulo 6: Ferramentas e Recursos**

Para colocar a mão na massa, o ecossistema de ML conta com diversas ferramentas e fontes de conhecimento:

* **Linguagem & Ambientes**: Python, Anaconda, Jupyter e Google Colab.
* **Bibliotecas Populares**: Pandas, NumPy, Matplotlib, Scikit-learn, TensorFlow e Keras são algumas das principais bibliotecas.
* **Fontes de Datasets**: Kaggle, UCI Machine Learning Repository, Google Dataset Search, entre outros.
* **Livros Recomendados**:
    1.  *Mãos à Obra: Aprendizado de Máquina com Scikit-Learn & TensorFlow*
    2.  *Python para Análise de Dados*
    3.  *Estatística Prática para Cientistas de Dados*

---

# Aula 3 – Pré-processamento de Dados 

---

## Tipos Comuns de Dados  
- **Tabulares (DataFrames)**  
  - Estrutura bidimensional (linhas e colunas).  
  - Exemplo: `pandas.DataFrame`  
  - Operações principais:  
    - Abrir/escrever arquivos (`read_csv`, `to_csv`, `read_excel`).  
    - Remover linhas/colunas (`drop`).  
    - Coletar informações (`shape`, `index`, `columns`, `info`, `describe`, `min`, `max`, `sum`).  

- **Categóricos**  
  - Variáveis que representam categorias.  
  - Técnicas de transformação:  
    - **Ordinal Encoding:** converte categorias em inteiros.  
    - **One Hot Encoding:** cria colunas binárias para cada categoria.  

---

## Tratamento de Dados Nulos  
- Excluir colunas com valores nulos.  
- Excluir apenas as linhas nulas.  
- Substituir pela média da coluna.  
- Substituir por um valor fixo.  

---

## Escalonamento de Dados  
- Necessário para melhorar desempenho de algoritmos que usam **distância euclidiana**.  

### Padronização  
- Transforma dados para **média = 0** e **desvio padrão = 1**.  
- Fórmula:  
  \[
  z = \frac{x - \mu}{\sigma}
  \]  

### Normalização (Min-Max)  
- Redimensiona valores para um intervalo fixo, geralmente **[0, 1]**.  
- Fórmula:  
  \[
  x' = \frac{x - x_{min}}{x_{max} - x_{min}}
  \]  

### Diferenças  
- **Padronização:** preserva distribuição, menos sensível a outliers, usada em dados normais.  
- **Normalização:** sensível a outliers, garante escala fixa entre variáveis.  

---

## Atividade  
1. Aplicar as técnicas de pré-processamento vistas em aula nos datasets explorados anteriormente.  
2. Utilizar tutoriais para visualização do **Titanic dataset**:  
   - [Visualizing the Titanic Data (Seaborn)](https://www.kaggle.com/code/fourbic/visualizing-the-titanic-data-with-seaborn)  
   - [Seaborn Titanic Example (GitHub)](https://gist.github.com/mwaskom/8224591)  

---

# 📊 Resumo – Códigos da Aula de Pré-processamento de Dados

## 1. **DataFrames**
- Estruturas em forma de tabela (linhas e colunas).  
- Criados com `pd.DataFrame`.  
- Usados para manipular dados de forma parecida com Excel.

---

## 2. **Leitura e Escrita de Arquivos**
- `pd.read_csv('arquivo.csv')` → lê arquivos CSV.  
- `pd.to_csv('arquivo.csv')` → salva DataFrame em CSV.  
- `pd.read_excel('arquivo.xlsx', 'Planilha 1')` → lê planilha do Excel.

---

## 3. **Manipulação de Dados**
- Remover linhas:  
  ```python
  data_frame.drop([0, 1])  # remove linhas 0 e 1
  ```
Remover colunas:

```python
data_frame.drop('País', axis=1)  # axis=1 = coluna
```
⚡ axis=0 → linhas | axis=1 → colunas

4. Exploração de Dados
data_frame.shape → dimensões (linhas, colunas).

data_frame.columns → nomes das colunas.

data_frame.info() → tipos e nulos.

data_frame.drop('País', axis=1)  # axis=1 = coluna
⚡ axis=0 → linhas | axis=1 → colunas

4. Exploração de Dados
data_frame.shape → dimensões (linhas, colunas).

data_frame.columns → nomes das colunas.

data_frame.info() → tipos e nulos.

data_frame.describe() → estatísticas (média, min, max…).

data_frame.sum(), min(), max() → operações básicas.

5. Tratamento de Dados Nulos
Remover colunas ou linhas com valores nulos.

Substituir nulos pela média da coluna.

Substituir por um valor fixo.

6. Escalonamento (Scaling)
Usado para colocar variáveis em mesma escala → melhora algoritmos de ML.

Padronização (Z-score)

Média = 0, Desvio Padrão = 1

Fórmula: (x - μ) / σ

Normalização (Min-Max)

Intervalo fixo [0, 1]

Fórmula: (x - x_min) / (x_max - x_min)

Diferença:

Padronização → bom para dados normais, menos sensível a outliers.

Normalização → sensível a outliers, mas garante mesmo intervalo.

7. Dados Categóricos
Ordinal Encoding → transforma categorias em inteiros (0, 1, 2…).

One Hot Encoding → cria colunas extras (binárias) para cada categoria.

---