package com.btcag.bootcamp.week2;

import java.util.Scanner;

// rework this

public class Hanoi {
    //---------------------------------------------------------------------Klassenweite Variablen und Arrays------------------------------------------------------------------------
    public class hanoi {
        public static Scanner input = new Scanner(System.in);
        public static int[] towerOne = {4, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        public static int[] towerTwo = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        public static int[] towerThree = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        public static int moveStart = 0;
        public static int moveDest = 0;

        //----------------------------------------------------------------------------------Main----------------------------------------------------------------------------------------
        public static void main(String[] args) {
            while (!isSolved()) {
                printTowers();
                input();
                moveDisc();
            }
            System.out.println("Gelöst :)");
            printTowers();
        }

        //------------------------------------------------------------------------------Win Condition----------------------------------------------------------------------------------------
        public static boolean isSolved() {
            return towerThree[0] == 4 && towerThree[1] == 3 && towerThree[2] == 2 && towerThree[3] == 1;
        }

        //------------------------------------------------------------------------------Print Towers----------------------------------------------------------------------------------------
        public static void printTowers() {
            System.out.println("Turm 1: " + java.util.Arrays.toString(towerOne) + "\n" +
                    "Turm 2: " + java.util.Arrays.toString(towerTwo) + "\n" +
                    "Turm 3: " + java.util.Arrays.toString(towerThree));
        }

        //-------------------------------------------------------------------------------- Eingabe----------------------------------------------------------------------------------------

        public static void input() {
            System.out.println("Von welchem Turm willst du die Scheibe nehmen?");
            moveStart = input.nextInt();

            System.out.println("Auf welchen Turm willst du sie legen?");
            moveDest = input.nextInt();
        }

        //--------------------------------------------------------------------------------Move Valid?----------------------------------------------------------------------------------------
        public static boolean invalidMove() {
            if (moveStart < 1 || moveStart > 3 || moveDest < 0 || moveDest > 3 || moveStart == moveDest) {
                System.out.println("Der gewählte Zug ist nicht auf dem Spielfeld. Bitte nochmal");
                input();
                invalidMove();
                return true;
            }

            if ((moveStart == 1 && moveDest == 2 && findTopDiscT1() > findTopDiscT2() && findTopDiscT2() > 0)
                    || (moveStart == 1 && moveDest == 3 && findTopDiscT1() > findTopDiscT3() && findTopDiscT3() > 0)
                    || (moveStart == 2 && moveDest == 1 && findTopDiscT2() > findTopDiscT1() && findTopDiscT1() > 0)
                    || (moveStart == 2 && moveDest == 3 && findTopDiscT2() > findTopDiscT3() && findTopDiscT3() > 0)
                    || (moveStart == 3 && moveDest == 1 && findTopDiscT3() > findTopDiscT1() && findTopDiscT1() > 0)
                    || (moveStart == 3 && moveDest == 2 && findTopDiscT3() > findTopDiscT2() && findTopDiscT2() > 0)) {

                System.out.println("Du kannst keine größere Scheibe auf eine kleinere legen. Mach nochmal.");
                input();
                invalidMove();
                return true;
            }
            return false;
        }

        //-------------------------------------------------------------------------------Find top Discs----------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------Tower One----------------------------------------------------------------------------------------
        public static int findTopDiscT1() {
            int topDiscT1 = 0;

            for (int i = towerOne.length - 1; i >= 0; i--) {
                if (towerOne[i] > 0) {
                    topDiscT1 = towerOne[i];
                    return topDiscT1;
                }
            }
            return -1;
        }

        //---------------------------------------------------------------------------------Tower Two----------------------------------------------------------------------------------------
        public static int findTopDiscT2() {
            int topDiscT2 = 0;

            for (int i = towerTwo.length - 1; i >= 0; i--) {
                if (towerTwo[i] > 0) {
                    topDiscT2 = towerTwo[i];
                    return topDiscT2;
                }
            }
            return -1;
        }

        //--------------------------------------------------------------------------------Tower Three----------------------------------------------------------------------------------------
        public static int findTopDiscT3() {
            int topDiscT3 = 0;

            for (int i = towerThree.length - 1; i >= 0; i--) {
                if (towerThree[i] > 0) {
                    topDiscT3 = towerThree[i];
                    return topDiscT3;
                }
            }
            return -1;
        }

        //--------------------------------------------------------------------------------Move Disc----------------------------------------------------------------------------------------
        public static void moveDisc() {
            if (invalidMove()) {
                return;
            }

            int temp = 0;

            if (moveStart == 1 && moveDest == 2) {
                for (int i = towerOne.length - 1; i >= 0; i--) {
                    if (towerOne[i] != 0) {  // Oberste Scheibe von Turm 1
                        for (int j = 0; j < towerTwo.length - 1; j++) {
                            if (towerTwo[j] == 0) {  // Platz in Turm 2 finden
                                towerTwo[j] = towerOne[i];
                                towerOne[i] = 0;
                                return;
                            }
                        }
                    }
                }
            } else if (moveStart == 1 && moveDest == 3) {
                for (int i = towerOne.length - 1; i >= 0; i--) {
                    if (towerOne[i] != 0) {  // Oberste Scheibe von Turm 1 finden
                        for (int j = 0; j < towerThree.length - 1; j++) {
                            if (towerThree[j] == 0) {  // Platz in Turm 3 finden
                                towerThree[j] = towerOne[i];
                                towerOne[i] = 0;
                                return;
                            }
                        }
                    }
                }

            } else if (moveStart == 2 && moveDest == 1) {
                for (int i = towerTwo.length - 1; i >= 0; i--) {
                    if (towerTwo[i] != 0) {  // Oberste Scheibe von Turm 2 finden
                        for (int j = 0; j < towerOne.length - 1; j++) {
                            if (towerOne[j] == 0) {  // Platz in Turm 1 finden
                                towerOne[j] = towerTwo[i];
                                towerTwo[i] = 0;
                                return;
                            }
                        }
                    }
                }

            } else if (moveStart == 2 && moveDest == 3) {
                for (int i = towerTwo.length - 1; i >= 0; i--) {
                    if (towerTwo[i] != 0) {  // Oberste Scheibe von Turm 2 finden
                        for (int j = 0; j < towerThree.length - 1; j++) {
                            if (towerThree[j] == 0) {  // Platz in Turm 3 finden
                                towerThree[j] = towerTwo[i];
                                towerTwo[i] = 0;
                                return;
                            }
                        }
                    }
                }

            } else if (moveStart == 3 && moveDest == 1) {
                for (int i = towerThree.length - 1; i >= 0; i--) {
                    if (towerThree[i] != 0) {  // Oberste Scheibe von Turm 3 finden
                        for (int j = 0; j < towerOne.length - 1; j++) {
                            if (towerOne[j] == 0) {  // Platz in Turm 1 finden
                                towerOne[j] = towerThree[i];
                                towerThree[i] = 0;
                                return;
                            }
                        }
                    }
                }

            } else if (moveStart == 3 && moveDest == 2) {
                for (int i = towerThree.length - 1; i >= 0; i--) {
                    if (towerThree[i] != 0) {  // Oberste Scheibe von Turm 3 finden
                        for (int j = 0; j < towerTwo.length - 1; j++) {
                            if (towerTwo[j] == 0) {  // Platz in Turm 2 finden
                                towerTwo[j] = towerThree[i];
                                towerThree[i] = 0;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
