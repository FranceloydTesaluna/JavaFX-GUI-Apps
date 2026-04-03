module com.example.foodorderingsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.foodorderingsystem to javafx.fxml;
    exports com.example.foodorderingsystem;
}