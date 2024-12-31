module com.bsanju.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bsanju.weatherapp to javafx.fxml;
    exports com.bsanju.weatherapp;
}