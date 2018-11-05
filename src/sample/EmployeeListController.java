package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeListController implements Initializable {

    @FXML
    TableView<Table> employeeTable;
    @FXML
    TableColumn<Table, String> employeeName;
    @FXML
    TableColumn<Table, String> employeePosition;
    @FXML
    TableColumn<Table, Boolean> employeePresent;


    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    public void initialize(URL location, ResourceBundle resources) {

    }
}
