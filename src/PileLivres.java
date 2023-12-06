import java.util.ArrayList;
//constructeur de la classe PileLivre
public class PileLivres{
    protected static int capacite;
    protected int taille;
    protected static ArrayList<Livre> livres;

    public PileLivres(int capacite, int taille, ArrayList<Livre> livres){
        this.capacite = capacite;
        this.taille = taille;
        this.livres = livres;
    }
// on recupère la taille et le poids (capacité)
    public int getTaille() {
        return taille;
    }

    public int getCapacite() {
        return capacite;
    }
//si le poids vide alors estVide retourne
    public static boolean estVide(){
        return capacite == 0;
    }

//on ajoute un livre à la liste correspondant à la pile de livre
    public static int empile(Livre livre){
        livres.add(livre);
        return capacite = capacite + livre.getPoids();
    }
// pour avoir le sommet de la pile, on retourne dans le sommet de la pile representé par le dernier livre, en utilisant la taille de la liste, l'index size -1,
// si vide alors erreur
    public static Livre getSommet(){
        if(estVide()) throw new Error("La pile est vide");
        return livres.get(livres.size()-1);
    }
//on verifie que la pile est vide, avec la capacité, on retire son poids donc livre de cette pile
// on stock ce dernier livre dans une variable qu'on retire ensuite de la liste puis on retourne l'élément
    public Livre depile(){
        if(estVide()){
            throw new Error("La pile est vide");
        }else{
            capacite = capacite - PileLivres.getSommet().getPoids();
            Livre livreDepile = PileLivres.getSommet();
            livres.remove(livreDepile);
            return livreDepile;
        }
    }
}
