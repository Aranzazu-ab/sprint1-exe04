package L1Exe3;

import java.util.ArrayList;
import java.util.List;

public class ArrayException {
    private List<Integer> arrayInt;

    public ArrayException() {
        arrayInt = new ArrayList<>();
    }

    public void throwException(int position) {
        if (position < 0 || position >= arrayInt.size()) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
    }
}

//    public void generateException() {
//        int[] numbers = {10, 20, 30};
//        System.out.println(numbers[5]);
//    }
//
//}
