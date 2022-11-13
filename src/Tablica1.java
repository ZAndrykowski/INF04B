public class Tablica1 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i != 5) {
                arr[i] = 3;
            } else {
                arr[i] = 4;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("arr[" + i + "]=" + arr[i] + ";");
        }
    }
}
