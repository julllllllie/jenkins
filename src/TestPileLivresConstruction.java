import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
//on teste si la pile renvoie bien les attributs noté dans le nouvel objet
public class TestPileLivresConstruction {
    @Test
    public void should_return_attributs_pile_livres(){
        PileLivres pile = new PileLivres(15, 80, new ArrayList<>());
        MatcherAssert.assertThat(pile.getTaille(), is(80));
        MatcherAssert.assertThat(pile.getCapacite(), is(15));
    }
}
