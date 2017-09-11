import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rainfall {

    public static double mean(String town, String strng) {
        String rainDataStr = getRainDataForTown(town, strng);
        ArrayList<Float> rainData = Rainfall.getRainData(rainDataStr);

        if (rainData.isEmpty())
            return -1;

        return  rainData.stream().reduce(0f, (x,y) -> x+y) / rainData.size();
    }

    public static double variance(String town, String strng) {
        String rainDataStr = getRainDataForTown(town, strng);
        ArrayList<Float> rainData = Rainfall.getRainData(rainDataStr);

        if (rainData.isEmpty())
            return -1;

        float mean = rainData.stream().reduce(0f, (x,y) -> x+y) / rainData.size();
        return rainData.stream().map(i -> (i-mean) * (i-mean))
                .reduce(0f, (x,y) -> x + y)
                / rainData.size();
    }

    public static String getRainDataForTown(String town, String strng) {
        Pattern pattern = Pattern.compile(town + ":" + ".*");
        Matcher matcher = pattern.matcher(strng);
        if (matcher.find())
            return matcher.group();

        return null;
    }

    public static ArrayList<Float> getRainData(String str){
        ArrayList<Float> rainData = new ArrayList<>();

        if (str != null) {
            Pattern pattern = Pattern.compile("[(\\d)(\\d.\\d)]+");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                rainData.add(Float.parseFloat(matcher.group()));
            }
        }
        return rainData;
    }
}