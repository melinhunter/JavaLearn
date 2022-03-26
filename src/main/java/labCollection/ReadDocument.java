package labCollection;

import java.io.FileInputStream;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class ReadDocument {

    public static void main(String[] args) throws Exception {
        ReadDocument r = new ReadDocument();
        Runtime.getRuntime();
        String fileName = "P:\\My Documents\\小說\\《吞噬星空》（校对版全本）作者：我吃西红柿.txt";
        int lineNumber = 40000;
        long t0 = System.currentTimeMillis();
        long t2 = System.nanoTime();
        Collection<String> strings = new LinkedList<>();
        //Collection<String> strings = new ArrayList<>();

        strings = r.findDocument(fileName, lineNumber, strings);
        output(strings);
        long t1 = System.currentTimeMillis();
        long t3 = System.nanoTime();
        System.out.println(t1-t0);
        long used = t3-t2;
        System.out.println("used:"+ TimeUnit.NANOSECONDS.toMillis(used)+" ms");
        viewMemory();

    }
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public static void viewMemory(){
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory));
    }

    public static void output(Collection<String> strings){
        int line =1;
        for(String str : strings){
            System.out.print(line++);
            System.out.println(str);
        }
    }

    public Collection<String> findDocument(String filePath, int lineLim, Collection<String> t) throws Exception {
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(filePath);
            sc = new Scanner(inputStream, "GB2312");
            int lineNum = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                t.add(line);
                // System.out.println(line);
                lineNum ++;
                if(lineNum >= lineLim) break;
            }
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
        return t;
    }
}
