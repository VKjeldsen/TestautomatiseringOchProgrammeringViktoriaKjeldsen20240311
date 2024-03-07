import java.util.HashMap;

public class Logic {

    //Attribut
    private HashMap<String, String> letterToMorse;
    private HashMap<String, String> morseToLetter;

    //Konstruktor
    public Logic() {
        letterToMorse = new HashMap<>();
        letterToMorse.put("A", "*-");
        letterToMorse.put("B", "-***");
        letterToMorse.put("C", "-*-*");
        letterToMorse.put("D", "-**");
        letterToMorse.put("E", "*");
        letterToMorse.put("F", "**-*");
        letterToMorse.put("G", "--*");
        letterToMorse.put("H", "****");
        letterToMorse.put("I", "**");
        letterToMorse.put("J", "*---");
        letterToMorse.put("K", "-*-");
        letterToMorse.put("L", "*-**");
        letterToMorse.put("M", "--");
        letterToMorse.put("N", "-*");
        letterToMorse.put("O", "---");
        letterToMorse.put("P", "*--*");
        letterToMorse.put("Q", "--*-");
        letterToMorse.put("R", "*-*");
        letterToMorse.put("S", "***");
        letterToMorse.put("T", "-");
        letterToMorse.put("U", "**-");
        letterToMorse.put("V", "***-");
        letterToMorse.put("W", "*--");
        letterToMorse.put("X", "-**-");
        letterToMorse.put("Y", "-*--");
        letterToMorse.put("Z", "--**");
        letterToMorse.put("0", "-----");
        letterToMorse.put("1", "*----");
        letterToMorse.put("2", "**---");
        letterToMorse.put("3", "***--");
        letterToMorse.put("4", "****-");
        letterToMorse.put("5", "*****");
        letterToMorse.put("6", "-****");
        letterToMorse.put("7", "--***");
        letterToMorse.put("8", "---**");
        letterToMorse.put("9", "----*");
        letterToMorse.put(".", "*-*-*-");
        letterToMorse.put(",", "--**--");
        letterToMorse.put("?", "**--**");

        morseToLetter = new HashMap<>();
        morseToLetter.put("*-", "A");
        morseToLetter.put("-***", "B");
        morseToLetter.put("-*-*", "C");
        morseToLetter.put("-**", "D");
        morseToLetter.put("*", "E");
        morseToLetter.put("**-*", "F");
        morseToLetter.put("--*", "G");
        morseToLetter.put("****", "H");
        morseToLetter.put("**", "I");
        morseToLetter.put("*---", "J");
        morseToLetter.put("-*-", "K");
        morseToLetter.put("*-**", "L");
        morseToLetter.put("--", "M");
        morseToLetter.put("-*", "N");
        morseToLetter.put("---", "O");
        morseToLetter.put("*--*", "P");
        morseToLetter.put("--*-", "Q");
        morseToLetter.put("*-*", "R");
        morseToLetter.put("***", "S");
        morseToLetter.put("-", "T");
        morseToLetter.put("**-", "U");
        morseToLetter.put("***-", "V");
        morseToLetter.put("*--", "W");
        morseToLetter.put("-**-", "X");
        morseToLetter.put("-*--", "Y");
        morseToLetter.put("--**", "Z");
        morseToLetter.put("-----", "0");
        morseToLetter.put("*----", "1");
        morseToLetter.put("**---", "2");
        morseToLetter.put("***--", "3");
        morseToLetter.put("****-", "4");
        morseToLetter.put("*****", "5");
        morseToLetter.put("-****", "6");
        morseToLetter.put("--***", "7");
        morseToLetter.put("---**", "8");
        morseToLetter.put("----*", "9");
        morseToLetter.put("*-*-*-", ".");
        morseToLetter.put("--**--", ",");
        morseToLetter.put("**--**", "?");
    }

    public String getLetter(String morse) {
        //getOrDefault: Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
            //Istället för en if-sats här
        return morseToLetter.getOrDefault(morse, "Wrong input, please try again!");
    }

    public String getMorse(String letter) {
        //getOrDefault: Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
            //Istället för en if-sats här
        return letterToMorse.getOrDefault(letter.toUpperCase(), "Wrong input, please try again!");
    }

}
