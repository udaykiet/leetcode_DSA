package recursion;

public class EditString {
    static void main() {
        String s = "iiiiiiiizzzizizizizizizizizizi";
        char remove = 'i';
        String ans = "";
        System.out.println(editString(s,ans, 0,remove));
    }

    public static String editString(String s, String ans, int index, char remove){
        if(index == s.length()) return ans;
        if(s.charAt(index) != remove){
            ans = ans + s.charAt(index);
        }

       return editString(s, ans, index+1, remove);

    }
}
