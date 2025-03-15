import java.util.ArrayList;

public class Main {
    // metodo de entrada especial
    public static void main(String[] args) {
            // stancia de cada carro, new envoca
            Carro meuCarro = new Carro("Bm");
            Carro meuCarro2 = new Carro("Fusca");
            Carro meuCarro3 = new Carro("Virtus");

            String resultado = meuCarro2.acelerar();
            System.out.println(resultado);
    }
}

class Carro {
    String modelo;
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String acelerar() {
        System.out.println("Acelerar o carro " + this.modelo);

        return "Carro " + this.modelo + " foi acelerado!";
    }
}
