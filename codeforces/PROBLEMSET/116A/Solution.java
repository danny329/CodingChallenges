
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stops = Integer.parseInt(br.readLine());
        int minCapacity = 0;
        int currentCapacity = 0;

        for(int i=0;  i<stops; i++){
            String[] inputs = br.readLine().split(" ");
            int exit = Integer.parseInt(inputs[0]);
            int enter = Integer.parseInt(inputs[1]);

            currentCapacity = currentCapacity - exit + enter;
            minCapacity = Math.max(currentCapacity, minCapacity);
        }
                
        System.out.println(minCapacity);
    }
}