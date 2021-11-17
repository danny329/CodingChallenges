
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        int uppercount = 0;
        int lowercount = 0;
        char[] inp =  inputs.toCharArray();
        for (char e: inp ) {
            if((e >= 'a') && (e <= 'z'))
                lowercount++;
            else
                uppercount++;
        }
        if (lowercount >= uppercount){
            System.out.println(inputs.toLowerCase());
        }
        else {
            System.out.println(inputs.toUpperCase());
        }
    }
}