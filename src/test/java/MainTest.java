import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void givenFilePath_whenUsingFilesLines_thenFileData() throws URISyntaxException, IOException {
        String file ="src/test/resources/Feladat_fejlesztőknek_1_jutalékadatok.txt";
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
