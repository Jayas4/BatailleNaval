import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bataille Navale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création de l'objet Grille
        Grille grille = new Grille();

        // Ajout de la grille à la fenêtre
        frame.add(grille);

        // Réglages de la fenêtre
        frame.pack();
        frame.setVisible(true);
    }
}
