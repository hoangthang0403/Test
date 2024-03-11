module com.mycompany.lab1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab1 to javafx.fxml;
    exports com.mycompany.lab1;
}
