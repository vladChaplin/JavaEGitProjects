package kz.com.javarush.solutions;


public class SpiralFillArr {

    public static void main(String[] args) {

        //Алгоритм заполнения двумерного массива nxn по спирали
        int[][] arrSpiral = new int[7][7];
        int values = 1;
        int count = 0;

        for(int i = 0; i < arrSpiral.length; i++) {

            int j = count;
            int c = count;
            int l = count + 1;
            int sizeOfRows = arrSpiral[i].length - count;
            int sizeOfCol = arrSpiral.length - count;

            //Заполнение верхней строки
            for(; j < sizeOfRows; j++) {
                arrSpiral[i][j] = values;
                values++;
            }

            //Заполнение правого столбца
            for(; l < sizeOfCol; l++) {
                arrSpiral[l][j-1] = values;
                values++;
            }
            j -= 2;
            l--;
            //Заполнение нижней строки
            for(; j >= count; j--) {
                arrSpiral[l][j] = values;
                values++;
            }
            l--;
            //Заполнение левого столбца
            for(; l > count; l--) {
                arrSpiral[l][c] = values;
                values++;
            }
            count++;
        }

        //Out
        for(int i = 0; i < arrSpiral.length; i++) {
            for(int j = 0; j < arrSpiral[i].length; j++) {
                if(arrSpiral[i][j] < 10) {
                    System.out.print(" " + arrSpiral[i][j] + " ");
                } else {
                    System.out.print(arrSpiral[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
