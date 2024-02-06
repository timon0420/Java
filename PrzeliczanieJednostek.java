import java.util.Scanner;
public class PrzeliczanieJednostek {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cal = 39.37007874015748;
        double jard = 1.0936132983377078;
        double stopa = 3.280839895013123;
        double mila = 0.0006213712;
        double milaMorska = 0.0005399568034557236;
        double saznie = 0.5468066491688539;
        double lokcie = 1.6404199475065617;
        System.out.println("Program przelicza metry na różne jednostki miary, aby przerwać działanie programu należy wcisnąć 'q'");
        int q = 1;
        while (q==1){
            System.out.print("Ilość metrów: ");
            String bufor = scan.nextLine();
            if (bufor.equals("q")) q = 0;
            else{
                double metr = Double.parseDouble(bufor);
                if (metr < 0) System.out.println("Podana wartość jest nieprawidłowa");
                else{
                    System.out.format("Cale: %.4f%n",metr*cal);
                    System.out.format("Jardy: %.4f%n",metr*jard);
                    System.out.format("Stopy: %.4f%n",metr*stopa);
                    System.out.format("Mile: %.4f%n",metr*mila);
                    System.out.format("Mile morskie: %.4f%n",metr*milaMorska);
                    System.out.format("Sążnie: %.4f%n",metr*saznie);
                    System.out.format("Łokcie: %.4f%n",metr*lokcie);
                }
            }
        }
    }
}
