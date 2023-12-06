import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
// si pile vide alors erreur
public class TestPileLivresDepile {
    @Test
    public void should_return_error_when_pilelivre_is_vide(){
        PileLivres pile = new PileLivres(0, 80, new ArrayList<>());
        Throwable exception = assertThrows(Error.class, pile::depile);
        assertEquals("La pile est vide", exception.getMessage());
    }
// on teste si l'élément est bien retiré de la pile, de la liste Livre
// on verifie que l'element est correct avec MatcherAssert.assertThat
    @Test
    public void should_return_livre_depile(){
        ArrayList<Livre> livres = new ArrayList<Livre>();
        Livre roman = new Livre(200, "litérature étrangère", 4);
        Livre bd = new Livre(80, "bande dessinée", 2);
        Livre manga = new Livre(100, "mangas", 3);
        livres.add(roman);
        livres.add(bd);
        livres.add(manga);
        PileLivres pile = new PileLivres(15, 80, livres);
        MatcherAssert.assertThat(pile.depile(), is(manga));
    }
// on verfie que la capacité de la pile est bien modifié apres avoir enlevé un livre de la pileLivre
    @Test
    public void should_update_capacite_when_livre_is_depile(){
        ArrayList<Livre> livres = new ArrayList<Livre>();
        Livre roman = new Livre(200, "litérature étrangère", 4);
        Livre bd = new Livre(80, "bande dessinée", 2);
        Livre manga = new Livre(100, "mangas", 3);
        livres.add(roman);
        livres.add(bd);
        livres.add(manga);
        PileLivres pile = new PileLivres(15, 80, livres);
        pile.depile();
        MatcherAssert.assertThat(pile.getCapacite(), is(manga));
    }
}
