/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecturalpatern.controller;

import architecturalpatern.models.Message;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author gemme
 */

public class MainController implements Initializable {
@FXML
private TextField headerTf;
@FXML
private TextField bodyTf;
@FXML
private Pane pane1;
@FXML
private Pane pane2;
@FXML
private Pane pane3;
@FXML 
private Text t1,t2,t3;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void send(){
        
        
    String header=headerTf.getText();
    String body=bodyTf.getText();
    Message message= new Message(body, header);
    Broker broker = new Broker();
    broker.send(message);
    }

    private  class Broker {

        public Broker() {
        }
         private  void send(Message message) {
       if(message.getHeader().equalsIgnoreCase("1")){
        pane1.setStyle("-fx-background-color: lightblue;");
        pane2.setStyle("-fx-background-color:  #f4f1f1;");
        pane3.setStyle("-fx-background-color:  #f4f1f1;");
        t1.setText(message.getBody());
        t2.setText("");
        t3.setText("");
        
    }
      if(message.getHeader().equalsIgnoreCase("2")){
        pane1.setStyle("-fx-background-color: #f4f1f1;");
        pane2.setStyle("-fx-background-color:  lightblue;");
        pane3.setStyle("-fx-background-color:  #f4f1f1;");
         t1.setText("");
        t2.setText(message.getBody());
        t3.setText("");
        
    }
    if(message.getHeader().equalsIgnoreCase("3")){
        pane1.setStyle("-fx-background-color: #f4f1f1;");
        pane2.setStyle("-fx-background-color:  #f4f1f1;");
        pane3.setStyle("-fx-background-color:  lightblue;");
         t1.setText("");
        t2.setText("");
        t3.setText(message.getBody());
        
    }
        }
    }
}
