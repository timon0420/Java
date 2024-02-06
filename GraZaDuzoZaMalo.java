import java.util.Random;
import java.util.Scanner;
public class GraZaDuzoZaMalo {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int start;
        int koniec;
        int liczba;
        String proby;
        boolean program = true;
        while(program){
            int liczbaProb = 1;
            System.out.println("Gram polega na zgadywaniu przez użutkownika cyfry wylosowaniej przez komputer");
            System.out.print("Pierwsza liczba z zakresu liczb do losowania: ");
            start = scan.nextInt();
            System.out.print("Druga liczba z zakresu liczb do losowania: ");
            koniec = scan.nextInt();
            liczba = rand.nextInt(start, koniec); //wylosowana liczba
            System.out.println("Aby liczba prób była nieograniczona należy wprowadzić 's'");
            System.out.print("Ilość prób na odgadnięcie liczby: ");
            proby = scan.next();
            if (proby.equals("s")){
                while (true){
                    int strzal;
                    System.out.print("Liczba: ");
                    strzal = scan.nextInt();
                    if (strzal == liczba){
                        System.out.println("Brawo podana liczba jest poprawna, liczba prób: " + liczbaProb);
                        break;
                    }
                    else if (strzal<liczba) System.out.println("Podana liczba jest za mała");
                    else if (strzal>liczba) System.out.println("Podana liczba jest za duża");
                    liczbaProb += 1;
                }
            }
            else{
                int p = Integer.parseInt(proby);
                for (int i = p; i>0; i--){
                    int strzal;
                    System.out.print("Liczba: ");
                    strzal = scan.nextInt();
                    if (strzal == liczba){
                        System.out.println("Brawo podana liczba jest poprawna, liczba prób: " + liczbaProb);
                        break;
                    }
                    else if (strzal<liczba) System.out.println("Podana liczba jest za mała");
                    else if (strzal>liczba) System.out.println("Podana liczba jest za duża");
                    liczbaProb += 1;
                }
            }
            String p;
            System.out.print("Aby zakończyć działanie programu należy nacisnąć klawisz 'q', aby kontynuować działanie programu należy nacisnąć klawisz 's' ");
            p = scan.next();
            if (p.equals("q")) program = false;
            else if (p.equals("s")) program = true;
            else break;
        }

    }
}
