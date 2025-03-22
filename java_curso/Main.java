package java_curso;
// public geral
// default nada declarado só na classe
// private igual default (praticamente)
// protected só no mesmo pacote
public class Main {
    // metodo de entrada especial
    public static void main(String[] args) {
            // stancia de cada carro, new envoca
            Carro meuCarro = new Carro("Bm");

            String resultado = meuCarro.acelerar();
            System.out.println(resultado);

            SerVivo meuSer = new Humano();
            meuSer.idade();
    }
}

class Carro {
    String modelo;
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    private String frear() {
        System.out.println("Freando o carro " + this.modelo);

        return "Carro " + this.modelo + " foi freado!";
    }

    public String acelerar() {
        System.out.println("Acelerar o carro " + this.modelo);
        String result = this.frear();

        return result + "Carro " + this.modelo + " foi acelerado!";
    }
}
