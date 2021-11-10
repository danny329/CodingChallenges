

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk = br.readLine();
        List<Integer> inital_values =  List.of(nk.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        int N = inital_values.get(0);
        int K = inital_values.get(1);
        int count = 0;
        String result = br.readLine();
        List<Integer> scores =  List.of(result.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        int K_score = scores.get(K - 1);
        for(int i=0; i < N; i++){
            if(scores.get(i)>= K_score && scores.get(i)>0) count++;
        }
        System.out.println(count);
    }
}