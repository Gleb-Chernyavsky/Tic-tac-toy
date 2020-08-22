import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] massive = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massive[i][j] = ".";
            }
        }
        int q = 0;
        int w = n-1;
        for(int i = 0; i < n; i++){

            massive[q][q] = "*";
            massive[w][q] = "*";
            q++;
            w--;
        }


        Arrays.fill(massive[n/2], "*");
        for (int i = 0; i < n; i++){
            massive[i][n/2] = "*";
        }
        for (int b = 0; b < n; b++) {
            for (int j = 0; j < n; j++) {
                System.out.print((massive[b][j] + " "));
            }
            System.out.println();
        }

    }
}