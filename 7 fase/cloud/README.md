# Processos em Sistemas Operacionais  


## 🖥️ Introdução  
- Aborda conceitos essenciais como concorrência, paralelismo, processos, threads e programação síncrona/assíncrona.  
- Objetivo: simplificar e esclarecer a relação entre esses conceitos.  

---

## 🔄 Monotarefa vs Multitarefa  
- **Monotarefa**: Executa apenas um processo por vez, deixando recursos ociosos.  
- **Multitarefa**: Permite executar múltiplas tarefas simultaneamente, utilizando preempção para alternar entre processos.  

---

## ⚙️ Processos Sequenciais e Concorrentes  
- Um **processo** é um contêiner de recursos para execução de tarefas.  
- **Isolamento**: Processos não compartilham memória diretamente.  
- **Threads**: São "linhas" de execução dentro de um processo, compartilhando memória.  
- **Concorrência vs Paralelismo**:  
  - Concorrência → alternância entre tarefas (exemplo: fila de drive-thru).  
  - Paralelismo → execução simultânea em múltiplos núcleos de processador.  

---

## 🔄 Síncrono vs Assíncrono  
- **Síncrono**: Uma operação precisa ser concluída antes da próxima (exemplo: PHP).  
- **Assíncrono**: Várias operações alternam execução sem esperar (exemplo: GO).  

---

## 💾 Memória  
- **Primária (Volátil)**: RAM, Cache, Registradores → rápida, mas perde dados sem energia.  
- **Secundária (Não Volátil)**: SSD, HD → armazenamento permanente.  
- **Memória Virtual**: Utiliza SWAP quando a RAM está cheia.  

---

## ⚡ Processador  
- Evolução desde o Intel 4004 até os modernos Intel Core i7.  
- **Miniaturização** foi essencial para o avanço dos processadores.  

---

## 🖥️ Gestão do Sistema Operacional  
1. **Memory Manager** → Gerenciamento da Memória.  
2. **File Manager** → Gerenciamento de Arquivos.  
3. **Process Manager** → Gerenciamento de Processos.  
4. **Device Manager** → Gerenciamento de Dispositivos.  

---

## 🔄 Multiprogramação e Memória Virtual  
- **Multiprogramação em Memória Real**: Troca processos inteiros entre memória física e virtual.  
- **Multiprogramação com Memória Virtual**: Transferência de páginas ou segmentos.  
- **Multiplexação de Processos**: Simulação de execução simultânea no mesmo CPU.  

# 📌 Resumo do Documento: Sistemas de Arquivos Locais  

## 🗂️ Introdução  
- Os sistemas de arquivos são fundamentais nos sistemas operacionais.  
- Fornecem uma visão abstrata dos dados persistentes e organizam o acesso a arquivos.  

---

## 🖥️ Armazenamento e Requisitos  
- Aplicações precisam armazenar e recuperar dados além do espaço de endereçamento dos processos.  
- Três requisitos essenciais para armazenamento de longo prazo:  
  1. Capacidade para grandes volumes de dados.  
  2. Persistência dos dados mesmo após o término dos processos.  
  3. Acesso simultâneo por múltiplos processos.  

---

## 📂 Estrutura de Arquivos e Diretórios  
- **Arquivo**: Sequência de bytes com atributos como tamanho, permissões e dono.  
- **Diretório**: Mapeia nomes para identificadores de arquivos, podendo conter subdiretórios (estrutura em árvore).  
- O sistema de arquivos organiza e indexa os arquivos para acesso eficiente.  

---

## 🖱️ Acesso aos Arquivos  
- Pode ser feito via **interface gráfica** ou **linha de comando**.  
- Funções principais do sistema de arquivos:  
  - Gerenciamento de arquivos.  
  - Navegação na estrutura de diretórios.  
  - Recuperação e armazenamento de dados.  

---

## 🔧 Particionamento e Estruturas Internas  
- **Particionamento**: Divisão do disco em seções.  
- **Formatação**: Aplica um sistema de arquivos a uma partição.  
- Estruturas fundamentais:  
  - **MBR (Master Boot Record)**: Responsável pela inicialização do sistema.  
  - **Superbloco**: Contém informações essenciais do sistema de arquivos.  
  - **i-nodes**: Estruturas que armazenam metadados sobre arquivos.  

---

## 📜 Tipos de Sistemas de Arquivos  
### 🏷️ Alguns sistemas de arquivos e suas características:  

| Sistema de Arquivos | Descrição |
|---------------------|-----------|
| **BFS** | Utilizado no antigo BeOS, suporta indexação avançada. |
| **EFS** | Sistema de criptografia no NTFS para segurança de dados. |
| **ext** | Primeiro sistema de arquivos do Linux, substituído pelo ext2. |
| **ext3** | Extensão do ext2, com suporte a journaling. |
| **ext4** | Suporta volumes de até 1 Exbibyte e permite subdiretórios ilimitados. |
| **FAT** | Popular em sistemas antigos, possui versões como FAT12, FAT16 e FAT32. |
| **HFS+** | Desenvolvido pela Apple, utiliza estrutura B-tree. |
| **JFS** | Criado pela IBM, otimizado para multiprocessamento. |
| **NFS** | Sistema de arquivos distribuído para acesso remoto. |
| **NTFS** | Utilizado no Windows, suporta recuperação de arquivos. |
| **ReiserFS** | Projetado para Linux, otimizado para metadados. |
| **XFS** | Sistema de alto desempenho, com suporte a redimensionamento online. |
| **ZFS** | Integra gerenciamento de volumes e alta integridade de dados. |

---

## 📌 LVM (Logical Volume Manager)  
- Método de gerenciamento de discos que permite redimensionamento dinâmico.  
- Permite a combinação de múltiplos discos em volumes lógicos flexíveis.  
- **Vantagens**:  
  - Redimensionamento de partições.  
  - Uso eficiente de discos paralelos.  
  - Suporte a snapshots.  

  ![lvm](imagens/lvm.png)

# 📂 Guia Completo: Configuração e Expansão de LVM no Linux

## 🔹 O que é LVM?
O **LVM (Logical Volume Manager)** permite gerenciar discos e partições de forma flexível. Diferente do particionamento tradicional, ele possibilita **adicionar, remover e redimensionar volumes lógicos sem formatar ou perder dados**.

---

## 📌 Passo a Passo da Configuração do LVM

### 🟢 **1️⃣ Criar Partições para LVM**
Usamos o **fdisk** para criar uma partição do tipo `8e` (**Linux LVM**) nos discos `/dev/sdb` e `/dev/sdc`.

```bash
sudo fdisk /dev/sdb
```

* Pressione n para criar uma nova partição.
* Escolha p para partição primária.
* Aceite os valores padrão (usa todo o disco).
* Pressione t e digite 8e (Linux LVM).
* Pressione w para salvar.

### 🔄 Repita o mesmo processo para /dev/sdc.

 Verifique as partições criadas:

```bash
lsblk
sudo fdisk -l
```

---

## 🟢 2️⃣ Criar o Physical Volume (PV)

Agora que temos partições prontas, informamos ao LVM que elas serão usadas como armazenamento.

```bash
sudo pvcreate /dev/sdb /dev/sdc
```

🔍 Verifique os PVs criados:

```bash
sudo pvscan  # Lista os Physical Volumes disponíveis
sudo pvdisplay  # Exibe detalhes dos PVs
```

---

## 🟢 3️⃣ Criar o Volume Group (VG)

Agrupamos os Physical Volumes em um Volume Group (VG). Isso nos permite tratar vários discos como um único grande espaço de armazenamento.

```bash
sudo vgcreate vg_data /dev/sdb /dev/sdc
```

🔍 Verifique o VG criado:

```bash
sudo vgdisplay
```

---

## 🟢 4️⃣ Criar um Logical Volume (LV)

Dentro do Volume Group, criamos um Logical Volume (LV) para armazenar dados.

```bash
sudo lvcreate -L 2G -n lv_storage vg_data
```

🔍 Verifique o LV criado:

```bash
sudo lvdisplay
```

---

## 🟢 5️⃣ Formatar e Montar o LV

Agora, formatamos o Logical Volume com ext4 e o montamos.

```bash
sudo mkfs.ext4 /dev/vg_data/lv_storage  # Formata o LV
sudo mkdir /mnt/storage  # Cria um ponto de montagem
sudo mount /dev/vg_data/lv_storage /mnt/storage  # Monta o LV
```

Adicione ao /etc/fstab para montagem automática:

```bash
echo "/dev/vg_data/lv_storage /mnt/storage ext4 defaults 0 0" | sudo tee -a /etc/fstab
```

🔍 Verifique o espaço disponível:

```bash
df -h
```

---

## 📌 Expansão do Logical Volume (LV)

Agora, simulamos a adição de espaço ao volume lógico.

### 1️⃣ Verificar o Tamanho Atual

```bash
df -h
```

### 2️⃣ Expandir o LV

```bash
sudo lvextend -L +1G /dev/vg_data/lv_storage
```
🔹 Isso aumenta o LV em 1GB.

### 3️⃣ Redimensionar o Sistema de Arquivos

```bash
sudo resize2fs /dev/vg_data/lv_storage
```
🔹 Agora o sistema reconhece o espaço extra!

## 🎯 Resumo dos Passos
* 1️⃣ Criamos partições (fdisk - tipo 8e)
* 2️⃣ Transformamos as partições em Physical Volumes (pvcreate)
* 3️⃣ Agrupamos os PVs em um Volume Group (vgcreate)
* 4️⃣ Criamos um Logical Volume (lvcreate)
* 5️⃣ Formatamos, montamos e usamos o LV (mkfs.ext4, mount)
* 6️⃣ Expandimos o volume sem perder dados (lvextend, resize2fs)

---

## 🔄 SWAP (Memória Virtual)  
- Usado quando a RAM está cheia, armazenando dados temporários no disco.  
- Pode ser ativado e configurado no Linux via terminal.  

---

# 📂 Sistemas de Arquivos Distribuídos (SAD)

## 📝 Introdução
Os **Sistemas de Arquivos Distribuídos (SADs)** são projetados para permitir o acesso a arquivos armazenados em servidores remotos como se estivessem localmente disponíveis. Eles garantem que múltiplos usuários possam compartilhar arquivos de forma transparente, segura e eficiente, independente da localização física dos dados.

Quando bem projetado, um SAD oferece desempenho e confiabilidade similares a sistemas de arquivos locais, enquanto melhora a escalabilidade e a disponibilidade dos dados.

## 🔑 Características Principais
- **Compartilhamento de Arquivos:** Clientes remotos podem acessar arquivos armazenados em servidores distribuídos.
- **Estrutura Centralizada:** Mesmo com clientes dispersos, o gerenciamento de arquivos é unificado.
- **Escalabilidade:** Capacidade de aumentar a quantidade de nós (servidores e clientes) sem comprometer o desempenho.
- **Tolerância a Falhas:** Se um servidor falhar, o sistema deve continuar funcionando sem perda de dados.
- **Segurança:** Controle de acesso e autenticação de usuários.

---

## ❓ Por Que Utilizar um SAD?
Os SADs surgiram para resolver problemas de armazenamento e compartilhamento de arquivos em redes distribuídas. Algumas vantagens incluem:
- **Economia de Espaço:** Não é necessário armazenar arquivos localmente em todas as máquinas.
- **Gerenciamento Centralizado:** Facilita backups e administração dos dados.
- **Acesso Remoto:** Possibilidade de acessar arquivos a partir de diferentes dispositivos e locais.
- **Balanceamento de Carga:** Distribuição eficiente de arquivos entre servidores.

---

## ⚙️ Funcionalidades de um SAD
Os SADs fornecem uma interface para manipulação de arquivos, incluindo:
- **Abertura e fechamento de arquivos**
- **Leitura e escrita de dados**
- **Listagem e busca de arquivos**
- **Bloqueio de arquivos ou partes deles**
- **Exclusão e renomeação de arquivos e diretórios**

Além disso, um SAD pode implementar **caching** para melhorar o desempenho e reduzir a latência.

---

## 📌 Requisitos de um SAD
Um SAD deve oferecer:
1. **Compartilhamento Transparente:** Usuários devem acessar arquivos sem se preocupar com sua localização física.
2. **Mobilidade do Usuário:** Permite que o usuário trabalhe de diferentes máquinas sem perder o acesso aos seus arquivos.
3. **Replicação de Arquivos:** Copiar arquivos em múltiplos servidores para aumentar confiabilidade e desempenho.
4. **Consistência:** Todas as cópias de um arquivo devem permanecer sincronizadas.
5. **Eficiência e Escalabilidade:** Capacidade de suportar grandes volumes de dados e usuários simultâneos.

---

## 🏛️ Arquitetura de um SAD
Os SADs geralmente seguem o modelo **Cliente-Servidor**, onde:
- **Cliente:** Solicita operações de arquivos (ler, gravar, modificar, excluir).
- **Servidor:** Processa solicitações e gerencia os arquivos armazenados.

Existem diferentes formas de armazenamento:
- **Centralizado:** Todos os arquivos são mantidos em um único servidor.
- **Distribuído:** Arquivos são distribuídos entre múltiplos servidores.

Outros modelos incluem SADs baseados em **Cluster**, onde múltiplos servidores trabalham em conjunto para aumentar a performance e confiabilidade.

---

## 🔧 Serviços de um SAD
Os SADs oferecem serviços essenciais, incluindo:
1. **Serviço de Nomes Distribuído:** Localiza arquivos pelo nome ou caminho.
2. **Serviço de Arquivos Distribuído:** Garante operações como leitura, escrita e controle de acesso.
3. **Serviço de Diretórios Distribuído:** Organiza arquivos em uma estrutura hierárquica de diretórios e subdiretórios.

---

## 📌 Exemplos de SADs
Existem diversas implementações de SADs, algumas bastante populares:
- **NFS (Network File System):** Usado em sistemas Unix/Linux, permite acesso remoto a arquivos via RPC.
- **GFS (Google File System):** Desenvolvido para armazenar grandes volumes de dados do Google.
- **GlusterFS:** Um sistema de arquivos escalável baseado em blocos distribuídos.
- **PVFS (Parallel Virtual File System):** Usado para computação de alto desempenho.
- **HDFS (Hadoop Distributed File System):** Projetado para Big Data e processamento paralelo.
- **Ceph:** Sistema distribuído usado para armazenamento em nuvem.
- **Lustre:** Comum em supercomputação.
- **CODA:** Focado em disponibilidade constante de dados.
- **DFS (Distributed File System):** Implementação da Microsoft.

---

## 📊 Desafios e Melhorias em SADs
Embora os SADs tragam muitos benefícios, também apresentam desafios:
- **Latência de Rede:** O tempo de resposta pode ser maior que em sistemas locais.
- **Consistência:** Manter todas as cópias de um arquivo sincronizadas pode ser complexo.
- **Gerenciamento de Conflitos:** Quando múltiplos usuários editam o mesmo arquivo simultaneamente.
- **Segurança:** Proteção contra acessos não autorizados e falhas de autenticação.

### 🔹 Melhorias possíveis:
- Implementação de **cache local** para acelerar o acesso aos arquivos.
- Uso de **algoritmos eficientes de replicação** para garantir a consistência dos dados.
- Aplicação de **técnicas de compressão e compactação** para otimizar a transmissão de arquivos na rede.

---

## 📌 Conclusão
Os **Sistemas de Arquivos Distribuídos (SADs)** são essenciais para a computação moderna, garantindo armazenamento eficiente, compartilhamento de arquivos e escalabilidade para grandes redes e infraestruturas de TI. Eles são amplamente utilizados em ambientes corporativos, nuvem, Big Data e supercomputação.

O avanço das tecnologias de armazenamento distribuído, junto com melhorias em segurança e desempenho, tornam os SADs cada vez mais robustos e adaptáveis às necessidades modernas.

---

# Resumo: Padrão ANSI/TIA-942 para Data Centers

## O que é a norma TIA-942?
A **TIA-942** é um padrão que define os requisitos mínimos para a infraestrutura de um **Data Center (DC)**, abrangendo:

- **HVAC** (Aquecimento, Ventilação e Ar-condicionado)
- **Energia e iluminação**
- **Arquitetura e piso elevado**
- **Redundância e controle de acesso**
- **Prevenção de incêndios**
- **Cabeamento estruturado**

## Principais Referências
A norma TIA-942 faz referência a diversos outros padrões como:

- ANSI/TIA/EIA-568 (Cabeamento de telecomunicações)
- ANSI/NFPA 70 (Código elétrico nacional)
- ASHRAE (Diretrizes térmicas para ambientes de processamento de dados)

## Topologia Básica de um Data Center
Elementos do cabeamento de um **Data Center**:

1. **Cabeamento horizontal**
2. **Backbone**
3. **Conexões cruzadas (MC, HC)**
4. **Áreas de distribuição (MDA, HDA, SDA, ZDA, EDA)**

## Espaços Definidos na TIA-942
- **Sala de Entrada (EF)**: Interface com operadoras de telecom.
- **Sala de Telecom (TR)**: Suporte para cabeamento externo à sala de computadores.
- **Área de Distribuição Principal (MDA)**: Cross-connect principal, aloca switches core.
- **Área de Distribuição Horizontal (HDA)**: Conexão entre ativos e equipamentos.
- **Área de Equipamentos (EDA)**: Hospeda servidores e storages.

## Classificação dos Data Centers (Tiers)
A norma divide os Data Centers em **4 níveis (Tiers)**:

### **Tier I - Básico**
- Sem redundância, único caminho de distribuição.
- Falha em qualquer componente pode interromper operações.
- Até **28.8 horas de downtime anuais** permitidas.

### **Tier II - Componentes Redundantes**
- Redundância mínima (N+1) para UPS e refrigeração.
- Dois caminhos de entrada para telecomunicações.
- Até **22.0 horas de downtime anuais** permitidas.

### **Tier III - Sistema Auto Sustentado**
- Atendido por pelo menos **duas operadoras de telecom**.
- Duas **Salas de Entrada (ER)** separadas fisicamente.
- Permite manutenção sem interrupção.
- **1.6 horas de downtime anuais** permitidas.

### **Tier IV - Sem Tolerância a Falhas**
- **Redundância total (2N+1)** para energia e refrigeração.
- Backbone de cabeamento protegido por dutos fechados.
- Utilização de duas fontes de energia separadas.
- **0.4 horas de downtime anuais** permitidas.

## Requisitos de Infraestrutura
- **Controle ambiental:** Temperatura de **18°C a 27°C**, umidade entre **40% e 55%**.
- **Piso elevado:** Alturas variam conforme Tier (30cm a 91cm).
- **Iluminação:** Mínimo de **500 lux** no plano horizontal.
- **Energia:** Redundância UPS e geradores, tomadas independentes para serviços.

## Resfriamento e Cabeamento
- **Corredores quentes e frios** para otimização do fluxo de ar.
- **Cabeamento LSZH** para melhor resistência ao fogo e menor emissão de fumaça.

## Conclusão
O padrão **TIA-942** estabelece diretrizes essenciais para garantir a **eficiência, segurança e disponibilidade** de Data Centers, sendo a classificação **Tier** um fator crucial na escolha do nível de infraestrutura adequado para cada necessidade.

# PROVA 2

# 📊 Gestão de Data Center e Métricas em TI

Apresentação por **Gledson Scotti**  
Disciplina: **Cloud Computing**

---

## 📌 Conceitos Fundamentais

### ✅ Medida
> Quantificação de dados baseada em um padrão, considerando precisão, completude, consistência e temporalidade.  
Exemplo: Mbps como unidade de velocidade de link.

### ✅ Métrica
> Extrapolação de medidas para gerar conclusões baseadas em dados finitos.  
Exemplo: Defeitos em um lote = número de defeitos / total de unidades.

### ✅ Indicador
> Representação simplificada de uma métrica, facilitando interpretação e tomada de decisão.  
Exemplo: Gráfico de disponibilidade de rede.

---

## 📈 Principais Métricas de TI

### 1. Disponibilidade de Infraestrutura
- Monitoramento de ativos de rede:
  - Links de internet
  - Uso de banda
  - Tráfego em switches
  - Sensores de temperatura, umidade e corrente

### 2. Performance de Servidores
Monitoramento preventivo com foco em desempenho e estabilidade:

| Recurso    | Ferramentas Comuns                                  |
|------------|-----------------------------------------------------|
| Memória    | `free`, `vmstat`, `mpstat`, `iostat`, `sar`, `htop` |
| CPU        | `vmstat`, `mpstat`, `iostat`, `sar`                 |
| I/O        | `iostat`, `vmstat`                                  |
| Processos  | `ipcs`, `ipcrm`, `dmesg`, `pidstat`                 |
| Rede       | `tcpdump`, `ping`, `ifstat`, `iptraf`, `vnstat`     |

### 3. Métricas de Chamados
- Tempo médio de atendimento
- Tempo de resolução
- Avaliação por setor ou tipo de problema

### 4. Segurança
- Análise de portas e atualizações
- Identificação de portas abertas indevidamente

### 5. ROI (Retorno sobre Investimento)
- Demonstração de valor de ativos em termos de:
  - Produtividade
  - Eficiência operacional
  - Lucro ou economia gerada

---

## 🛠️ Ferramentas para Coleta e Visualização

### 🔧 Automação de Métricas
- Coleta manual é inviável em larga escala
- Uso de ferramentas que automatizam a coleta e apresentação de dados

### 📊 Ferramentas de Dashboard
#### Locais:
- `Webmin`
- `NetData`

#### Centralizadas:
- `Zabbix`
- `Nagios`
- `MRTG`
- `CACTI`

Essas ferramentas ajudam a visualizar, monitorar e alertar sobre métricas críticas em Data Centers e ambientes de TI corporativos.

---

## ✅ Considerações Finais

- Métricas e indicadores são essenciais para a **gestão eficiente** de recursos em TI.
- Devem ser escolhidos conforme os objetivos estratégicos da organização.
- A combinação de **métricas operacionais** e **indicadores de negócio** é chave para **decisões assertivas**.

# 📡 Gestão de Data Center – Métricas II

Apresentação por **Gledson Scotti**  
Disciplina: **Cloud Computing**

---

## 🔍 Tipos de Monitoramento em TI

### 1. Monitoramento por Agentes
- Requer instalação de software na máquina monitorada
- Captura dados pré-configurados e envia ao Gerente
- Pode haver conflitos no sistema e coleta de dados fora de contexto

### 2. Monitoramento Sem Agentes
- Monitoramento simples com `ping` ou verificação de portas
- Foco apenas na **disponibilidade** do serviço

### 3. Monitoramento via SNMP (Simple Network Management Protocol)
- Protocolo padrão, amplamente suportado por dispositivos de rede
- Utiliza **TCP/IP**, porta **UDP 161**
- Composto por:
  - Protocolo de comunicação
  - Estrutura de base de dados (MIB - Management Information Base)
  - Objetos gerenciáveis

### 4. Monitoramento via IPMI (Intelligent Platform Management Interface)
- Monitoramento de **hardware**
- Usado em servidores
- Fornece dados como temperatura, pressão, falhas físicas
- Funciona mesmo offline
- Considerado menos seguro

---

## 🗂️ Componentes e Conceitos do SNMP

### 📑 Estrutura
- Atua na camada de aplicação (OSI)
- Baseado em RFCs:  
  - SMI: RFC 1155  
  - MIB-I: RFC 1156  
  - SNMPv1: RFC 1157  
  - MIB-II: RFC 1213  
  - SNMPv2: RFC 1902  
  - SNMPv3: RFC 3410  

### 🧩 Arquitetura
- **Agente SNMP**: presente no dispositivo monitorado
- **Gerente SNMP**: realiza solicitações ao agente
- **MIB**: base de dados que armazena informações gerenciadas
- **OID (Object Identifier)**: identificador único de objetos

### 🧠 Classificação das Informações
- **Estática**: configurações fixas (ex: nome do dispositivo)
- **Dinâmica**: dados que mudam frequentemente (ex: pacotes transferidos)
- **Estatística**: cálculos derivados das dinâmicas (ex: uso da CPU em %)

---

## 🌲 Estrutura da MIB

- Organizada em árvore hierárquica
- Cada objeto possui um **OID**
- Exemplo:
  - OID `1.3.6.1.2.1.5` → objeto `icmp`
  - Representação alternativa: `iso.org.dod.internet.mgmt.mib-2.icmp`

---

## 🧪 Comandos SNMP

### 📤 Consulta de Dados
- `snmpget`: recupera valor de um OID específico  
  ```bash
  $ snmpget -v 1 -c public localhost SNMPv2-MIB::system.sysUpTime.0
  ```

- `snmpwalk`: percorre e exibe uma subárvore da MIB  
  ```bash
  $ snmpwalk -v 1 -c public localhost .1.3.6.1.2.1.1
  ```

- `snmptable`: exibe dados de uma tabela SNMP  
  ```bash
  $ snmptable -v 1 -c public localhost .1.3.6.1.4.1.2021.10
  ```

### 🛠️ Modificação de Dados
- `snmpset`: altera valores na MIB  
  ```bash
  $ snmpset -c private -v 1 localhost system.sysName.0 s grade18.lncc.br
  ```

### 🔄 Tradução de OIDs
- `snmptranslate`: converte OIDs para formato textual e vice-versa  
  ```bash
  $ snmptranslate -Tp
  $ snmptranslate -On -IR sysDescr
  $ snmptranslate -Onf -IR sysDescr
  $ snmptranslate -Td -OS .1.3.6.1.2.1.1.1
  $ snmptranslate -Tp -OS .1.3.6.1.2.1.1
  ```

---

## 🧑‍💻 Atividade Prática (Ubuntu Mini no VirtualBox)

### 🔧 Instalação e Configuração
```bash
sudo su
apt-get update
apt-get install snmpd*
apt-get install snmp-mibs-downloader

vi /etc/snmp/snmp.conf
# Comentar 'mibs :' e adicionar:
mibs +ALL

vi /etc/snmp/snmpd.conf
# Descomentar ou adicionar:
rocommunity public

/etc/init.d/snmpd restart
snmpwalk -v 1 -c public localhost
```

### 🧠 Exploração com MIBs (Ex: UCD-SNMP-MIB::laLoad)
- Utilizar `snmpwalk`, `snmpget`, `snmptable`, `snmptranslate` para estudar a MIB
- Apresentar vídeo demonstrando comandos e resultados

### ⚠️ Solução de Erro de MIB
```bash
sudo wget http://www.iana.org/assignments/ianaippmmetricsregistry-mib/ianaippmmetricsregistry-mib -O /var/lib/snmp/mibs/iana/IANA-IPPM-METRICS-REGISTRY-MIB

sudo wget http://pastebin.com/raw.php?i=p3QyuXzZ -O /usr/share/snmp/mibs/ietf/SNMPv2-PDU

sudo wget http://pastebin.com/raw.php?i=gG7j8nyk -O /usr/share/snmp/mibs/ietf/IPATM-IPMC-MIB
```

---

## ✅ Considerações Finais

- SNMP é essencial para monitoramento automatizado e em tempo real
- A correta configuração das MIBs permite análise detalhada de desempenho
- Ferramenta vital na **administração de Data Centers e redes corporativas**

# 📈 Trabalho Prático – Métricas com SNMP e Zabbix

**Disciplina:** Cloud Computing  
**Professor:** Gledson Scotti  
**Objetivo:** Habilitar consulta SNMP entre duas VMs e instalar o Zabbix para capturar métricas via SNMP.

---

## 🧰 Estrutura Inicial

1. **Pré-requisitos:**
   - VirtualBox instalado
   - Duas VMs com Ubuntu:
     - `Zabbix_Gerente` (Zabbix Server)
     - `Zabbix_Cliente` (SNMP habilitado)

2. **Configuração de Rede:**
   - Em casa: Modo `Bridge`
   - Na faculdade: `Rede NAT` entre as VMs
   - Configure redirecionamento de portas para acesso Web/SSH

3. **Evitar Conflito de MAC e IP:**
   - Trocar MAC address das VMs
   - Definir IPs fixos com `netplan` ou `nmtui`

---

## 🌐 Configurando IP Fixo com Netplan

```bash
# Editar o arquivo de rede (substitua <arquivo> pelo nome real)
vi /etc/netplan/<arquivo>.yaml

network:
  version: 2
  renderer: networkd
  ethernets:
    enp0s3:
      dhcp4: no
      addresses: [192.168.20.200/24]
      gateway4: 192.168.20.1
      nameservers:
        addresses: [8.8.8.8,8.8.4.4]

# Aplicar alterações
netplan apply
```

---

## 🔧 Instalação do Zabbix (Servidor)

### 1. Instalar utilitários e dependências

```bash
apt-get install openssh-server -y      # Habilita acesso SSH
apt-get install snmp                   # Instala suporte a SNMP
passwd root                            # Define senha root
apt-get install snmp-mibs-downloader   # Traduz OIDs para nomes amigáveis
```

> 📝 Se houver problema com MIBs, usar a solução da aula anterior para atualizar arquivos MIB corrompidos.

---

## 📦 Instalação do Zabbix Server, Frontend e Agent

### 2. Baixar e ativar o repositório

```bash
wget https://repo.zabbix.com/zabbix/6.4/ubuntu/pool/main/z/zabbix-release/zabbix-release_6.4-1+ubuntu22.04_all.deb
dpkg -i zabbix-release_6.4-1+ubuntu22.04_all.deb
apt update
```

### 3. Instalar os pacotes do Zabbix

```bash
apt install zabbix-server-mysql zabbix-frontend-php zabbix-apache-conf zabbix-sql-scripts zabbix-agent
```

---

## 🗃️ Banco de Dados MySQL

### 4. Criar base de dados e usuário

```bash
mysql -uroot -p
# No prompt do MySQL:
create database zabbix character set utf8mb4 collate utf8mb4_bin;
create user zabbix@localhost identified by 'password';
grant all privileges on zabbix.* to zabbix@localhost;
set global log_bin_trust_function_creators = 1;
quit;
```

### 5. Importar esquema de dados do Zabbix

```bash
zcat /usr/share/zabbix-sql-scripts/mysql/server.sql.gz | mysql --default-character-set=utf8mb4 -uzabbix -p zabbix
```

### 6. Reverter alteração temporária

```bash
mysql -uroot -p
set global log_bin_trust_function_creators = 0;
quit;
```

---

## ⚙️ Configuração Final

### 7. Configurar senha do banco

```bash
vi /etc/zabbix/zabbix_server.conf
# Adicionar:
DBPassword=password
```

### 8. Configurar fuso horário do PHP

```bash
vi /etc/zabbix/apache.conf
# Descomentar e ajustar:
php_value date.timezone America/Sao_Paulo
```

### 9. Iniciar serviços e habilitar no boot

```bash
systemctl restart zabbix-server zabbix-agent apache2
systemctl enable zabbix-server zabbix-agent apache2
```

---

## 🌐 Acesso ao Zabbix Web

- URL: `http://ip_do_servidor_zabbix/zabbix`  
- Login: **Admin**  
- Senha: **zabbix**

---

## 📊 Entregáveis do Trabalho

- 3 métricas via **SNMP**
- 2 métricas via **verificação simples**
- Vídeo com até **30 segundos** mostrando as métricas no painel
- Justifique sua escolha de métricas e explique seu valor para a organização

---

## 🔗 Referências Úteis

- [Documentação oficial do Zabbix – SNMP](https://www.zabbix.com/documentation/current/pt/manual/config/items/itemtypes/snmp)  
- [Download Zabbix 6.4 para Ubuntu](https://www.zabbix.com/br/download?zabbix=6.4&os_distribution=ubuntu&os_version=22.04&components=server_frontend_agent&db=mysql&ws=apache)

# 🔐 Proxy e Firewall – Cloud Computing

**Professor:** Gledson Scotti  
**Disciplina:** Cloud Computing  

---

## 🧭 O que é Proxy?

- É um serviço intermediário entre cliente e servidor.
- Pode repassar requisições ou atendê-las via cache local.
- Otimiza banda, fornece anonimato e aplica filtros de acesso.
- Usado para controle de tráfego e aumento de desempenho.

### Principais funções:
- Armazenamento em cache
- Compartilhamento de internet
- Filtros por IP, URL, domínio
- Anonimato (com riscos de segurança)

---

## 🧱 Tipos de Proxy

### 🔍 Proxy Transparente
- Intercepta e redireciona tráfego sem intervenção do usuário.
- Usado para forçar uso de proxy.
- Utiliza técnica de port forwarding via iptables.

```bash
iptables -t nat -A PREROUTING -i eth1 -s 10.0.0.1/24 -p tcp -m multiport --dport 80,443 -j DNAT --to-destination 10.0.0.100:3128
```

### 🔁 Proxy Reverso
- Recebe requisições e redireciona ao servidor real.
- Comum em balanceadores de carga como:
  - Nginx, HAProxy, AWS ELB
- Pode fazer cache e balanceamento de carga.

---

## 🚀 CDN – Content Delivery Network
- Distribui conteúdo para locais próximos ao usuário final.
- Reduz latência, melhora desempenho e mitiga DDoS.

---

## ⚖️ Proxy como Load Balancer

### Tipos de Balanceamento:

- **Round Robin**: distribui em sequência.
- **Weighted Round Robin**: servidores com pesos diferentes.
- **Least Connections**: menos conexões ativas.
- **Weighted Least Connections**: igual ao anterior com pesos.
- **Random**: distribuição aleatória.

---

## 🌐 Principais Balanceadores de Carga

| Nome       | Linguagem | Camada OSI | Estrelas GitHub |
|------------|-----------|------------|------------------|
| Traefik    | Golang    | 7 (App)    | 27.7k            |
| NGINX      | C         | 7 (App)    | 11.3k            |
| HAProxy    | C         | 4 e 7      | 1.1k             |
| Neutrino   | Scala     | 4 e 7      | 265              |

---

## ✅ Vantagens do Proxy

- Redução de tráfego externo
- Alívio de carga ao servidor
- Redução de latência
- Possibilidade de acesso offline (via cache)
- Monitoramento e inibição de uso indevido

---

## 🧪 Exercício: Instalando o Proxy Squid

### 1. Instalar o Squid
```bash
sudo apt-get install squid3
```

### 2. Configurar o arquivo squid.conf
```bash
sudo vi /etc/squid/squid.conf
```
- Descomentar:
  ```http_port 3128```
- Substituir:
  ```http_access deny all``` por ```http_access allow all```

### 3. Ajustar permissões e rodar Squid
```bash
sudo chmod 777 /etc/squid/squid.conf
sudo squid /etc/squid/squid.conf
```

### 4. Reiniciar o serviço
```bash
sudo squid -k reconfigure
```

---

## 🧪 Exercício: Testar Logs de Acesso

- Configure o proxy no SO cliente (ex: Windows):
  - Acesse: Ferramentas → Opções da Internet → Conexões → Configurações da LAN
  - Marque "Usar um servidor Proxy"
  - Preencha IP e porta (ex: 3128)

- Monitore logs com:
```bash
tail -f /var/log/squid/access.log
```

- Teste a navegação e observe se todos os sites funcionam.

---

## 🔐 Considerações Finais

- O uso de proxy traz segurança, controle e desempenho.
- É fundamental em redes corporativas e em servidores com alta demanda.
- A prática com Squid permite compreender a aplicação real desses conceitos.

# 🔐 Firewall, NAT e Proxy – Introdução

**Professor:** Gledson Scotti  
**Disciplina:** Cloud Computing  

---

## 🚧 O que é um Firewall?

Um **firewall** é um componente (ou conjunto de componentes) que **restringe o acesso entre redes**, atuando como uma barreira de proteção entre:

- Redes internas e a Internet
- Ou entre duas redes com níveis diferentes de segurança

📌 Origem do nome: vem das "portas corta-fogo" utilizadas em edifícios para evitar a propagação de incêndios.

### 🛡️ Propósitos principais:
- Controlar entrada e saída de tráfego
- Proteger redes privadas contra acessos não autorizados
- Centralizar pontos de acesso

---

## 🔍 Tipos de Firewall

### 1. 🔎 Filtros de Pacotes (Packet Filtering)
- Analisa cabeçalhos de pacotes IP
- Permite ou bloqueia pacotes com base em regras simples (ex: IP, porta, protocolo)

### 2. 🧠 Filtros Dinâmicos
- Mais inteligentes
- Acompanham o estado das conexões para decisões mais contextuais

### 3. 🌐 Proxy (como Firewall)
- Atua como intermediário entre o cliente e a Internet
- Pode filtrar, logar e controlar acessos
- Exemplos: Squid, Zscaler

### 4. 🔄 NAT (Network Address Translation)
- Tradução de endereços IP entre redes
- Muito usado para permitir que redes privadas acessem a Internet com poucos IPs válidos

---

## 🌍 Tipos de NAT

| Tipo                | Função                                                                 |
|---------------------|------------------------------------------------------------------------|
| **SNAT** (Source)   | Altera o IP de **origem** (saída) – usado para dar acesso à Internet   |
| **DNAT** (Destiny)  | Altera o IP de **destino** – usado para expor serviços internos        |
| **NAT Estático**    | Um IP privado → um IP público (1-para-1)                               |
| **NAT Dinâmico**    | Vários IPs privados → um IP público (N-para-1, também chamado *masquerading*) |

---

## 🧩 UTM vs NGFW

| Tipo     | Foco | Características |
|----------|------|------------------|
| **UTM** (Unified Threat Management) | Facilidade de uso | Combina firewall com antivírus, antispam, filtro de conteúdo |
| **NGFW** (Next Generation Firewall) | Flexibilidade e segurança avançada | Permite personalização, inspeção profunda de pacotes, detecção de malware |

### ✳️ Diferença:
- UTM = tudo-em-um, ideal para pequenas/médias empresas
- NGFW = mais configurável, ideal para empresas com demandas específicas

---

## 📊 Qual escolher?

- 🔧 **UTM**: melhor para quem precisa de configuração rápida e gestão centralizada
- 🧠 **NGFW**: indicado para quem precisa de **controle granular** e personalização

---

## 🛠️ Exemplos práticos (com comandos)

### 🔄 Exemplo de NAT com iptables (SNAT/DNAT)

```bash
# Exemplo de redirecionamento (DNAT)
iptables -t nat -A PREROUTING -i eth0 -p tcp --dport 80 -j DNAT --to-destination 192.168.0.10:80

# Exemplo de mascaramento (SNAT/NAT dinâmico)
iptables -t nat -A POSTROUTING -o eth0 -j MASQUERADE
```

---

## 🧱 Marcas Conhecidas de Firewall

- Fortinet
- Cisco ASA
- Palo Alto
- Sophos
- Check Point
- pfSense
- SonicWall

---

## 🔗 Referências

- [Symmetry: NGFW e UTM](https://www.symmetry.com.br/next-generation-utm-firewall)

---

## ✅ Conclusão

O firewall é essencial para a segurança de redes. Não basta instalar; é necessário **planejamento, topologia adequada e definição de políticas**.

🎯 **Resumo:**
- Entenda as necessidades da sua rede
- Escolha o tipo de firewall mais adequado (UTM ou NGFW)
- Aplique políticas claras de acesso e monitore constantemente

# 🔥 Firewall com UFW e IPTables – Prática

**Professor:** Gledson Scotti  
**Disciplina:** Cloud Computing  

---

## 🔐 O que é UFW?

**UFW (Uncomplicated Firewall)** é uma interface simplificada para o IPTables.  
Permite configurar regras de firewall de forma mais acessível, especialmente no **Ubuntu**.

- 🔒 Foco em firewalls baseados em host (*host-based firewall*)
- 🚫 Por padrão, está desativado no Ubuntu
- ✅ Suporte a IPv4 e IPv6
- 📁 Regras armazenadas em `/etc/ufw/*.rules`

---

## ⚙️ Comandos Básicos

### ➕ Habilitar o UFW:
```bash
sudo ufw enable
```

### 🔎 Verificar status detalhado:
```bash
sudo ufw status verbose
```

### ➖ Desativar o UFW:
```bash
sudo ufw disable
```

---

## 📜 Visualizar Regras Atuais

```bash
sudo ufw show raw
```

---

## ✅ Permitir Conexões

### Por porta (qualquer protocolo):
```bash
sudo ufw allow 53
```

### Por porta e protocolo:
```bash
sudo ufw allow 53/tcp
sudo ufw allow 53/udp
```

---

## ❌ Bloquear Conexões

### Por porta (qualquer protocolo):
```bash
sudo ufw deny 53
```

### Por porta e protocolo:
```bash
sudo ufw deny 53/tcp
sudo ufw deny 53/udp
```

---

## 🧹 Remover Regras

Se a regra for:
```bash
sudo ufw deny 80/tcp
```

Remova com:
```bash
sudo ufw delete deny 80/tcp
```

---

## 📛 Usando Nome de Serviço

Lista de serviços disponíveis:
```bash
less /etc/services
```

### Permitir:
```bash
sudo ufw allow ssh
```

### Bloquear:
```bash
sudo ufw deny ssh
```

---

## 📋 Ativar ou Desativar Logs

### Habilitar log:
```bash
sudo ufw logging on
```

### Desabilitar log:
```bash
sudo ufw logging off
```

---

## 📡 Regras Avançadas com IPs

### Permitir IP específico:
```bash
sudo ufw allow from 207.46.232.182
```

### Permitir Sub-rede:
```bash
sudo ufw allow from 192.168.1.0/24
```

### Permitir Porta + IP:
```bash
sudo ufw allow from 192.168.0.4 to any port 22
```

### Porta + IP + Protocolo:
```bash
sudo ufw allow from 192.168.0.4 to any port 22 proto tcp
```

---

## ⛔ Negar por IP e Porta

### Negar IP:
```bash
sudo ufw deny from 207.46.232.182
```

### Negar IP + Porta:
```bash
sudo ufw deny from 192.168.0.1 to any port 22
```

---

## 🧪 Exercício Proposto

### Cenário:

1. **Bloquear** acesso à porta 22 dos IPs:
   - `192.168.5.1`
   - `192.168.5.7`

2. **Permitir** os outros IPs da rede `192.168.0.x` para acesso à porta 22 usando **TCP**.

3. Depois, **bloquear** também o IP `192.168.5.3`.

### Sugestão de comandos:

```bash
sudo ufw deny from 192.168.5.1 to any port 22 proto tcp
sudo ufw deny from 192.168.5.7 to any port 22 proto tcp
sudo ufw allow from 192.168.0.0/24 to any port 22 proto tcp
sudo ufw deny from 192.168.5.3 to any port 22 proto tcp
```

---

## ✅ Considerações Finais

- UFW simplifica o uso do iptables.
- Ideal para administradores iniciantes.
- Pode ser usado com regras básicas e avançadas.
- Logs ajudam no diagnóstico e controle de tráfego.

# 🐳 Introdução ao Docker

**Professor:** Gledson Scotti  
**Disciplina:** Cloud Computing  

---

## 📦 Contexto e Problema

Você desenvolveu um sistema e precisa colocá-lo em produção. Isso envolve configurar servidores, instalar dependências e adaptar o ambiente — um processo **lento, repetitivo e sujeito a erros**.

Com Docker, você empacota cada camada da aplicação (frontend, backend, banco etc.) em **containers padronizados**, garantindo consistência e portabilidade entre diferentes ambientes.

---

## 🚀 Conceitos Fundamentais

### Docker é:
- Um **isolador de serviços** (web server, banco, app)
- Utiliza **Linux Containers (LXC)**
- Não virtualiza o hardware nem cria sistemas operacionais inteiros
- Compartilha o **kernel do host**, o que garante **alta performance**

---

## 🧰 Componentes do Ecossistema Docker

- **Docker Engine**: Daemon + cliente CLI
- **Docker Compose**: Define e executa múltiplos containers via arquivo `.yaml`
- **Docker Machine**: Gera ambientes Docker em VMs, nuvens ou máquinas físicas

---

## 🆚 Container vs Máquina Virtual

| Container            | Máquina Virtual          |
|----------------------|--------------------------|
| Compartilha kernel    | Cada VM tem seu SO próprio |
| Leve e rápido         | Pesado e mais lento       |
| Inicia em segundos    | Pode demorar minutos      |

---

## 🧪 Comandos Básicos

### 🔍 Verificar imagens locais:
```bash
docker image list
```

### ⬇️ Baixar uma imagem:
```bash
docker image pull python
```

### 🔍 Detalhar imagem:
```bash
docker image inspect python
```

### ▶️ Executar container:
```bash
docker container run -it --rm --name meu_python python bash
```

### Parâmetros importantes:
- `-i`: modo interativo  
- `-t`: terminal (TTY)  
- `--rm`: remove o container após execução  
- `--name`: nomeia o container

---

## 📂 Volume e Porta

### 📁 Mapear volume:
```bash
docker container run -it --rm -v "/caminho_host:/caminho_container" python
```

### 🌐 Mapear porta:
```bash
docker container run -it --rm -p 80:8080 python
```

---

## 📉 Limite de Recursos

### 💾 RAM:
```bash
docker container run -it --rm -m 512M python
```

### 🧠 CPU:
```bash
docker container run -it --rm -c 512 python
```

---

## 🔄 Execução e Listagem de Containers

### 📜 Listar containers:
```bash
docker container list -a
```

### 🛑 Parar e iniciar:
```bash
docker container stop meu_python
docker container start meu_python
```

---

## 📄 Dockerfile Exemplo

```Dockerfile
FROM ubuntu
LABEL name="satcnginx"
MAINTAINER Gledson Scotti <gledson.scotti@satc.edu.br>
RUN apt update
RUN apt install nginx -y
```

### 🔨 Build da imagem:
```bash
sudo docker build -t nginx .
```

### ▶️ Executar NGINX:
```bash
docker run -d -p 8000:80 nginx /usr/sbin/nginx -g "daemon off;"
```

### 🔎 Testar:
```bash
curl -IL http://localhost:8000
```

---

## 🌐 Redes no Docker

### 🔍 Ver redes:
```bash
docker network ls
```

Padrões:
- `bridge`: padrão
- `host`: usa a rede do host
- `none`: sem acesso à rede

### 🔧 Criar nova rede:
```bash
docker network create --driver bridge isolated_satc
```

### 📥 Associar container à rede:
```bash
docker container run -itd --net isolated_satc ubuntu bash
```

---

## 🧾 Comandos Essenciais Docker

```bash
sudo docker info              # Informações gerais
sudo docker version           # Versão do cliente/servidor
sudo docker images            # Lista imagens locais
sudo docker search nginx      # Busca imagem no Docker Hub
sudo docker pull nginx        # Baixa imagem
sudo docker run nginx         # Executa imagem
sudo docker ps -a             # Lista containers
sudo docker stats <ID>        # Exibe uso de recursos
sudo docker inspect <ID>      # Detalhes em JSON
sudo docker rmi <imagem>      # Remove imagem
sudo docker rm <container>    # Remove container
sudo docker attach <ID>       # Anexa ao terminal do container
sudo docker exec <ID> bash    # Executa comando dentro do container
sudo docker start/stop <ID>   # Inicia ou para container
```

---

## ⚙️ Exemplos de Execução

```bash
# Ubuntu em modo detach
sudo docker run -it -d ubuntu /bin/bash

# Nginx na porta 8080 do host
sudo docker run -it -p 8080:80 nginx
```

---

## 🧠 Limites e Inspeção

### 🔒 Container com 512MB:
```bash
docker run -it -m 512M --name app01 debian
docker inspect app01 | grep -i mem
```

### 🧠 Limitar a 0.5 CPU:
```bash
docker run -it --cpus=0.5 --name app02 debian
docker inspect app02 | grep -i cpu
```

### 🔁 Atualizar recursos:
```bash
docker container update -m 256m --cpus=1 app_novo01
```

---

## 📦 Exportar e Importar Container

```bash
docker export meucontainer | gzip > meucontainer.gz
zcat meucontainer.gz | docker import - meucontainer
docker run -it meucontainer bash
```

---

## 🖥️ Ferramentas Visuais para Docker

1. Kitematic  
2. Portainer  
3. DockStation  
4. Shipyard  
5. Docker Compose UI  
6. Rancher

---

## ✅ Conclusão

- Docker é leve, rápido e poderoso.
- Ideal para desenvolvimento, testes e deploy.
- Containers garantem consistência entre ambientes.
- Ferramentas visuais facilitam a adoção em ambientes corporativos.

