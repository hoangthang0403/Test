package com.mycompany.lab1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 2;
        boolean b = false;
        if (a>0)
            b = true;
        App.setRoot("secondary");
    }
}
