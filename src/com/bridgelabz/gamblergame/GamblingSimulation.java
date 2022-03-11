package com.bridgelabz.gamblergame;

public class GamblingSimulation {

    public static final int STARTING_DAILY_STAKE = 100;
    public static final int BET = 1;

    //method to check win or loss
    private static int checkWin() {
        return (int) Math.floor(Math.random() * 10) % 2;
    }

    //method for checking resign
    private static int checkResign(int startingStake, int endDayAmount) {
        //initialising control variable
        double winResignAmt = 1.5 * startingStake;
        double lossResignAmt = 0.5 * startingStake;
        if (endDayAmount >= winResignAmt || endDayAmount <= lossResignAmt)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        int endDayAmount = STARTING_DAILY_STAKE;

        if (checkWin() == 1)
            endDayAmount += BET;
        else
            endDayAmount -= BET;

        System.out.println("Welcome to Gambler Simulator Program");
        System.out.println("Starting Daily Stake : "+ STARTING_DAILY_STAKE);
        System.out.println("Starting Daily Stake : "+ BET);
        System.out.println("End of the day amount : "+ endDayAmount);

    }
}
