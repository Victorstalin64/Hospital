module org.example.hospital {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.hospital to javafx.fxml;
    exports org.example.hospital;
}