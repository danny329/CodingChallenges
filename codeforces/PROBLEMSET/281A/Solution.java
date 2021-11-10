
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cap_string = br.readLine();
        System.out.println(cap_string.substring(0,1).toUpperCase()+cap_string.substring(1));
    }
}