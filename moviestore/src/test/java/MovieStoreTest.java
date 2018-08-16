import model.Movie;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieStoreTest {

    public void returnsNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception {
        MovieStore movieStore = new MovieStore();

        List<Movie> results = movieStore.findByPartialTitle("abc");

        assertThat(results.size(), is(0));

    }

}