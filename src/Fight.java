import java.util.Scanner;

public class Fight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ' ';

            }
        }
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + array[i][0] + " " + array[i][1] + " " + array[i][2] + " |");
        }
        System.out.println("---------");
        int x = 0;
        int y = 0;
        boolean exception;
        char step = 'X';
        boolean zeroWin = false;
        boolean xsWin = false;
        do {
            do {
                System.out.println("Enter the coordinates: ");
                exception = false;
                try {
                    Scanner scanner1 = new Scanner(System.in);
                    x = scanner1.nextInt();
                    y = scanner1.nextInt();
                } catch (Exception e) {
                    System.out.println("You should enter numbers! ");
                    exception = true;
                    //fffffffff
                }
                if (exception) {

                } else if (!((x == 1 || x == 2 || x == 3) && (y == 1 || y == 2 || y == 3))) {
                    System.out.println("Coordinates should be from 1 to 3! ");
                } else if (!(array[3 - y][x - 1] == ' ')) {
                    System.out.println("This cell is occupied! Choose another one!");
                }

            } while (exception || !((x == 1 || x == 2 || x == 3) && (y == 1 || y == 2 || y == 3) && (array[3 - y][x - 1] == ' ')));

            array[3 - y][x - 1] = step;
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                System.out.println("| " + array[i][0] + " " + array[i][1] + " " + array[i][2] + " |");
            }
            System.out.println("---------");
            if(step == 'X'){
                step = 'O';
            } else {
                step = 'X';
            }
            int countX = 0;
            int countO = 0;

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
            countO = 0;
            countX = 0;
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
        }while (!xsWin && !zeroWin);
        if(xsWin){
            System.out.println("X wins");
        }else{
            System.out.println("O wins");
        }

    }
}
