package java_curso;

public class Humano extends SerVivo {
    public Humano() {
        super(42);
    }
    @Override
    public void respirar() {
        System.out.println(("Inalando e exalando"));
    }
}
