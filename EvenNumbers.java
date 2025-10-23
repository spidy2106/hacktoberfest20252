package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        Arrays.stream(arr).filter(x->x%2==0).forEach(System.out::println);

    }
}
