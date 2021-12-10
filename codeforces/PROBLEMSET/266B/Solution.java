
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        char[] queue = br.readLine().toCharArray();
        if(n == queue.length){
            for(int i=0; i< t; i++){
                for(int j=0; j< queue.length-1 ; j++){
                    if(queue[j]== 'B' && queue[j+1] == 'G'){
                        queue[j] = 'G';
                        queue[j+1] = 'B';
                        j++;
                    }
                }
            }
        }
        System.out.println(String.valueOf(queue));
    }
}