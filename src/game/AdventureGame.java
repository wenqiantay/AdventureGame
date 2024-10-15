package game;

import java.io.Console;

public class AdventureGame {

    public static void main(String[] args) {
        System.out.println("Welcome to your own adventure game! You have to make your choices for your own adventures!");
        Console cons = System.console();
        boolean progRun = true;
        String choice = cons.readLine("You are wandering around in a big forest and it is getting late. You happen to see a house lit up infront. Do you want to enter the house (y/n) ? \n");

        while (progRun) {
        if(choice.equals("y")) {
            choice = cons.readLine("\"You have entered the house. Suddenly the lights went out, you see a blinking light in the kitchen. Do you want to enter the kitchen (y/n)?\n");

            if(choice.equals("y")) {
                choice = cons.readLine("You have found a cooked dish that is unfamiliar to you. You start to feel hungry. Do you want to eat the dish (y/n)?");
                if(choice.equals("y")){
                    System.out.println("When you ate the dish, you start to realised there is a weird taste. You took a smell... Oh no you just digested poison. Unfortunately, you died. Game Over !");
                    progRun = false;
                } else {
                    choice = cons.readLine("Despite your hunger, you decided not to eat something that you are not familiar with. You continue to explore the house. You saw a lever on the wall. Do you pull it (y/n)?\n");
                    if(choice.equals("y")){
                        choice = cons.readLine("You hear a loud sound, you see a ladder drop down from the ceiling. This leads to the attic. Do you want to climb up (y/n)?\n");
                        if(choice.equals("y")) {
                            System.out.println("You went up the attic. At the corner of the attic, you saw shiny treasure chest. You opened it and found the an ancient sword. You win the game !");
                            progRun = false;
                        } else {
                            System.out.println("You decided not to go up but as you turn behind you saw a bear walking up to you. You do not have a weapon. You died. Game over");
                            progRun = false;
                        }              
                    } else {
                        choice = cons.readLine("You decided not to pull the lever. You turn back and you hear a sound coming from the living room. Do you go and check it out (y/n)?\n");
                        if(choice.equals("y")){
                            System.out.println("You saw a big bear. It came running towards you after spotting you. You got attacked by the bear. You died. Game over!");
                            progRun = false;
                        } else {
                            System.out.println("You see a bear running towards you. You got attacked. You died. Game Over!");
                            progRun = false;
                        }
                    }
                } 
            } else {
                System.out.println("You decided to leave the house. As you open the door, you saw a bear infront of your eyes. It became aggressive and attacked you. With nothing to protect you, you died. Game Over!");
                progRun = false;
            }
        } else {
            choice = cons.readLine("You continue to wonder around the forest. It is getting dark and you do not have a light source. You saw a rabbit eating grass. Do you pet it (y/n)?\n");
            if(choice.equals("y")) {
                System.out.println("You crouch down to pet the rabbit. As you look up, you saw a big bear. It started attacking you. You died. Game Over!");
                progRun = false;
            } else {
                System.out.println("As you walk away from the rabbit, you accidentally stepped on to a bear trap. Your leg is severly injured. You cannot move. Game over !");
                progRun = false;
            }
        }

    }
    }
}