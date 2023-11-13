import java.util.ArrayList;

public class RandomStringGenerator {
    private ArrayList<Range> randList = new ArrayList<Range>();

    public void addRange(char first, char last){
        this.randList.add(new Range(first, last));
    }
    public String nextString(int length){
        String output = "";
        int index;
        for (int i = 0; i < length; i++) {
            index = ((int) (Math.random() * this.randList.size()));
            output = output + this.randList.get(index).getChar();
        }
        return output;
    }
    public static void main(String[] args) {
        int howeverMany = 10;
        if (args.length == 1)
            howeverMany = Integer.parseInt(args[0]);
        RandomStringGenerator obj = new RandomStringGenerator();
        obj.addRange('a', 'f');
        System.out.println(obj.nextString(howeverMany));
        obj.addRange('M', 'W');
        System.out.println(obj.nextString(howeverMany));
        obj.addRange('0', '9');
        System.out.println(obj.nextString(howeverMany));
    }
}
