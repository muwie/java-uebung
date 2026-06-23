import javax.swing.JOptionPane;

public class AlterCheck {
    public static void main(String[] args) {
        // TODO 1: Frage per Popup nach dem Alter der Person und merke dir die Eingabe
        String alterString = JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein:");
        // TODO 2: Wandle die Eingabe in eine ganze Zahl um (mit Prüfung)
        if (alterString == null) {
            System.out.println("Eingabe abgebrochen.");
            return;
        }
        alterString = alterString.trim();
        try {
            int alter = Integer.parseInt(alterString);
            // TODO 3: Bedingung -> ab 18 'volljaehrig', sonst 'minderjaehrig'
            if (alter >= 18) {
                System.out.println("volljaehrig");
            } else {
                System.out.println("minderjaehrig");
            }
        } catch (NumberFormatException e) {
            System.out.println("Bitte eine gültige Zahl eingeben.");
        }
    }
}