import model.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class MovieStoreTest {

    private final Movie harryPotter = new Movie("Harry Potter");
    private final Movie starWars = new Movie("Star Wars");
    private final Movie starTrek = new Movie("STAR Trek");
    private final MovieStore movieStore = new MovieStore();

    @Before
    public void setUp() throws Exception {

        movieStore.add(new Movie("Shawshank Redemption"));
        movieStore.add(harryPotter);
        movieStore.add(starWars);
        movieStore.add(starTrek);

    }

    @Test
    public void returnsNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception {

        List<Movie> results = movieStore.findByPartialTitle("abc");

        assertThat(results.size(), is(0));

    }

    @Test
    public void findMoviesWhenTitlesArePartiallyMatched() throws Exception {



        List<Movie> results = movieStore.findByPartialTitle("tar");

        assertThat(results.size(), is(2));
        assertThat(results, containsInAnyOrder(starTrek, starWars));

    }




}