import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.abs;


class Scale {
    static List<List<Integer>> getMasses(Integer slowLorisWeight, List<Integer> allMasses) {
        List<Integer> leftPlate = new ArrayList<>();
        List<Integer> rightPlate = new ArrayList<>();
        List<List<Integer>> retValue = new ArrayList<>();

        for (int i = allMasses.size() - 1; i >= 0; i--) {
            int currentMass = allMasses.get(i);

            if (currentMass < slowLorisWeight) {
                slowLorisWeight -= currentMass;
                rightPlate.add(currentMass);
            } else if(currentMass == slowLorisWeight) {
                rightPlate.add(currentMass);

                break;
            } else if(-currentMass == slowLorisWeight) {
                leftPlate.add(currentMass);

                break;
            } else if(currentMass * 1.5 / 3 >= slowLorisWeight && rightPlate.isEmpty()) {

            } else if(rightPlate.isEmpty()) {
                slowLorisWeight -= currentMass;
                rightPlate.add(currentMass);
            } else if (currentMass * 1.5 / 3 <= slowLorisWeight) {
                    slowLorisWeight -= currentMass;
                    rightPlate.add(currentMass);
            } else if(currentMass * 1.5 / 3 <= abs(slowLorisWeight)) {
                        slowLorisWeight += currentMass;
                        leftPlate.add(currentMass);
            }
        }

        retValue.add(leftPlate);
        retValue.add(rightPlate);

        return retValue;
    }
}
