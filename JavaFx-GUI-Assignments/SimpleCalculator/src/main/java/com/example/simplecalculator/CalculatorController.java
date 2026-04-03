package com.example.simplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CalculatorController {

    @FXML
    private TextField tfNumber1;

    @FXML
    private TextField tfNumber2;

    @FXML
    private ComboBox<String> cbOperations;

    @FXML
    private Label lblResult;

    @FXML
    public void initialize() {
        cbOperations.getItems().addAll("+", "-", "*", "/");
        cbOperations.setValue("+");
    }

    @FXML
    private void handleCompute() {
        try {
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());
            String op = cbOperations.getValue();

            double result = 0;

            switch (op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            lblResult.setText(result == (long) result ? String.format("%d", (long) result) : String.valueOf(result));

        } catch (Exception e) {
            lblResult.setText("Error");
        }
    }
}
