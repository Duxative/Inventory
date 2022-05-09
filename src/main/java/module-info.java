module com.duxa.inventory {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.duxa.inventory to javafx.fxml;
    exports com.duxa.inventory;
}