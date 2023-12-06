import java.util.Objects;
// constructeur de la classe Livre
public class Livre {
    protected int poids;
    protected int epaisseur;
    protected String section;

    public Livre(int poids, String section, int epaisseur){
        this.poids = poids;
        this.section = section;
        this.epaisseur = epaisseur;
    }

    public int getPoids() {
        return poids;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public String getSection() {
        return section;
    }

    public String versChaine(){
        return "poids: " + getPoids() + "- ep: "+ getEpaisseur() + "(" + getSection() + ")";
    }
   // public boolean estEgal(Livre livre){
      //  if(livre.section == )
       // return true;
   // }
    // estEgal en prenant l'objet livre, on retourne si le livre est different de null, si le poid et l'epaisseur sont identique
   public boolean estEgal(Livre livre) {
       return  (livre != null) &&
               (livre.getPoids() == this.poids) &&
               (livre.getEpaisseur() == this.epaisseur) &&
       (Objects.equals(livre.getSection(), this.section));
   }
}
