package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom,int pvs, int attaqueMax, int defense, int ini) {
        this.nom=nom;
        this.pointsDeVie=pvs;
        this.valeurMaxAttaque=attaqueMax;
        this.valeurDefense=defense;
        this.initiative=ini;
    }

    public Personnage() {
        this.nom="NAME";
        this.pointsDeVie=0;
        this.valeurMaxAttaque=0;
        this.valeurDefense=0;
        this.initiative=0;
    }
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    
    public String getNom() {
        return nom;
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }
    public int getInitiative() {
        return initiative;
    }
    // TODO : Les setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println(this.nom);
        System.out.println("Attaque : "+ this.valeurMaxAttaque);
        System.out.println("Défense : "+ this.valeurDefense);
        System.out.println("Points de vie : "+ this.pointsDeVie);
        System.out.println("Initiative : "+ this.initiative);
        System.out.println("Statut : ");
    }

    private int attaqueCalcul() {
        int max = this.valeurMaxAttaque;
        int alea = ( int )(Math.random()*(max-0+ 1 )+0);
        
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return alea;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int forceDeFrappe;
        int dommages;
        forceDeFrappe = attaqueCalcul();
        valeurDefense = personnageCible.valeurDefense;
        dommages = forceDeFrappe - valeurDefense;
        if(dommages < 0){
            dommages = 0;
        }
        System.out.println(this.nom+" attaque avec une puissance de : "+forceDeFrappe);
        System.out.println(personnageCible.nom+" à une défense de : "+valeurDefense);
        System.out.println("Les dommages sont de : "+dommages);
        System.out.println("");
        
        
        
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
    
}
