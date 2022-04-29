import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test_File() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        String[] links = {"https://something.com", "some-thing.html"};
        assertEquals(links[0], fileLinks.get(0));
        assertEquals(links[1], fileLinks.get(1));
    }

    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/testfile2.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        String[] links = {"https://google.com/", "https://en.wikipedia.org/", "mailto:rmasserf@ucsd.edu"};
        assertEquals(links[0], fileLinks.get(0));
        assertEquals(links[1], fileLinks.get(1));
        assertEquals(links[2], fileLinks.get(2));
    }

    @Test
    public void test3() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals("https://google.com/", fileLinks.get(0));
    }

    @Test
    public void test_File2() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        String[] links = {"https://something.com", "some-page.html"};
        assertEquals(links[0], fileLinks.get(0));
        assertEquals(links[1], fileLinks.get(1));
    }

    @Test
    public void test_File3() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals(0, fileLinks.size());
    }

    @Test
    public void test_File4() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals(0, fileLinks.size());
    }

    @Test  
    public void test_File5() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals(0, fileLinks.size());
    }

    @Test  
    public void test_File6() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals(0, fileLinks.size());
    }

    @Test    //Does not evaluate, meaning does not work
    public void test_File7() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals(0, fileLinks.size());
    }

    @Test   
    public void test_File8() throws IOException {
        Path fileName = Path.of("/Users/pranavnair/Desktop/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> fileLinks = MarkdownParse.getLinks(content);
        assertEquals(1, fileLinks.size());
    }
}