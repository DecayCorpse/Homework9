import java.util.Arrays;
import java.util.Random;
public class DvymerniMassive {
    Random random = new Random();
    int a;
    int b;
    int[][] c;
    //    DvymerniMassive(){}
    public DvymerniMassive(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = new int[a][b];
        init();
    }
    void init() {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = random.nextInt(10);
            }
        }
    }
    public void show() {
        System.out.println(Arrays.deepToString(this.c));
    }
    public void plus() {
        for (int i = 0; i < c.length; i++) {
            System.out.println();
            int summ = 0;
            for (int j = 0; j < c[i].length; j++) {
                summ = summ + c[i][j];
            }
            System.out.print(" вектор " + i + " = " + summ + ",");
        }
    }
    }




