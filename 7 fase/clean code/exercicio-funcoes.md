# Exercício: Funções

## Código 01

Reescreva o código abaixo removendo o uso desnecessário de switch/case:

````java
public class Pedido {
    private double valorTotal;
    private String tipoCliente; // Pode ser "COMUM", "VIP" ou "FUNCIONARIO"

    public Pedido(double valorTotal, String tipoCliente) {
        this.valorTotal = valorTotal;
        this.tipoCliente = tipoCliente;
    }

    // Método com uso desnecessário de switch
    public double calcularDesconto() {
        double desconto = 0.0;
        switch (tipoCliente) {
            case "COMUM":
                desconto = 0.05; // 5% de desconto
                break;
            case "VIP":
                desconto = 0.10; // 10% de desconto
                break;
            case "FUNCIONARIO":
                desconto = 0.20; // 20% de desconto
                break;
            default:
                desconto = 0.0; // Sem desconto
                break;
        }
        return valorTotal * (1 - desconto);
    }

    // Método para exibir o resumo do pedido
    public void exibirResumo() {
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Valor Original: R$" + valorTotal);
        System.out.println("Valor com Desconto: R$" + calcularDesconto());
    }
    
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.0, "VIP");
        pedido1.exibirResumo();
    }
}
````

Correção:

````java
public class Pedido {
    private double valorTotal;
    private CalculaDescontoSobreCargo calculaDescontoSobreCargo;

    public Pedido(double valorTotal, CalculaDescontoSobreCargo calculaDescontoSobreCargo) {
        this.valorTotal = valorTotal;
        this.calculaDescontoSobreCargo = calculaDescontoSobreCargo;
    }

    // Método para exibir o resumo do pedido
    public void exibirResumo() {
        System.out.println("Tipo de Cliente: " + calculaDescontoSobreCargo.getTipoCliente());
        System.out.println("Valor Original: R$" + valorTotal);
        System.out.println("Valor com Desconto: R$" + calculaDescontoSobreCargo.calcularDesconto(valorTotal));
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.0, new Vip());
        pedido1.exibirResumo();
    }
}

interface CalculaDescontoSobreCargo {
    String getTipoCliente();
    double calcularDesconto(Double valor);
}

class Comum implements CalculaDescontoSobreCargo {
    private String tipoCliente;

    @Override
    public String getTipoCliente() {
        return tipoCliente;
    }

    public Comum() {
        this.tipoCliente = "Comum";
    }

    @Override
    public double calcularDesconto(Double valor) {
        return valor * (1 - 0.05);
    }
}

class Vip implements CalculaDescontoSobreCargo {
    private String tipoCliente;

    @Override
    public String getTipoCliente() {
        return tipoCliente;
    }

    public Vip() {
        this.tipoCliente = "Vip";
    }

    @Override
    public double calcularDesconto(Double valor) {
        return  valor * (1 - 0.1);
    }
}

class Funcionario implements CalculaDescontoSobreCargo {
    private String tipoCliente;

    @Override
    public String getTipoCliente() {
        return tipoCliente;
    }

    public Funcionario() {
        this.tipoCliente = "Funcionario";
    }

    @Override
    public double calcularDesconto(Double valor) {
        return  valor * (1 - 0.2);
    }
}
````

## Código 02

Reescreva o código abaixo removendo as assinaturas de métodos com um número excessivo de parâmetros:

````java
public class GerenciadorPartida {
    
    public void registrarPartida(String timeCasa, String timeVisitante, int golsCasa, int golsVisitante, 
                                 int posseBolaCasa, int posseBolaVisitante, int chutesCasa, int chutesVisitante, 
                                 int faltasCasa, int faltasVisitante, int cartoesAmarelosCasa, int cartoesAmarelosVisitante, 
                                 int cartoesVermelhosCasa, int cartoesVermelhosVisitante) {
        System.out.println("Partida Registrada:");
        System.out.println(timeCasa + " " + golsCasa + " x " + golsVisitante + " " + timeVisitante);
        System.out.println("Posse de Bola: " + posseBolaCasa + "% - " + posseBolaVisitante + "%");
        System.out.println("Chutes: " + chutesCasa + " - " + chutesVisitante);
        System.out.println("Faltas: " + faltasCasa + " - " + faltasVisitante);
        System.out.println("Cartões Amarelos: " + cartoesAmarelosCasa + " - " + cartoesAmarelosVisitante);
        System.out.println("Cartões Vermelhos: " + cartoesVermelhosCasa + " - " + cartoesVermelhosVisitante);
    }
    
    public void gerarRelatorio(String timeCasa, String timeVisitante, int golsCasa, int golsVisitante, 
                               int posseBolaCasa, int posseBolaVisitante, int chutesCasa, int chutesVisitante, 
                               int faltasCasa, int faltasVisitante, int cartoesAmarelosCasa, int cartoesAmarelosVisitante, 
                               int cartoesVermelhosCasa, int cartoesVermelhosVisitante) {
        String vencedor = golsCasa > golsVisitante ? timeCasa : (golsCasa < golsVisitante ? timeVisitante : "Empate");
        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Posse de Bola: " + posseBolaCasa + "% - " + posseBolaVisitante + "%");
        System.out.println("Total de Chutes: " + (chutesCasa + chutesVisitante));
        System.out.println("Total de Faltas: " + (faltasCasa + faltasVisitante));
        System.out.println("Total de Cartões: " + ((cartoesAmarelosCasa + cartoesAmarelosVisitante) + 
                          (cartoesVermelhosCasa + cartoesVermelhosVisitante)));
    }

    public static void main(String[] args) {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        
        gerenciador.registrarPartida("Time A", "Time B", 2, 1, 55, 45, 10, 8, 15, 12, 3, 2, 1, 0);
        gerenciador.gerarRelatorio("Time A", "Time B", 2, 1, 55, 45, 10, 8, 15, 12, 3, 2, 1, 0);
    }
}
````

Correção:

````java
class Partida {
    String timeCasa;
    String timeVisitante;
    int golsCasa, golsVisitante;
    int posseBolaCasa, posseBolaVisitante;
    int chutesCasa, chutesVisitante;
    int faltasCasa, faltasVisitante;
    int cartoesAmarelosCasa, cartoesAmarelosVisitante;
    int cartoesVermelhosCasa, cartoesVermelhosVisitante;

    public Partida(String timeCasa, String timeVisitante, int golsCasa, int golsVisitante, 
                   int posseBolaCasa, int posseBolaVisitante, int chutesCasa, int chutesVisitante, 
                   int faltasCasa, int faltasVisitante, int cartoesAmarelosCasa, int cartoesAmarelosVisitante, 
                   int cartoesVermelhosCasa, int cartoesVermelhosVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
        this.posseBolaCasa = posseBolaCasa;
        this.posseBolaVisitante = posseBolaVisitante;
        this.chutesCasa = chutesCasa;
        this.chutesVisitante = chutesVisitante;
        this.faltasCasa = faltasCasa;
        this.faltasVisitante = faltasVisitante;
        this.cartoesAmarelosCasa = cartoesAmarelosCasa;
        this.cartoesAmarelosVisitante = cartoesAmarelosVisitante;
        this.cartoesVermelhosCasa = cartoesVermelhosCasa;
        this.cartoesVermelhosVisitante = cartoesVermelhosVisitante;
    }
}

class GerenciadorPartida {
    public void registrarPartida(Partida partida) {
        System.out.println("Partida Registrada:");
        System.out.println(partida.timeCasa + " " + partida.golsCasa + " x " + partida.golsVisitante + " " + partida.timeVisitante);
        System.out.println("Posse de Bola: " + partida.posseBolaCasa + "% - " + partida.posseBolaVisitante + "%");
        System.out.println("Chutes: " + partida.chutesCasa + " - " + partida.chutesVisitante);
        System.out.println("Faltas: " + partida.faltasCasa + " - " + partida.faltasVisitante);
        System.out.println("Cartões Amarelos: " + partida.cartoesAmarelosCasa + " - " + partida.cartoesAmarelosVisitante);
        System.out.println("Cartões Vermelhos: " + partida.cartoesVermelhosCasa + " - " + partida.cartoesVermelhosVisitante);
    }

    public void gerarRelatorio(Partida partida) {
        String vencedor = partida.golsCasa > partida.golsVisitante ? partida.timeCasa
                : (partida.golsCasa < partida.golsVisitante ? partida.timeVisitante : "Empate");

        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Posse de Bola: " + partida.posseBolaCasa + "% - " + partida.posseBolaVisitante + "%");
        System.out.println("Total de Chutes: " + (partida.chutesCasa + partida.chutesVisitante));
        System.out.println("Total de Faltas: " + (partida.faltasCasa + partida.faltasVisitante));
        System.out.println("Total de Cartões: " + ((partida.cartoesAmarelosCasa + partida.cartoesAmarelosVisitante)
                + (partida.cartoesVermelhosCasa + partida.cartoesVermelhosVisitante)));
    }

    public static void main(String[] args) {
        Partida partida = new Partida("Time A", "Time B", 2, 1, 55, 45, 10, 8, 15, 12, 3, 2, 1, 0);
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.registrarPartida(partida);
        gerenciador.gerarRelatorio(partida);
    }
}
````

## Código 03

Reescreva o código abaixo sem utilizar parâmetros booleanos nas funções:

````java
public class FilmeService {

    public void listarFilmes(boolean apenasDisponiveis) {
        if (apenasDisponiveis) {
            System.out.println("Listando apenas filmes disponíveis para locação...");
        } else {
            System.out.println("Listando todos os filmes do catálogo...");
        }
    }

    public void atualizarStatusFilme(String titulo, boolean disponivel) {
        if (disponivel) {
            System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
        } else {
            System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
        }
    }

    public static void main(String[] args) {
        FilmeService service = new FilmeService();

        service.listarFilmes(true);
        service.listarFilmes(false);

        service.atualizarStatusFilme("Inception", true);
        service.atualizarStatusFilme("Matrix", false);
    }
}
````

Correção:

````java
public class FilmeService {

    public void listarFilmesDisponiveis() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void listarTodosOsFilmes() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void marcarFilmeComoDisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
    }

    public void marcarFilmeComoIndisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
    }

    public static void main(String[] args) {
        FilmeService service = new FilmeService();

        service.listarFilmesDisponiveis();
        service.listarTodosOsFilmes();

        service.marcarFilmeComoDisponivel("Inception");
        service.marcarFilmeComoIndisponivel("Matrix");
    }
}
````

## Código 04

Reescreva o código abaixo resolvendo um problema de imulatibilidade que causa um problema com o preço final do produto quando usado mais de uma vez:

````java
class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void aplicarDesconto(double desconto) {
        this.preco -= desconto;
    }
}

class CarrinhoDeCompras {
    Produto produto;

    CarrinhoDeCompras(Produto produto) {
        this.produto = produto;
    }

    void adicionarProdutoAoCarrinho(Produto novoProduto) {
        this.produto = novoProduto;
    }

    void finalizarCompra() {
        produto.aplicarDesconto(10.0);
    }

    void mostrarDetalhes() {
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Laptop", 1500.00);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produto1);

        Produto produto2 = new Produto("Smartphone", 1200.00);
        carrinho.adicionarProdutoAoCarrinho(produto2);

        carrinho.finalizarCompra();
        carrinho.mostrarDetalhes();
    }
}
````

Correção:

`````java
class Produto {
    private final String nome;
    private final double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto aplicarDesconto(double desconto) {
        return new Produto(nome, preco - desconto);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    private Produto produto;

    CarrinhoDeCompras(Produto produto) {
        this.produto = produto;
    }

    void adicionarProdutoAoCarrinho(Produto novoProduto) {
        this.produto = novoProduto;
    }

    void finalizarCompra() {
        this.produto = produto.aplicarDesconto(10.0);
    }

    void mostrarDetalhes() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Laptop", 1500.00);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produto1);

        Produto produto2 = new Produto("Smartphone", 1200.00);
        carrinho.adicionarProdutoAoCarrinho(produto2);

        carrinho.finalizarCompra();
        carrinho.mostrarDetalhes();
    }
}

````

## Código 05

Reescreva o código abaixo de forma a métodos com funcionamento muito parecido.

````java
public class Jogo {
    private int vidaJogador;
    private int vidaInimigo;

    public Jogo(int vidaJogador, int vidaInimigo) {
        this.vidaJogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
    }

    public void atacarJogador(int dano) {
        vidaJogador -= dano;
        if (vidaJogador <= 0) {
            System.out.println("Jogador perdeu!");
        } else {
            System.out.println("Vida do Jogador: " + vidaJogador);
        }
    }

    public void atacarInimigo(int dano) {
        vidaInimigo -= dano;
        if (vidaInimigo <= 0) {
            System.out.println("Inimigo perdeu!");
        } else {
            System.out.println("Vida do Inimigo: " + vidaInimigo);
        }
    }

    public int getVidaJogador() {
        return vidaJogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }
}
`````

Correção:

````java
public class Jogo {
    private int vidaJogador;
    private int vidaInimigo;

    public Jogo(int vidaJogador, int vidaInimigo) {
        this.vidaJogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
    }

    public void atacar(String alvo, int dano) {
        if (alvo.equals("jogador")) {
            vidaJogador -= dano;
            if (vidaJogador <= 0) {
                System.out.println("Jogador perdeu!");
            } else {
                System.out.println("Vida do Jogador: " + vidaJogador);
            }
        } else if (alvo.equals("inimigo")) {
            vidaInimigo -= dano;
            if (vidaInimigo <= 0) {
                System.out.println("Inimigo perdeu!");
            } else {
                System.out.println("Vida do Inimigo: " + vidaInimigo);
            }
        }
    }

    public int getVidaJogador() {
        return vidaJogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }
}

````