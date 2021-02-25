package viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Phonebook;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    private TextField nameTxtField;

    @FXML
    private TextField addressTxtField;

    @FXML
    private TextField phoneNumTxtField;

    @FXML
    private Label currentPage;

    private Phonebook pB = new Phonebook();


    @FXML
    private void nextPerson()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    @FXML
    private void prevPerson()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    @FXML
    private void addPerson()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    @FXML
    private void delPerson()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    @FXML
    private void saveChanges()
    {
        String name = nameTxtField.getText();
        String address = addressTxtField.getText();
        String telNum = phoneNumTxtField.getText();

        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    @FXML
    private void loadFromCSV(){pB.loadCSV();}

    @FXML
    private void saveToCSV(){pB.saveCSV();}


    //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################

    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}