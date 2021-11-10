
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sum_string = br.readLine();
        String result = Arrays.stream(sum_string.split("\\+")).map(Integer::parseInt).sorted().map(String::valueOf).collect(Collectors.joining("+"));
        System.out.println(result);
    }
}