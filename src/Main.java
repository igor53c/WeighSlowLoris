import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> allMasses = Arrays.asList(1, 3, 9, 27, 81, 243);

        for (int i = 1; i < 364; i++) {
            List<List<Integer>> result = Scale.getMasses(i, allMasses);

            if(result.size() > 1) {
                int leftSum = i;
                int rightSum = 0;

                for(int left : result.get(0)) {
                    leftSum += left;
                }

                for(int right : result.get(1)) {
                    rightSum += right;
                }

                if(leftSum != rightSum) {
                    System.out.println("i = " + i);
                    System.out.println("leftSum = " + leftSum);
                    System.out.println("rightSum = " + rightSum);
                    System.out.println("result = " + result);
                }
            }
        }
    }
}