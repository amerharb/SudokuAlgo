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
public class SudokuCell
{

    public SudokuValue sureValue = null;

    public SudokuValue[] possibleValues = new SudokuValue[9];

    public int getPosibility()
    {

        if (sureValue != null) {
            return 0;
        } else {
            int count = 0;
            for (SudokuValue v: possibleValues) {
                if (v != null) {
                    count++;
                }
            }
            return count;
        }
    }
}
