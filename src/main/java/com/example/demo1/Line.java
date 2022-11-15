package com.example.demo1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shaped {

    @Override
    public String Discriptor() {
        return "Изображен " + this.getClass().getSimpleName();
    }

    @Override
    public void Draw(GraphicsContext gr) {
        gr.setLineWidth(5);
        gr.setStroke(Color.BLUE);
        gr.strokeLine(50, 150, 150, 120);
    }
}