package com.example.pocok;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML private ImageView ivKep;
    @FXML private Pane pnJatek;
    @FXML private Button btStop;

    private Label[][] lt = new Label[6][6];
    private Image kep = new Image(getClass().getResourceAsStream("pocok0.png"));

    public void initialize(){
        for(int s=0; s<6; s++) for(int o=0; o<6; o++){
            lt[s][o] = new Label("");
            lt[s][o].setGraphic(new ImageView(kep));
            lt[s][o].setLayoutX(10+o*128);
            lt[s][o].setLayoutY(10+s*128);
            pnJatek.getChildren().add(lt[s][o]);
        }
    }

}