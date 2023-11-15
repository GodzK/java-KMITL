import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] perm = new int[3];
        List<int[]> permutations = new ArrayList<>();
        generatePermutations(perm, 0, permutations);

        for (int[] permutation : permutations) {
            System.out.println(Arrays.toString(permutation));
        }
    }

    private static void generatePermutations(int[] perm, int index, List<int[]> permutations) {
        if (index == perm.length) {
          
            permutations.add(perm.clone());
            return;
        }


        perm[index] = 0;
        generatePermutations(perm, index + 1, permutations);

        perm[index] = 1;
        generatePermutations(perm, index + 1, permutations);
    }
}
