import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
// on teste le poids +1 livre avec la methode empile quand un objet Livre est ajoyter à la pileLivres
public class TestPileLivresEmpileSommet {
    @Test
    public void should_return_new_poids_when_empile_livre(){
        PileLivres pile = new PileLivres(15, 80, new ArrayList<>());
        Livre roman = new Livre(200, "littérature étrangère", 4);
        MatcherAssert.assertThat(pile.empile(roman), is(215));
    }
// on teste lorsqu'un livre est ajouté à la pileLivre,
// qu'il soit ajouté à la liste livres puis on verifie que le dernier élément ajouté est bien le nouvel object ici manga
    @Test
    public void should_add_livre_a_pile_when_empile_livre(){
        ArrayList<Livre> livres = new ArrayList<Livre>();
        Livre roman = new Livre(200, "litérature étrangère", 4);
        Livre bd = new Livre(80, "bande dessinée", 2);
        Livre manga = new Livre(100, "mangas", 3);
        livres.add(roman);
        livres.add(bd);
        PileLivres pile = new PileLivres(15, 80, livres);
        pile.empile(manga);
        MatcherAssert.assertThat(livres.get(livres.size()-1), is(manga));
    }
//on verifie que le sommet est bien le dernier object ajouté à la liste Livres
    @Test
    public void should_return_sommet_pile_livre(){
        ArrayList<Livre> livres = new ArrayList<Livre>();
        Livre roman = new Livre(200, "litérature étrangère", 4);
        Livre bd = new Livre(80, "bande dessinée", 2);
        Livre manga = new Livre(100, "mangas", 3);
        livres.add(roman);
        livres.add(bd);
        livres.add(manga);
        PileLivres pile = new PileLivres(15, 80, livres);
        MatcherAssert.assertThat(pile.getSommet(), is(manga));

    }

    @Test
    public void should_return_error_when_pilelivre_is_vide(){
        PileLivres pile = new PileLivres(0, 80, new ArrayList<>());
        Throwable exception = assertThrows(Error.class, () -> pile.getSommet());
        assertEquals("La pile est vide", exception.getMessage());
    }
}
