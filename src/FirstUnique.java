
 import java.util.*;

// Link : https://app.codility.com/demo/results/trainingUE3WWB-XYE/
class FirstUnique {
    public int solution(int[] A) {
        // write your code in Java SE 8

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for(int i=0; i<A.length; i++) {
            if(!linkedHashSet.contains(A[i])) {
                linkedHashSet.add(A[i]);
            }else {
                linkedHashSet.remove(A[i]);
            }
        }
        if(linkedHashSet.isEmpty()) {
            return -1;
        }
        Integer[] array = new Integer[linkedHashSet.size()];
        if(!linkedHashSet.isEmpty()) {
            array = linkedHashSet.toArray(array);
        }
        return array[0];
    }
}
