
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RobotFactory {
    public static void main(String[] args)  {
        ArrayList<Integer> char_list = new ArrayList<Integer>(Arrays.asList(10,15,3,7));
        HashSet<Integer> inverses_set = new HashSet<Integer>();
        int sum = 17;
        int flag = 0;
        for (int element : char_list) {
            if (inverses_set.contains(element)) {
                flag = 1;
                break;
            }
            inverses_set.add(sum - element);
        }
        if (flag == 1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}