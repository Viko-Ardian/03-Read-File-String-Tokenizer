import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String data = bufferedReader.readLine();
        int number = 0;

        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("| no\t| name\t\t\t| Profesion\t\t| Language");
        System.out.println("-----------------------------------------------------------------------");
        while (data != null) {
            number++;
            StringTokenizer stringTokenizer =new StringTokenizer(data, ",");
            System.out.printf("|%2d",number);
            System.out.printf("\t| %-20s", stringTokenizer.nextToken());
            System.out.printf("\t| %-20s", stringTokenizer.nextToken());
            System.out.printf("\t| %s", stringTokenizer.nextToken());
            System.out.println();

            data = bufferedReader.readLine();
        }
        System.out.println("-----------------------------------------------------------------------\n");
    }
}
