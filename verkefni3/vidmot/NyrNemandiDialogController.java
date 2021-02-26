package vidmot;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class NyrNemandiDialogController implements Initializable {



    @FXML
    private DialogPane dpNyrNemandiDialogPane;
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

    try {
        //fxNyrNemDialog = nyrNemandiDialogContro
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("NyrNemandiDialog.fxml"));
        dpNyrNemandiDialogPane = fxmlLoader.load();
        //Parent parent = fxmlLoader.load();
        NyrNemandiDialogController nyrNemandiController = fxmlLoader.getController();
        //NemendaskraController.setNemandi(nemandi);
        //nyrNemandiController.setVisible(true);

        //dpNyrNemandiDialogPane.setContent(dpNyrNemandiDialogPane);

        Dialog<ButtonType> d = new Dialog();
        d.setDialogPane(dpNyrNemandiDialogPane);
        d.showAndWait();

    } catch (IOException e) {
        e.printStackTrace();
    }
        // Hnapparnir Í lagi og hætta við búnir til og bætt við
       /*
        ButtonType iLagi = new ButtonType("Í lagi",
                ButtonBar.ButtonData.OK_DONE);
        apNyrNemDialog.getDialogPane().getButtonTypes().add(iLagi);

        ButtonType haettaVid = new ButtonType("Hætta við",
                ButtonBar.ButtonData.CANCEL_CLOSE);
        nyrNemPane.getDialogPane().getButtonTypes().add(haettaVid);
*/
/*
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("vidmot/NyrNemandiDialog.fxml"));
            Stage stage = (Stage) nyrNemDialog.getScene().getWindow();
            Parent root = fxmlLoader.load();

            //stage.setScene(scene);

            //nemendaskraMain.nyrGluggi(stage, root, "OK");

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
