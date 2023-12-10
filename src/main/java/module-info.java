module com.sam.sami {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;
    requires java.desktop;


    opens com.sam.main to javafx.fxml;
    exports com.sam.main;
    exports controllers.Nomina.Empleados;
    opens controllers.Nomina.Empleados to javafx.fxml;
    exports controllers.Nomina.Inicio;
    opens controllers.Nomina.Inicio to javafx.fxml;
    exports controllers.PaisesCiudades;
    opens controllers.PaisesCiudades to javafx.fxml;
    exports controllers.Contabilidad;
    opens controllers.Contabilidad to javafx.fxml;
    opens modelo.Nomina to javafx.base;
    exports controllers.Login;
    opens controllers.Login to javafx.fxml;
    exports consultas.entidad;
    opens consultas.entidad to javafx.fxml;
    exports controllers.Nomina.Otros;
    opens controllers.Nomina.Otros;


}