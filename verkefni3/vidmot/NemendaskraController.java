package vidmot;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import vidmot.gogn.Nemendaskra;
import vinnsla.Deild;
import vinnsla.Namsleid;
import vinnsla.Svid;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *Controller fyrir Nemendaskra
 *
 * @author Friðjón Sigvaldason frs5@hi.is
 */
public class NemendaskraController implements Initializable {

    public static final String NEMENDASKRA = "Nemskra.txt";
    public static final String SVID = "Svid.txt";
    public static final String DEILD = "Deild.txt";

    private Nemendaskra nemendaskra;


    public ComboBox<Svid> fxSvid;        // combobox fyrir svið

    public ComboBox<Deild> fxDeild;       // combobox fyrir deildir

    public ComboBox<Namsleid> fxNamsleid;    // combobox fyrir námsleiðir


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Svid svid = Svid.VON;
        Deild deild = Deild.IVT;
        Namsleid namsleid = Namsleid.HBV;

        System.out.println(svid.name());
        ObservableList<Deild> obsDeild = FXCollections.observableArrayList();

// setjum try catch utan um innlesturinn til að varna krassi ef skrá er ekki til
        try {
            Scanner inntak = new Scanner(getClass().getResourceAsStream(NEMENDASKRA));
            while (inntak.hasNext()) {
                // lesa inn streng og setja í Namsleid breytu
                Deild nyDeild = Deild.valueOf(inntak.next());  // getur kastað Exceptions
                obsDeild.add(nyDeild);
            }
        }
        // grípum IllegalArgumentException villu sem getur komið út úr valueOf aðferðinni lína 52 -
        catch (IllegalArgumentException e) {
            System.out.println("rangt gildi " + e.toString() + " á enum í " + DEILD);
            // Hættum - gætum líka gert eitthvað annað
            Platform.exit();
            System.exit(0);
        }
        // hægt að grípa fleiri exceptions - gæti komið null pointer við að búa til nýjan Scanner lína 49
        catch (NullPointerException e) {
            e.printStackTrace();    // prentum út rakninguna
        }


        fxDeild.setItems(obsDeild);
    }




}
