package com.btcag.bootcamp.week2;
import java.util.Scanner;

//rework this
public class ConnectFour {
    public static Scanner input = new Scanner(System.in);
    public static String[] players = getPlayers();
    public static String[] coins = getCoins();

    public static int turn = 1;
    public static int maxTurns = 42;

    public static char[][] board = new char[6][7];

    public static int column = 0;

    //-----------------------------------------------------------------------------Main------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("Willkommen zu Vier-Gewinnt " + players[0] + " und " + players[1] + "!");

        System.out.println(players[0] + " Hat die " + coins[0] + " Münzen.");

        while (turn <= maxTurns && !checkWin()) {
            game();
            turn++;
        }
        if (turn >= maxTurns && !checkWin()) {
            System.out.println("Unentschieden. Das Spielfeld ist voll.");
        }
    }

    //-------------------------------------------------------------------Namenseingabe------------------------------------------------------------------------------
    public static String[] getPlayers() {
        String[] players = new String[2];
        System.out.println("Bitte gib deinen gewünschten Benutzernamen ein, Spieler 1.");
        players[0] = input.nextLine();

        System.out.println("Bitte gib deinen gewünschten Benutzernamen ein, Spieler 2.");
        players[1] = input.nextLine();

        return players;
    }

    //---------------------------------------------------------------------Münzwahl----------------------------------------------------------------------------------------
    public static String[] getCoins() {
        String[] coins = new String[2];
        System.out.println("Wähle ein Zeichen als Münze, X oder O " + players[0]);
        coins[0] = input.nextLine();

        while (!coins[0].equals("X") && !coins[0].equals("O")) {
            System.out.println("Deine Münze muss X oder O sein.");
            System.out.println("Bitte gib erneut deine Wunschmünze ein");
            coins[0] = input.nextLine();
        }

        if (coins[0].equals("X")) {
            coins[1] = "O";
        } else {
            coins[1] = "X";
        }
        return coins;
    }

    //----------------------------------------------------------------------Game--------------------------------------------------------------------------------
    public static void game() {
        String winner = "";
        if (turn % 2 == 0) {
            System.out.println("In welche Spalte möchtest du deine Münze werfen, " + players[0] + "?");
        } else {
            System.out.println("In welche Spalte möchtest du deine Münze werfen, " + players[1] + "?");
        }
        column = input.nextInt();
        isValid();
        fallingDown();
        printBoard();
        if (checkWin()) {
            if (turn % 2 == 0) {
                winner = players[0];
            } else {
                winner = players[1];
            }
            System.out.println("AND THE WINNER ISSS " + winner.toUpperCase() + "!");
        }
    }

    //----------------------------------------------------------------Prüfen ob Zug gültig ist-----------------------------------------------------------------

    public static void isValid() {
        if (column > 7 || column < 1) {
            if (turn % 2 == 0) {
                System.out.println("Zug ungültig. Mach nochmal " + players[0] + ".");
            } else {
                System.out.println("Zug ungültig. Mach nochmal " + players[1] + ".");
            }
            column = input.nextInt();
            isValid();
        }
    }

    //--------------------------------------------------------------Münze nach unten fallen lassen---------------------------------------------------------------
    public static void fallingDown() {
        column--;
        for (int row = board.length - 1; row >= 0; row--) {
            if (board[row][column] != 'X' && board[row][column] != 'O') {
                if (turn % 2 == 0) {
                    board[row][column] = coins[0].charAt(0);
                } else {
                    board[row][column] = coins[1].charAt(0);
                }
                break;
            }
        }
    }

    //-----------------------------------------------------------------Prüfen auf Winner---------------------------------------------------------------------------
    public static boolean checkWin() {
        char[] coins = {'O', 'X'};
        for (char coin : coins) {
            //--------------------------------------------------------------------Horizontal------------------------------------------------------------------------------------------
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j < 4; j++) {
                    if (board[i][j] == coin && board[i][j + 1] == coin && board[i][j + 2] == coin && board[i][j + 3] == coin) {
                        return true;
                    }
                }
            }
            //-------------------------------------------------------------------Vertikal--------------------------------------------------------------------------------------------
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[j][i] == coin && board[j + 1][i] == coin && board[j + 2][i] == coin && board[j + 3][i] == coin) {
                        return true;
                    }
                }
            }
            //------------------------------------------------------------------Oben Links --> unten rechts-----------------------------------------------------------------------------
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == coin && board[i - 1][j + 1] == coin && board[i - 2][j + 2] == coin && board[i - 3][j + 3] == coin) {
                        return true;
                    }
                }
            }
            //-----------------------------------------------------------------Oben rechts --> unten links---------------------------------------------------------------------------------
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (board[i][j] == coin && board[i + 1][j + 1] == coin && board[i + 2][j + 2] == coin && board[i + 3][j + 3] == coin) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //--------------------------------------------------------------------------------Spielfeld--------------------------------------------------------------------------------
    public static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == 'O' || cell == 'X') {
                    System.out.print("[  " + cell + "   ]");
                } else {
                    System.out.print("[      ]");
                }
            }
            System.out.println();
        }
    }
}

