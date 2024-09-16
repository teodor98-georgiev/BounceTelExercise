import java.lang.Math;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        int power = 0;
        double[][] data = new double[rows][columns];
        double number = 0;
        // creating the matrix
        for (int j = 0; j < rows; j++){
            power = j;
            for (int i = 0; i < columns; i++){
                number = Math.pow(2,power);
                data[j][i] = number;
                power++;
            }
        }
        // show matrix to check if all is on right place
        for (int u = 0; u < rows; u++){
            for (int y = 0; y < columns; y++){
                System.out.print(data[u][y] + "  ");
            }
            System.out.println();
        }
        // work on matrix (looping through it)
        ArrayList<Double> numbToSum = new ArrayList<>();
        if (rows == columns - 1){
            int r = 0;
            int c = 0;
            numbToSum.add(data[r][c]);
            while (r < rows - 1 && c == 0){
                if (true){
                    while(true){
                        r++;
                        c++;
                        numbToSum.add(data[r][c]);
                        if (r == rows - 1 && c < columns - 1){
                            break;
                        }
                    }
                }
                if (r == rows - 1 && c < columns - 1){
                    while(true){
                        r--;
                        c++;
                        numbToSum.add(data[r][c]);
                        if (c == columns - 1 && r < rows - 1){
                            break;
                        }
                    }
                }
                if (c == columns - 1 && r > 0){
                    while(true){
                        r--;
                        c--;
                        numbToSum.add(data[r][c]);
                        if (c < columns - 1 && r == 0 ){
                            break;
                        }
                    }
                }
                if (c < columns - 1 && r == 0 ){
                    while(true){
                        r++;
                        c--;
                        numbToSum.add(data[r][c]);
                        if (c == 0 && r <= rows - 1){
                            break;
                        }
                    }
                }
                if (r == 0 && c == columns - 1){
                    break;
                }
            }
        }
        else {
            int r = 0;
            int c = 0;
            numbToSum.add(data[r][c]);
            while (c != columns - 1){
                while (r < rows - 1 && c < columns - 1){
                    r++;
                    c++;
                    numbToSum.add(data[r][c]);
                    if (r == rows - 1){
                        break;
                    }
                }
                while (r > 0 && c < columns - 1){
                    r--;
                    c++;
                    numbToSum.add(data[r][c]);
                    if (r == 0){
                        break;
                    }
                }
            }
        }
    }
}