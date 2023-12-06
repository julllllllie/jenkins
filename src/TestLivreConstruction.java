import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
//on test si les attributs sont bien return avec un objet livre
public class TestLivreConstruction {

    @Test
    public void should_return_attributs_livre(){
        Livre roman = new Livre(200, "littérature étrangère", 4);
        MatcherAssert.assertThat(roman.getPoids(), is(200));
        MatcherAssert.assertThat(roman.getSection(), is("littérature étrangère"));
        MatcherAssert.assertThat(roman.getEpaisseur(), is(4));
    }
}
