package com.example.foodorderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FoodController {
    @FXML
    private CheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    @FXML
    private  RadioButton rbNone, rb5, rb10, rb15;
    @FXML
    private  Button btnOrder;

    @FXML
    public void initialize() {

        cPizza.setId("cPizza");
        cBurger.setId("cBurger");
        cFries.setId("cFries");
        cSoftDrinks.setId("cSoftDrinks");
        cTea.setId("cTea");
        cSundae.setId("cSundae");

        rbNone.setId("rbNone");
        rb5.setId("rb5");
        rb10.setId("rb10");
        rb15.setId("rb15");

        btnOrder.setId("btnOrder");
    }

    @FXML
    private void handleOrder() {

        double total = 0;

        if (cPizza.isSelected()) total += 100;
        if (cBurger.isSelected()) total += 80;
        if (cFries.isSelected()) total += 65;
        if (cSoftDrinks.isSelected()) total += 55;
        if (cTea.isSelected()) total += 50;
        if (cSundae.isSelected()) total += 40;

        double discount = 0;

        if (rb5.isSelected()) discount =  0.05;
        else if (rb10.isSelected()) discount = 0.10;
        else if (rb15.isSelected()) discount = 0.15;

        double finalTotal = total - (total * discount);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Total");

        alert.setContentText(String.format("The total price is Php %.2f", finalTotal));
        alert.showAndWait();
    }
}
