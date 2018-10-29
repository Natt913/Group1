package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HousekeepingController {
    @FXML
    Label hRRoomID;
    @FXML
    TextField towelAmount;
    @FXML
    TextField toiletPaperAmount;
    @FXML
    TextField shampooAmount;
    @FXML
    TextField conditionerAmount;
    @FXML
    TextField soapAmount;
    @FXML
    CheckBox makeBed;
    @FXML
    CheckBox changeSheets;
    @FXML
    CheckBox stockFridge;
    @FXML
    CheckBox cleanRoom;
    @FXML
    Button submitHousekeeping;
}
