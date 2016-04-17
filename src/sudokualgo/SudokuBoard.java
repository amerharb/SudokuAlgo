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
    private SudokuCell[] unSureCellArray;
    
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
            for (SudokuCell c : r.sudokoCells) {
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
            sc[0] = sudokoRects[0].sudokoCells[0];
            sc[1] = sudokoRects[0].sudokoCells[1];
            sc[2] = sudokoRects[0].sudokoCells[2];
            sc[3] = sudokoRects[1].sudokoCells[0];
            sc[4] = sudokoRects[1].sudokoCells[1];
            sc[5] = sudokoRects[1].sudokoCells[2];
            sc[6] = sudokoRects[2].sudokoCells[0];
            sc[7] = sudokoRects[2].sudokoCells[1];
            sc[8] = sudokoRects[2].sudokoCells[2];
            break;
        case 1:
            sc[0] = sudokoRects[0].sudokoCells[3];
            sc[1] = sudokoRects[0].sudokoCells[4];
            sc[2] = sudokoRects[0].sudokoCells[5];
            sc[3] = sudokoRects[1].sudokoCells[3];
            sc[4] = sudokoRects[1].sudokoCells[4];
            sc[5] = sudokoRects[1].sudokoCells[5];
            sc[6] = sudokoRects[2].sudokoCells[3];
            sc[7] = sudokoRects[2].sudokoCells[4];
            sc[8] = sudokoRects[2].sudokoCells[5];
            break;
        case 2:
            sc[0] = sudokoRects[0].sudokoCells[6];
            sc[1] = sudokoRects[0].sudokoCells[7];
            sc[2] = sudokoRects[0].sudokoCells[8];
            sc[3] = sudokoRects[1].sudokoCells[6];
            sc[4] = sudokoRects[1].sudokoCells[7];
            sc[5] = sudokoRects[1].sudokoCells[8];
            sc[6] = sudokoRects[2].sudokoCells[6];
            sc[7] = sudokoRects[2].sudokoCells[7];
            sc[8] = sudokoRects[2].sudokoCells[8];
            break;
        case 3:
            sc[0] = sudokoRects[3].sudokoCells[0];
            sc[1] = sudokoRects[3].sudokoCells[1];
            sc[2] = sudokoRects[3].sudokoCells[2];
            sc[3] = sudokoRects[4].sudokoCells[0];
            sc[4] = sudokoRects[4].sudokoCells[1];
            sc[5] = sudokoRects[4].sudokoCells[2];
            sc[6] = sudokoRects[5].sudokoCells[0];
            sc[7] = sudokoRects[5].sudokoCells[1];
            sc[8] = sudokoRects[5].sudokoCells[2];
            break;
        case 4:
            sc[0] = sudokoRects[3].sudokoCells[3];
            sc[1] = sudokoRects[3].sudokoCells[4];
            sc[2] = sudokoRects[3].sudokoCells[5];
            sc[3] = sudokoRects[4].sudokoCells[3];
            sc[4] = sudokoRects[4].sudokoCells[4];
            sc[5] = sudokoRects[4].sudokoCells[5];
            sc[6] = sudokoRects[5].sudokoCells[3];
            sc[7] = sudokoRects[5].sudokoCells[4];
            sc[8] = sudokoRects[5].sudokoCells[5];
            break;
        case 5:
            sc[0] = sudokoRects[3].sudokoCells[6];
            sc[1] = sudokoRects[3].sudokoCells[7];
            sc[2] = sudokoRects[3].sudokoCells[8];
            sc[3] = sudokoRects[4].sudokoCells[6];
            sc[4] = sudokoRects[4].sudokoCells[7];
            sc[5] = sudokoRects[4].sudokoCells[8];
            sc[6] = sudokoRects[5].sudokoCells[6];
            sc[7] = sudokoRects[5].sudokoCells[7];
            sc[8] = sudokoRects[5].sudokoCells[8];
            break;
        case 6:
            sc[0] = sudokoRects[6].sudokoCells[0];
            sc[1] = sudokoRects[6].sudokoCells[1];
            sc[2] = sudokoRects[6].sudokoCells[2];
            sc[3] = sudokoRects[7].sudokoCells[0];
            sc[4] = sudokoRects[7].sudokoCells[1];
            sc[5] = sudokoRects[7].sudokoCells[2];
            sc[6] = sudokoRects[8].sudokoCells[0];
            sc[7] = sudokoRects[8].sudokoCells[1];
            sc[8] = sudokoRects[8].sudokoCells[2];
            break;
        case 7:
            sc[0] = sudokoRects[6].sudokoCells[3];
            sc[1] = sudokoRects[6].sudokoCells[4];
            sc[2] = sudokoRects[6].sudokoCells[5];
            sc[3] = sudokoRects[7].sudokoCells[3];
            sc[4] = sudokoRects[7].sudokoCells[4];
            sc[5] = sudokoRects[7].sudokoCells[5];
            sc[6] = sudokoRects[8].sudokoCells[3];
            sc[7] = sudokoRects[8].sudokoCells[4];
            sc[8] = sudokoRects[8].sudokoCells[5];
            break;
        case 8:
            sc[0] = sudokoRects[6].sudokoCells[6];
            sc[1] = sudokoRects[6].sudokoCells[7];
            sc[2] = sudokoRects[6].sudokoCells[8];
            sc[3] = sudokoRects[7].sudokoCells[6];
            sc[4] = sudokoRects[7].sudokoCells[7];
            sc[5] = sudokoRects[7].sudokoCells[8];
            sc[6] = sudokoRects[8].sudokoCells[6];
            sc[7] = sudokoRects[8].sudokoCells[7];
            sc[8] = sudokoRects[8].sudokoCells[8];
            break;
        }

        return sc;
    }

    public SudokuCell[] getCol(SudokuCell cell)
    {
        //look for the cell in which row it is
        int re = 0, ce = 0;
        RECT_BLOCK:
        for (SudokuRect r : sudokoRects) {
            ce = 0;
            for (SudokuCell c : r.sudokoCells) {
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

            return getCol(getColNumber(re, ce));
        }
    }

    public SudokuCell[] getCol(int colNumber)
    {
        SudokuCell[] sc = new SudokuCell[9];

        switch (colNumber) {
        case 0:
            sc[0] = sudokoRects[0].sudokoCells[0];
            sc[1] = sudokoRects[0].sudokoCells[3];
            sc[2] = sudokoRects[0].sudokoCells[6];
            sc[3] = sudokoRects[3].sudokoCells[0];
            sc[4] = sudokoRects[3].sudokoCells[3];
            sc[5] = sudokoRects[3].sudokoCells[6];
            sc[6] = sudokoRects[6].sudokoCells[0];
            sc[7] = sudokoRects[6].sudokoCells[3];
            sc[8] = sudokoRects[6].sudokoCells[6];
            break;
        case 1:
            sc[0] = sudokoRects[0].sudokoCells[1];
            sc[1] = sudokoRects[0].sudokoCells[4];
            sc[2] = sudokoRects[0].sudokoCells[7];
            sc[3] = sudokoRects[3].sudokoCells[1];
            sc[4] = sudokoRects[3].sudokoCells[4];
            sc[5] = sudokoRects[3].sudokoCells[7];
            sc[6] = sudokoRects[6].sudokoCells[1];
            sc[7] = sudokoRects[6].sudokoCells[4];
            sc[8] = sudokoRects[6].sudokoCells[7];
            break;
        case 2:
            sc[0] = sudokoRects[0].sudokoCells[2];
            sc[1] = sudokoRects[0].sudokoCells[5];
            sc[2] = sudokoRects[0].sudokoCells[8];
            sc[3] = sudokoRects[3].sudokoCells[2];
            sc[4] = sudokoRects[3].sudokoCells[5];
            sc[5] = sudokoRects[3].sudokoCells[8];
            sc[6] = sudokoRects[6].sudokoCells[2];
            sc[7] = sudokoRects[6].sudokoCells[5];
            sc[8] = sudokoRects[6].sudokoCells[8];
            break;
        case 3:
            sc[0] = sudokoRects[1].sudokoCells[0];
            sc[1] = sudokoRects[1].sudokoCells[3];
            sc[2] = sudokoRects[1].sudokoCells[6];
            sc[3] = sudokoRects[4].sudokoCells[0];
            sc[4] = sudokoRects[4].sudokoCells[3];
            sc[5] = sudokoRects[4].sudokoCells[6];
            sc[6] = sudokoRects[7].sudokoCells[0];
            sc[7] = sudokoRects[7].sudokoCells[3];
            sc[8] = sudokoRects[7].sudokoCells[6];
            break;
        case 4:
            sc[0] = sudokoRects[1].sudokoCells[1];
            sc[1] = sudokoRects[1].sudokoCells[4];
            sc[2] = sudokoRects[1].sudokoCells[7];
            sc[3] = sudokoRects[4].sudokoCells[1];
            sc[4] = sudokoRects[4].sudokoCells[4];
            sc[5] = sudokoRects[4].sudokoCells[7];
            sc[6] = sudokoRects[7].sudokoCells[1];
            sc[7] = sudokoRects[7].sudokoCells[4];
            sc[8] = sudokoRects[7].sudokoCells[7];
            break;
        case 5:
            sc[0] = sudokoRects[1].sudokoCells[2];
            sc[1] = sudokoRects[1].sudokoCells[5];
            sc[2] = sudokoRects[1].sudokoCells[8];
            sc[3] = sudokoRects[4].sudokoCells[2];
            sc[4] = sudokoRects[4].sudokoCells[5];
            sc[5] = sudokoRects[4].sudokoCells[8];
            sc[6] = sudokoRects[7].sudokoCells[2];
            sc[7] = sudokoRects[7].sudokoCells[5];
            sc[8] = sudokoRects[7].sudokoCells[8];
            break;
        case 6:
            sc[0] = sudokoRects[2].sudokoCells[0];
            sc[1] = sudokoRects[2].sudokoCells[3];
            sc[2] = sudokoRects[2].sudokoCells[6];
            sc[3] = sudokoRects[5].sudokoCells[0];
            sc[4] = sudokoRects[5].sudokoCells[3];
            sc[5] = sudokoRects[5].sudokoCells[6];
            sc[6] = sudokoRects[8].sudokoCells[0];
            sc[7] = sudokoRects[8].sudokoCells[3];
            sc[8] = sudokoRects[8].sudokoCells[6];
            break;
        case 7:
            sc[0] = sudokoRects[2].sudokoCells[1];
            sc[1] = sudokoRects[2].sudokoCells[4];
            sc[2] = sudokoRects[2].sudokoCells[7];
            sc[3] = sudokoRects[5].sudokoCells[1];
            sc[4] = sudokoRects[5].sudokoCells[4];
            sc[5] = sudokoRects[5].sudokoCells[7];
            sc[6] = sudokoRects[8].sudokoCells[1];
            sc[7] = sudokoRects[8].sudokoCells[4];
            sc[8] = sudokoRects[8].sudokoCells[7];
            break;
        case 8:
            sc[0] = sudokoRects[2].sudokoCells[2];
            sc[1] = sudokoRects[2].sudokoCells[5];
            sc[2] = sudokoRects[2].sudokoCells[8];
            sc[3] = sudokoRects[5].sudokoCells[2];
            sc[4] = sudokoRects[5].sudokoCells[5];
            sc[5] = sudokoRects[5].sudokoCells[8];
            sc[6] = sudokoRects[8].sudokoCells[2];
            sc[7] = sudokoRects[8].sudokoCells[5];
            sc[8] = sudokoRects[8].sudokoCells[8];
            break;
        }

        return sc;
    }

    public void clear()
    {
        for (SudokuRect r : sudokoRects) {
            r.clear();
        }

    }

    void fillFromArray(int[] bord)
    {
        clear();

        int i = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 3; y < 6; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 6; y < 9; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }

        for (int x = 3; x < 6; x++) {
            for (int y = 0; y < 3; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 3; y < 6; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 6; y < 9; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }

        for (int x = 6; x < 9; x++) {
            for (int y = 0; y < 3; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 3; y < 6; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
                i++;
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 6; y < 9; y++) {
                sudokoRects[x].sudokoCells[y].sureValue = getSV(bord[i]);
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

        findOnePosibilityCell();
        findUniquePosibilityCell();
        buildUnSureCellsArray();
    }

    private void findOnePosibilityCell()
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

        RECT_LOOP:
        for (SudokuRect rect : sudokoRects) {
            for (SudokuCell cell : rect.sudokoCells) {
                if (cell.sureValue == null) {
                    ArrayList<SudokuValue> temp = SudokuAlgo.copyArrayList(allValues);

                    //clear old possiblities to re calculate
                    //cell.clearPosibilities();

                    //check other cell in same rect of this cell and remove then sure value
                    for (SudokuCell c : rect.sudokoCells) {
                        if (c.sureValue != null) {
                            temp.remove(c.sureValue);
                        }
                    }

                    //check other cell in the same row and remove then sure value
                    for (SudokuCell c : this.getRow(cell)) {
                        if (c.sureValue != null) {
                            temp.remove(c.sureValue);
                        }
                    }

                    //check other cell in the same col and remove then sure value
                    for (SudokuCell c : this.getCol(cell)) {
                        if (c.sureValue != null) {
                            temp.remove(c.sureValue);
                        }
                    }

                    if (temp.size() < 1) {
                        System.out.println("ERROR: this is a non-solveable sudoku");
                    } else if (temp.size() == 1) {
                        cell.sureValue = temp.get(0);
                        //debug
                        print();
                        //run the findPosibility again
                        findOnePosibilityCell();
                        break RECT_LOOP;
                    } else {
                        for (SudokuValue v : temp) {
                            cell.addPosibility(v);
                        }
                    }
                }
            }
        }
    }

    private void print()
    {
        System.out.println("+---+---+---+");
        for (int j = 0; j < 9; j++) {
            SudokuCell[] row = this.getRow(j);
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

    private void findUniquePosibilityCell()
    {

        RECT_LOOP:
        for (SudokuRect rect : sudokoRects) {
            for (SudokuCell cell : rect.sudokoCells) {
                if (cell.sureValue == null) {
                    ArrayList<SudokuValue> temp;

                    //check other cell in same rect of this cell 
                    temp = cell.getPosibilitiesValueCopy();
                    for (SudokuCell c : rect.sudokoCells) {
                        if (c.sureValue == null && c != cell) {
                            for (SudokuValue v : c.getPosibilitiesValueCopy()) {
                                temp.remove(v);
                            }
                            if (temp.size() == 0) {
                                break;
                            }
                        }
                    }
                    if (temp.size() == 1) { //unique posibility in rect
                        cell.sureValue = temp.get(0);
                        //debug
                        print();

                        findOnePosibilityCell();
                        findUniquePosibilityCell();
                        break RECT_LOOP;
                    }

                    //check other cell in the same row 
                    temp = cell.getPosibilitiesValueCopy();
                    for (SudokuCell c : this.getRow(cell)) {
                        if (c.sureValue == null && c != cell) {
                            for (SudokuValue v : c.getPosibilitiesValueCopy()) {
                                temp.remove(v);
                            }
                            if (temp.size() == 0) {
                                break;
                            }
                        }
                    }
                    if (temp.size() == 1) { //unique posibility in row
                        cell.sureValue = temp.get(0);
                        //debug
                        print();
                        findOnePosibilityCell();
                        findUniquePosibilityCell();
                        break RECT_LOOP;
                    }

                    //check other cell in the same col and remove then sure value
                    temp = cell.getPosibilitiesValueCopy();
                    for (SudokuCell c : this.getCol(cell)) {
                        if (c.sureValue == null) {
                            for (SudokuValue v : c.getPosibilitiesValueCopy()) {
                                temp.remove(v);
                            }
                        }
                    }
                    if (temp.size() == 1) { //unique posibility in col
                        cell.sureValue = temp.get(0);
                        //debug
                        print();

                        findOnePosibilityCell();
                        findUniquePosibilityCell();
                        break RECT_LOOP;
                    }

                }
            }
        }
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

    private void buildUnSureCellsArray()
    {
        ArrayList<SudokuCell> list = new ArrayList<SudokuCell>();
        
        for (SudokuRect r : sudokoRects) {
            for (SudokuCell c : r.sudokoCells) {
                if (c.sureValue == null){
                    list.add(c);
                }
            }
        }
        
        //create array
        unSureCellArray = new SudokuCell[list.size()];
        int i = 0;
        for (SudokuCell c : list) {
            unSureCellArray[i] = c;
            i++;
        }
    }

    private void tryPosibilities(){
        for (int i = 0; i < unSureCellArray.length; i++) {
            SudokuCell c = unSureCellArray[i]; //just to make it easy to deal with
            //here we will asume that each cell has 2 posiblity or more it make sense as long as this proc run after findOnepos... proc
            c.trialValue();
            
            
        }
    }
}
