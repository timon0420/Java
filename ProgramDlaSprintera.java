import java.util.Scanner;
public class ProgramDlaSprintera {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Program oblicza średni czas biegu oraz pokazuje najgorszy i najlepszy czas");
        System.out.println("Aby zakończyć działanie programu i wyświetlić wyniki należy nacisnąć klawisz 'q'");
        double max = 0;
        double min = 0;
        double suma = 0;
        int i = 1;
        while (true){
            String bufor;
            double zmienna;
            System.out.print("Czas biegu: ");
            bufor = scan.nextLine();
            if (bufor.equals("q")) break;
            else zmienna = Double.parseDouble(bufor);
            if (zmienna <= 0) System.out.println("Podany czas jest nieprawidłowy, należy podać prawidłowy czas!!!");
            else{
                suma += zmienna;
                if (i == 1){
                    min = zmienna;
                    i++;
                }
                else if (min > zmienna) min = zmienna;
                else i++;
                if (max < zmienna) max = zmienna;
            }
        }
        if (suma > 0){
            System.out.format("Średni czas: %.4f\n", (suma/i));
            System.out.println("Najlepszy czas: "+min);
            System.out.println("Najgorszy czas: "+max);
        }
    }
}
