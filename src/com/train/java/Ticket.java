package com.train.java;

import java.util.Scanner;

public class Ticket {
    public void count() {
        Scanner scanner = new Scanner(System.in);
        int tickets, round_ticket;
        System.out.print("Please enter number of tickets: ");
        tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        round_ticket = scanner.nextInt();
        System.out.println("Total tickets:" + tickets);
        System.out.println("Round-trip: " + round_ticket);
        System.out.println("Total : " + ((1800 * round_ticket) + (1000 * (tickets - round_ticket))));
    }
    public static void print(){
        System.out.printf("hello");
    }
}
