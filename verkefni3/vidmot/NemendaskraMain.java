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
        Parent root = FXMLLoader.load(getClass().getResource("Adal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //nyrGluggi(stage, root, "Nemendaskrá");

        System.out.println("test");
        //NemendaskraController c1 = new Nemendaskra();
    }
    public static void main(String[] args) {
        launch(args);
    }

}

        /**
         * Birtir nýja senu sem er í root í glugganum s með titlinum t
         * @param s glugginn
         * @param root senan (viðmótstréð)
         * @param t titill á glugganum
         */
    /*
    public void nyrGluggi(Stage s, Parent root, String t){
        s.setTitle(t);
        Scene s1 = new Scene(root);
        s.setScene(s1);
        s.show();
    }*/

