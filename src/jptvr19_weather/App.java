/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19_weather;


import java.util.Random;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("---Weather---");
        System.out.println("Задание. Создаем зубчатый массив");
        int [][] tempInYear = new int[12][];
        int max = 30;
        int min = -30;
        Random random = new Random();
        int n= 0;
        for (int i = 0; i<12; i++){
            switch (i) {
                case 0: min = -30; max = 0; n = 31; break;
                case 1: min = -30; max = -5; n = 28; break;
                case 2: min = -20; max = 5; n = 31; break;
                case 3: min = -15; max = 15; n = 30; break;
                case 4: min = -5; max = 25; n = 31; break;
                case 5: min = 10; max = 40; n = 30; break;
                case 6: min = 15; max = 40; n = 31; break;
                case 7: min = 10; max = 40; n = 31; break;
                case 8: min = 5; max = 20; n = 30; break;
                case 9: min = -5; max = 10; n = 31; break;
                case 10: min = -10; max = 0; n = 30; break;
                case 11: min = -30; max = -10; n = 31; break;
            }
            tempInYear[i] = new int[n];
            for (int j = 0; j< tempInYear[i].length;j++) {
                tempInYear[i][j] = random.nextInt(max-min+1)+min;
                System.out.printf("%4d",tempInYear[i][j]);
            }
            System.out.println();
        }   
       
    }
    
}
