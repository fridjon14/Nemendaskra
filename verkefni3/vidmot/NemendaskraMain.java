package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.System;

public class NemendaskraMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Adal.fxml"));
        Parent root = loader.load();

        nyrGluggi(stage, root, "Nemendaskrá");

        System.out.println("test");
        //NemendaskraController c1 = new Nemendaskra();


        /**
         * Birtir nýja senu sem er í root í glugganum s með titlinum t
         * @param s glugginn
         * @param root senan (viðmótstréð)
         * @param t titill á glugganum
         */
    }
    public void nyrGluggi(Stage s, Parent root, String t){
        s.setTitle(t);
        Scene s1 = new Scene(root);
        s.setScene(s1);
        s.show();
    }
}
