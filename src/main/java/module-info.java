module com.bur1y.flyfree {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.bur1y.flyfree to javafx.fxml;
    exports com.bur1y.flyfree;
}