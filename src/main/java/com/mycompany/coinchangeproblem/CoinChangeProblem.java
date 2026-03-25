/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coinchangeproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChangeProblem {

    // Maximum allowed sum
    private static final int MAX_SUM = 10000;

    // DP function to count number of ways
    public static int countWays(int[] coins, int S) {
        int[] dp = new int[S + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= S; j++) {
                dp[j] += dp[j - coin];
            }
        }

        return dp[S];
    }

    // Recursive function to print all combinations (for small S only)
    public static void findCombinations(int[] coins, int S) {
        List<Integer> combination = new ArrayList<>();
        findCombinationsHelper(coins, S, 0, combination);
    }

    private static void findCombinationsHelper(int[] coins, int remaining, int start, List<Integer> combination) {
        if (remaining == 0) {
            System.out.println(combination);
            return;
        }

        for (int i = start; i < coins.length; i++) {
            int coin = coins[i];
            if (coin <= remaining) {
                combination.add(coin);
                findCombinationsHelper(coins, remaining - coin, i, combination);
                combination.remove(combination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for total sum
        int S;
        while (true) {
            System.out.print("Enter the total amount (S, max " + MAX_SUM + "): ");
            S = scanner.nextInt();
            if (S > 0 && S <= MAX_SUM) break;
            System.out.println("Please enter a number between 1 and " + MAX_SUM + ".");
        }

        // Ask user for number of denominations
        System.out.print("Enter the number of coin types: ");
        int n = scanner.nextInt();

        int[] coins = new int[n];
        System.out.println("Enter the coin denominations separated by spaces:");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        // Count and print number of ways
        int ways = countWays(coins, S);
        System.out.println("\nNumber of ways to make " + S + " is: " + ways);

        // Print all combinations only if S is reasonably small
        if (S <= 30) { // limit for readable output
            System.out.println("\nAll possible combinations to make " + S + ":");
            findCombinations(coins, S);
        } else {
            System.out.println("\nS is large; skipping printing all combinations to avoid huge output.");
        }

        scanner.close();
    }
}