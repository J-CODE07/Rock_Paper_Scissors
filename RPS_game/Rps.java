package com.RPS_game;


import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String playersMove;
        String playAgain;

        while(true) {
            String[] rps = {"r", "p", "s"};
            String computer = rps [new Random().nextInt(rps.length)];


            while (true) {
                System.out.print("Enter your choice: ");
                playersMove = scan.next();
                if (playersMove.equals("r") || playersMove.equals("p") || playersMove.equals("s")) {
                    break;
                }
                System.out.println(playersMove + " is not valid");
            }

            System.out.println("Computer played: " + computer);

            if (playersMove.equals(computer)) {
                System.out.println("The Game is Tie!");
            } else if (playersMove.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println("You Lose!");
                } else if (computer.equals("s")) {
                    System.out.println("You Win!");
                }
            } else if (playersMove.equals("p")) {
                if (computer.equals("r")) {
                    System.out.println("You Win!");
                } else if (computer.equals("s")) {
                    System.out.println("You Lose!");
                }
            } else if (playersMove.equals("s")) {
                if (computer.equals("r")) {
                    System.out.println("You Lose!");
                } else if (computer.equals("p")) {
                    System.out.println("You Win!");
                }
            }

            System.out.println("Do you want to Play Again? (y/n): ");
            playAgain = scan.next().toLowerCase();
            if(!playAgain.equals("y")){
                break;
            }

        }
        if (playAgain.equals("n")) {
            System.out.println("Thanks for Playing!");
            scan.close();
        }
        }
    }
