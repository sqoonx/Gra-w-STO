package ProjectGameOneHundred;

import java.util.Random;
import java.util.Scanner;

public class GameOneHundred {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    private int player;
    private int computer;
    private int counter = 100;

    public void startGame(){
        Header();
        while (counter != 0){
            Player();
            player = sc.nextInt();
            if (player > 10 || player < 1) {
                Range();
                continue;
            }
            counter = counter - player;
            Result(counter);
            if (counter == 0 || counter == 1){
                playerWins();
                if (counter == 1)
                    counter--;
                continue;
            }
            if (counter < 10){
                computer = rand.nextInt(counter)+1;
            }else {
                computer = rand.nextInt(10) + 1;
            }
            Computer(computer);
            counter = counter - computer;
            Result(counter);
            if (counter == 0 || counter ==1){
                computerWins();
                if (counter == 1)
                    counter--;
                continue;
            }
        }
    }
    private void Header(){
        System.out.println("GRA W 100\n");
        System.out.println("Wybierz liczbę z przedziału od 1 do 10");
    }
    private void Player(){
        System.out.println("Gracz:");
    }
    private void Range(){
        System.out.println("Podana liczba nie jest z zakresu od 1 do 10. Ponów swój wybór.");
    }
    private void playerWins(){
        System.out.println("Grę wygrywa Gracz. Gratulacje!!!");
    }
    private void computerWins(){
        System.out.println("Grę wygrywa Komputer.");
    }
    private void Computer(int x){
        System.out.println("Komputer odejmuje liczbę " + x);
    }
    private void Result(int x){
        System.out.println("Wynik: " + x);
    }
    public void startCheatGame(){
        Header();
        while (counter != 0){
            Player();
            player = sc.nextInt();
            if (player > 10 || player < 1) {
                Range();
                continue;
            }
            counter = counter - player;
            Result(counter);
            if (counter == 0 || counter == 1){
                playerWins();
                if (counter == 1)
                    counter--;
                continue;
            }
            computer = 11 - player;
            Computer(computer);
            counter = counter - computer;
            Result(counter);
            if (counter == 0 || counter ==1){
                computerWins();
                if (counter == 1)
                    counter--;
                continue;
            }
        }
    }
}
