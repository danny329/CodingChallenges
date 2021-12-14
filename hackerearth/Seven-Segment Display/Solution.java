import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class Solution {

    public static void main(String[] args) throws IOException {
        HashMap<Integer,Integer> segmentmapper = new HashMap<Integer, Integer>();
        segmentmapper.put(0,6);
        segmentmapper.put(1,2);
        segmentmapper.put(2,5);
        segmentmapper.put(3,5);
        segmentmapper.put(4,4);
        segmentmapper.put(5,5);
        segmentmapper.put(6,6);
        segmentmapper.put(7,3);
        segmentmapper.put(8,7);
        segmentmapper.put(9,6);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int totalsticks = Arrays.stream(br.readLine().split(""))
            .mapToInt(Integer::valueOf)
            .reduce(0, (subtotal, element) -> subtotal + segmentmapper.get(element));
            StringBuilder wordList = new StringBuilder();
            
            if (totalsticks % 2 == 0){
                for(int j=0; j< (int) totalsticks/2; j++){
                    wordList.append('1');
                }
            }
            else{
                wordList.append('7');
                for(int j=1; j< (int) totalsticks/2; j++){
                    wordList.append('1');
                }
            }
            System.out.println(wordList);

        }
    }
}
