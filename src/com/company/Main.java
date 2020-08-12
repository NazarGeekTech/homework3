package com.company;

public class Main {

    public static void main(String[] args) {
            // write your code here
        double[] massiv = {34.52, 45.68, -21.8,74.34, -21.56, 51.97, 0.41, 76.98, -27.69,
                546.72, 2812.73, 483.95, 699.43, -382.54, 754.61, 876.32, 869.59};
        boolean isStart = false;

        double positiveCount = 0;
        double summa = 0; //
        int counter = 0;

            for (double i : massiv) {
                if (!isStart && i<0){
                    isStart = true;
                     continue;
                }
                else if (isStart && i>0){
                    positiveCount +=i;
                    counter++;
                }
              summa = positiveCount / counter ;

            }
        System.out.println(summa);



    }
}
