package recursion;

public class practiceOnly {
    static void main() {
        int n = 5;
        printMessage(n);
    }


    static void printMessage(int n){
        if(n == 0) return;

        System.out.println("hello uday pratap singh");
        n--;

        printMessage(n);
    }
}
