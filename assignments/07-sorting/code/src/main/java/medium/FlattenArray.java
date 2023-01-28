package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) throws Exception {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
        Integer[] flattenedArray = flatten(array);
        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {
        if(inputArray == null){
            return null;
        }
        List<Integer> flatten = new ArrayList<>();
        for (Object obj : inputArray) {
            if(obj instanceof Integer){
                flatten.add((Integer) obj);
            }
            if (obj instanceof Object[]) {
                flatten.addAll(Arrays.asList(flatten((Object[]) obj)));
            }
        }

        //return flatten.stream().toArray(Integer[]::new);
        return flatten.toArray(new Integer[flatten.size()]);
    }
}
