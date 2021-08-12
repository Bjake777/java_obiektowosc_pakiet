package permute;



import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Permute {
    public static void permute(List<String> arr, int k) {
        for (int i = k; i < arr.size(); i++) {
            Collections.swap(arr, i, k);
            permute(arr, k + 1);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {
            System.out.println(Arrays.toString(arr.toArray()));
        }
    }
}
