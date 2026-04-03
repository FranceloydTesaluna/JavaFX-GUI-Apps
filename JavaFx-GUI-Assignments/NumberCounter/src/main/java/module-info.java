module com.example.numbercounter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.numbercounter to javafx.fxml;
    exports com.example.numbercounter;
}