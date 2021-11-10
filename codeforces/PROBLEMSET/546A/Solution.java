
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
        int k = inputs.get(0);
        int n = inputs.get(1);
        int w = inputs.get(2);
        int sum = (int) ((w/2.0) * ( (2*k) + ( (w-1) * k ) ));
        int borrow = n-sum;
        if (borrow < 0)
            System.out.println(Math.abs(borrow));
        else
            System.out.println(0);
    }
}