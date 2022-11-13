public class Tablica2 {

    public static void main(String[] args) {
        int dlug1 = 5;
        int dlug2 = 3;
        int arr[][] = new int[dlug1][dlug2];

        for(int i = 0; i < dlug1; i++) {
            for (int j = 0; j < dlug2; j++) {
              arr[i][j] = 1;
                System.out.println("j="+j+"  i="+i);
            }
        }

//        for(int i = 0; i < dlug1; i++) {
//            for (int j = 0; j < dlug2; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }

    }
}