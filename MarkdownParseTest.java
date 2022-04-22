import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        expectedResults.add("https://something.com");
        expectedResults.add("some-thing.html");
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }
}