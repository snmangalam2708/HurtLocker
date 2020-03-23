import org.apache.commons.io.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

//    public String readRawDataToString() throws Exception{
//        ClassLoader classLoader = getClass().getClassLoader();
//        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
//        return result;
//        }

    public static String formatedFile() {

        File file = new File("/Users/snaraya/projects/HurtLocker/src/main/resources/RawData.txt");
        StringBuilder data = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    public static void main(String[] args) {

//        String output = (new Main()).readRawDataToString();
//        System.out.println(output);

        OutputResults printer = new OutputResults();
        printer.printAllItems();

    }
}
