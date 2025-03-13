package br.com.kasolution.exercicio9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends JFrame {
    private Snake snake;
    private Board board;
    private GamePanel gamePanel;
    private Timer timer;
    private Direction direction;

    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public Game(int boardRows, int boardCols) {
        board = new Board(boardRows, boardCols);
        snake = new Snake(board.getCell(boardRows / 2, boardCols / 2));
        board.generateFood();
        direction = Direction.RIGHT;

        gamePanel = new GamePanel(board, snake);
        add(gamePanel);

        setTitle("Snake Game");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (direction != Direction.DOWN) direction = Direction.UP;
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != Direction.UP) direction = Direction.DOWN;
                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != Direction.RIGHT) direction = Direction.LEFT;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != Direction.LEFT) direction = Direction.RIGHT;
                        break;
                }
            }
        });

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
                gamePanel.repaint();
            }
        });
        timer.start();
    }

    public void update() {
        Cell nextCell = getNextCell(snake.getHead());
        if (nextCell == null || nextCell.getCellType() == CellType.SNAKE_NODE) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over");
            return;
        }

        if (nextCell.getCellType() == CellType.FOOD) {
            snake.grow();
            nextCell.setCellType(CellType.SNAKE_NODE);
            board.generateFood();
        } else {
            snake.move(nextCell);
            nextCell.setCellType(CellType.SNAKE_NODE);
        }
    }

    private Cell getNextCell(Cell currentHead) {
        int row = currentHead.getRow();
        int col = currentHead.getCol();

        switch (direction) {
            case UP:
                row--;
                break;
            case DOWN:
                row++;
                break;
            case LEFT:
                col--;
                break;
            case RIGHT:
                col++;
                break;
        }

        if (row < 0 || row >= board.getRows() || col < 0 || col >= board.getCols()) {
            return null;
        }

        return board.getCell(row, col);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game(20, 20);
            }
        });
    }
}
