import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N%2 == 0)
        {
            if((N/2) >= 2)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}