package org.example.list;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddStudentController
{

  @FXML private TextField usernameInput;
  @FXML private TextField ageInput;

  private HelloController mainController;

  public void addStudentController(HelloController mainController){
    this.mainController = mainController;
  }


  public void confirmButton(){
    String username = usernameInput.getText();
    int age = Integer.parseInt(ageInput.getText());

    mainController.addStudent(username, age);
    usernameInput.getScene().getWindow().hide();

    System.out.println(username + " " + age);
  }
}
