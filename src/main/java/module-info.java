module com.example.shippingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires xstream;


    opens com.example.shippingsystem to javafx.fxml;
    exports com.example.shippingsystem;
}