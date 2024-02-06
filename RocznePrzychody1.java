import java.util.Scanner;
import java.util.Arrays;
public class RocznePrzychody1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] dochody = {0,0,0,0,0,0,0,0,0,0,0,0};
        int i = 0;
        while (true){
            if (i == 0) i++;
            else if (i != 0){
                System.out.print("Aby kontynuować działanie programu należy nacisnąć klawisz 's'\nAby zakończyć działanie programu należy nacisnąć klawisz 'q': ");
                if (scan.next().equals("q")) break;
            }
            menu();
            switch (wybory(scan)){
                case 1:
                    for (int x = 0; x < 12; x++){
                        double bufor;
                        System.out.print("Dochód: ");
                        bufor = scan.nextDouble();
                        if (bufor < 0){
                            System.out.println("Podano niepoprawną wartość");
                            x--;
                        }
                        else dochody = wczytaj_dochody(dochody, bufor);
                    }
                    break;
                case 2:
                    wyswietl_dochody(dochody);
                    break;
                case 3:
                    srednia_suma_dochodow(dochody);
                    break;
                case 4:
                    maksymalny_minimalny_dochod(dochody);
                    break;
                case 5:
                    sortuj(dochody);
                    break;
                case 6:
                    pod_nad_srednim_dochodem(dochody);
                    break;
                default:
                    System.out.println("BŁĄD");
                    break;
            }
        }

    }
    static void menu(){
        System.out.println("1.Wczytywanie dochodu");
        System.out.println("2.Wyświetl dochody");
        System.out.println("3.Średnia i suma dochodów");
        System.out.println("4.Maksymalny i minimalny dochód");
        System.out.println("5.Posortowane dochody");
        System.out.println("6.Dochody poniżej i powyżej średniej");
    }
    static int wybory(Scanner scan){
        int wybor;
        System.out.print("--------------------------\nWybór: ");
        wybor = scan.nextInt();
        return wybor;
    }
    static double[] wczytaj_dochody(double[] tab, double dochody){
        for (int i = 0; i < tab.length; i++){
            if (tab[i] == 0){
                tab[i] = dochody; break;
            }
        }
        return tab;
    }
    static void wyswietl_dochody(double[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
    static void srednia_suma_dochodow(double[] tab){
        double suma = 0;
        for (int i = 0; i < tab.length; i++){
            suma += tab[i];
        }
        System.out.println("Suma: "+suma);
        System.out.format("Średnia: %.4f\n",suma/12);
    }
    static void maksymalny_minimalny_dochod(double[] tab){
        Arrays.sort(tab);
        System.out.println("Maksymalny dochód: "+tab[tab.length-1]);
        System.out.println("Minimalny dochód: "+tab[0]);
    }
    static void sortuj(double[] tab){
        Arrays.sort(tab);
        System.out.print("| ");
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i]+" | ");
        }
        System.out.println();
    }
    static void pod_nad_srednim_dochodem(double[] tab){
        double suma = 0;
        for (int i = 0; i < tab.length; i++) suma += tab[i];
        double srednia = suma/12;
        for (int x = 0; x < tab.length; x++){
            if (tab[x] < srednia) System.out.println("Pod średnią: "+tab[x]);
            else if (tab[x] == srednia) System.out.println("Srednia: "+tab[x]);
            else System.out.println("Nad średnią: "+tab[x]);
        }
    }
}
