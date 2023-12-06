import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
// on teste si la pile est vide ou non selon la methode estVide
public class TestPileLivresVide {
    @Test
    public void should_return_true_when_pile_livre_est_vide(){
        PileLivres pileLivres = new PileLivres(0,0, new ArrayList<>());
        MatcherAssert.assertThat(pileLivres.estVide(), is(true));
    }

    @Test
    public void should_return_false_when_pile_livre_est_pas_vide(){
        PileLivres pileLivres = new PileLivres(10,60, new ArrayList<>());
        MatcherAssert.assertThat(pileLivres.estVide(), is(false));
    }
}
