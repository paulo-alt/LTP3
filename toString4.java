public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor 1: apenas hora
    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    // Construtor 2: hora e minuto
    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    // Construtor 3: hora, minuto e segundo
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public static void main(String[] args) {
        Tempo t1 = new Tempo(10);
        Tempo t2 = new Tempo(14, 30);
        Tempo t3 = new Tempo(23, 59, 59);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
