package com.train.java;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tickets, round_ticket;
        Ticket ticket = new Ticket();
        int round = 0;
        System.out.print("Enter -1 to quit, or buy a ticket for how may rounds : ");
        tickets = scanner.nextInt();
        while (true) {
            if ((tickets == -1) || (tickets == round)) {
                break;
            }
            round++;
            ticket.count(round);
        }
    }
}
