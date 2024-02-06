import java.util.Scanner;
public class ProgramSedziowski {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int liczbaSedziow;
        System.out.println("Program oblicza oceny zawodników na podstawie ocen podanych przez sędziów");
        boolean q = true;
        while (q == true){
            double suma = 0;
            double min = 0;
            double max = 0;
            System.out.print("Liczba sędziów: ");
            liczbaSedziow = scan.nextInt();
            if (liczbaSedziow <= 3 || liczbaSedziow > 10) System.out.println("Podane dane są niepoprawne");
            else{
                for (int i = liczbaSedziow; i > 0; i--){
                    double zmienna;
                    System.out.print("Ocena: ");
                    zmienna = scan.nextDouble();
                    if (zmienna >= 0 && zmienna <= 10){
                        suma += zmienna;
                        if (i == liczbaSedziow) min = zmienna;
                        else if (min > zmienna) min = zmienna;
                    }
                    else{
                        System.out.println("Podane dane są niepoprawne");
                        break;
                    }
                }
                String bufor;
                System.out.format("Średnia ocen: %.4f\n",((suma-min-max)/(liczbaSedziow-2)));
                System.out.print("Aby kontynuować należy nacisnąć klawisz 's', aby zakończyć działanie programu należy nacisnąć klawisz 'q': ");
                bufor = scan.next();
                if (bufor.equals("q")) q = false;
                else if (bufor.equals("s")) q = true;
            }
        }
    }
}
