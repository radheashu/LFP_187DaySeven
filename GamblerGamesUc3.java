package com.company;
import java.util.Scanner;
public class Gambler GameUC3 {
        static int days = 20;
        static int rsPerDay = 100;
        static int ch = 0;
        static int totalWinAmount=0;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int winCount = 0 ;
            int lossCount = 0;
            System.out.println("Press 1 to bet");
            int n = sc.nextInt();
            if(n == 1){
                while (rsPerDay!=0){
                    if(winCount == 50 && lossCount == 50){
                        System.out.println("You are unable to play more");
                        break;
                    }
                    rsPerDay--;
                    ch = getRandom();
                    switch (ch){
                        case 1:
                            gamblingWin();
                            winCount++;
                            break;
                        case 2:
                            gamblingLoss();
                            lossCount++;
                            break;
                        default:
                            break;
                    }
                }
                if(totalWinAmount<0){
                    System.out.println("Loss "+lossCount+" times on this day!");
                    System.out.println("You loss Game "+totalWinAmount+"$ ");
                }else{
                    System.out.println("Win "+winCount+" times on this day!");
                    System.out.println("You win amount "+totalWinAmount+"$");
                }
            }
        }
        private static void gamblingLoss() {
            totalWinAmount+=1;
        }

        private static void gamblingWin() {
            totalWinAmount-=1;
        }

        private static int getRandom(){
            int min=1,max=3;
            double random = Math.random();
            int hours = (int)(random * (max - min))+min;
            return hours;
        }
    }



