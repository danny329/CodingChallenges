
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String  s = br.readLine();
        char c = s.charAt(0);
        int remove_count = 0;
        for(int i=1; i< n; i++){
            if (c == s.charAt(i)){
                remove_count++;
            }
            else{
                c=s.charAt(i);
            }
        }
        System.out.println(remove_count);
    }
}