import java.util.Scanner;
public class RocznePrzychody {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int liczbaMiesiecy;
        double max = 0;
        double min = 0;
        double suma = 0;
        System.out.println("Program oblicza sumę, średnią, minimalny i maksymalny przychód w okresie zadanym przez urzytkownika");
        System.out.print("Liczba miesięcy: ");
        liczbaMiesiecy = scan.nextInt();
        for (int i = liczbaMiesiecy; i > 0; i--){
            double zmienna;
            System.out.print("Przychód: ");
            zmienna = scan.nextDouble();
            suma += zmienna;
            if (i == liczbaMiesiecy) min = zmienna;
            else if (min > zmienna) min = zmienna;
            if (max < zmienna) max = zmienna;
        }
        System.out.println("------------------------------------");
        System.out.println("Suma: "+suma);
        System.out.println("Maksymalny przychód: "+max);
        System.out.println("Minimalny przychód: "+min);
        System.out.format("Średni przychód: %.4f",(suma/liczbaMiesiecy));
    }
}
