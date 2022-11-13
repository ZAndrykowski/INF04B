public class Tablica4 {

    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5,6,7,8,9,10};
        int[] result = new int[10];

        for (int i= 9; i>=0; i--) {
            result[9-i] = array1[i];
        }
        System.out.println("");
        for (int i : result) {
            System.out.println(i);
        }
    }
}