package com.pnhp.quizapp;

import com.pnhp.utils.MyAlertSingleTon;
import com.pnhp.utils.themes.ThemesType;
import static com.pnhp.utils.themes.ThemesType.DARK;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemesType> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemesType.values()));
    }
    
    public void ManageQuestion(ActionEvent e){
        MyAlertSingleTon.getInstance().showMessage("[ManageQuestion] Coming soon... ");
    }
    
    public void Practice(ActionEvent e){
        MyAlertSingleTon.getInstance().showMessage("[ManageQuestion] Coming soon... ");
    }
    
    public void Exam(ActionEvent e){
        MyAlertSingleTon.getInstance().showMessage("[ManageQuestion] Coming soon... ");
    }

    public void changeTheme(ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
                throw new AssertionError();
        }
    }
}
