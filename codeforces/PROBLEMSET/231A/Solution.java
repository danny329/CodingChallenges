
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i < N; i++){
            String result = br.readLine();
            int sum = List.of(result.split(" ")).stream().map(Integer::parseInt).reduce(0, Integer::sum);
            if(sum>=2) count++;
        }
        System.out.println(count);
    }
}