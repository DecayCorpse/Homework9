import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vektor1 b = new Vektor1(5, 5, 5);
        Vektor1 a = new Vektor1(2, 5, 7);
        a.dlinna();
        Vektor1.summa(a, b);
        Vektor1.raznost(a, b);
        Vektor1.massive(5);
        Vektor1.sravnenie(a,b);
    }
}