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
public class SudokuBoard
{

    public SudokuRect[] sudokoRects = new SudokuRect[9];

    public SudokuBoard()
    {
        for (int i = 0; i < 9; i++) {
            sudokoRects[i] = new SudokuRect();
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

}
