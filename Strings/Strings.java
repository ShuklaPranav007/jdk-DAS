
public class Strings {
    public static String subString(String str, int start, int end) {
        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S')
                y--;
            else if (dir == 'N')
                y++;
            else if (dir == 'W')
                x--;
            else {
                x++;
            }
        }
        float xm = x * x;
        float ym = y * y;

        return (float) Math.sqrt(xm + ym);
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

   public static String compressString(String str) {

    StringBuilder sb = new StringBuilder("");

    for (int i = 0; i < str.length(); i++) {

        int count = 1;

        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }

        sb.append(str.charAt(i));

        if (count > 1) {
            sb.append(count);
        }
    }

    return sb.toString();
}

    public static void main(String[] args) {
        // String str = "Hi i am a software engineer pranav shukla";
        // System.out.println(toUpperCase(str));

        String str = "aabbbcccddddddd";
        System.out.println(compressString(str));
    }
}

// length() is used in srings as function
// arr.length is used a property in array
// System.out.println(name.length());