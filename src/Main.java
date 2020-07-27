import java.util.Arrays;

/**
 * Created by KPS on 7/27/2020.
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = new String[10];
        for (int  i = 0 ; i < 10 ; i++){
            strings[i] = String.valueOf(i);
        }
        System.out.println(Arrays.toString(strings));
    }
}
