
public class Strings {
    public static String subString(String str, int start, int end){
        String subStr = "";
        for(int i = start;i<end;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
   
    public static float  getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S') y--;
            else if (dir == 'N') y++;
            else if (dir == 'W') x--;
            else{x++;}
        }
        float xm = x*x;
        float ym = y*y;

        return (float)Math.sqrt(xm+ym);
    }

    public static void main(String[] args) {
        String str = "Hello_World";
        String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));
        
    }
}

// length() is used in srings as function 
// arr.length is used a property in array
// System.out.println(name.length());