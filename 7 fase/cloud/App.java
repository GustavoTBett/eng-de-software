public class App {
    private static int number = 10;

    public static void main(String[] args) {
        Thread newThread = new Thread(() -> {
            number = 30;
            System.out.println("Assincrono");
            System.out.println("Número assincrono 1: " + number);
        });
        newThread.start();

        Thread newThread2 = new Thread(() -> {
            number = 40;
            System.out.println("Assincrono");
            System.out.println("Número assincrono 2: " + number);
        });
        newThread2.start();

        Thread newThread3 = new Thread(() -> {
            number = 50;
            System.out.println("Assincrono");
            System.out.println("Número assincrono 3: " + number);
        });
        newThread3.start();

        System.out.println("Número sincrono: " + number);
    }
}

/* 
resultado:
Assincrono
Assincrono
Assincrono
Número assincrono 1: 40
Número assincrono 2: 40
Número assincrono 3: 50
Número sincrono: 40

resultado 2:
Assincrono
Número assincrono 1: 30
Assincrono
Número sincrono: 30
Assincrono
Número assincrono 2: 50
Número assincrono 3: 50

Explicação: A classe roda 3 threads asyncs atribuindo um valor ao número para ser visualizado depois e como elas estão rodando ao mesmo tempo, podem mostrar valores diferentes dependendo do momento que vai rodar.
*/