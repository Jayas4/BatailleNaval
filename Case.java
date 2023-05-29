import javax.swing.JButton;

public class Case extends JButton {
    private boolean isBateau;
    private boolean isTouche;

    public Case() {
        isBateau = false;
        isTouche = false;
    }

    public boolean estBateau() {
        return isBateau;
    }

    public void setBateau(boolean bateau) {
        isBateau = bateau;
    }

    public boolean estTouche() {
        return isTouche;
    }

    public void setTouche(boolean touche) {
        isTouche = touche;
    }
}
