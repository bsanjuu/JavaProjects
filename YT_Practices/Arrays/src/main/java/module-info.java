module in.bsanju.arrays {
    requires javafx.controls;
    requires javafx.fxml;


    opens in.bsanju.arrays to javafx.fxml;
    exports in.bsanju.arrays;
}