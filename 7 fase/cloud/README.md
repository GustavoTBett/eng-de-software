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

---

## 🔄 SWAP (Memória Virtual)  
- Usado quando a RAM está cheia, armazenando dados temporários no disco.  
- Pode ser ativado e configurado no Linux via terminal.  

---