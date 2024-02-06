import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class TabliceZadanie2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        program(scan);
    }
    static int menu(Scanner scan){
        int wybor;
        do{
            System.out.println("1.Wypełnianie tablicy wartościami losowymi");
            System.out.println("2.Wypełnianie tablicy zerami i jedynkami");
            System.out.println("3.Transponowanie tablicy po przez tworzenie nowej tablicy");
            System.out.println("4.Transponowanie tablicy");
            System.out.println("5.Mnożenie macierzy");
            System.out.println("6.Koniec");
            System.out.print("Wybór: ");
            wybor = scan.nextInt();
            if (wybor == 1 || wybor == 2 || wybor == 3 || wybor == 4 || wybor == 5 || wybor == 6) return wybor;
            else System.out.println("BŁĄD");
        }while(true);

    }
    static void program(Scanner scan){
        boolean q = true;
        do{
            int wybory = menu(scan);
            int[][] tab = new int[0][];
            int[][] tab1 = new int[0][];
            if (wybory != 6 && wybory != 5){
                int[] wymiary = wczytywanieRozmiaruTablic(scan);
                tab = new int[wymiary[0]][wymiary[1]];
                if (wybory != 2){
                    int[] minIMax = wczytywanieMinIMax(scan);
                    tab1 = wypelnijTablice(tab, minIMax[0], minIMax[1]);
                }
            }
            switch (wybory){
                case 1:
                    wypisz(tab1);
                    kontynuacjaProgramu(scan);
                    break;
                case 2:
                    wypisz(wypelnijTabliceZJednkami(tab));
                    kontynuacjaProgramu(scan);
                    break;
                case 3:
                    wypisz(tab1);
                    wypisz(transponujTablice1(tab1));
                    kontynuacjaProgramu(scan);
                    break;
                case 4:
                    if (czyKwadrat(tab1)) {
                        wypisz(tab1);
                        int[][] transpozycja = transponujTablice2(tab1);
                        wypisz(transpozycja);

                    }
                    else System.out.println("Transpozycja tej tablicy jest niemożliwa");
                    kontynuacjaProgramu(scan);
                    break;
                case 5:
                    System.out.println("Pierwsza macierz: ");
                    int[][] macierzA = tworzenieMacierzy(scan);
                    System.out.println("Druga macierz: ");
                    int[][] macierzB = tworzenieMacierzy(scan);
                    System.out.println("Wynik mnożenia macierzy: ");
                    wypisz(mnozenieMacierzy(macierzA, macierzB));
                    kontynuacjaProgramu(scan);
                    break;
                case 6:
                    q = false;
                    break;
                default:
                    System.out.println("BŁĄD");
                    break;
            }
        }while(q);
    }
    static int[] wczytywanieRozmiaruTablic(Scanner scan){
        int rozmiar1, rozmiar2;
        System.out.print("Rozmiar pierwszej tablicy: ");
        rozmiar1 = scan.nextInt();
        System.out.print("Rozmiar drugiej tablicy: ");
        rozmiar2 = scan.nextInt();
        return new int[]{rozmiar1, rozmiar2};
    }
    static int[] wczytywanieMinIMax(Scanner scan){
        System.out.print("Minimalna wartość: ");
        int min = scan.nextInt();
        System.out.print("Maksymalna wartość: ");
        int max = scan.nextInt();
        return new int[]{min, max};
    }
    static int[][] wypelnijTablice(int[][] t, int min, int max){
        Random rand = new Random();
        for (int i = 0; i < t.length; i++){
            for (int x = 0; x < t[i].length; x++) {
                t[i][x] = rand.nextInt(min, max);
            }
        }
        return t;
    }
    static int[][] wypelnijTabliceZJednkami(int[][] t){
        for (int i = 0; i < t.length; i++){
            for (int x = 0; x < t[i].length; x++){
                if (x == i) t[i][x] = 1;
                else if (x == t[i].length - i - 1) t[i][x] = 1;
                else t[i][x] = 0;
            }
        }
        return t;
    }
    static int[][] transponujTablice1(int[][] t){
        int[][] nowa = new int[t[0].length][t.length];
        for (int i = 0; i < t.length; i++){
            for (int x = 0; x < t[i].length; x++){
                nowa[x][i] = t[i][x];
            }
        }
        return nowa;
    }
    static boolean czyKwadrat(int[][] t){
        return t.length == t[0].length;
    }
    static int[][] transponujTablice2(int[][] t){
        for (int i = 0; i < t.length; i++){
            for (int x = i+1; x < t[i].length; x++){
                int bufor = t[i][x];
                t[i][x] = t[x][i];
                t[x][i] = bufor;
            }
        }
        return t;
    }
    static int wczytywanieLiczby(Scanner scan){
        System.out.print("Liczba: ");
        return scan.nextInt();
    }
    static int[][] tworzenieMacierzy(Scanner scan){
        int[] wymiary = wczytywanieRozmiaruTablic(scan);
        int[][] macierz = new int[wymiary[0]][wymiary[1]];
        for (int i = 0; i < macierz.length; i++){
            System.out.println(i+1+". Wiersz");
            for (int x = 0; x < macierz[i].length; x++){
                macierz[i][x] = wczytywanieLiczby(scan);
            }
        }
        return macierz;
    }
    static int[][] mnozenieMacierzy(int[][] a, int[][] b){
        if (a.length == b[0].length){
            int[][] nowaMacierz = new int[a.length][b[0].length];
            for (int i = 0; i < a.length; i++){
                int suma = 0;
                for (int y = 0; y < a.length; y++){
                    suma = 0;
                    for (int x = 0; x < b.length; x++){
                        suma += a[i][x]*b[x][y];
                    }
                    nowaMacierz[i][y] = suma;
                }
            }
            return nowaMacierz;
        }
        else {
            System.out.println("BŁĄD");
        }
        return null;
    }
    static void wypisz(int[][] t){
        if (t != null){
            for (int i = 0; i < t.length; i++){
                System.out.println(Arrays.toString(t[i]));
            }
            System.out.println("\n");
        }
    }
    static void kontynuacjaProgramu(Scanner scan){
        System.out.print("Aby kontynuować należy nacisnąć dowolny klawisz: "); scan.next();
    }
}
