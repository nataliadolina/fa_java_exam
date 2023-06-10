package com.example.exam_var_37;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private Label from;

    @FXML
    private TextField fromField;

    @FXML
    private Label result;

    @FXML
    private Button resultBtn;

    @FXML
    private TextArea resultField;

    @FXML
    private Label to;

    @FXML
    private TextField toField;

    @FXML
    void showResult(ActionEvent event) {
        List<String> result = new ArrayList<String>();
        Integer fromValue = Integer.valueOf(fromField.getText());
        Integer toValue = Integer.valueOf(toField.getText());

        int from = 10;
        if (fromValue > from){
            from = fromValue;
        }

        int to = 99;
        if (toValue < to){
            to = toValue;
        }
        for (int i = from; i <= to; i+=2){
            result.add(Integer.toString(i));
        }

        resultField.setText(String.join(" ", result));
    }

}