package br.com.kasolution.exercicio9;

import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> snakeParts;
    private Cell head;

    public Snake(Cell initialPosition) {
        snakeParts = new LinkedList<>();
        head = initialPosition;
        snakeParts.add(head);
    }

    public void move(Cell nextCell) {
        snakeParts.addFirst(nextCell);
        head = nextCell;
        snakeParts.removeLast();
    }

    public void grow() {
        snakeParts.addFirst(head);
    }

    public LinkedList<Cell> getSnakeParts() {
        return snakeParts;
    }

    public Cell getHead() {
        return head;
    }
}