/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokualgo;

/**
 *
 * @author Amer
 */
public class SudokuAlgo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new SudokuAlgo();
    }

    public SudokuAlgo()
    {
        CommandReader r = new CommandReader();
        r.start();
        int[] bord = new int[81];
        SudokuBoard sb;

        while (true) {
            if (r.hasCommand) {
                String command = r.getCommand();
                if (command.startsWith("fill")) {
                    String numbers = command.substring(5);
                    for (int i = 0; i < numbers.length(); i++) {
                        String nu = numbers.substring(i, i + 1);
                        int n;
                        try {
                            n = Integer.parseInt(nu);
                        } catch (Exception e) {
                            n = 0;
                        }
                        bord[i] = n;

                    }

                    //fill from array to the object
                    sb = new SudokuBoard();
                    int i = 0;
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }
                    for (int x = 0; x < 3; x++) {
                        for (int y = 3; y < 6; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }
                    for (int x = 0; x < 3; x++) {
                        for (int y = 6; y < 9; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }

                    for (int x = 3; x < 6; x++) {
                        for (int y = 0; y < 3; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }
                    for (int x = 3; x < 6; x++) {
                        for (int y = 3; y < 6; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }
                    for (int x = 3; x < 6; x++) {
                        for (int y = 6; y < 9; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }

                    for (int x = 6; x < 9; x++) {
                        for (int y = 0; y < 3; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }
                    for (int x = 6; x < 9; x++) {
                        for (int y = 3; y < 6; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }
                    for (int x = 6; x < 9; x++) {
                        for (int y = 6; y < 9; y++) {
                            sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                            i++;
                        }
                    }

                    //wrong code
                    /*
                     for (int x = 0; x < 9; x++) {
                     for (int y = 0; y < 9; y++) {
                     if (bord[i] == 0) {
                     sb.sudokoRects[x].sudokoCell[y].sureValue = null;
                     } else {
                     sb.sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                     }
                     i++;
                     }
                     }
                     */
                    //print what has been filled
                    for (int j = 0; j < 9; j++) {
                        SudokuCell[] row = sb.getRow(j);
                        //print row
                        System.out.println("");
                        System.out.print(" | ");
                        for (SudokuCell c : row) {
                            System.out.print(c.getSureValue() + " | ");
                        }
                    }
                } else if (command.startsWith("solve")) {

                }
            }
        }
    }

    private SudokuValue getSV(int v)
    {
        switch (v) {
        case 1:
            return SudokuValue.SV_1;
        case 2:
            return SudokuValue.SV_2;
        case 3:
            return SudokuValue.SV_3;
        case 4:
            return SudokuValue.SV_4;
        case 5:
            return SudokuValue.SV_5;
        case 6:
            return SudokuValue.SV_6;
        case 7:
            return SudokuValue.SV_7;
        case 8:
            return SudokuValue.SV_8;
        case 9:
            return SudokuValue.SV_9;
        default:
            return null;
        }
    }
}
