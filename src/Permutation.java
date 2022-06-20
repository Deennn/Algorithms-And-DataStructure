import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] letter = new int[128];
        System.out.println(Arrays.toString(letter));

        System.out.println(helperFunction("god"));

        System.out.println(permutation2("god", "dog"));

    }

    public static boolean permutation1(String first, String second) {
        if (first.length() !=  second.length()) return false;

        return helperFunction(first).equals(helperFunction(second));
    }

    public static String helperFunction(String helpMe) {
        char[] ans = helpMe.toCharArray();
        Arrays.sort(ans);
        return new String(ans);
    }

    public static boolean permutation2(String first, String second) {
        int[] letter = new int[128];

        for (int i =0; i < first.length(); i++) {
            int val = first.charAt(i);
            letter[val]++;
        }

        char[] ans = second.toCharArray();

        for (char val: ans) {
            letter[val]--;
            if (letter[val] < 0) {
                return false;
            }
        }
        return true;
    }
}
