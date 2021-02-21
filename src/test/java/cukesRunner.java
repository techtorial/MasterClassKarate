import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(
        features = {"/Users/techtorial/Downloads/TechtorialKarate/src/test/resources/SingleUserPost.feature"}
)
public class cukesRunner {
}
