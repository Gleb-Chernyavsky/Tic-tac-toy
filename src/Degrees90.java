import java.util.Scanner;

public class Degrees90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] firstMas = new int[a][b];
        int[][] newMas = new int[b][a];
        //int[][] data = new int [][]
        for(int i = 0; i < firstMas.length; i++) {
            for (int j = 0; j < b; j++) {
                firstMas[i][j] = scanner.nextInt();
            }
        }
        int q = 0;
        int z = a - 1;
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                newMas[i][j] = firstMas[z][q];
                z--;
            }
            z = a - 1;
            q++;
        }
        for(int i = 0; i < newMas.length; i++){
            for(int j = 0; j < a; j++){
                System.out.print(newMas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
