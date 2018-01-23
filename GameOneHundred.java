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
            System.out.println("Gracz:");
            player = sc.nextInt();
            if (player > 10 || player < 1) {
                System.out.println("Podana liczba nie jest z zakresu od 1 do 10. Ponów swój wybór.");
                continue;
            }
            counter = counter - player;
            System.out.println("Wynik: " + counter);
            if (counter == 0 || counter == 1){
                System.out.println("Grę wygrywa Gracz. Gratulacje!!!");
                if (counter == 1)
                    counter--;
                continue;
            }
            if (counter < 10){
                computer = rand.nextInt(counter)+1;
            }else {
                computer = rand.nextInt(10) + 1;
            }
            System.out.println("Komputer odejmuje liczbę " + computer);
            counter = counter - computer;
            System.out.println("Wynik: " + counter);
            if (counter == 0 || counter ==1){
                System.out.println("Grę wygrywa Komputer.");
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
    public void startCheatGame(){
        Header();
        while (counter != 0){
            System.out.println("Gracz:");
            player = sc.nextInt();
            if (player > 10 || player < 1) {
                System.out.println("Podana liczba nie jest z zakresu od 1 do 10. Ponów swój wybór.");
                continue;
            }
            counter = counter - player;
            System.out.println("Wynik: " + counter);
            if (counter == 0 || counter == 1){
                System.out.println("Grę wygrywa Gracz. Gratulacje!!!");
                if (counter == 1)
                    counter--;
                continue;
            }
            computer = 11 - player;
            System.out.println("Komputer odejmuje liczbę " + computer);
            counter = counter - computer;
            System.out.println("Wynik: " + counter);
            if (counter == 0 || counter ==1){
                System.out.println("Grę wygrywa Komputer.");
                if (counter == 1)
                    counter--;
                continue;
            }
        }
    }
}
