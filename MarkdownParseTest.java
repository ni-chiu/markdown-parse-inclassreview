import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    
    @Test
    public void test1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        expectedResults.add("https://something.com");
        expectedResults.add("some-thing.html");
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void myTest2() throws IOException {
        Path fileName = Path.of("testfile2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        expectedResults.add("https://google.com/");
        expectedResults.add("https://en.wikipedia.org/");
        expectedResults.add("mailto:rmasserf@ucsd.edu");
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void myTest3() throws IOException {
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        expectedResults.add("https://google.com/");
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        expectedResults.add("https://something.com");
        expectedResults.add("some-page.html");
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test6() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test7() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }

    @Test
    public void test8() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedResults = new ArrayList<String>();
        expectedResults.add("a link on the first line");
        assertEquals(expectedResults, MarkdownParse.getLinks(content));
    }
}