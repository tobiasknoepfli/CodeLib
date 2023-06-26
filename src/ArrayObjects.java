import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

//        PRIMITIVE INITIALISATION
        /*array is initialised but filled later */
        int[] array1;
        array1 = new int[]{5,1,3,2,4};
        intToString(array1);
        /* size of array is known but values not yet */
        int[] array2 = new int[10];
        intToString(array2);
        int[] array3 = new int[2];
        intToString(array3);
        /* values of array are known */
        int[] array4 = {1, 2, 3, 4, 5};
        intToString(array4);

//        OBJECT INITIALISATION
        Integer[] objArray = {1, 2, 3, 4, 5};
        toString(objArray);
        Double[] doubleObjArray = new Double[5];
        toString(doubleObjArray);

//        FILLING ARRAYS SEPARATELY
        array3[0] = 10;
        array3[1] = 20;
        intToString(array3);

//        FILLING ARRAYS WITH LOOPS
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 2 * i;
        }
        intToString(array2);

//        ACCESSING ELEMENTS
        int fourthElement = array2[3];
        System.out.println(fourthElement);

//        ARRAY LENGTH
        System.out.println(objArray.length);

//        COPY ARRAYS
        /* Using System.arraycopy() */
        int[] copy1 = new int[array1.length];
        System.arraycopy(array1, 0, copy1, 0, array1.length);
        intToString(array1);
        intToString(copy1);
        /* Using ArrayObjects.copyOf() */
        int[] copy2 = Arrays.copyOf(array2,array2.length);
        intToString(array2);
        intToString(copy2);

//        MULTIDIMENSIONAL ARRAYS
        int[][] matrix = new int[3][3];
        int[][][] cube = new int[3][3][3];;

//        SORT ARRAY
        Arrays.sort(array1);
        intToString(array1);

//        SEARCH ARRAY FOR AN ELEMENT
        int index = Arrays.binarySearch(array1, 3);
        System.out.println(index);
    }

    //    ITERATING OVER ARRAYS
    public static <T> void toString(T[] array) {
        for (T a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void intToString(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
