import java.util.Arrays;
import java.util.Random;
public class Tablice {
    public static void main(String[] args){
        int[] t4 = new int[20];
        wypelnijTablice(t4);
        System.out.println(Arrays.toString(t4));
        sortowanieBombelkowe(t4);
        System.out.println(Arrays.toString(t4));
    }
    static void wypelnijTablice(int[] tt){
        Random rand = new Random();
        for (int i = 0; i < tt.length; i++) tt[i] = rand.nextInt(20);
    }
    static void sortowanieBombelkowe(int[] tt){
        int x = tt.length-1;
        for (; x > 0; x--){
            for (int i = 0; i < tt.length-1; i++){
                int bufor;
                if (tt[i] > tt[i+1]){
                    bufor = tt[i];
                    tt[i] = tt[i+1];
                    tt[i+1] = bufor;
                }
            }
            x--;
        }
    }
}
