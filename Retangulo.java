/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Retangulo {
    // Atributos
    double base;
    double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular o perímetro
    public double perimetro() {
        return 2 * (base + altura);
    }

    // Método para calcular a área
    public double area() {
        return base * altura;
    }

    // Método principal para testar
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5, 3);
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("Área: " + r1.area());
    }
}
