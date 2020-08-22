import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        int[][] massive = new int[N * N][N * N];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                massive[i][j] = scanner.nextInt();
            }
        }

        boolean solve = true;
        for (int i = 0; i < N * N; i++) {
            for (int j = 0; j < N * N; j++) {
                if (massive[i][j] > N * N){
                    solve = false;
                }
            }
        }

        int count = 0;
        int count2 = 0;
        for (int x = 0; x < N * N; x++) {
            for (int i = 0; i <= N * N; i++) {
                for (int j = 0; j < N * N; j++) {
                    if (massive[x][j] == i) {
                        count++;
                    }

                }
                if (count > 1) {
                    solve = false;
                }
                count = 0;
            }
        }
        for (int x = 0; x < N * N; x++) {
            for (int i = 0; i <= N * N; i++) {
                for (int j = 0; j < N * N; j++) {
                    if (massive[j][x] == i) {
                        count2++;
                    }

                }
                if (count2 > 1) {
                    solve = false;
                }
                count2 = 0;
            }
        }
            int y = 0;
            int q = 0;
            int count3 = 0;
            for (int w = 0; w < N; w++) {
                for (int v = 0; v < N; v++) {
                    for (int i = 0; i <= N * N; i++) {
                        for (int j = 0; j < N; j++) {
                            for (int z = 0; z < N; z++) {
                                if (massive[j + N * v][z + N * w] == i) {
                                    count3++;
                                }
                            }
                        }
                        if (count3 > 1) {
                            solve = false;
                        }
                        count3 = 0;
                    }

                }
            }

            if (solve) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


    }
}
