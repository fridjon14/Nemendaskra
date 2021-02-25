package vidmot;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import vidmot.gogn.Nemendaskra;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NyrNemandiDialogController implements Initializable {

    @FXML
    private AnchorPane nyrNemDialog;
    @FXML
    private TextField fxNafn;
    @FXML
    private TextField fxNetfang;
    @FXML
    private ComboBox fxSvid;
    @FXML
    private ComboBox fxDeild;
    @FXML
    private ComboBox fxNamsleid;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /**
     * birtir dialog til að
     * stofna nýjan nemanda.
     */
    public void NyrNemandiDialogBirta() {
        DialogPane p = new DialogPane();
        nyrNemDialog.setVisible(true);

        /*
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXML/NyrNemandiDialog.fxml"));
            Stage stage = (Stage) nyrNemDialog.getScene().getWindow();
            Parent root = fxmlLoader.load();
            nemendaskraMain.nyrGluggi(stage, root, "OK");

            nyrNemDialog  = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    /*    // Innihald dialogs búið
        Dialog<String> dialog = new Dialog<String>
        DialogPane p = new DialogPane();
        nyrNemDialog.setVisible(true);
        this.stage = stage;
        stage.setScene(new Scene(dialogPane));
*/
    }
}
