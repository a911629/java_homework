package com.train.java.kotlin

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTicket = scanner.nextInt()
    println("Total tickets: $ticket")
    println("Round-trip: $roundTicket")
    println("Total: " + ((roundTicket * 1800) + ((ticket - roundTicket) * 1000)))

}

class TesterKotlin {
}