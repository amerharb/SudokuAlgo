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
        int[] bord = new int[49];

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
                }
            }
        }
    }
}
