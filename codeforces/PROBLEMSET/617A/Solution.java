
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n%5 == 0){
            System.out.println((int)Math.floor(n/5));
        }
        else{
            System.out.println((int)Math.floor(n/5) + 1);
        }
    }
}