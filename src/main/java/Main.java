import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ilyes on 2/23/2017.
 */
public class Main {
    private final static String FILE_NAME = "D:\\untitled\\me_at_the_zoo.in";

    /**
     * Read file (not so elegant... but works)
     *
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
                entireFile += sCurrentLine;
            }
        } catch (IOException e) {

        }
        return entireFile;
    }

    /**
     * Reads integers from file (yet again not elegant... but number of fucks given.equals(new Integer(0))
     *
     * @param fileName the name of the file
     * @return the list of integers from the file
     * @throws IOException because why dafuq not
     */
    private static List<Integer> readParams(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        Scanner scanner = new Scanner(filePath);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
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

    private int getTotalLatency(List<Endpoint> endPoints, List<RequestDescription> reqDescriptions) {
        int totalL = 0;
        for (RequestDescription r : reqDescriptions) {
            totalL += endPoints.get(r.getEndPointId()).getLatency() * r.getNoOfReq();
        }
        return totalL;
    }

    private void distributeCache(List<Video> listOfVideos, List<Endpoint> endP) {

    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        try {
            numbers = readParams(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer videos = numbers.get(0);
        Integer endPoints = numbers.get(1);
        Integer requests = numbers.get(2);
        Integer caches = numbers.get(3);
        Integer cacheSize = numbers.get(4);
        List<Video> listOfVideos = new ArrayList<>(videos);
        List<Endpoint> endP = new ArrayList<>(endPoints);
        for (int i = 0; i < videos; i++) {
            Video v = new Video(i, numbers.get(5 + i));
            listOfVideos.add(v);
        }
        Iterator<Integer> it = numbers.iterator();
        for (int i = 0; i < 5 + videos; i++) {
            if (it.hasNext()) {
                Integer iasfd = it.next();
                it.remove();
            }
        }


        int num = 0;
        for (int i = 0; i < endPoints; i++) {
            int latency = numbers.get(num);
            num++;
            int connectedCaches = numbers.get(num);
            num++;
            Endpoint end = new Endpoint(i, latency, connectedCaches, null);
            List<CacheServer> cacheS = new ArrayList<>();
            for (int j = 0; j < connectedCaches; j++) {
                CacheServer cs = new CacheServer(numbers.get(num), numbers.get(num + 1));
                cacheS.add(cs);
                num += 2;
            }
            end.setCaches(cacheS);
            endP.add(end);
        }
        it = numbers.iterator();
        for (int i = 0; i < num; i++) {
            if (it.hasNext()) {
                Integer iasfd = it.next();
                it.remove();
            }
        }

        num = 0;
        for (int i = 0; i < requests; i++) {
            
        }

    }


}
