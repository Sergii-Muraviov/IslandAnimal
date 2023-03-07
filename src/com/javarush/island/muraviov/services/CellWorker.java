package com.javarush.island.muraviov.services;

import com.javarush.island.muraviov.entity.location.Cell;

public class CellWorker implements Runnable {

    private final Cell cell;

    public CellWorker(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {
        cell.simulate();
    }
}
