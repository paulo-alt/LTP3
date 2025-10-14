public class Pessoa {
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    @Override
    public String toString() {
        if (altura == 0) {
            return "Pessoa: " + nome + " (altura não informada)";
        } else {
            return "Pessoa: " + nome + ", Altura: " + altura + " m";
        }
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paulo", 1.75);
        Pessoa p2 = new Pessoa("João", 0);
        System.out.println(p1);
        System.out.println(p2);
    }
}
