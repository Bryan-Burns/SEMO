module com.example.closelab8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.closelab8 to javafx.fxml;
    exports com.example.closelab8;
}