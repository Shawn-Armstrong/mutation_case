package myjavaproject2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TotoTest {

    @Test
    public void testGetName() {
        Toto toto = new Toto();
        assertEquals("Toto", toto.getName(), "getName should return 'Toto'");
    }

    @Test
    public void testEnumToyLinks() {
        // Testing individual enum elements
        assertEquals("his_ball", Toto.TOYS.BALL.getLink(), "BALL should link to 'his_ball'");
        assertEquals("his_monkey", Toto.TOYS.MONKEY.getLink(), "MONKEY should link to 'his_monkey'");
    }

    @Test
    public void testEnumToysArray() {
        // Testing the array of links
        String[] expectedLinks = {"his_ball", "his_monkey"};
        assertArrayEquals(expectedLinks, Toto.TOYS.getLinks(), "getLinks should return all toy links");
    }

    @Test
    public void testGetLinksShouldNotReturnNull() {
        assertNotNull(Toto.TOYS.getLinks(), "getLinks should not return null");
    }

    @Test
    public void testGetLinksContents() {
        String[] links = Toto.TOYS.getLinks();
        assertNotNull(links, "getLinks should not return null");
        List<String> linksList = Arrays.asList(links);
        assertTrue(linksList.contains("his_ball"), "getLinks should contain 'his_ball'");
        assertTrue(linksList.contains("his_monkey"), "getLinks should contain 'his_monkey'");
    }

    @Test
    public void testGetLinksDoesNotThrowException() {
        assertDoesNotThrow(() -> Toto.TOYS.getLinks(), "getLinks should not throw an exception");
    }

    @Test
    public void testGetLinksArrayNotNullOrEmpty() {
        String[] links = Toto.TOYS.getLinks();
        assertNotNull(links, "getLinks array should not be null.");
        assertTrue(links.length > 0, "getLinks array should not be empty.");
        List<String> linksList = Arrays.asList(links);
        assertTrue(linksList.contains("his_ball"), "getLinks should contain 'his_ball'.");
        assertTrue(linksList.contains("his_monkey"), "getLinks should contain 'his_monkey'.");
    }

}
