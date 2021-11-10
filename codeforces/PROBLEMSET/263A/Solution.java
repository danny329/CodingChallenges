
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i=0; i<5; i++){
            String statement = br.readLine();
            if(statement.matches("[\\w\\s]*[1][\\w\\s]*")) {
                int row = i+1;
                int col = statement.replace(" ", "").indexOf("1") + 1;
                count = Math.abs(3-row) + Math.abs(3-col) ;
                break;
            }
        }
        System.out.println(count);

    }
}