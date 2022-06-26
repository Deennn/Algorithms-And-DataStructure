public class Geeks1 {

    public static void main(String[] args) {
        System.out.println(nonRepeatingCharacter("zxvczbtxyzvy"));

    }
    static char nonRepeatingCharacter(String str) {
       int[] container = new int[128];
       char[] arr = str.toCharArray();
       for (char val : arr) container[val]++;
       for (char val : arr) if (container[val] == 1) return val;
       return '$';
    }
}
