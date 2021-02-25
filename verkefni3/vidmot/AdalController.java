package vidmot;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import vidmot.gogn.Nemendaskra;

import java.net.URL;
import java.util.ResourceBundle;

public class AdalController implements Initializable {

    private int virkurIndex=0;
    private AnchorPane nyrNemDialog;
    private Nemendaskra nemendaskra;

    @FXML
    private NyrNemandiDialogController nyrNemandiDialogController;
    @FXML
    private void NyrNemandiDialogHandler(ActionEvent event) {
        if (virkurIndex != -1)
            nyrNemandiDialogController.NyrNemandiDialogBirta();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nyrNemandiDialogController = new NyrNemandiDialogController();
       // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("NyrNemandiDialog.fxml"));
    }
}



/**
package vidmot;

        import vidmot.gogn.Kennsluskra;
        import vidmot.gogn.Namskeid;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.beans.value.ChangeListener;
        import javafx.beans.value.ObservableValue;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.ListView;
        import javafx.scene.control.MultipleSelectionModel;

/**
 * Sýnir hvernig notaður er klasinn
 * Námskeið í ListView.
 * @author Ebba Þóra Hvannberg ebba@hi.is
 *//**
public class AdalController implements Initializable {

    // Vinnsluhlutinn með gögnunum
    private Nemendaskra nemendaskra;
    private int virkurIndex=0;

    @FXML
    private ListView<Namskeid> listiNamskeid;

    @FXML
    private NamskeidDialogController namskeidDialogController;

    @FXML
    private void eydaNamskeidiHandler(ActionEvent event) {
        if (virkurIndex != -1)
            kennsluskra.eydaNamskeidi(virkurIndex);
    }

    @FXML
    private void skodaNamskeidHandler(ActionEvent event) {
        if (virkurIndex != -1)
            namskeidDialogController.namskeidDialogBirta(
                    kennsluskra.getNamskeid(virkurIndex));
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kennsluskra = new Kennsluskra();
        listiNamskeid.setItems(kennsluskra.getOllNamskeid());

        listiNamskeid.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Namskeid>() {
            @Override
            public void changed(ObservableValue<? extends Namskeid> observable,
                                Namskeid oldValue, Namskeid newValue) {
                // Indexinn í listanum.
                virkurIndex = listiNamskeid.getSelectionModel().getSelectedIndex();
            }
        });
    }
}
*/