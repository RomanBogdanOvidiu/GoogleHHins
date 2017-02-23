import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ilyes on 2/23/2017.
 */
public class Main {
    private final static String FILE_NAME = "D:\\Google\\small.in";
    /**
     * Read file (not so elegant... but works)
     * @param fileName the name of the input file
     * @return a String with the contents of the file
     */
    private static String readFile1(String fileName) {
        BufferedReader br;
        String entireFile = new String();
        try {

            br = new BufferedReader(new FileReader(fileName));
            String sCurrentLine = new String();
            while ((sCurrentLine = br.readLine()) != null) {
                entireFile+=sCurrentLine;
            }
        } catch (IOException e) {

        }
        return entireFile;
    }

    /**
     * Reads integers from file (yet again not elegant... but number of fucks given.equals(new Integer(0))
     * @param fileName the name of the file
     * @return the list of integers from the file
     * @throws IOException because why dafuq not
     */
    private static List<Integer> readParams(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        Scanner scanner = new Scanner(filePath);
        List<Integer> integers = new ArrayList<>();
        while(scanner.hasNext()){
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        return integers;
    }

    public static void writeToFile(String content) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {



            fw = new FileWriter(FILE_NAME);
            bw = new BufferedWriter(fw);
            bw.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
}
