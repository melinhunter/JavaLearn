package udacityLab.objectSerialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public final class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: Main [file path]");
            return;
        }

        UdacisearchClient client =
                new UdacisearchClient(
                        "CatFacts LLC",
                        17,
                        8000,
                        5,
                        Instant.now(),
                        Duration.ofDays(180),
                        ZoneId.of("America/Los_Angeles"),
                        "555 Meowmers Ln, Riverside, CA 92501");

        Path outputPath = Path.of(args[0]);


        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(outputPath))){
            UdacisearchClient deserialized = client;
            oos.writeObject(client);
        }
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(outputPath))) {
            UdacisearchClient deserialized = (UdacisearchClient) in.readObject();
            System.out.println("Deserialized " + deserialized);
        }
    }
}
