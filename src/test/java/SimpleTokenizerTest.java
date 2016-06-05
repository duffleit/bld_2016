import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.aggregation.Aggregations;
import org.apache.flink.api.java.tuple.Tuple2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by dl on 05.06.2016.
 */
public class SimpleTokenizerTest {

    private ExecutionEnvironment environment;

    @Before
    public void setUpEnvironment() throws Exception {
        environment = ExecutionEnvironment.getExecutionEnvironment();
    }

    @Test
    public void tokenizeHelloWorld() throws Exception {

        final DataSet<String> helloWorldString = environment
                .fromElements("Hello Hello World!");

        List<Tuple2<String, Integer>> wordCounts = helloWorldString
                .flatMap(new SimpleTokenizer())
                .groupBy(0)
                .aggregate(Aggregations.SUM, 1)
                .collect();


        int wordCount = wordCounts.size();
        int uniqueWordsInString = 2;

        Assert.assertTrue(wordCount == uniqueWordsInString);
    }

    @Test
    public void tokenizeLoremIpsum() throws Exception {

        final DataSet<String> helloWorldString = environment
                .fromElements("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");

        List<Tuple2<String, Integer>> wordCounts = helloWorldString
                .flatMap(new SimpleTokenizer())
                .groupBy(0)
                .aggregate(Aggregations.SUM, 1)
                .collect();


        int wordCount = wordCounts.size();
        int uniqueWordsInString = 40;

        Assert.assertTrue(wordCount == uniqueWordsInString);
    }
}

