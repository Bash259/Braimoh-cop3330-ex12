/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        Scanner UserInput = new Scanner(System.in);
        String Principal = UserInput.nextLine();
        int PrincipalA = Integer.parseInt(Principal);

        System.out.println("Enter the rate of interest: ");
        String ROI = UserInput.nextLine();
        float ROIA = Float.parseFloat(ROI);
        float ROIB = ROIA/100;

        System.out.println("Enter the number of years: ");
        String NOY = UserInput.nextLine();
        int NOYA = Integer.parseInt(NOY);

        float SI = PrincipalA * (1 + ROIB*NOYA);
        float SIA = Math.round(SI);

        String Output = "After "+NOYA+" years at "+ROIA+"%, the investment will be worth $"+SIA;
        System.out.println(Output);
    }
}