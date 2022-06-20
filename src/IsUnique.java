import java.util.Arrays;

public class IsUnique {

    public static void main(String[] args) {

        boolean[] container = new boolean[128];

        System.out.println(Arrays.toString(container));

        System.out.println(isUnique("I AM COming i"));

    }

    public static boolean isUnique(String str) {
        if (str.length() > 128) return false;

        boolean[] container = new boolean[128];

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (container[val]) {
                return false;
            }
            container[val] = true;
        }

        return true;
    }
}
