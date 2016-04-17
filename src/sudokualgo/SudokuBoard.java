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
public class SudokuBoard
{

    public SudokuRect[] sudokoRects = new SudokuRect[9];

    public SudokuBoard()
    {
        for (int i = 0; i < 9; i++) {
            sudokoRects[i] = new SudokuRect();
        }
    }

    public SudokuCell[] getRow(SudokuCell cell)
    {
        //look for the cell in which row it is
        int re = 0, ce = 0;
        RECT_BLOCK:
        for (SudokuRect r : sudokoRects) {
            ce = 0;
            for (SudokuCell c : r.sudokoCell) {
                if (c == cell) {
                    break RECT_BLOCK;
                }
                ce++;
            }
            re++;
        }
        if (re > 8 || ce > 8) {//not found
            return null;
        } else {

            return getRow(getRowNumber(re, ce));
        }
    }

    public SudokuCell[] getRow(int rowNumber)
    {
        SudokuCell[] sc = new SudokuCell[9];

        switch (rowNumber) {
        case 0:
            sc[0] = sudokoRects[0].sudokoCell[0];
            sc[1] = sudokoRects[0].sudokoCell[1];
            sc[2] = sudokoRects[0].sudokoCell[2];
            sc[3] = sudokoRects[1].sudokoCell[0];
            sc[4] = sudokoRects[1].sudokoCell[1];
            sc[5] = sudokoRects[1].sudokoCell[2];
            sc[6] = sudokoRects[2].sudokoCell[0];
            sc[7] = sudokoRects[2].sudokoCell[1];
            sc[8] = sudokoRects[2].sudokoCell[2];
            break;
        case 1:
            sc[0] = sudokoRects[0].sudokoCell[3];
            sc[1] = sudokoRects[0].sudokoCell[4];
            sc[2] = sudokoRects[0].sudokoCell[5];
            sc[3] = sudokoRects[1].sudokoCell[3];
            sc[4] = sudokoRects[1].sudokoCell[4];
            sc[5] = sudokoRects[1].sudokoCell[5];
            sc[6] = sudokoRects[2].sudokoCell[3];
            sc[7] = sudokoRects[2].sudokoCell[4];
            sc[8] = sudokoRects[2].sudokoCell[5];
            break;
        case 2:
            sc[0] = sudokoRects[0].sudokoCell[6];
            sc[1] = sudokoRects[0].sudokoCell[7];
            sc[2] = sudokoRects[0].sudokoCell[8];
            sc[3] = sudokoRects[1].sudokoCell[6];
            sc[4] = sudokoRects[1].sudokoCell[7];
            sc[5] = sudokoRects[1].sudokoCell[8];
            sc[6] = sudokoRects[2].sudokoCell[6];
            sc[7] = sudokoRects[2].sudokoCell[7];
            sc[8] = sudokoRects[2].sudokoCell[8];
            break;
        case 3:
            sc[0] = sudokoRects[3].sudokoCell[0];
            sc[1] = sudokoRects[3].sudokoCell[1];
            sc[2] = sudokoRects[3].sudokoCell[2];
            sc[3] = sudokoRects[4].sudokoCell[0];
            sc[4] = sudokoRects[4].sudokoCell[1];
            sc[5] = sudokoRects[4].sudokoCell[2];
            sc[6] = sudokoRects[5].sudokoCell[0];
            sc[7] = sudokoRects[5].sudokoCell[1];
            sc[8] = sudokoRects[5].sudokoCell[2];
            break;
        case 4:
            sc[0] = sudokoRects[3].sudokoCell[3];
            sc[1] = sudokoRects[3].sudokoCell[4];
            sc[2] = sudokoRects[3].sudokoCell[5];
            sc[3] = sudokoRects[4].sudokoCell[3];
            sc[4] = sudokoRects[4].sudokoCell[4];
            sc[5] = sudokoRects[4].sudokoCell[5];
            sc[6] = sudokoRects[5].sudokoCell[3];
            sc[7] = sudokoRects[5].sudokoCell[4];
            sc[8] = sudokoRects[5].sudokoCell[5];
            break;
        case 5:
            sc[0] = sudokoRects[3].sudokoCell[6];
            sc[1] = sudokoRects[3].sudokoCell[7];
            sc[2] = sudokoRects[3].sudokoCell[8];
            sc[3] = sudokoRects[4].sudokoCell[6];
            sc[4] = sudokoRects[4].sudokoCell[7];
            sc[5] = sudokoRects[4].sudokoCell[8];
            sc[6] = sudokoRects[5].sudokoCell[6];
            sc[7] = sudokoRects[5].sudokoCell[7];
            sc[8] = sudokoRects[5].sudokoCell[8];
            break;
        case 6:
            sc[0] = sudokoRects[6].sudokoCell[0];
            sc[1] = sudokoRects[6].sudokoCell[1];
            sc[2] = sudokoRects[6].sudokoCell[2];
            sc[3] = sudokoRects[7].sudokoCell[0];
            sc[4] = sudokoRects[7].sudokoCell[1];
            sc[5] = sudokoRects[7].sudokoCell[2];
            sc[6] = sudokoRects[8].sudokoCell[0];
            sc[7] = sudokoRects[8].sudokoCell[1];
            sc[8] = sudokoRects[8].sudokoCell[2];
            break;
        case 7:
            sc[0] = sudokoRects[6].sudokoCell[3];
            sc[1] = sudokoRects[6].sudokoCell[4];
            sc[2] = sudokoRects[6].sudokoCell[5];
            sc[3] = sudokoRects[7].sudokoCell[3];
            sc[4] = sudokoRects[7].sudokoCell[4];
            sc[5] = sudokoRects[7].sudokoCell[5];
            sc[6] = sudokoRects[8].sudokoCell[3];
            sc[7] = sudokoRects[8].sudokoCell[4];
            sc[8] = sudokoRects[8].sudokoCell[5];
            break;
        case 8:
            sc[0] = sudokoRects[6].sudokoCell[6];
            sc[1] = sudokoRects[6].sudokoCell[7];
            sc[2] = sudokoRects[6].sudokoCell[8];
            sc[3] = sudokoRects[7].sudokoCell[6];
            sc[4] = sudokoRects[7].sudokoCell[7];
            sc[5] = sudokoRects[7].sudokoCell[8];
            sc[6] = sudokoRects[8].sudokoCell[6];
            sc[7] = sudokoRects[8].sudokoCell[7];
            sc[8] = sudokoRects[8].sudokoCell[8];
            break;
        }

        return sc;
    }

    void fillFromArray(int[] bord)
    {
        int i = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 3; y < 6; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 6; y < 9; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }

        for (int x = 3; x < 6; x++) {
            for (int y = 0; y < 3; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 3; y < 6; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 6; y < 9; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }

        for (int x = 6; x < 9; x++) {
            for (int y = 0; y < 3; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 3; y < 6; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 6; y < 9; y++) {
                sudokoRects[x].sudokoCell[y].sureValue = getSV(bord[i]);
                i++;
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

    public void findPosibilities()
    {
        ArrayList allValues = new ArrayList<SudokuValue>();
        allValues.add(SudokuValue.SV_1);
        allValues.add(SudokuValue.SV_2);
        allValues.add(SudokuValue.SV_3);
        allValues.add(SudokuValue.SV_4);
        allValues.add(SudokuValue.SV_5);
        allValues.add(SudokuValue.SV_6);
        allValues.add(SudokuValue.SV_7);
        allValues.add(SudokuValue.SV_8);
        allValues.add(SudokuValue.SV_9);

        for (SudokuRect rect : sudokoRects) {
            for (SudokuCell cell : rect.sudokoCell) {
                ArrayList temp = copyArrayList(allValues);
                if (cell.sureValue == null) {
                    //check other cell in same rect of this cell
                    for (SudokuCell c : rect.sudokoCell) {
                        if (c.sureValue != null) {
                            temp.remove(c.sureValue);
                        }
                    }

                    //check other cell in the same row
                    for (SudokuCell c : this.getRow(cell)) {

                    }

                }
            }
        }
    }

    private ArrayList copyArrayList(ArrayList source)
    {
        ArrayList target = new ArrayList();

        for (Object E : source) {
            target.add(E);
        }
        return target;
    }

    private int getRowNumber(int re, int ce)
    {
        if (re < 0 | re > 8 | ce < 0 | ce > 8) { // invalid input
            return -1;
        } else if (re < 3) { // the row then is 0,1,2
            if (ce < 3) {
                return 0;
            } else if (ce < 6) { 
                return 1;
            } else {
                return 2;
            }
        } else if (re < 6) { // the row then is 3,4,5
            if (ce < 3) {
                return 3;
            } else if (ce < 6) {
                return 4;
            } else {
                return 5;
            }
        } else { // the row then is 6,7,8
            if (ce < 3) {
                return 6;
            } else if (ce < 6) {
                return 7;
            } else {
                return 8;
            }
        }
    }

    private int getColNumber(int re, int ce)
    {
        if (re < 0 | re > 8 | ce < 0 | ce > 8) { // invalid input
            return -1;
        } else if (re % 3 == 0) { // the col then is 0,1,2
            if (ce % 3 == 0) {
                return 0;
            } else if (ce % 3 == 1) { 
                return 1;
            } else {
                return 2;
            }
        } else if (re % 3 == 1) { // the col then is 3,4,5
            if (ce % 3 == 0) {
                return 3;
            } else if (ce % 3 == 1) { 
                return 4;
            } else {
                return 5;
            }
        } else { // the col then is 6,7,8
            if (ce % 3 == 0) {
                return 6;
            } else if (ce % 3 == 1) { 
                return 7;
            } else {
                return 8;
            }

        }
    }

}
