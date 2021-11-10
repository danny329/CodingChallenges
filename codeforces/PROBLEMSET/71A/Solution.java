
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i < N; i++){
            String word = br.readLine();
            if (word.length() < 11) System.out.println(word);
            else{
                System.out.printf("%c%d%c%n",word.charAt(0), (word.length()-2), word.charAt(word.length()-1));
            }
        }
    }
}