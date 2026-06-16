import javax.swing.JOptionPane;

public class AlterCheck {
    public static void main(String[] args) {
        // TODO 1: Frage per Popup nach dem Alter der Person und merke dir die Eingabe
        String alterString = JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein:");
        // TODO 2: Wandle die Eingabe in eine ganze Zahl um
        int alter = Integer.parseInt(alterString);
        // TODO 3: Bedingung -> ab 18 'volljaerig', sonst 'minderjaehrig'
     if (alter >= 18) {
            System.out.println("volljaehrig");
        } else {
            System.out.println("minderjaehrig");
        }
    }
}