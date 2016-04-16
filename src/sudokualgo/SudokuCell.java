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

    public SudokuValue sureValue;

    public SudokuValue[] possibleValue = {null, null, null, null, null, null, null, null, null};

    public int getPosibility()
    {

        if (sureValue != null) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < 9; i++) {
                if (possibleValue[i] != null) {
                    count++;
                }
            }
            return count;
        }
    }

}
