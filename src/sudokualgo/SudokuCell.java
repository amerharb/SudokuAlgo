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
public class SudokuCell
{

    public SudokuValue sureValue = null;

    private ArrayList<SudokuValue> possibleValues = new ArrayList<>();
    private int pCounter = 0;

    public void addPosibility(SudokuValue v)
    {
        if (v != null) {
            //check if the value is not before
            for (SudokuValue pv : possibleValues) {
                if (pv == v){
                    return; //cancel the adding if there value already there
                }
            }
            possibleValues.add(v);
        }
    }

    public int getPosibilitiesCount()
    {

        if (sureValue != null) {
            return 0;
        } else {
            return possibleValues.size();
            /*
            int count = 0;
            for (SudokuValue v : possibleValues) {
                if (v != null) {
                    count++;
                }
            }
            return count;*/
        }
    }

    public String getSureValue()
    {
        try {
            switch (sureValue) {
            case SV_1:
                return "1";
            case SV_2:
                return "2";
            case SV_3:
                return "3";
            case SV_4:
                return "4";
            case SV_5:
                return "5";
            case SV_6:
                return "6";
            case SV_7:
                return "7";
            case SV_8:
                return "8";
            case SV_9:
                return "9";
            default :
                return " ";
            }
        } catch (Exception e) {
            return " ";
        }
    }

    ArrayList<SudokuValue> getPosibilitiesValueCopy()
    {
        return SudokuAlgo.copyArrayList(possibleValues);
    }

    void clear()
    {
        sureValue = null;
        possibleValues.clear();
    }
}
