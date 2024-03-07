
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testAToMorse() {
        Logic converter = new Logic();
        String expected = "*-";
        String testdata = "A";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToA() {
        Logic converter = new Logic();
        String expected = "A";
        String testdata = "*-";
        String actual = converter.getLetter(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testSmallAToMorse() {
        Logic converter = new Logic();
        String expected = "*-";
        String testdata = "a";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyMorse() {
        Logic converter = new Logic();
        String expected = "Wrong input, please try again!";
        String testdata = "";
        String actual = converter.getLetter(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyLetter() {
        Logic converter = new Logic();
        String expected = "Wrong input, please try again!";
        String testdata = "";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidSymbol() {
        Logic converter = new Logic();
        String expected = "Wrong input, please try again!";
        String testdata = "&";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void test0ToMorse() {
        Logic converter = new Logic();
        String expected = "-----";
        String testdata = "0";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseTo9() {
        Logic converter = new Logic();
        String expected = "9";
        String testdata = "----*";
        String actual = converter.getLetter(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testQuestionMarkToMorse() {
        Logic converter = new Logic();
        String expected = "**--**";
        String testdata = "?";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToDot() {
        Logic converter = new Logic();
        String expected = ".";
        String testdata = "*-*-*-";
        String actual = converter.getLetter(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidMorse() {
        Logic converter = new Logic();
        String expected = "Wrong input, please try again!";
        String testdata = "--..--"; //punkter istället för stjärnor
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testÖToMorse() {
        Logic converter = new Logic();
        String expected = "Wrong input, please try again!";
        String testdata = "Ö";
        String actual = converter.getMorse(testdata);
        assertEquals(expected, actual);
    }

}
