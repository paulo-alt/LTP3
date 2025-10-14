public class Retangulo {
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Método toString()
    @Override
    public String toString() {
        return "Retângulo [Base = " + base + ", Altura = " + altura +
               ", Área = " + calcularArea() +
               ", Perímetro = " + calcularPerimetro() + "]";
    }
}
