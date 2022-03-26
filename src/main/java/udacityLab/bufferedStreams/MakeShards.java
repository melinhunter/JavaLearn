package udacityLab.bufferedStreams;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public final class MakeShards {
    private static final int SHARD_SIZE = 100;

    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.out.println("Usage: MakeShards [input file] [output folder]");
//            return;
//        }
        String f = null;
        String d = null;
        if(args.length == 2) {
            d = args[1];
            f = args[0];
        }
        f = "unsorted.txt";
        d = "dd/";

        Path input = Path.of(f);
        Path outputFolder = Files.createDirectory(Path.of(d));

        // TODO: Read the unsorted words from the "input" Path, line by line. Write the input words to
        //       many shard files. Each shard file should contain at most SHARD_SIZE words, in sorted
        //       order. All the words should be accounted for in the output shard files; you should not
        //       skip any words. Write the shard files in the newly created "outputFolder", using the
        //       getOutputFileName(int) method to name the individual shard files.
        BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);

        System.out.println("END");
    }

    private static String getOutputFileName(int shardNum) {
        return String.format("shard%02d.txt", shardNum);
    }
}

