public class assignment {
    public static int find_maximum(int[] A){
        int max = A[0];
        for (int x = 0; x<A.length; x++){
            if (max < A[x]){
                max = A[x];
            }
        }
        return max;
    }
    public static void reverse(char[] s, int begin, int end){
        if (begin == end){
            for (int x = 0; x<s.length; x++){
                System.out.println(s[x]);
            }
        }
        else{
            char temp = s[begin];
            s[begin] = s[end-1];
            s[end-1] = temp;
            reverse(s, begin+1, end-1);
        }
    }
    public static void main(String[] args){
        //System.out.println(find_maximum(new int[]{5, 8, 9, 10, 2, 5, 4, 9}));
        //reverse(new char[]{'a','b','c','d','e','f','g','h'}, 2, 6);

    }
}
