
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        for(int i=k; i>0;i--){
            if(n%10 == 0){
                n = (int) n/10;
            }
            else{
                n -= 1;
            }
        }
        System.out.println(n);
    }
}