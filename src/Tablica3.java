public class Tablica3 {
    public static void main(String[] args) {
        int dlug = 5;
        char[][] gra = new char[dlug][dlug];

        for (int i = 0; i < dlug; i++) {
            for (int j = 0; j < dlug; j++) {
                if (i == j || (i + j) == 4) {
                    gra[i][j] = 'x';
                } else {
                    gra[i][j] = '0';
                }
            }
        }

        for (int i = 0; i < dlug; i++) {
            for (int j = 0; j < dlug; j++) {
                System.out.print(gra[i][j]+" ");
            }
            System.out.println();
        }
    }
}