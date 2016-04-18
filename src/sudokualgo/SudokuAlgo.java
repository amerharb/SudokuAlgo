/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokualgo;

import java.util.ArrayList;

/**
 *
 * @author Amer
 */
public class SudokuAlgo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Good Morning!");
        SudokuAlgo sudokuAlgo = new SudokuAlgo();
        System.out.println("Good bye!");
        System.exit(0);
    }

    public static ArrayList copyArrayList(ArrayList source)
    {
        ArrayList target = new ArrayList();

        for (Object E : source) {
            target.add(E);
        }
        return target;
    }

    public SudokuAlgo() throws InterruptedException
    {
        CommandReader r = new CommandReader();
        r.start();
        int[] bord = new int[81];
        SudokuBoard sb = new SudokuBoard();

        while (true) {
            Thread.yield();
            if (r.hasCommand) {
                String command = r.getCommand();
                if (command.isEmpty()) {
                    continue;
                }
                if (command.startsWith("exit")) {
                    break; //exit system
                } else if (command.startsWith("echo ")) {
                    System.out.println(command.substring(5));
                } else if (command.startsWith("fill ")) {
                    String numbers = command.substring(5);
                    for (int i = 0; i < numbers.length() && i < 81; i++) {
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
                    sb.fillFromArray(bord);

                } else if (command.startsWith("clear")) {
                    sb.clear();
                } else if (command.startsWith("print")) {
                    //print what has been filled
                    if (sb != null) {
                        System.out.println("+---+---+---+");
                        for (int j = 0; j < 9; j++) {
                            SudokuCell[] row = sb.getRow(j);
                            //print row
                            System.out.print("|");
                            for (int i = 0; i < 9; i++) {
                                System.out.print(row[i].getSureValue());
                                if (i % 3 == 2) {
                                    System.out.print("|");
                                }
                            }
                            System.out.println("");
                            if (j % 3 == 2) {
                                System.out.println("+---+---+---+");
                            }
                        }
                        System.out.println("");
                    }
                } else if (command.startsWith("solve")) {
                    //sb.findPosibilities();
                    sb.solve();
                }
            }
        }
    }

}
