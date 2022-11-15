package com.example.demo1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

    public class SecRect extends Shaped {
        @Override
        public void Draw(GraphicsContext gc) {
            gc.setFill(Color.RED);
            gc.fillRect(100, 50, 150, 120);
        }

        @Override
        public String Discriptor() {
            return "Изображен " + this.getClass().getSimpleName();
        }
}