import java.util.ArrayList;

public class Range {
//    private String[] cAlphabetList = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//    private String[] lAlphabetList = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//    ArrayList<String> alphaRanges;
//    public Range(String start, String end){
//        ArrayList<String> alphaRanges = new ArrayList<String>();
//        alphaRanges.add(start);
//        alphaRanges.add(end);
//    }
//
    private char a; // make sure a < b
    private char b; // this time we have a constructor

    public Range (char a, char b) { // we could throw exception here if a > b
        this.a = a; // remember the first character
        this.b = b; // remember the second
    }

    public char getChar() { // pull a random character from the contiguous range
        return (char) (Math.random() * (this.b - this.a + 1) + this.a); // random ASCII code in range
    }
}
