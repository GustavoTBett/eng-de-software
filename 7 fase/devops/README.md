# 🚀 A Importância de Aprender sobre DevOps  

## 🔗 Quebrando Silos e Promovendo a Colaboração  

### 📌 Introdução  
DevOps é uma cultura que busca transformar a colaboração entre as equipes de desenvolvimento e operações. Ele não se trata apenas de ferramentas, mas de uma abordagem que melhora eficiência e comunicação.  

---

## 🤔 O que é DevOps?  
- **Filosofia de integração** entre desenvolvimento (Dev) e operações (Ops).  
- **Objetivo:** Melhorar colaboração e eficiência.  
- **Problema:** Equipes operam em silos, dificultando entregas ágeis.  

---

## 🔄 Quebra de Silos  
- Desenvolvimento foca em novas funcionalidades.  
- Operações se concentram na infraestrutura.  
- Sem comunicação, surgem erros, retrabalho e "blame game".  
- **DevOps resolve isso promovendo colaboração e transparência.**  

---

## 🌍 A Cultura DevOps  
- Permite melhor compreensão do funcionamento das aplicações.  
- Envolve **monitoramento, gestão de versões e automação.**  
- Engenheiros de plataforma criam ferramentas internas para facilitar processos.  

---

## ⚙️ Automação  
- **Pilar fundamental do DevOps.**  
- Reduz tarefas repetitivas e aumenta produtividade.  

---

## 📊 Medição e Feedback  
- **Entregas frequentes e pequenas** → Mais feedback dos usuários.  
- Permite aprendizado rápido e melhoria contínua.  

---

## 📚 Compartilhamento de Conhecimento  
- DevOps promove eventos e conferências para troca de experiências.  
- **Documentação e fóruns internos** evitam sobrecarga em um único profissional.  

---

## 🛠️ Práticas Fundamentais de DevOps  
1. **Integração Contínua (CI):** Código atualizado frequentemente e testado automaticamente.  
2. **Entrega Contínua (CD):** Código pronto para produção a qualquer momento.  
3. **Micro Serviços:** Aplicações divididas em pequenos serviços independentes.  
4. **Infraestrutura como Código (IaC):** Infraestrutura gerenciada via código.  
5. **Monitoramento e Logging:** Identificação de problemas com métricas e logs.  

---

## 🎯 Benefícios do DevOps  
1. **Velocidade:** Atualizações mais rápidas e ágeis.  
2. **Confiabilidade:** Menos erros devido à automação.  
3. **Escalabilidade:** Infraestrutura flexível e eficiente.  
4. **Colaboração:** Melhor comunicação entre equipes.  
5. **Segurança:** DevSecOps integra segurança desde o início.  

---

## 🛠️ Ferramentas Populares de DevOps  
- **Controle de Versão:** Git, GitHub, GitLab.  
- **Integração Contínua:** Jenkins, Travis CI, CircleCI.  
- **Gerenciamento de Configuração:** Ansible, Puppet, Chef.  
- **Containerização:** Docker, Kubernetes.  
- **Monitoramento:** Prometheus, Grafana, ELK Stack.  

---

## ⚖️ Comparação: Waterfall vs Agile vs DevOps  
| Metodologia | Características | Desvantagens |
|------------|---------------|--------------|
| **Waterfall** (Cascata) | Processo linear e sequencial. | Atrasos nos projetos. |
| **Agile** | Sprints curtos e feedback contínuo. | Alguns veem como uma versão rápida do Waterfall. |
| **DevOps** | Integração entre Dev, QA e Ops com CI/CD e automação. | Requer mudanças culturais e tecnológicas. |

---

## 🔄 DevOps: Integração, Entrega e Automação  
- **Integração Contínua (CI):** Código testado constantemente.  
- **Entrega Contínua (CD):** Software lançado em pequenas partes.  
- **Automação:** Reduz tempo de desenvolvimento e chances de erro.  

---

### Os Pilares do DevOps: Cultura, Automação, Medição e Compartilhamento

O DevOps revolucionou a maneira como empresas desenvolvem, testam e entregam software, promovendo a colaboração entre equipes de desenvolvimento e operações. O sucesso dessa abordagem se baseia em quatro pilares fundamentais: Cultura, Automação, Medição e Compartilhamento (conhecidos pela sigla CAMS). Vamos explorar cada um desses pilares em detalhes, com exemplos práticos e orientações para implementação.

#### 1. Cultura
A cultura é a base do DevOps. Sem uma mentalidade colaborativa e focada na entrega contínua de valor, qualquer iniciativa técnica será ineficaz. O DevOps promove um ambiente onde os times de desenvolvimento, operações e segurança trabalham juntos de forma integrada, evitando silos organizacionais.

**Como implementar?**
- Promova a colaboração: Incentive a comunicação aberta entre equipes.
- Mentalidade de aprendizado contínuo: Erros devem ser tratados como oportunidades de aprendizado, promovendo uma cultura de melhoria contínua.
- Feedback constante: Criar loops de feedback para identificar e corrigir problemas rapidamente.
- Ambiente psicológico seguro: Incentivar a experimentação sem medo de punições.

**Exemplo prático:**
Uma empresa de e-commerce percebeu que havia muitos atritos entre os times de desenvolvimento e operações. Para resolver isso, adotaram práticas ágeis e promoveram reuniões diárias conjuntas (daily stand-ups), onde ambos os times compartilhavam desafios e sucessos. Implementaram também um sistema de *pair programming*, reduzindo o tempo de resposta para problemas em produção em 50%.

#### 2. Automação
A automação reduz erros manuais, aumenta a eficiência e permite entregas mais rápidas e seguras. Desde a infraestrutura até a entrega de código, tudo deve ser automatizado sempre que possível.

**Como implementar?**
- **CI/CD (Integração e Entrega Contínuas):** Ferramentas como Jenkins, GitHub Actions e GitLab CI ajudam a automatizar testes e implantações.
- **Infraestrutura como Código (IaC):** Ferramentas como Terraform e Ansible permitem provisionamento automatizado.
- **Monitoramento e alertas automatizados:** Soluções como Prometheus e Grafana ajudam a detectar falhas antes que impactem os usuários.
- **Testes automatizados:** Implementação de testes unitários, integração e de aceitação contínuos.

**Exemplo prático:**
Uma startup de fintech implementou um pipeline CI/CD utilizando GitLab CI, Docker e Kubernetes. Com essa automação, o tempo de entrega de novas funcionalidades foi reduzido de semanas para apenas alguns dias e falhas em produção diminuíram em 60%.

#### 3. Medição
O que não pode ser medido, não pode ser melhorado. No DevOps, a medição é essencial para identificar gargalos, monitorar desempenho e tomar decisões embasadas em dados.

**Como implementar?**
- **Definição de métricas chave (KPIs):** Como tempo de implantação (*Lead Time*), taxa de falha de implantação e tempo médio de recuperação (MTTR).
- **Ferramentas de monitoramento:** Utilizar Prometheus, Grafana e Datadog.
- **Logging estruturado:** Centralizar logs com ferramentas como ELK Stack ou Loki.
- **Revisão contínua dos dados:** Criar dashboards para acompanhar os principais indicadores.

**Exemplo prático:**
Uma fintech percebeu que o tempo médio de recuperação após falhas era alto. Com Prometheus e Grafana, configuraram alertas automáticos e reduziram o MTTR de 4 horas para 45 minutos, melhorando a experiência dos usuários e reduzindo custos operacionais.

#### 4. Compartilhamento
O compartilhamento do conhecimento e das responsabilidades fortalece a equipe e melhora a eficiência do DevOps.

**Como implementar?**
- **Documentação acessível:** Utilizar Wikis, Confluence ou Notion para centralizar informações.
- **Post-mortems sem culpa:** Realizar análises de incidentes focadas em aprendizado e não em punições.
- **Comunidade interna:** Criar canais para troca de experiências e aprendizado contínuo.
- **Treinamentos constantes:** Promover workshops e mentorias internas sobre boas práticas de DevOps.

**Exemplo prático:**
Uma empresa de SaaS percebeu que erros operacionais estavam se repetindo devido à falta de conhecimento compartilhado. Criaram um banco de conhecimento no Confluence e organizaram "DevOps Talks" mensais, reduzindo a repetição de erros em 70% e aumentando a autonomia dos times.

---

### Fluxo de Trabalho DevOps: Dev, Build, Test, Release, Deploy, Operate, Monitor
O DevOps é uma abordagem que integra desenvolvimento e operações para garantir um fluxo de trabalho eficiente e ágil. O ciclo DevOps pode ser dividido em sete estágios principais:

1. **Desenvolvimento (Dev)**: Escrita de código e versionamento.
2. **Construção (Build)**: Compilação e empacotamento do código.
3. **Testes (Test)**: Garante a qualidade do software antes do lançamento.
4. **Lançamento (Release)**: Preparação da versão final do software.
5. **Implantação (Deploy)**: Publica a versão no ambiente de produção.
6. **Operação (Operate)**: Gerenciamento da aplicação em produção.
7. **Monitoramento (Monitor)**: Monitoramento contínuo para melhoria constante.

Cada fase tem sua importância e influencia diretamente na qualidade e confiabilidade do software. O uso de ferramentas e boas práticas é essencial para garantir um fluxo de trabalho eficiente no DevOps.

## Gitflow: Um Guia Completo  

### O que é Gitflow?  
Gitflow é um modelo de branching para Git criado por Vincent Driessen. Ele organiza o fluxo de trabalho no desenvolvimento de software, definindo regras claras para criação e mesclagem de branches.  

### Por que utilizar o Gitflow?  
- Estrutura o desenvolvimento de forma organizada.  
- Facilita o trabalho em equipe.  
- Reduz conflitos na integração de código.  
- Separa código de produção e desenvolvimento.  
- Automatiza releases e hotfixes.  

### Quando utilizar o Gitflow?  
- Projetos médios e grandes com múltiplos desenvolvedores.  
- Equipes com ciclos de release estruturados.  
- Desenvolvimento contínuo e manutenção paralela.  
- Ambientes que precisam de um histórico claro de versões.  

### Estrutura do Gitflow  
O Gitflow utiliza seis tipos principais de branches:  
1. **main** – Código estável e pronto para produção.  
2. **develop** – Código em desenvolvimento contínuo.  
3. **feature** – Para novas funcionalidades, baseada em develop.  
4. **release** – Preparação de versões antes de irem para main.  
5. **hotfix** – Correções urgentes diretamente na main.  
6. **support (opcional)** – Suporte a versões anteriores.  

### Passo a Passo para Implementar o Gitflow  

#### 1. Instalando o Gitflow  
- **Linux/macOS:**  
  ```sh
  $ brew install git-flow-avh
  ```  
- **Windows:**  
  ```sh
  $ choco install gitflow-avh
  ```  

#### 2. Inicializando um repositório  
- Criar ou clonar um repositório:  
  ```sh
  $ git init meu-projeto  
  $ cd meu-projeto  
  $ git flow init  
  ```  
- Definir branches principais:  
  - `main` (produção)  
  - `develop` (desenvolvimento)  

#### 3. Criando e Trabalhando com Branches  
- **Feature Branch:**  
  ```sh
  $ git flow feature start minha-feature  
  $ git add .  
  $ git commit -m "Nova feature"  
  $ git flow feature finish minha-feature  
  ```  
- **Release Branch:**  
  ```sh
  $ git flow release start 1.0.0  
  $ git flow release finish 1.0.0  
  ```  
  _(Cria automaticamente uma tag de versão)_  
- **Hotfix Branch:**  
  ```sh
  $ git flow hotfix start correção-importante  
  $ git flow hotfix finish correção-importante  
  ```  
  _(Mescla na main e develop)_  

#### 4. Mantendo o Fluxo de Trabalho  
- Antes de novas features, atualizar a branch develop:  
  ```sh
  $ git checkout develop  
  $ git pull origin develop  
  ```  
- Sincronizar código regularmente:  
  ```sh
  $ git fetch origin  
  ```  
- Utilizar Gitflow para gerenciar features, releases e hotfixes.

# Resumo: DevOps e Gitflow  

## 1. Monitoramento e Métricas  
- **Métricas chave (KPIs):** Lead Time, taxa de falha de implantação, MTTR.  
- **Ferramentas:** Prometheus, Grafana, Datadog.  
- **Logging estruturado:** ELK Stack ou Loki.  
- **Dashboards:** Criar visualizações para acompanhar indicadores.  

### 📌 **Exemplo**  
Uma fintech reduziu o MTTR de **4 horas para 45 minutos** ao implementar **Prometheus + Grafana** e centralizar logs com **ELK Stack**.  

## 2. Compartilhamento  
- **Documentação:** Wikis, Confluence, Notion.  
- **Post-mortems sem culpa:** Foco no aprendizado.  
- **Comunidade interna:** Canais para troca de experiências.  
- **Treinamentos:** Workshops e mentorias sobre DevOps.  

### 📌 **Exemplo**  
Uma empresa SaaS reduziu erros operacionais em **70%** ao criar um banco de conhecimento no **Confluence** e organizar **"DevOps Talks"** mensais.  

---

# 🚀 Fluxo de Trabalho DevOps  
> **Fases:** Desenvolvimento → Build → Test → Release → Deploy → Operate → Monitor  

## 1️⃣ Desenvolvimento (Dev)  
- **Ferramentas:** Git (GitHub, GitLab), IDEs (VS Code, IntelliJ), Scrum/Kanban.  
- **Exemplo:** Branch separado → Pull Request → Merge.  

## 2️⃣ Construção (Build)  
- **Ferramentas:** Maven, Gradle, Docker.  
- **Exemplo:** Pipeline CI/CD compila código e cria imagem Docker.  

## 3️⃣ Testes (Test)  
- **Tipos:** Unitários, Integração, Funcionais, Performance, Segurança.  
- **Ferramentas:** JUnit, Selenium, JMeter.  
- **Exemplo:** Pipeline executa testes antes de avançar para release.  

## 4️⃣ Lançamento (Release)  
- **Ferramentas:** GitHub Releases, Helm, Terraform.  
- **Exemplo:** Gerar versão documentada e armazenar no repositório.  

## 5️⃣ Implantação (Deploy)  
- **Estratégias:** Blue-Green, Canary Release, Rolling Updates.  
- **Ferramentas:** Kubernetes, Ansible, ArgoCD.  
- **Exemplo:** Deploy com rollback automático no Kubernetes.  

## 6️⃣ Operação (Operate)  
- **Boas práticas:** Log centralizado, escalabilidade, backup.  
- **Ferramentas:** ELK Stack, Kubernetes Auto-Scaling.  
- **Exemplo:** Escalabilidade automática no Kubernetes conforme tráfego.  

## 7️⃣ Monitoramento (Monitor)  
- **Métricas:** Latência, uso de CPU/RAM, taxa de erro.  
- **Ferramentas:** Prometheus, Datadog, Sentry.  
- **Exemplo:** Alerta no Slack ao detectar alta latência.  

## 8️⃣ Segurança (Security)  
- **Práticas:** Varredura de código, gestão de credenciais, auditoria de logs.  
- **Ferramentas:** SonarQube, OWASP ZAP, Vault.  
- **Exemplo:** CI/CD bloqueia código inseguro com análise SonarQube.  

---

# 🛠 Gitflow: Um Guia Rápido  
**O que é?**  
- Modelo de branching para organização do desenvolvimento.  

**Principais branches:**  
- **`main`** → Código estável e pronto para produção.  
- **`develop`** → Desenvolvimento contínuo.  
- **`feature/*`** → Novas funcionalidades.  
- **`release/*`** → Preparação para lançamento.  
- **`hotfix/*`** → Correção de bugs críticos em produção.  

**Fluxo:**  
1. Criar branch `feature/nova-funcionalidade` a partir de `develop`.  
2. Após finalizar, mergear na `develop`.  
3. Quando pronto para release, criar `release/v1.0` e testar.  
4. Merge em `main`, criando uma tag.  
5. Se necessário, criar `hotfix/bug-fix` e mergear em `main` e `develop`.  

# DevOps - Aula 03

## Infraestrutura como Código (IaC)

Infraestrutura como Código (IaC) é a prática de gerenciar e provisionar infraestrutura de TI via código, ao invés de processos manuais.

### Benefícios:
- **Consistência** - Evita erros de configuração manual
- **Automação** - Reduz tempo de provisionamento
- **Escalabilidade** - Facilita crescimento da infraestrutura
- **Versionamento** - Permite rastreamento como código-fonte

---

## **On-Premises vs IaC**

| Característica     | On-Premises        | IaC                      |
|-------------------|------------------|--------------------------|
| **Custo**         | Alto (hardware próprio) | Baixo (paga conforme uso) |
| **Escalabilidade** | Limitada e demorada | Automática e rápida |
| **Automação**     | Baixa              | Alta |
| **Gerenciamento** | Manual             | Automatizado via código |
| **Provisionamento** | Dias/Semanas      | Minutos |
| **Flexibilidade** | Baixa              | Alta |

---

## **Ferramentas de IaC**

### **Terraform** (HashiCorp)
- **Código Declarativo** - Define o estado desejado da infraestrutura
- **Multi-Cloud** - Suporta AWS, Azure, Google Cloud, etc.
- **Versionamento e Controle de Estado** - Usa arquivos `.tfstate`
- **Infraestrutura Imutável** - Altera recursos destruindo e recriando-os

Exemplo em **Terraform**:
```hcl
provider "aws" {
    region = "us-east-1"
}

resource "aws_instance" "example" {
    ami           = "ami-12345678"
    instance_type = "t2.micro"
}
```

---

### **Ansible** (Red Hat)
- **Baseado em YAML** - Usa Playbooks
- **Agentless** - Não requer agentes nos servidores gerenciados
- **Fácil Integração** - Funciona com AWS, Azure, Kubernetes, Docker, etc.
- **Ideal para Configuração** - Complementa o Terraform

Exemplo em **Ansible**:
```yaml
- name: Instalar Nginx
  hosts: servidores
  become: yes
  tasks:
    - name: Atualizar pacotes
      apt:
        update_cache: yes
    - name: Instalar Nginx
      apt:
        name: nginx
        state: present
```

---

### **AWS CloudFormation**
- **Específico para AWS** - Diferente do Terraform, só funciona na AWS
- **Baseado em JSON ou YAML** - Define infraestrutura como código
- **Automação Completa** - Pode criar servidores, redes, bancos de dados e aplicações
- **Gerenciamento de Stack** - Define toda a infraestrutura como um conjunto de recursos interligados

Exemplo em **CloudFormation**:
```yaml
Resources:
  MyEC2Instance:
    Type: AWS::EC2::Instance
    Properties:
      ImageId: ami-12345678
      InstanceType: t2.micro
```

---

# DevOps - Aula 04

## Containers e Virtualização

### O que é Virtualização?
- Permite rodar múltiplos sistemas operacionais em um único hardware físico.
- Criada por meio de **máquinas virtuais (VMs)**.
- Softwares utilizados: **VirtualBox, VMWare, Hypervisor, Docker**.

### Tipos de Virtualização
- **Full Virtualization**: Emula um hardware completo.
- **Para-Virtualization**: OS convidados colaboram com o Hypervisor.
- **Container-Based Virtualization**: Compartilha o kernel do SO.

### Como funcionam as VMs?
- Cada VM tem seu próprio **SO, bibliotecas e aplicações**.
- Requer um **Hypervisor** para gerenciar múltiplas VMs.
- Exemplos de **Hypervisors**: *VMware, VirtualBox, Hyper-V*.

## Containers

### O que são Containers?
- Ambientes isolados para execução de aplicações.
- Compartilham o **kernel** do SO.
- Mais leves e eficientes que VMs.

### Containers vs VMs

| Característica  | Containers | VMs  |
|----------------|-----------|------|
| Isolamento     | Parcial   | Completo |
| Tempo de Inicialização | Segundos  | Minutos |
| Uso de Recursos | Baixo     | Alto |
| SO Próprio     | Não       | Sim |
| Flexibilidade  | Alta      | Moderada |

### Benefícios dos Containers
- **Menor consumo de recursos**.
- **Maior portabilidade** entre ambientes.
- **Escalabilidade facilitada**.
- **Desenvolvimento e implantação ágil**.

## Introdução ao Docker

### Conceitos Fundamentais do Docker
- **Imagem**: Blueprint de um container.
- **Container**: Instância de uma imagem.
- **Dockerfile**: Receita para criar imagens personalizadas.
- **Docker Hub**: Repositório de imagens Docker.

Exemplo:
```docker pull nginx```

