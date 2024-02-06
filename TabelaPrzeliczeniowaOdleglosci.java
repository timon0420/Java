import java.util.Scanner;
public class TabelaPrzeliczeniowaOdleglosci {
    public static void main(String[] args){
        double cal = 39.37007874015748;
        double stopa = 3.280839895013123;
        double jard = 1.0936132983377078;
        double milaLadowa = 0.0006213711922373339;
        int start;
        int koniec;
        int krok;
        System.out.println("Program przelicza jednostki z metrów na cale, stopy, jardy i milem lądowe.\nUżytkownik programu może podać wartość początkową oraz wartość końcową przelicznych jednostek oraz krok\n(wartość o jaką w każdym przebiegu pętli będzie zwiększała się długość początkowa).");
        Scanner scan = new Scanner(System.in);
        System.out.print("Wartość początkowa: ");
        start = scan.nextInt();
        System.out.print("Wartość końcowa: ");
        koniec = scan.nextInt();
        System.out.print("Wartość kroku: ");
        krok = scan.nextInt();
        if (krok == 0) System.out.println("Podana wartość kroku jest niepoprawna");
        else if (((start>koniec) && krok>0)) System.out.println("Program nie jest możliwy do wykonania");
        else if ((start <= 0 || koniec <= 0)) System.out.println("Program nie jest możliwy do wykonania");
        else if (start == koniec) System.out.println("Program nie jest możliwy do wykonania");
        else{
            if (start>koniec){
                for(int i = koniec; i <= start; i -= krok ){
                    System.out.println("Metry: "+i);
                    System.out.format("Cale: %.4f\n", (i*cal));
                    System.out.format("Stopy: %.4f\n", (i*stopa));
                    System.out.format("Jardy: %.4f\n", (i*jard));
                    System.out.format("Mile lądowe: %.4f\n", (i*milaLadowa));
                    System.out.println("----------------------------------");
                }
            }
            else if(koniec>start){
                for(int i = start; i <= koniec; i += krok){
                    System.out.println("Metry: "+i);
                    System.out.format("Cale: %.4f\n", (i*cal));
                    System.out.format("Stopy: %.4f\n", (i*stopa));
                    System.out.format("Jardy: %.4f\n", (i*jard));
                    System.out.format("Mile lądowe: %.4f\n", (i*milaLadowa));
                    System.out.println("----------------------------------");
                }
            }
        }
    }
}
