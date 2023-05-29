import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.GridLayout;

public class Grille extends JPanel {
    private Case[][] cases;

    public Grille() {
        setLayout(new GridLayout(10, 11)); // Grille de 10x10 avec une colonne vide

        // Initialisation de la grille
        cases = new Case[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cases[i][j] = new Case();
                add(cases[i][j]);
            }
        }

        // Ajout de la ligne blanche à droite
        for (int i = 0; i < 10; i++) {
            JPanel emptyPanel = new JPanel();
            emptyPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            add(emptyPanel);
        }

        // Placement aléatoire des navires
        placerNavires();
    }

    private void placerNavires() {
        // Placement du porte-avion (5 cases)
        placerNavire(5);

        // Placement du croiseur (4 cases)
        placerNavire(4);

        // Placement du contre-torpilleur (3 cases)
        placerNavire(3);

        // Placement du sous-marin (3 cases)
        placerNavire(3);

        // Placement du torpilleur (2 cases)
        placerNavire(2);
    }

    private void placerNavire(int taille) {
        int x = (int) (Math.random() * 10); // Coordonnée x aléatoire
        int y = (int) (Math.random() * (10 - taille + 1)); // Coordonnée y aléatoire

        // Vérification si les cases sont disponibles
        boolean disponible = true;
        for (int i = 0; i < taille; i++) {
            if (cases[x][y + i].estBateau()) {
                disponible = false;
                break;
            }
        }

        // Placement du navire si les cases sont disponibles
        if (disponible) {
            for (int i = 0; i < taille; i++) {
                cases[x][y + i].setBateau(true);
                cases[x][y + i].setBackground(Color.DARK_GRAY);
            }
        } else {
            placerNavire(taille); // Replacer le navire si les cases ne sont pas disponibles
        }
    }
}
