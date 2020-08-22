import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AnalyzeField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arrayS = new char[9];
        arrayS = s.toCharArray();
        char[][] array = new char[3][3];
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = arrayS[a];
                a++;
            }
        }
        boolean zeroWin = false;
        boolean xsWin = false;
        int countO = 0;
        int countX = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 'X') {
                    countX++;
                } else if (array[i][j] == 'O') {
                    countO++;
                }
            }
            if (countO == 3) {
                zeroWin = true;
            }
            if (countX == 3) {
                xsWin = true;
            }
            countO = 0;
            countX = 0;
        }
        countO = 0;
        countX = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[j][i] == 'X') {
                    countX++;
                } else if (array[j][i] == 'O') {
                    countO++;
                }
            }
            if (countO == 3) {
                zeroWin = true;
            }
            if (countX == 3) {
                xsWin = true;
            }
            countO = 0;
            countX = 0;
        }
        countO = 0;
        countX = 0;
        for (int i = 0; i < 3; i++) {
            if (array[i][i] == 'X') {
                countX++;
            } else if (array[i][i] == 'O') {
                countO++;
            }
        }
        if (countO == 3) {
            zeroWin = true;
        }
        if (countX == 3) {
            xsWin = true;
        }
        countO = 0;
        countX = 0;
        int tr = 2;
        for (int i = 0; i < 3; i++) {
            if (array[i][tr] == 'X') {
                countX++;
            } else if (array[i][tr] == 'O') {
                countO++;
            }
            tr--;
        }
        if (countO == 3) {
            zeroWin = true;
        }
        if (countX == 3) {
            xsWin = true;
        }
        boolean hasEmpty = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == '_' || array[i][j] == ' ') {
                    hasEmpty = true;
                }
            }
        }
        boolean bool = false;
        int coutnNumOfX = 0;
        int countNumOfO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 'X') {
                    coutnNumOfX++;
                } else if (array[i][j] == 'O') {
                    countNumOfO++;
                }
            }
        }
        if (Math.abs(countNumOfO - coutnNumOfX) >= 2) {
            bool = true;
        }
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + array[i][0] + " " + array[i][1] + " " + array[i][2] + " |");
        }
        System.out.println("---------");
        if (xsWin && zeroWin || bool) {
            System.out.println("Impossible");
        } else if (!xsWin && !zeroWin && !hasEmpty) {
            System.out.println("Draw");
        } else if (!xsWin && !zeroWin && hasEmpty) {
            System.out.println("Game not finished");
        } else if (!xsWin && zeroWin) {
            System.out.println("O wins");
        } else if (!zeroWin && xsWin) {
            System.out.println("X wins");


        }
    }
}

