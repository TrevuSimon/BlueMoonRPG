package rpg.bluemoon;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField tfStr;

    public void btClicked(ActionEvent actionEvent){
        tfStr.setText("Eita!");
    }
}
