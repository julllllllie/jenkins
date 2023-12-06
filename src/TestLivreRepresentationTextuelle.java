import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
// on teste la methode versChaine, qui retourne les caractéristiques d'un livre
public class TestLivreRepresentationTextuelle {
    @Test
    public void should_return_representation_textuelle(){
        Livre roman = new Livre(200, "littérature étrangère", 4);
        MatcherAssert.assertThat(roman.versChaine(), is("poids: " + 200 + "- ep: "+ 4+"(littérature étrangère)"));
    }
}
