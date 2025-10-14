public class Carro {
    private String modelo;
    private int ano;
    private double tanque;   // em litros
    private double consumo;  // km por litro

    // Construtor completo
    public Carro(String modelo, int ano, double tanque, double consumo) {
        this.modelo = modelo;
        this.ano = ano;
        this.tanque = tanque;
        this.consumo = consumo;
    }

    // Construtor sem modelo
    public Carro(int ano, double tanque, double consumo) {
        this(null, ano, tanque, consumo);
    }

    // Construtor sem ano
    public Carro(String modelo, double tanque, double consumo) {
        this(modelo, 0, tanque, consumo);
    }

    // Construtor mínimo
    public Carro(double tanque, double consumo) {
        this(null, 0, tanque, consumo);
    }

    public double autonomia() {
        return tanque * consumo;
    }

    @Override
    public String toString() {
        String dados = "Carro:";
        dados += (modelo != null) ? "\nModelo: " + modelo : "\nModelo: não informado";
        dados += (ano != 0) ? "\nAno: " + ano : "\nAno: não informado";
        dados += "\nTanque: " + tanque + " L";
        dados += "\nConsumo: " + consumo + " km/L";
        dados += "\nAutonomia: " + autonomia() + " km";
        return dados;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Civic", 2020, 50, 12);
        Carro c2 = new Carro(2022, 40, 10);
        System.out.println(c1);
        System.out.println(c2);
    }
}
