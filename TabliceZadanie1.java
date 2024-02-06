import java.util.Scanner;
public class TabliceZadanie1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        program(scan);
    }
    static int menu(Scanner scan){
        int wybor;
        do{
            System.out.println("1.Macierz 2x2 i obliczanie wyznacznika");
            System.out.println("2.Macierz 3x3 i obliczanie wyznacznika");
            System.out.println("3.Rozwiązywanie równań metodą wyznacznikową");
            System.out.println("4.Koniec programu");
            System.out.print("Wybór: ");
            wybor = scan.nextInt();
            if (wybor == 1 || wybor == 2 || wybor == 3 || wybor == 4) return wybor;
            else System.out.println("BŁĄD");
        }while(true);

    }
    static void program(Scanner scan){
        boolean q = true;
        do{
            int wybory = menu(scan);
            switch (wybory){
                case 1:
                    System.out.println("Wynik: "+det2(tworzenieMacierzy(scan,wybory)));
                    System.out.print("Aby kontynuować należy nacisnąć dowolny klawisz: "); scan.next();
                    break;
                case 2:
                    System.out.println("Wynik: "+det3(tworzenieMacierzy(scan, wybory)));
                    System.out.print("Aby kontynuować należy nacisnąć dowolny klawisz: "); scan.next();
                    break;
                case 3:
                    System.out.println("Współczynniki A1, A2, B1, B2");
                    double[][] wspolczynniki = tworzenieMacierzy(scan, 1);
                    System.out.println("Wyniki równań");
                    System.out.print("Równanie pierwsze: ");
                    double y1 = scan.nextDouble();
                    System.out.print("Równanie drugie: ");
                    double y2 = scan.nextDouble();
                    double w = det2(wspolczynniki);
                    double[][] tablicaPomocnicza1 = {{y1, wspolczynniki[0][1]}, {y2, wspolczynniki[1][1]}};
                    double wx = det2(tablicaPomocnicza1);
                    double[][] tablicaPomocnicza2 = {{wspolczynniki[0][0], y1}, {wspolczynniki[1][0], y2}};
                    double wy = det2(tablicaPomocnicza2);
                    System.out.println("x = "+wx/w+" y = "+wy/w);
                    System.out.print("Aby kontynuować należy nacisnąć dowolny klawisz: "); scan.next();
                    break;
                case 4:
                    q = false;
                    break;
                default:
                    System.out.println("BŁĄD");
                    break;
            }
        }while (q);
    }
    static double[][] tworzenieMacierzy(Scanner scan, int wybory){
        double[][] macierz;
        if (wybory == 1){
             macierz = new double[2][2];
        }
        else{
            macierz = new double[3][3];
        }
        for (int i = 0; i < macierz.length; i++){
            System.out.println(i+1+". Wiersz");
            for (int x = 0; x < macierz[i].length; x++){
                System.out.print("Liczba: ");
                macierz[i][x] = scan.nextInt();
            }
        }
        return macierz;
    }
    static double det2(double[][] t){
        return (t[0][0]*t[1][1]) - (t[0][1]*t[1][0]);
    }
    static double det3(double[][] t){
        return ((t[0][0]*t[1][1]*t[2][2])+(t[0][1]*t[1][2]*t[2][0])+(t[0][2]*t[1][0]*t[2][1])) - ((t[2][0]*t[1][1]*t[0][2])+(t[2][1]*t[1][2]*t[0][0])+(t[2][2]*t[1][0]*t[0][1]));
    }
}
