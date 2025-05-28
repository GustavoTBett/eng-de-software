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

Questão:1
Qual é o protocolo de transporte usado pelo DHCP?
R= UDP

Questão:2
Qual é o propósito principal de uma VLAN?
R= Criar redes lógicas independentes em uma mesma rede física

Questão:3
Qual comando habilita o UFW em um sistema Ubuntu?
R= sudo ufw enable

Questão:4
Qual protocolo é usado pelo SNMP para atuar na camada de aplicação?
R= UDP

Questão:5
Qual é a principal função de um proxy reverso?
R= Receber requisições e delegá-las ou devolver páginas pré-processadas

Questão:6
Qual comando SNMP obtém um ramo inteiro de OIDs?
R= snmpwalk

Questão:7
Quais das opções abaixo são benefícios do protocolo VTP? (Escolha todas que se aplicam)
R= Consistência da configuração de VLANs na rede
   Adição de VLANs plug-and-play

Questão:8
Quais informações o servidor DHCP pode fornecer ao cliente? (Escolha todas que se aplicam)
R= Endereço IP temporário.
   Máscara de rede
   Nome e endereço IP do servidor DNS

Questão:9
Quais são os modos de operação do VTP? (Escolha todas que se aplicam)
R= Servidor.
   Cliente
   Transparente


Questão:10
Quais ferramentas são mencionadas como soluções de monitoramento de métricas em TI? (Escolha todas que se aplicam)
R= Zabbix
   Nagios

Questão:11
Qual é a terceira etapa no processo de operação do DHCP, que ocorre após o DHCP Offer e antes do DHCP Ack?
R= DHCP Request

Questão:12
Qual comando deve ser usado para atribuir a porta FastEthernet 0/2 de um switch à VLAN estática chamada 'Financeiro' com ID 100?
R= switchport access vlan 100


Questão:13
Qual é o comando correto para permitir acesso de um IP específico (192.168.0.4) à porta 22 com protocolo TCP usando UFW?
R= sudo ufw allow from 192.168.0.4 to any port 22 proto tcp


Questão:14
Qual porta do protocolo UDP é utilizada pelo SNMP?
R= 161


Questão:15
Quais endereços são usados como base para configurar uma VLAN dinâmica?
R= MAC e IP

Questão:16
Qual é o nome do pacote que deve ser instalado para configurar o servidor de proxy/cache Squid no Ubuntu, conforme o exercício prático feito em sala de aula?
R= squid

Questão:17
Qual comando SNMP é usado para traduzir OIDs de forma textual para numérica ou vice-versa?
R= snmptranslate

Questão:18
Qual é a principal diferença entre a virtualização por máquinas virtuais e a virtualização por containers?
R= A virtualização por containers compartilha partes do kernel do host, resultando em menor sobrecarga.


Questão:19
Qual comando Docker pode ser usado para visualizar informações detalhadas sobre uma imagem, como a imagem "python", incluindo configurações e metadados?
R= docker image inspect python


Questão:20
Qual é o comando correto para iniciar um container a partir da imagem "ubuntu" na rede personalizada "isolated_satc", em modo interativo, com um terminal alocado e que seja removido automaticamente após a finalização?
R= docker container run -it --rm --net isolated_satc ubuntu bash

1) Qual é o protocolo de transporte usado pelo DHCP?
✅ Gabarito: B | Sua resposta: B ✔️

2) Qual é o propósito principal de uma VLAN?
✅ Gabarito: B | Sua resposta: B ✔️

3) Qual comando habilita o UFW em um sistema Ubuntu?
✅ Gabarito: B | Sua resposta: B ✔️

4) Qual protocolo é usado pelo SNMP para atuar na camada de aplicação?
✅ Gabarito: B | Sua resposta: B ✔️

5) Qual é a principal função de um proxy reverso?
✅ Gabarito: B | Sua resposta: B ✔️

6) Qual tipo de armazenamento é conectado diretamente a um único computador?
✅ Gabarito: C | Sua resposta: C ✔️

7) Qual comando SNMP obtém um ramo inteiro de OIDs?
✅ Gabarito: C | Sua resposta: C ✔️

8) Quais são os benefícios do protocolo VTP?
✅ Gabarito: A, D | Sua resposta: B, A, D ❌
🔸 Comentário: Letra B está incorreta, pois não é um benefício do VTP.

9) Quais informações o servidor DHCP pode fornecer?
✅ Gabarito: B, D | Sua resposta: B, C, D ❌
🔸 Comentário: Letra C (MAC do cliente) não é fornecida pelo servidor DHCP.

10) Modos de operação do VTP:
✅ Gabarito: A, B, C | Sua resposta: A, B ❌
🔸 Comentário: Faltou incluir a letra C (Transparente).

11) Protocolos usados por NAS:
✅ Gabarito: A, B | Sua resposta: B, D ❌
🔸 Comentário: SNMP (D) não é protocolo típico de compartilhamento usado por NAS.

12) Ferramentas de monitoramento de métricas:
✅ Gabarito: A, B, D | Sua resposta: A, B, D ✔️

13) Terceira etapa do DHCP:
✅ Gabarito: B | Sua resposta: B ✔️

14) Comando para atribuir porta a VLAN:
✅ Gabarito: B | Sua resposta: A ❌

15) Comando UFW para liberar IP/porta:
✅ Gabarito: B | Sua resposta: B ✔️

16) Porta UDP usada pelo SNMP:
✅ Gabarito: B | Sua resposta: B ✔️

17) Base para VLAN dinâmica:
✅ Gabarito: B | Sua resposta: B ✔️

18) Pacote para instalar o Squid:
✅ Gabarito: A | Sua resposta: B ❌

19) Sistema base do TrueNAS:
✅ Gabarito: C | Sua resposta: A ❌

20) Comando SNMP para traduzir OIDs:
✅ Gabarito: D | Sua resposta: D ✔️

✅ Resumo da pontuação:
Acertos: 14

Erros: 6

Aproveitamento: 70%

Se quiser, posso gerar uma versão corrigida ou em PDF com destaque para estudo. Deseja isso?





Você disse:
MAS TIRANDO O GABARITO DO BLOCO DE NOTAS O QUE ESTÁ CERTO E ERRADO DE VERDADE EXPLICANDO CADA PERGUNTA


O ChatGPT disse:
Perfeito! Vamos analisar cada uma das suas respostas, comparando com o conteúdo técnico correto sem olhar o gabarito presente no bloco de notas. Isso vai garantir que você aprenda o conteúdo de forma fundamentada e entenda o porquê de cada questão estar certa ou errada.

1) Qual é o protocolo de transporte usado pelo DHCP?
Sua resposta: B) UDP ✅
Explicação: DHCP (Dynamic Host Configuration Protocol) utiliza o protocolo UDP nas portas 67 (servidor) e 68 (cliente).
Status: ✔️ Correto

2) Qual é o propósito principal de uma VLAN?
Sua resposta: B) Criar redes lógicas independentes em uma mesma rede física ✅
Explicação: VLANs permitem segmentar uma rede física em várias redes lógicas para melhorar a organização e a segurança.
Status: ✔️ Correto

3) Qual comando habilita o UFW em um sistema Ubuntu?
Sua resposta: B) sudo ufw enable ✅
Explicação: Este é o comando correto para ativar o Uncomplicated Firewall (UFW).
Status: ✔️ Correto

4) Qual protocolo é usado pelo SNMP para atuar na camada de aplicação?
Sua resposta: B) UDP ✅
Explicação: O SNMP (Simple Network Management Protocol) usa o UDP por ser mais leve, especialmente na porta 161.
Status: ✔️ Correto

5) Qual é a principal função de um proxy reverso?
Sua resposta: B) Receber requisições e delegá-las ou devolver páginas pré-processadas ✅
Explicação: O proxy reverso atua como intermediário entre clientes e servidores, recebendo requisições e encaminhando conforme necessário.
Status: ✔️ Correto

6) Qual tipo de armazenamento é conectado diretamente a um único computador?
Sua resposta: C) DAS ✅
Explicação: DAS (Direct Attached Storage) é um armazenamento que se conecta diretamente a um computador, sem rede intermediária.
Status: ✔️ Correto

7) Qual comando SNMP obtém um ramo inteiro de OIDs?
Sua resposta: C) snmpwalk ✅
Explicação: snmpwalk percorre toda uma subárvore de OIDs, diferente do snmpget que busca um único valor.
Status: ✔️ Correto

8) Quais são os benefícios do protocolo VTP? (B - A - D)
Sua resposta: B, A, D ❌
Explicação:

A) Correto. Ele garante consistência das VLANs entre switches.

B) Incorreto. Monitoramento não é papel do VTP.

D) Correto. Adição automática de VLANs entre switches.
Status: ❌ Errado (Letra B inválida)

9) Quais informações o servidor DHCP pode fornecer? (B - C - D)
Sua resposta: B, C, D ❌
Explicação:

B) Máscara de rede: Sim

C) Endereço MAC: Não. O cliente envia o MAC, o servidor não fornece isso.

D) Nome e IP do DNS: Sim
Status: ❌ Errado (Letra C inválida)

10) Modos de operação do VTP (A - B)
Sua resposta: A, B ❌
Explicação: Os modos válidos do VTP são:

Servidor (A)

Cliente (B)

Transparente (faltou incluir C)
Status: ❌ Errado (faltou uma opção correta)

11) Protocolos usados por NAS (B - D)
Sua resposta: B, D ❌
Explicação:

A) SMB/CIFS → Correto

B) NFS → Correto

D) SNMP → Não é usado para compartilhamento, e sim para monitoramento
Status: ❌ Errado (faltou A, e D está errada)

12) Ferramentas de monitoramento (A - B - D)
Sua resposta: A, B, D ✅
Explicação: Zabbix, Nagios e MRTG são ferramentas reconhecidas para monitoramento. FreeNAS não é.
Status: ✔️ Correto

13) Terceira etapa do DHCP (B)
Sua resposta: B) DHCP Request ✅
Explicação: Ordem correta:

DHCP Discover

DHCP Offer

DHCP Request

DHCP ACK
Status: ✔️ Correto

14) Comando para atribuir VLAN (A)
Sua resposta: A) switchport mode trunk vlan 100 ❌
Explicação: Para atribuir uma porta a uma VLAN específica em modo de acesso, o comando correto é:
→ switchport access vlan 100 (letra B)
Status: ❌ Errado

15) Comando UFW para liberar porta 22 para IP (B)
Sua resposta: B) sudo ufw allow from 192.168.0.4 to any port 22 proto tcp ✅
Explicação: A sintaxe está perfeita para liberar SSH (porta 22/TCP) para um IP específico.
Status: ✔️ Correto

16) Porta UDP do SNMP (B)
Sua resposta: B) 161 ✅
Explicação: SNMP usa a porta UDP 161 para requisições.
Status: ✔️ Correto

17) Base para configurar VLAN dinâmica (B)
Sua resposta: B) MAC e IP ✅
Explicação: VLANs dinâmicas geralmente são atribuídas com base no MAC address ou atributos de autenticação.
Status: ✔️ Correto

18) Pacote do Squid (B)
Sua resposta: B) squid3 ❌
Explicação: A versão padrão atual do pacote é squid, não mais squid3 (obsoleto nas versões recentes do Ubuntu).
Status: ❌ Errado

19) Sistema base do TrueNAS (A)
Sua resposta: A) Linux ❌
Explicação: TrueNAS é baseado em FreeBSD, não Linux.
Status: ❌ Errado

20) Comando SNMP para traduzir OIDs (D)
Sua resposta: D) snmptranslate ✅
Explicação: O snmptranslate é usado para converter OIDs entre forma numérica e textual.
Status: ✔️ Correto

