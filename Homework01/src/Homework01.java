import java.math.BigInteger;
import java.util.*;

public class Homework01 {
    public static void main(String[] args){
        BigInteger A = new BigInteger("1");
        BigInteger B = new BigInteger("0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        BigInteger n = new BigInteger(sc.nextLine());
        System.out.println(fun(n, A, B));
    }
    public static BigInteger fun(BigInteger num, BigInteger a, BigInteger b ){
        if (num.equals(b)) return a;
        else if (num.equals(a)) return a;
        return funHelper(a, num, a, a);
    }
    public static BigInteger funHelper(BigInteger location, BigInteger target, BigInteger a, BigInteger b){
        if (location.equals(target)) return b;
        else{
            return funHelper(location.add(new BigInteger("1")), target,b, a.add(b) );
        }
    }
}