import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstMove {
    public static void main(String[] args) {
        System.out.println("Enter cells: ");
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
        char ch = '_';
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                if (array[i][j]== ch){
                    array[i][j] = ' ';
                }
            }
        }

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + array[i][0] + " " + array[i][1] + " " + array[i][2] + " |");
        }
        System.out.println("---------");
        boolean b = false;
        int counterX = 0;
        int counterY = 0;
        int x = 0 ;
        int y = 0;
        boolean exception;
        do {
            System.out.println("Enter the coordinates: ");
            exception = false;
            try {
                Scanner scanner1 = new Scanner(System.in);
                x = scanner1.nextInt();
                y = scanner1.nextInt();
            } catch (Exception e){
                System.out.println("You should enter numbers! ");
                exception = true;
                //fffffffff
            }
            if(exception){

            }else if(!((x == 1 || x == 2 || x == 3) && (y == 1 || y == 2 || y == 3))){
                System.out.println("Coordinates should be from 1 to 3! ");
            } else if(!(array[3 - y][x - 1] == ' ')){
                System.out.println("This cell is occupied! Choose another one!");
            }

        } while (exception || !((x == 1 || x == 2 || x == 3) && (y == 1 || y == 2 || y == 3) && (array[3 - y][x - 1] == ' ')));

        array[3 - y][x - 1] = 'X';

       // !((x == 1 || x == 2 || x == 3) && (y == 1 || y == 2 || y == 3) && (array[3 - y][x - 1] == '_' &&))
       // if (array[3 - y][x - 1] != '_') {
       // } else if (true) {
       // }
       // array[3 - y][x - 1] = 'X';
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + array[i][0] + " " + array[i][1] + " " + array[i][2] + " |");
        }
        System.out.println("---------");
    }
}
