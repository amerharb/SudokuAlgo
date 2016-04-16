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

    private SudokuValue[] possibleValues = new SudokuValue[9];
    private int pCounter = 0;

    public void addPosibility(SudokuValue v)
    {
        if (v != null) {
            //check if the value is not before
            for (int i = 0; i < pCounter; i++) {
                if (possibleValues[i] == v){
                    return; //cancel the adding if there value already there
                }
            }
            possibleValues[pCounter++] = v;
        }
    }

    public int getPosibility()
    {

        if (sureValue != null) {
            return 0;
        } else {
            int count = 0;
            for (SudokuValue v : possibleValues) {
                if (v != null) {
                    count++;
                }
            }
            return count;
        }
    }
}
