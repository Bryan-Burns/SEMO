module com.example.examstuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examstuff to javafx.fxml;
    exports com.example.examstuff;
}