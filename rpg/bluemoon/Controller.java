package rpg.bluemoon;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    Sheet sheet = new Sheet();
    Sheet sheet1 = new Sheet();

    //For your character
    public TextField tfName;

    public TextField tfStr;
    public TextField tfDex;
    public TextField tfEnd;
    public TextField tfVit;

    public TextField tfWil;
    public TextField tfInt;
    public TextField tfWis;
    public TextField tfIns;

    public TextField tfCha;
    public TextField tfDom;
    public TextField tfLea;
    public TextField tfFai;

    //For enemy field
    public TextField tfName1;

    public TextField tfStr1;
    public TextField tfDex1;
    public TextField tfEnd1;
    public TextField tfVit1;

    public TextField tfWil1;
    public TextField tfInt1;
    public TextField tfWis1;
    public TextField tfIns1;

    public TextField tfCha1;
    public TextField tfDom1;
    public TextField tfLea1;
    public TextField tfFai1;

    //battle field
    public Label lbChar;
    public Label lbEnem;
    public TextArea taResult;

    public void btClicked(ActionEvent actionEvent){
        sheet.name = tfName.getText();
        lbChar.setText(tfName.getText());

        sheet.strength = Integer.parseInt(tfStr.getText());
        sheet.dexterity = Integer.parseInt(tfDex.getText());
        sheet.endurance = Integer.parseInt(tfEnd.getText());
        sheet.vitality = Integer.parseInt(tfVit.getText());

        sheet.willpower = Integer.parseInt(tfWil.getText());
        sheet.inteligence = Integer.parseInt(tfInt.getText());
        sheet.wisdom = Integer.parseInt(tfWis.getText());
        sheet.insight = Integer.parseInt(tfIns.getText());

        sheet.charm = Integer.parseInt(tfCha.getText());
        sheet.dominion = Integer.parseInt(tfDom.getText());
        sheet.leadership = Integer.parseInt(tfLea.getText());
        sheet.faith = Integer.parseInt(tfFai.getText());
    }

    public void btClicked1(ActionEvent actionEvent){
        sheet1.name = tfName.getText();
        lbEnem.setText(tfName1.getText());

        sheet1.strength = Integer.parseInt(tfStr.getText());
        sheet1.dexterity = Integer.parseInt(tfDex.getText());
        sheet1.endurance = Integer.parseInt(tfEnd.getText());
        sheet1.vitality = Integer.parseInt(tfVit.getText());

        sheet1.willpower = Integer.parseInt(tfWil.getText());
        sheet1.inteligence = Integer.parseInt(tfInt.getText());
        sheet1.wisdom = Integer.parseInt(tfWis.getText());
        sheet1.insight = Integer.parseInt(tfIns.getText());

        sheet1.charm = Integer.parseInt(tfCha.getText());
        sheet1.dominion = Integer.parseInt(tfDom.getText());
        sheet1.leadership = Integer.parseInt(tfLea.getText());
        sheet1.faith = Integer.parseInt(tfFai.getText());
    }

    public void result(ActionEvent actionEvent){

    }

}
