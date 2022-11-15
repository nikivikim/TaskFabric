package com.example.demo1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rect extends Shaped {
    @Override
    public void Draw(GraphicsContext gc) {
        gc.setFill(Color.SKYBLUE);
        gc.strokeRect(10, 50, 200, 100);
        gc.setFill(Color.GOLD);
        gc.fillRect(10, 50, 200, 100);
    }

    @Override
    public String Discriptor() {
        return "Изображен " + this.getClass().getSimpleName();
    }
}