package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GuestServicesController {

    //Maintenance Request Screen Ids
    @FXML
    Label mRRoomID;
    @FXML
    Button submitMaintenanceReqButton;
    @FXML
    MenuButton maintenanceCategories;
    @FXML
    MenuItem lightingCategory;
    @FXML
    MenuItem plumbingCategory;
    @FXML
    MenuItem tvCategory;
    @FXML
    MenuItem wifiCategory;
    @FXML
    TextField maintenanceRequest;


    //Food Services Request Screen
    @FXML
    Label fSRoomID;
    @FXML
    TextField zucchiniApp;
    @FXML
    TextField calamariApp;
    @FXML
    TextField capreseApp;
    @FXML
    Label zucchiniPrice;
    @FXML
    Label calamariPrice;
    @FXML
    Label capresePrice;
    @FXML
    TextField parmChicken;
    @FXML
    TextField shrimpScampi;
    @FXML
    TextField beefTenderloin;
    @FXML
    TextField mushroomRisotto;
    @FXML
    Label chickenPrice;
    @FXML
    Label shrimpPrice;
    @FXML
    Label beefPrice;
    @FXML
    Label mushroomPrice;
    @FXML
    TextField mixedVeggies;
    @FXML
    TextField mashedPotatoes;
    @FXML
    TextField cSalad;
    @FXML
    Label veggiePrice;
    @FXML
    Label potatoPrice;
    @FXML
    Label saladPrice;
    @FXML
    TextField tiramisu;
    @FXML
    TextField pannaCotta;
    @FXML
    TextField zeppole;
    @FXML
    Label tiramisuPrice;
    @FXML
    Label pannaCottaPrice;
    @FXML
    Label zeppolePrice;
    @FXML
    Button submitFood;
    @FXML
    TextArea foodTotal;

    //
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
