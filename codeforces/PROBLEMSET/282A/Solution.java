
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=0; i<n; i++){
            String statement = br.readLine();
            if(statement.matches("\\w?\\+{2}\\w?")){
                count++;
            }
            else if(statement.matches("\\w?\\-{2}\\w?")){
                count--;
            }
        }
        System.out.println(count);
    }
}