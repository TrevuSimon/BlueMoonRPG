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
        sheet.setName(tfName.getText());
        lbChar.setText(tfName.getText());

        sheet.setStrength(Integer.parseInt(tfStr.getText()));
        sheet.setDexterity(Integer.parseInt(tfDex.getText()));
        sheet.setEndurance(Integer.parseInt(tfEnd.getText()));
        sheet.setVitality(Integer.parseInt(tfVit.getText()));

        sheet.setWillpower(Integer.parseInt(tfWil.getText()));
        sheet.setInteligence(Integer.parseInt(tfInt.getText()));
        sheet.setWisdom(Integer.parseInt(tfWis.getText()));
        sheet.setInsight(Integer.parseInt(tfIns.getText()));

        sheet.setCharm(Integer.parseInt(tfCha.getText()));
        sheet.setDominion(Integer.parseInt(tfDom.getText()));
        sheet.setLeadership(Integer.parseInt(tfLea.getText()));
        sheet.setFaith(Integer.parseInt(tfFai.getText()));
    }

    public void btClicked1(ActionEvent actionEvent){
        sheet1.setName(tfName1.getText());
        lbChar.setText(tfName1.getText());

        sheet1.setStrength(Integer.parseInt(tfStr1.getText()));
        sheet1.setDexterity(Integer.parseInt(tfDex1.getText()));
        sheet1.setEndurance(Integer.parseInt(tfEnd1.getText()));
        sheet1.setVitality(Integer.parseInt(tfVit1.getText()));

        sheet1.setWillpower(Integer.parseInt(tfWil1.getText()));
        sheet1.setInteligence(Integer.parseInt(tfInt1.getText()));
        sheet1.setWisdom(Integer.parseInt(tfWis1.getText()));
        sheet1.setInsight(Integer.parseInt(tfIns1.getText()));

        sheet1.setCharm(Integer.parseInt(tfCha1.getText()));
        sheet1.setDominion(Integer.parseInt(tfDom1.getText()));
        sheet1.setLeadership(Integer.parseInt(tfLea1.getText()));
        sheet1.setFaith(Integer.parseInt(tfFai1.getText()));
    }

    public void result(ActionEvent actionEvent){

    }

}
