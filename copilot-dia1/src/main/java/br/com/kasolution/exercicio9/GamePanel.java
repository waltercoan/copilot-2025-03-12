package br.com.kasolution.exercicio9;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Board board;
    private Snake snake;

    public GamePanel(Board board, Snake snake) {
        this.board = board;
        this.snake = snake;
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        drawSnake(g);
    }

    private void drawBoard(Graphics g) {
        for (int row = 0; row < board.getRows(); row++) {
            for (int col = 0; col < board.getCols(); col++) {
                Cell cell = board.getCell(row, col);
                if (cell.getCellType() == CellType.FOOD) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(col * 20, row * 20, 20, 20);
                g.setColor(Color.BLACK);
                g.drawRect(col * 20, row * 20, 20, 20);
            }
        }
    }

    private void drawSnake(Graphics g) {
        g.setColor(Color.GREEN);
        for (Cell cell : snake.getSnakeParts()) {
            g.fillRect(cell.getCol() * 20, cell.getRow() * 20, 20, 20);
        }
    }
}