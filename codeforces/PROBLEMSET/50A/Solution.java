
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
        int M = inital_values.get(0);
        int N = inital_values.get(1);

        System.out.println((int) ((M*N)/2));
    }
}