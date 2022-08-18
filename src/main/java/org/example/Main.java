package org.example;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Press 1 to see MOTD or 2 to see data");
        int a = scan.nextInt();
        switch (a){
            case 1:
                System.out.println("Hi, I try to use Jenkins");
                break;
            case 2:
                System.out.println(time);
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}