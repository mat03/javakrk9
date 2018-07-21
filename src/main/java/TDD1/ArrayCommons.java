package TDD1;

// Class IllegalArgumentException

public class ArrayCommons {
    /**
     * [2,3,1,9,0], 2, 4, -1 (wartosci ktora podstawiamy)-> [2,3,-1,-1,-1]
     */
    public static <T> void replace(T[] arr, int begin, int end, T obj)
    throws InvalidArgumentException {
        if((arr == null) || (begin < 0) || (end > arr.length) || (begin > arr.length)) {
            throw new InvalidArgumentException("invalid argument");
        }

        for (int i = begin; i <= end; ++i) {
            arr[i] = obj;
        }

    }

    public static Double[] reverseSum(Double[] first, Double[] second) throws InvalidArgumentException {
        if((first == null) || (second == null)) {
            throw new InvalidArgumentException("null array");
        }

        int arrayLen = first.length;

        if(arrayLen != second.length) {
            throw new InvalidArgumentException("arrays size no equal");
        }

        Double[] result = new Double[arrayLen];

        for(int i = 0; i < arrayLen; i++) {
            result[arrayLen - i - 1] = first[i] + second[i];
        }

        return result;
    }
}
