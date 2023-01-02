module com.example.avengerroyale1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.avengerroyale1 to javafx.fxml;
    exports com.example.avengerroyale1;
}