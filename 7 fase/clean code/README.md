# 📖 Introdução ao Código Limpo

## 🚀 A Crise do Software
- Em 1968, a OTAN introduziu o conceito de **Engenharia de Software**.
- O aumento da demanda por software impulsionou o desenvolvimento de novas metodologias e ferramentas.

## ⚠️ Exemplos de Falhas de Software
### 💀 Caso Therac-25 (1980)
- Erros de software em máquinas de radioterapia levaram à morte de 6 pessoas entre 1985 e 1987.

### 💥 Caso Ariane 5 (1996)
- Explosão do foguete após 39 segundos de voo, causando um prejuízo de **370 milhões de dólares**.
- Causa: **Overflow** ao tentar converter uma variável de 64 bits para 16 bits.

## 🛠 Como Evitar Falhas?
- **Desenvolvimento Ágil**  
- **Testes Automatizados**  
- **Revisão de Código**  
- **Arquitetura Limpa**  
- **Programação Defensiva**  

## ✅ Impactos do Código Limpo
- **Redução de custos**
- **Maior produtividade**
- **Menos vulnerabilidades**
- **Facilidade na manutenção**
- **Escalabilidade da equipe**

## 🏆 Características do Código Limpo
- **Legível (Readability)**
- **Mantenível (Maintainability)**
- **Testável (Testability)**
- **Extensível (Extensibility)**
- **Elegante (Beauty)**

## 🚧 Barreiras para um Código Limpo
- **Ignorância**
- **Teimosia**
- **Arrogância**
- **Falta de Tempo**

> “É sua responsabilidade como programador defender seu código.”  
> — *Robert C. Martin*

## 🏦 Débito Técnico
- Surge quando uma implementação **apressada** é feita para atender a uma demanda imediata.
- Pode comprometer **performance, segurança e escalabilidade**.

## 📚 Práticas de Código Limpo
- O livro *Clean Code*, de **Robert C. Martin**, cunhou o termo **Código Limpo**.
- Referência para boas práticas, **mas não um dogma**.

## 🔤 Nomenclaturas
> "Existem apenas duas coisas difíceis em Ciência da Computação: **Invalidação de cache e nomear coisas**."  
> — *Phil Karlton, Netscape Developer*

## ✍️ Funções e Comentários
- **Uma função bem escrita vale mais do que mil comentários.**  
- Comentários mal escritos podem ser tão prejudiciais quanto código ruim.

## 🎨 Formatação e Estrutura
- Grandes empresas seguem padrões de código, como o **Google Java Style Guide**.
  - 🔗 [Google Java Guide](https://google.github.io/styleguide/javaguide.html)

## 🛑 Tratamento de Erros
- O primeiro bug documentado foi um **inseto preso** em um computador em 1947, relatado por **Grace Hopper**.

## 🧪 Testes Unitários
- Testes **unitários** verificam pequenas unidades de código de forma **isolada**.
- Devem ser escritos antes do código e rodar **automaticamente**.

> "Escrever código limpo é uma **arte**, não uma ciência."

## 📂 Material de Apoio
- [Clean Code (PT/EN)](https://github.com/cleberspirlandeli/Clean-Code-Codigo-Limpo)
- [BBC - Bugs Digitais e seus impactos](https://www.bbc.com/portuguese/noticias/2015/05/150513_vert_fut_bug_digital_ml)

# 📖 Convenções e Nomenclaturas

## 🎯 A Importância da Nomenclatura  
*"Existem apenas duas coisas difíceis em ciência da computação: invalidação de cache e nomear coisas."*  
— Phil Karlton, Netscape Developer  

- 70% do código-fonte do Eclipse é composto por nomes.  
- Programas com nomes claros e significativos são mais fáceis de entender e manter.  

## 🔠 Categorias de Nomes  

- **Variáveis, constantes e classes → Substantivos**  
  - Exemplos: usuario, analise_agenda, device_storage.  
- **Funções e métodos → Verbos**  
  - Exemplos: save_user_profile, get_user_info, get_user_data.  

## 📝 Tipos de Nomes para Funções  

De acordo com Caprile e Tonella:  

- **Ação indireta** → Exemplo: on_error, on_error_callback.  
- **Ação direta** → Exemplo: open, close, kill.  
- **Ação sobre objeto** → Exemplo: read_line, write_line.  
- **Ação dupla (evitar)** → Exemplo: search_and_replace_text.  
- **Checagem** → Exemplo: is_valid, is_empty.  
- **Transformação** → Exemplo: convert_to_hex, converte_para_binario.  

🔹 No Bash, os verbos mais usados são **get**, **set** e **make**.  

## ✅ Nomes com Significado  

Um nome deve descrever **o que faz**, não **como faz**.  

- **Ruim:** variável chamada `d` para armazenar o tempo decorrido em dias.  
- **Melhor:** `dias_desde_modificacao` para indicar o contexto corretamente.  

## ⚠️ Nomes Enganosos  

Evite nomes que induzam a erro:  

- **Errado:** `accountList` para uma única conta.  
- **Certo:** `account` para um único elemento e `account_list` para uma lista.  
- **Outro exemplo ruim:** `students` para armazenar um único estudante.  
- **Melhor opção:** `student` para um único aluno e `students` para uma coleção.  

## 🎭 Distinções Significativas  

Evite usar sinônimos para funções diferentes:  

- **Ruim:** `delete_user` e `remove_user` fazem coisas diferentes.  
- **Melhor:** `delete_user` para remoção permanente e `disable_user` para desativação temporária.  

## 🔊 Nomes Pronunciáveis  

- Em vez de usar `ymdhms`, prefira `timestamp`.  
- Evite números aleatórios em nomes de variáveis, como `temp_55834`. Use `population` se representar uma população.  

## 🛑 Evite Abreviações  

- **Ruim:** `get_df_user`.  
- **Melhor:** `get_default_user` para indicar claramente seu propósito.  

## 🔍 Facilidade de Busca  

- **Errado:** nomear variáveis como `x` e `y` sem contexto.  
- **Certo:** usar `x_axis` e `y_axis` para maior clareza.  

## 🔠 Prefixos e Sufixos (Evitar)  

- Antigamente, era comum usar prefixos como `s_name`. Hoje, isso não é mais recomendado.  
- **Exceção:** Para interfaces e implementações, ainda é comum o uso de prefixos como `IUserRepository` e `UserRepositoryImpl`.  

## 🧠 Mapeamento Mental  

Guarde sua memória para o essencial:  

- **Evite nomes longos demais**, como `findArticlesWithoutTitlesThenApplyDefaultStyles`.  
- **Melhor opção:** dividir em funções menores chamadas `find_articles_without_titles` e `apply_default_styles`.  

## 🏛 Nomes de Classes e Métodos  

- **Classes** → Substantivos, como `User`, `Product`, `Account`.  
  - Evite nomes genéricos como `Manager`, `Processor`, `Data`.  
- **Métodos** → Verbos, como `post_tweet`, `delete_user`, `calculate_total`.  

## 🚫 Não seja "espertinho"  

- **Ruim:** nomear uma função de deletar usuários como `jogar_granada_de_mao`.  
- **Melhor:** nomes diretos e explicativos.  

## 🔄 Domínio do Problema vs. Solução  

- **Sempre que possível**, use nomes do domínio da solução, como `fila_de_espera` em vez de `sala_de_espera`.  
- Caso contrário, utilize nomes do domínio do problema, como `JogadorReserva` em vez de `IndividuoPreterido`.  

## 🎯 Resumo dos Problemas  

Um nome pode ser ruim se for:  

- **Muito específico**  
  - Exemplo: `set()`, sem contexto claro.  
  - Exemplo: `get_all_users_with_permission_to_edit_article` (muito longo).  
- **Muito ambíguo**  
  - Exemplo: `file`, que pode significar várias coisas diferentes.  
- **Incorreto**  
  - O nome não representa corretamente o que a variável armazena.  
- **Inconsistente**  
  - O nome não segue o padrão do código.  

## 📚 Material de Apoio  

- [Thesaurus (EN)](https://www.thesaurus.com/)  
- [Sinônimos (PT)](https://www.sinonimos.com.br/)  
- [Scientific Perspective on Naming in Programming](https://dl.acm.org/)  


# 📖 Tópico 03 - Convenções de Nomes  

## 🔍 O que são Naming Conventions?  

- Naming conventions são padrões que definem como os nomes de variáveis, funções, classes e outros elementos de código devem ser escritos.  
- Facilitam a leitura e a manutenção do código, promovendo consistência.  
- Diferentes convenções são usadas em diferentes contextos, linguagens de programação e sistemas operacionais.  

---

## 📌 Principais tipos de Naming Conventions  

1. PascalCase  
2. camelCase  
3. snake_case  
4. kebab-case  
5. SCREAMING_SNAKE_CASE  
6. Hungarian Notation  
7. Train-Case  
8. Flatcase  

---

## 🔤 PascalCase  

- Cada palavra começa com letra maiúscula, sem separadores.  
- **Exemplo:** `MyClass`, `UserController`.  
- **Uso comum:** Nomeação de classes e tipos em linguagens como C#, Java e TypeScript.  

---

## 🔤 camelCase  

- A primeira palavra é em minúscula, e as subsequentes começam com maiúscula.  
- **Exemplo:** `myVariableName`, `getUserData`.  
- **Uso comum:** Nomeação de variáveis e funções em linguagens como JavaScript, Java e Swift.  

---

## 🔤 snake_case  

- As palavras são todas em minúsculas e separadas por underscores (_).  
- **Exemplo:** `my_variable_name`, `get_user_data`.  
- **Uso comum:** Utilizado em Python para funções e variáveis, e em nomes de arquivos.  

---

## 🔤 kebab-case  

- As palavras são em minúsculas e separadas por hifens (-).  
- **Exemplo:** `my-variable-name`, `get-user-data`.  
- **Uso comum:** Muito utilizado em nomes de classes CSS e URLs.  

---

## 🔤 SCREAMING_SNAKE_CASE  

- Igual ao snake_case, mas todas as letras são maiúsculas.  
- **Exemplo:** `MY_CONSTANT_NAME`, `API_KEY`.  
- **Uso comum:** Usado para constantes em linguagens como C, C++ e Python.  

---

## 🔤 Hungarian Notation  

- Usa prefixos para indicar o tipo ou propósito da variável.  
- **Exemplo:** `strName` (string), `intAge` (inteiro).  
- **Uso comum:** Bastante utilizado em linguagens mais antigas, como Visual Basic e C.  

---

## 🔤 Train-Case  

- As palavras são separadas por hifens, mas com cada palavra começando em maiúscula.  
- **Exemplo:** `My-Variable-Name`.  
- **Uso comum:** Menos comum, pode aparecer em alguns casos específicos.  

---

## 🔤 Flatcase  

- Todas as letras são minúsculas, sem espaços ou separadores.  
- **Exemplo:** `myvariablename`.  
- **Uso comum:** Geralmente usado em sistemas compactos ou em nomes de arquivos.  

---

## 📌 Onde as Naming Conventions são usadas?  

| Convenção | Linguagens/Sistemas | Contexto de Uso |
|-----------|--------------------|----------------|
| **PascalCase** | C#, Java, TypeScript | Classes, tipos e métodos em frameworks e APIs |
| **camelCase** | JavaScript, Swift, Java | Variáveis e funções |
| **snake_case** | Python, C, Ruby | Funções, variáveis, nomes de arquivos |
| **kebab-case** | CSS, HTML, URLs | Classes CSS, nomes de arquivos web |
| **SCREAMING_SNAKE_CASE** | C, Python, Ruby | Constantes |
| **Hungarian Notation** | C, Visual Basic | Indicação de tipos em variáveis |
| **Flatcase** | Arquivos compactados | Nomes de arquivos e URLs curtos |

---

## 📌 Outras Convenções Importantes  

1. **Namespaces:**  
   - Estrutura hierárquica usada em linguagens como C# para organizar classes e métodos em módulos.  

2. **Nome de Arquivos e Pastas:**  
   - Sistemas operacionais têm suas próprias regras, como o uso de underscores ao invés de espaço para compatibilidade com Unix/Linux.  

3. **Web Naming Conventions:**  
   - URLs usam kebab-case por questões de legibilidade e SEO.  

---

## 🎯 O que aprendemos hoje  

✔ Diferentes tipos de naming conventions e exemplos.  
✔ Onde e quando cada convenção é utilizada.  
✔ A importância de seguir padrões para consistência e manutenção do código.  

# 📖 Tópico 04 - Funções  


## 🔍 O que são Funções?  

- Funções são blocos de código que realizam uma tarefa específica.  
- Podem receber parâmetros, realizar cálculos e retornar um resultado.  

---

## 🏛 Funções vs Métodos  

- A diferença entre funções e métodos é que os métodos pertencem a uma classe ou objeto específico.  
- O objeto é um dos parâmetros de cada método (`self` / `this`).  
- Uma função pode ser chamada de qualquer lugar do código.  
- Um método pode ser chamado apenas dentro da classe ou objeto em que foi definido.  

---

## 🔹 Argumentos vs Parâmetros  

- **Argumentos:** Valores passados para uma função quando ela é chamada.  
- **Parâmetros:** Variáveis declaradas em uma função para receber os argumentos.  

---

## 🎯 Princípio da Responsabilidade Única (SRP)  

- O **Princípio da Responsabilidade Única** faz parte dos princípios **SOLID**.  
- Uma classe ou método deve ter **apenas uma responsabilidade**.  

**Melhoria no código:**  
- Separação de responsabilidades dentro de uma classe.  
- Divisão de funções que realizam mais de uma tarefa.  

---

## 📖 Ordem de Leitura  

- O código-fonte deve contar a história de forma lógica e linear.  
- Pode-se usar diferentes estratégias, como leitura **de cima para baixo (top-down)** ou **de baixo para cima (bottom-up)**.  

---

## ❌ Evitando `switch`  

- O uso de `switch` é geralmente desencorajado por questões de legibilidade e manutenção.  
- Pode ser substituído por uma tabela de decisão ou polimorfismo.  

---

## 🔤 Nomes Significativos  

- Métodos e funções devem possuir **nomes claros e descritivos**.  
- **Exemplos:** `post_tweet`, `delete_user`, `calculate_total`.  

---

## 🔢 Parâmetros em Funções  

- Segundo o livro *Clean Code*, a quantidade ideal de parâmetros de uma função deve ser **0**, seguida de **1, 2 ou 3**.  
- Quanto mais parâmetros uma função tiver, mais difícil será identificar todas as possibilidades de uso.  

---

## ⚠️ Parâmetros Lógicos  

- O uso de um **booleano** como parâmetro de uma função é um sinal de que a função **faz mais do que uma coisa**.  
- Exemplo de refatoração: Separar funções para comportamentos distintos em vez de usar um booleano.  

---

## 🔄 Efeitos Colaterais  

- **Efeitos colaterais** são ações que acontecem fora do escopo da função, alterando o estado do programa de forma indireta.  
- Exemplo: Alteração de uma variável global dentro de uma função.  

---

## 🎯 Parâmetros de Saída  

- Parâmetros são geralmente interpretados como **entradas** de uma função.  
- **Parâmetros de saída** são modificados pela função e devem ser evitados, especialmente em linguagens orientadas a objetos.  

---

## ✨ Separação Comando-Consulta  

- **Uma função deve executar uma modificação ou uma consulta, mas não ambas.**  
- Se um método altera o estado de um objeto, ele não deve retornar um valor.  

---

## ❌ Tratamento de Erros vs Exceções  

- Funções que retornam códigos de erro são difíceis de testar e devem ser substituídas por exceções.  
- **Melhor prática:** Lançar exceções específicas em vez de retornar valores de erro.  

---

## 🛠 Extração de Exceções  

- **Blocos `try-catch` longos tornam o código difícil de ler.**  
- Solução: Extrair a lógica de tratamento de erros para uma função separada.  

---

## 🔁 Evite Repetição  

- **Códigos duplicados são difíceis de manter.**  
- **Refatoração:** Criar funções genéricas para evitar duplicação de lógica.  

---

## 🎯 Conclusão  

✔ Funções devem ser **pequenas**, com no máximo **20 linhas**.  
✔ Funções devem ser **bem nomeadas**.  
✔ Funções devem ter **apenas uma responsabilidade**.  
✔ Funções devem ter **poucos parâmetros**.  
✔ Funções devem ser **testáveis**.  
✔ Funções devem **evitar efeitos colaterais**.  
✔ Funções devem **evitar parâmetros de saída**.  
✔ Funções devem ser separadas em **comandos e consultas**.  

---

## 📚 Material de Apoio  

- [Clean Code: Funções - Daniel Wisky](https://danielwisky.com.br/2023-01-16-clean-code-funcoes/)  
- [Introdução a Mônadas - DevMedia](https://www.devmedia.com.br/introducao-a-monadas/33113)  
- [Clean Code: Capítulo 3 - Medium](https://medium.com/@seydialkan/clean-code-chapter-3-functions-158dad98bcb9)  

# 📌 Tópico 05 - Comentários (Clean Code)

### 📝 Introdução
- Comentários são usados para documentar o código.
- Servem exclusivamente para comunicação entre programadores.
- **"Comentários são sempre fracassos."** – Clean Code.
- Devem ser usados com moderação, apenas quando a linguagem não permitir expressar a intenção do código.

---

### ❌ Comentários Compensam Código Ruim
- Quanto mais bem escrito o código, **menos necessidade de comentários**.
- Exemplo ruim:
  *// Verifica se o funcionário é elegível para benefícios completos*  
  *if ((employee.flags & HOURLY_FLAG) && (employee.age < 65))*  

- Melhor abordagem:
  *if (employee.isEligibleForFullBenefits())*  

---

### 📜 Licenças de Software
- Alguns projetos exigem que cada arquivo tenha informações de licença.
- Recomendado armazenar as licenças em um **documento externo**.

---

### 🏷️ Explicação da Intenção
- Útil quando explica **o porquê** ao invés de **o quê**:
  *// Os espaços em branco são substituídos por %20 para evitar erros de URL*  
  *String url = rawUrl.replaceAll("\\s+", "%20");*  

---

### ⚠️ Alerta de Consequências
- Pode ser útil para alertar sobre riscos:
  *// Executar esse teste apenas se tiver tempo disponível*  
  */*  
  public void _testWithReallyBigFile() {  
      // ...  
  }  
  */*  

---

### 🚧 Comentários TODO
- Usados para indicar tarefas pendentes:
  *// TODO: Implementar a verificação de permissões*  

---

### 📖 Documentação de API
- Códigos distribuídos devem ter **documentação de API**.
- Utilizar ferramentas como **Javadoc** ou **Doxygen**.

---

### 🙊 Murmúrios e Comentários Redundantes
- Comentários pessoais ou óbvios devem ser evitados.

---

### ❗ Comentários Enganosos
- Comentários que não refletem o código devem ser **corrigidos ou removidos**.

---

### 📝 Comentários Imperativos
- Fora da documentação de API, comentários **não devem ser obrigatórios**.

---

### 🗣️ Comentários Longos e Ruidosos
- Comentários extensos indicam **falta de clareza no código**.
- Exemplo ruim:
  */*  
   * Esta variável 'name' armazena o nome do ambiente.  
   * Pode assumir os valores:  
   *   - development  
   *   - test  
   *   - production  
   * Para alterar, edite a variável de ambiente.  
   */*  
  *String name = getEnviromentVariable("name");*  

---

### 🔄 Substitua Comentários por Funções
- Exemplo ruim:
  *// Converte uma data para string*  
  *public String convertDateToString(Date date) {  
      SimpleDateFormat sdf = new SimpleDateFormat();  
      return sdf.format(date);  
  }*  

- Melhor abordagem:
  *public String formatDate(Date date) {  
      return new SimpleDateFormat().format(date);  
  }*  

---

### 📌 Marcadores e Estruturas de Código
- Não use **seções marcadas** com comentários:
  *// ------- ATRIBUTOS -------*  
  *private String name;*  
  *// ------- GETTERS -------*  
  *public String getName() { return name; }*  

---

### 📍 Posição dos Comentários
- Comentários devem estar **logo acima** do código que descrevem.

---

### 🏷️ Comentários vs Controle de Versão
- Informações como autor e data **devem estar no controle de versão**, não no código.
  *// Autor: John Doe*  
  *// Data: 2023-07-28*  
  *// Linhas editadas: 1-5, 10-15*  

---

### 📚 Material de Apoio
- [Clean Code - Comentários](https://danielwisky.com.br/2023-01-17-clean-code-comentarios/)
- [Medium - Clean Code Comments](https://medium.com/codex/clean-code-comments-833e11a706dc)

---

# 📌 Tópico 06 - Estrutura e Formatação (Clean Code)

### 📝 Objetivo da Formatação
- A formatação do código melhora a **comunicação**.
- Permanece útil mesmo quando a funcionalidade original não existe mais.

---

### 📏 Formatação Vertical
- **Arquivos menores** são mais fáceis de ler.
- Evite rolagem excessiva para manter uma visão global do código.

---

### 📰 Metáfora do Jornal
- Um código bem formatado **segue a lógica de um jornal**:
  - A **manchete** traz o essencial.
  - O **primeiro parágrafo** resume a ideia.
  - O restante **aprofundará os detalhes** progressivamente.

---

### 📖 Espaçamento Vertical
- **Linhas em branco** ajudam a separar conceitos diferentes.
- Exemplo ruim:
```javascript
import db from 'db';
const baseUrl = 'https://api.example.com';
function getUser(id) {
    const user = db.get(id);

    return user;
}
function setUser(user) {
    db.set(user);
}
```

- Melhor abordagem:
```javascript
import db from 'db';

const baseUrl = 'https://api.example.com';

function getUser(id) {
    const user = db.get(id);
    return user;
}

function setUser(user) {
    db.set(user);
}
```

---

### 🔄 Continuidade Vertical
- Conceitos similares **devem estar juntos**.
- Exemplo ruim:
```javascript
public project(axis: Vector): Projection {
    const scalars = [];

    const point = this.center;

    const dotProduct = point.dot(axis);
    scalars.push(dotProduct);
    
    scalars.push(dotProduct + this.radius);
    
    scalars.push(dotProduct - this.radius);
    return new Projection(Math.min.apply(Math, scalars), Math.max.apply(Math, scalars));
}
```

- Melhor abordagem:
```javascript
public project(axis: Vector): Projection {
    const scalars = [];
    const point = this.center;
    const dotProduct = point.dot(axis);
    scalars.push(dotProduct);
    scalars.push(dotProduct + this.radius);
    scalars.push(dotProduct - this.radius);
    return new Projection(Math.min.apply(Math, scalars), Math.max.apply(Math, scalars));
}
```

---

### 📌 Distância Vertical
- A **declaração** de uma função deve estar **perto de sua chamada**.

---

### 🎯 Declaração de Variáveis
- Variáveis devem ser declaradas **perto do primeiro uso**.
- Exemplo ruim:
```javascript
function createMainElement(tag) {
    const element = document.createElement(tag);
    const mainElement = document.querySelector('.main-element');
    element.classList.add('new-class');
    mainElement.appendChild(element);
    return mainElement;
}
```

- Melhor abordagem:
```javascript  
function createMainElement(tag) {
    const element = document.createElement(tag);
    element.classList.add('new-class');
    const mainElement = document.querySelector('.main-element');
    mainElement.appendChild(element);
    return mainElement;
}
```

---

### 🏗️ Declaração de Atributos (POO)
- **Atributos devem ser agrupados** no início da classe.
- Exemplo ruim:
```python
class User {
    nome: string;

    updateNome(nome: string) {
        this.nome = nome;
    }

    idade: number;

    updateIdade(idade: number) {
        this.idade = idade;
    }

    altura: number;

    updateAltura(altura: number) {
        this.altura = altura;
    }
}
``` 

- Melhor abordagem:
```python
class User {
    nome: string;
    idade: number;
    altura: number;

    updateNome(nome: string) {
        this.nome = nome;
    }

    updateIdade(idade: number) {
        this.idade = idade;
    }

    updateAltura(altura: number) {
        this.altura = altura;
    }
}
``` 

---

### 🔗 Funções Dependentes
- Sempre que chamamos uma função, **sua declaração deve estar próxima**.
- Exemplo ruim:
```javascript
function makeRequest(url) {
    /* ... */
    const response = fetch(url);
    /* ... */
}

function resolveUrl(url) {
    /* ... */
}

function fetch(url) {
    /* ... */
    resolveUrl(url);
    /* ... */
}
```   

- Melhor abordagem:
```javascript
function makeRequest(url) {
    /* ... */
    const response = fetch(url);
    /* ... */
}

function fetch(url) {
    /* ... */
    resolveUrl(url);
    /* ... */
}

function resolveUrl(url) {
    /* ... */
}
``` 
---

### 📌 Afinidade Conceitual
- **Elementos relacionados devem estar próximos**.
- Exemplo ruim:
```javascript
const userService = new UserService(userRepository);
const petService = new PetService(petRepository);
const mapaRepository = new MapRepository();
const userRepository = new UserRepository();
const userController = new UserController(userService);
const petRepository = new PetRepository();
const mapaService = new MapService(mapaRepository);
const mapaController = new MapController(mapaService);
const petController = new PetController(petService);
``` 

- Melhor abordagem:
```javascript
const userController = new UserController(userService);
const userService = new UserService(userRepository);
const userRepository = new UserRepository();

const mapaController = new MapController(mapaService);
const mapaService = new MapService(mapaRepository);
const mapaRepository = new MapRepository();

const petController = new PetController(petService);
const petService = new PetService(petRepository);
const petRepository = new PetRepository();
```

---

### 🏷️ Formatação Horizontal
- **Uma linha = uma ação**.
- Nomes longos podem necessitar de quebras.

---

### 📏 Limite de Linhas
- Máximo de **80 a 120 caracteres por linha**.

---

### 📐 Espaçamento Horizontal
- Utilize espaço **somente para separar elementos diferentes**.
- Exemplo ruim:
```python
function soma (a, b){
  return a+b ;
}

soma (1 , 2);
```  

- Melhor abordagem:
```python
function soma(a, b) {
  return a + b; 
} 

soma(1, 2);
```

---

### 📌 Alinhamento Horizontal
- Algumas equipes preferem alinhar elementos:
```java
class Pessoa {
  public      String  nome;
  protected   Integer idade;
  protected   Double  altura;
  private     Double  peso;
}
```  

---

### 🔢 Indentação
- Ajuda a visualizar a **hierarquia do código**.
- Exemplo ruim:
```python
class Pessoa {
nome: string;
idade: number;
altura: number;

constructor(nome: string, idade: number, altura: number) {
this.nome = nome;
this.idade = idade;

if (altura > 0) {
this.altura = altura;
} else {
this.altura = 0;
}
}
}
```

- Melhor abordagem:
```python
class Pessoa { 
  nome: string;
  idade: number; 
  altura: number; 
  
  constructor(nome: string, idade: number, altura: number) { 
    this.nome = nome;
    this.idade = idade; 
    
    if (altura > 0) { 
      this.altura = altura;
    } else {
      this.altura = 0;
    }
  }
}
```

---

### 🔄 Escopos Minúsculos
- Estruturas pequenas podem ser reduzidas a **uma única linha**:
  *lista.map(item => item.id);*  

---

### 🤝 Regra de Equipes
- Equipes devem definir **padrões de formatação**.

---

### 📚 Material de Apoio
- [Baeldung - Formatting](https://www.baeldung.com/cs/clean-code-formatting)  
- [Hack.md](https://hackmd.io/@jenc/H1bgodhlo)  

---

# 📌 Tópico 07 - Linters (Clean Code)

### 📝 Estilo
- **Boas práticas e convenções** devem ser documentadas para manter a padronização do código.

---

### 📖 Style Guides
- **Style guides** são documentos opinativos que definem convenções a serem seguidas pela equipe.
- Evitam inconsistências e **facilitam a manutenção do código**.

---

### 🔎 Linters
- **Ferramentas que analisam código-fonte** em busca de:
  - Problemas de formatação.
  - Erros comuns.
  - Inconsistências de estilo.
- Permitem a configuração de **regras personalizadas**.

---

### 🔍 Tipos de Linters
1. **Linter de estilo**:  
   - Verifica **formatação, indentação e nomenclatura**.
2. **Linter de qualidade**:  
   - Avalia a **qualidade do código**, identificando **bugs e problemas de desempenho**.

---

### 🔗 Integração dos Linters
- **IDE**: Mostram problemas **em tempo real**.
- **CI/CD**:  
  - Verificam o código antes de ser integrado ao repositório.
  - **Evitam a introdução de código inconsistente**.

---

### 🚀 Linters Populares
- **JavaScript**: *ESLint, Prettier*  
- **Python**: *Flake8, Black*  
- **Ruby**: *Rubocop*  
- **PHP**: *PHPStan*  
- **Java**: *SonarLint, Checkstyle*  
- **C/C++**: *Clang-tidy*  

📌 Links úteis:  
- [ESLint](https://eslint.org/)  
- [Prettier](https://prettier.io/)  
- [Flake8](https://flake8.pycqa.org/en/latest/)  
- [Black](https://black.readthedocs.io/en/stable/)  
- [Rubocop](https://rubocop.org/)  
- [PHPStan](https://phpstan.org/)  
- [SonarLint](https://www.sonarsource.com/products/sonarlint/)  
- [Checkstyle](https://checkstyle.sourceforge.io/)  
- [Clang-tidy](https://clang.llvm.org/extra/clang-tidy/)  

---

### 📚 Material de Apoio
- [Airbnb React JavaScript](https://airbnb.io/javascript/react/)  
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)  
- [PHP Guidelines](https://doc.php.net/guide/style.md)  
- [Google Python Style Guide](https://google.github.io/styleguide/pyguide.html)  
- [CppCoreGuidelines](https://isocpp.github.io/CppCoreGuidelines/CppCoreGuidelines)  
- [Black Guidelines](https://black.readthedocs.io/en/stable/the_black_code_style/current_style.html)  

---

# Resumo - Estruturas de Dados (Clean Code)

## 1. Introdução  
- Dados podem ser representados de diferentes formas: `structs`, `classes`, `arrays`, `dictionaries`, `records`, etc.  

## 2. Abstração de Dados  
- Exemplo de classe `Ponto` representando um ponto cartesiano:  

  ```java
  public class Ponto {
      public Double x;
      public Double y;
  }
  ```  

- Interface que permite representação em coordenadas cartesianas e polares:  

  ```java
  public interface Ponto {
      private Double getX();
      private Double getY();
      private Double getR();
      private Double getTheta();
      void setCartesiano(Double x, Double y);
      void setPolar(Double r, Double theta);
  }
  ```  

## 3. Anti-simetria entre Dados e Objetos  
- Objetos podem manipular outros objetos ou serem manipulados.  
- Objetos de valor (`POJO`) apenas armazenam dados.  

## 4. Lei de Demeter  
- Um módulo não deve acessar diretamente os detalhes internos de outro objeto.  
- Métodos devem chamar apenas métodos de:  
  - Sua própria classe.  
  - Parâmetros recebidos.  
  - Atributos internos.  
  - Objetos criados dentro do próprio método.  

- Exemplo de método chamando outro método da mesma classe:  

  ```java
  public class RegistroPonto {
      private DateTime data;

      public void atualizarHorario(DateTime data) {
          setData(data);
      }

      private void setData(DateTime data) {
          this.data = data;
      }
  }
  ```  

- Evitar "transgressão de Demeter":  

  ```java
  public class RegistroPonto {
      public void log(Funcionario funcionario) {
          String nomeSetor = funcionario.getSetor().getNome();
          Console.WriteLine("O setor " + nomeSetor + " fez um registro de ponto");
      }
  }
  ```  

- **Carrinhos de trem** devem ser evitados:  

  ```java
  public class MusicPlayer {
      public void play(MusicFile music) {
          music.getArtist().getAlbum().getSong().play();
      }
  }
  ```  

## 5. Híbridos e DTOs  
- **Objetos híbridos**: misturam manipulação e armazenamento de dados, o que deve ser evitado.  
- **DTOs (Data Transfer Objects)**: classes somente com dados, sem lógica de negócios.  
- Exemplo de classe tradicional:  

  ```java
  public class Pessoa {
      private String nome;
      private String cpf;

      public String getNome() {
          return this.nome;
      }

      public String getCpf() {
          return this.cpf;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public void setCpf(String cpf) {
          this.cpf = cpf;
      }
  }
  ```  

- Alternativa mais limpa com `record`:  

  ```java
  public record Pessoa(String nome, String cpf);
  ```  

## 6. Active Record  
- DTOs que possuem métodos como `save()` e `find()`.  
- Não devem conter regras de negócios.  

## 7. Estruturas de Dados vs Coleções  
- **Maps vs Arrays**:  
  - Vetores para processamento ordenado.  
  - Mapas para buscas rápidas.  

  ```java
  Map<String, String> mapaFuncionarios = new HashMap<>();
  ArrayList<String> listaFuncionarios = new ArrayList<>();
  ```  

- **Lists vs Sets**:  
  - Listas preservam ordem.  
  - Conjuntos garantem unicidade dos elementos.  

  ```java
  List<String> listaFuncionarios = new ArrayList<>();
  Set<String> grupoFuncionarios = new HashSet<>();
  ```  

## 8. Boas Práticas  
- **Evitar heranças profundas**: substituir por composição.  

  ```java
  public class SerHumano extends SerVivo {}
  public class Pessoa extends SerHumano {}
  public class Funcionario extends Pessoa {}
  public class FuncionarioGerente extends Funcionario {}
  public class FuncionarioSupervisor extends FuncionarioGerente {}
  ```  

  - Alternativa com composição:  

  ```java
  public class Funcionario {
      private Pessoa pessoa;
      private Cargo cargo;
      private Setor setor;
  }
  ```  

- **KISS (Keep It Simple, Stupid)**: evitar abstrações desnecessárias.  
- **Polimorfismo vs Condicionais**: substituir `if/else`* e `switch/case`* por herança e interfaces.  

  ```java
  if (tipo == "Gerente") {
      return new Gerente();
  }
  ```  

  - Alternativa com `Map`:  

  ```java
  Map<String, Funcionario> funcionarios = new HashMap<>();
  funcionarios.put("Gerente", new Gerente());
  ```  

## 9. Identidade vs Igualdade  
- Tipos primitivos e Strings são comparados por valor.  
- Objetos são comparados por identidade.  

  ```java
  String nome1 = "Marta";
  String nome2 = "Marta";
  nome1 == nome2; // true
  nome1.equals(nome2); // true

  Pessoa pessoa1 = new Pessoa("Marta", "123456789");
  Pessoa pessoa2 = new Pessoa("Marta", "123456789");
  pessoa1.equals(pessoa2); // false
  pessoa1 == pessoa2; // false
  ```  

- Cuidado ao modificar objetos passados por referência:  

  ```java
  public void revisaFuncionarios(List<Funcionario> funcionarios) {
      for (Funcionario funcionario : funcionarios) {
          if (funcionario.getSalario() > 10000) {
              funcionario.setSalario(funcionario.getSalario() * 1.1);
          }
      }
  }

  List<Funcionario> funcionarios = new ArrayList<>();
  funcionarios.add(new Funcionario("Ronaldinho", 10000));
  funcionarios.add(new Funcionario("Marta", 15000));
  revisaFuncionarios(funcionarios);
  ``` 

## 10. Material de Apoio  
- Artigos e livros sobre Clean Code e Estruturas de Dados.  

[Referências](https://medium.com/codex/clean-code-objects-and-data-structures-summary-1aa5d2058f84)  
