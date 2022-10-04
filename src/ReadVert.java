import java.util.*;

public class ReadVert {
    public static String readVertically(String[] arr) {
        // TODO:
        int maxLen = (int) Arrays.stream(arr).mapToInt(x -> x.length()).reduce(Integer::max).orElse(-1);
        int len = arr.length;
        String ans = "";


        for (int i = 0; i < maxLen; i++){
            for (int j = 0; j < len; j++){
                if ( i > arr[j].length()-1) continue;
                else ans += arr[j].charAt(i);


            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "worldawes",
        };
        int maxLen =(int) Arrays.stream(input).mapToInt(x -> x.length()).reduce(Integer::max).orElse(-1);
        System.out.println(maxLen);
        System.out.println(ReadVert.readVertically(input));
    }
}
