import com.sun.source.tree.ReturnTree;

import java.util.Arrays;
import java.util.Random;

public class Vektor1 {
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public Vektor1() {
        this.x = 0;
        this.y = 0;
        this.z = 0;


    }

    public void setY(int y) {
        this.y = y;
    }

    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vektor1(int x, int z, int y) {
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public void dlinna() {
        System.out.println(Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z));
    }

    public static void summa(Vektor1 a, Vektor1 b) {
        System.out.println((a.x + b.x) + " " + (a.y + b.y) + " " + (a.z + b.z));
    }

    public static void raznost(Vektor1 a, Vektor1 b) {
        System.out.println((a.x - b.x) + " " + (a.y - b.y) + " " + (a.z - b.z));
    }

    public static Vektor1[] massive(int N) {
        Random random = new Random();
        Vektor1[] a = new Vektor1[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Vektor1();
            a[i].x = random.nextInt(10);
            a[i].y = random.nextInt(10);
            a[i].z = random.nextInt(10);
            System.out.println(a[i].x + " " + a[i].y + " " + a[i].z);
        }
        return a;
    }

    public static void sravnenie(Vektor1 a, Vektor1 b) {
        if ((a.x + a.y + a.z) > (b.x + b.y + b.z)) {
            System.out.println("вектор 'а' больше");
        }
        if ((a.x + a.y + a.z) < (b.x + b.y + b.z)) {
            System.out.println("ветор 'а' меньше");
        } else {
            System.out.println("веектора равны");
        }
    }
}