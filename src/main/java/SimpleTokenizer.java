import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

/**
 * Created by dl on 05.06.2016.
 */
public class SimpleTokenizer implements FlatMapFunction<String, Tuple2<String, Integer>> {

    @Override
    public void flatMap(String value, Collector<Tuple2<String, Integer>> out) {

        String[] splittedLine = value.toLowerCase().split("\\W+");

        for (String token : splittedLine) {

            boolean isNotEmpty = token.length() > 0;

            if (isNotEmpty) {
                out.collect(new Tuple2<>(token, 1));
            }
        }
    }

}