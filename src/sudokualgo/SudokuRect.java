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
public class SudokuRect
{
    public SudokuCell[] sudokoCells = new SudokuCell[9];
    
    public SudokuRect(){
        for (int i = 0; i < 9; i++) {
            sudokoCells[i] = new SudokuCell();
        }
    }
}
