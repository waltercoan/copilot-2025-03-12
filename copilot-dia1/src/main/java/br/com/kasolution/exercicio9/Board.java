package br.com.kasolution.exercicio9;

import java.util.Random;

public class Board {
    private int rows;
    private int cols;
    private Cell[][] cells;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public void generateFood() {
        Random random = new Random();
        int row = random.nextInt(rows);
        int col = random.nextInt(cols);
        cells[row][col].setCellType(CellType.FOOD);
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}