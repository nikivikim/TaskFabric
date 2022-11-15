package com.example.demo1;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML TextField tfNumberOfSides;
    @FXML Canvas myCanvas;
    @FXML Label lblInfo;

    public boolean checkWithRegExp(String str){
        if(str != null) return true;
        else return false;
    }

    public void addPicker(){
        GraphicsContext gc = myCanvas.getGraphicsContext2D();

        if(checkWithRegExp(tfNumberOfSides.getText())==false || tfNumberOfSides.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 2!");
            alert.showAndWait();
        }else {
            int numberOfSides = Integer.parseInt(tfNumberOfSides.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shaped shape1 = shapeFactory.createShape(numberOfSides);
            gc.clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
            shape1.Draw(gc);
            lblInfo.setText(shape1.Discriptor());
        }
    }
}
