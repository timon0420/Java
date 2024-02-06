import javax.swing.JOptionPane;
public class PolaFigurJOptionPane {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Program oblicza pola figur");
        String[] lista = {"Kwadrat", "Prostokąt", "Trójkąt", "Koło"};
        //JOptionPane.showOptionDialog(null, "Wybierz swój prezent", "Wybór prezentu", 0, 0, null, lista, "");
        do{
            String wybor = JOptionPane.showInputDialog(null, "Wybieranie figury", "Okno wyboru figury", JOptionPane.QUESTION_MESSAGE, null, lista, "").toString();
            program(wybor);
        }while(true);
    }
    public static void program(String wybor){
        double pole;
        switch (wybor){
            case "Kwadrat":
                pole = Math.pow(dane(), 2);
                JOptionPane.showMessageDialog(null, "Pole jest równe: "+pole);
                break;
            case "Prostokąt":
                pole = dane()*dane();
                JOptionPane.showMessageDialog(null, "Pole jest równe: "+pole);
                break;
            case "Trójkąt":
                pole = 0.5*dane()*dane();
                JOptionPane.showMessageDialog(null, "Pole jest równe: "+pole);
                break;
            case "Koło":
                pole = Math.PI*Math.pow(dane(), 2);
                JOptionPane.showMessageDialog(null, "Pole jest równe: "+pole);
                break;
            default:
                JOptionPane.showMessageDialog(null, "BŁĄD", "", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    public static double dane(){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Liczba"));
    }
}
