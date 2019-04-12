import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] s1 = reader.readLine().split(" ");
            double a = Double.parseDouble(s1[0]);
            double b = Double.parseDouble(s1[1]);
            double c = Double.parseDouble(s1[2]);
            s1 = reader.readLine().split(" ");
            double d = Double.parseDouble(s1[0]);
            double e = Double.parseDouble(s1[1]);
            double f = Double.parseDouble(s1[2]);
            double y = (f - c * d / a) / (e - b * d / a);
            double x = (c - b * y) / a;
            System.out.println(x + " " + y);
        } catch (IOException e) {
            System.out.println("Incorrect arguments");
        }
    }
}
