import java.util.ArrayList;
import java.util.List;

public class MinimumIndexSum {

    public static void main(String[] args) {

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list  = new ArrayList<>();

        int j = 0;
        int max = 0;
        for (int i = 0; i < list2.length; i++) {
            if (list1[j].equals(list2[i])) {
               int temp= i + j;
               max = Math.max(max, temp);
            }

            if (j < list1.length) j++;
        }
        return new String[1];
    }
}
