
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputs = (ArrayList<Integer>) Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int a = inputs.get(0);
        int b = inputs.get(1);
        int count = 0;
        while (a<=b){
            count++;
            a*=3;
            b*=2;
        }
        System.out.println(count);
    }
}