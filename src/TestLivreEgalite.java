import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
// on teste si les livres sont egaux en comparant leurs 3 caractéristiques
public class TestLivreEgalite {
    @Test
    public void should_return_true_when_livres_are_egaux(){
        Livre roman = new Livre(200, "littérature étrangère", 4);
        Livre roman2 = new Livre(200, "littérature étrangère", 4);
        MatcherAssert.assertThat(roman2.estEgal(roman), is(true));
    }

    @Test
    public void should_return_false_when_livres_are_not_egaux(){
        Livre roman = new Livre(200, "littérature étrangère", 4);
        Livre bd = new Livre(200, "bande dessinée", 3);
        MatcherAssert.assertThat(roman.estEgal(bd), is(false));
    }
}
