package binary_search;

public class Q744 {
    static void main() {
        char[] arr = {'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z'};
        char target = 'z';
        char ch =  findCharCeil(arr, target);
        System.out.println(ch);
    }

    public static char findCharCeil(char[] arr , char target){
        int i=0;
        int j = arr.length-1;
        char result = arr[0];

        while(i<=j){
            int mid  = i + (j-i)/2;

            if(target >= arr[mid]){
                i = mid+1;
            }
            else{
                result = arr[mid];
                j = mid -1;
            }
        }

        return result;
    }
}
