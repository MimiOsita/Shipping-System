module com.example.shippingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shippingsystem to javafx.fxml;
    exports com.example.shippingsystem;
}