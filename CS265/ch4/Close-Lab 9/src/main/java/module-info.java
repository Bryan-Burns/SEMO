module com.example.closelab9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.closelab9 to javafx.fxml;
    exports com.example.closelab9;
}