
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int input = br.read();
        while(input != -1){
            if( Arrays.asList('4', '7').contains((char)input) )
                count++;
            input = br.read();
        }
        
        if( Arrays.asList(4, 7).contains(count) )
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}