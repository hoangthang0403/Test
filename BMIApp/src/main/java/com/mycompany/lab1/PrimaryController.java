package com.mycompany.lab1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = -2;
        boolean c;
        if (a<0)
            c = true;
        App.setRoot("secondary");
    }
}
