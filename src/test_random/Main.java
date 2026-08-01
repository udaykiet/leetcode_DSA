package test_random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(list.remove((Integer) 2));
        System.out.println(list);
    }
}
