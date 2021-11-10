
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  s = br.readLine();
        ArrayList<String> char_list = new ArrayList<>(Arrays.asList(s.split("")));
        ArrayList<String> distinct_list = new ArrayList<String>();
        for (String element: char_list) {
            if(!distinct_list.contains(element)){
                distinct_list.add(element);
            }
        }
        if(distinct_list.size() %2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}