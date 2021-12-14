import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] balloonCost = br.readLine().split(" ");
            int greenCost = Integer.parseInt(balloonCost[0]);
            int purpleCost = Integer.parseInt(balloonCost[1]);
            int n = Integer.parseInt(br.readLine());
            int probOneCount = 0;
            int probTwoCount = 0;
            for (int j = 0; j < n; j++) {
                String[] problemSolved = br.readLine().split(" ");
                int problemOne = Integer.parseInt(problemSolved[0]);
                int problemTwo = Integer.parseInt(problemSolved[1]);
                if(problemOne == 1)
                    probOneCount++;
                if(problemTwo == 1)
                    probTwoCount++;
            }                                        
            int minCost = Math.min(
                ((greenCost*probOneCount) + (purpleCost*probTwoCount)),
                ((purpleCost*probOneCount) + (greenCost*probTwoCount))
            );
            System.out.println(minCost);

        }
    }
}
