package org.example.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController
{

  @FXML private Button deleteButton;
  @FXML private TableView<Model> modelTableView ;
  @FXML private TableColumn<Model, String> column1;
  @FXML private TableColumn<Model, Integer> column2;

  private ObservableList<Model> students = FXCollections.observableArrayList();

  public void initialize(){
    column1.setCellValueFactory(new PropertyValueFactory<>("username"));
    column2.setCellValueFactory(new PropertyValueFactory<>("age"));

  modelTableView.setItems(students);
  }
  public void addStudent(String username, int age){
    students.add(new Model(username, age));
  }

  public void handleAddButton(ActionEvent event){

    try
    {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add-user.fxml"));
      Parent root = fxmlLoader.load();

      AddStudentController controller = fxmlLoader.getController();

      controller.addStudentController(this);


      Stage stage = new Stage();
      stage.setTitle("Add Student");
      stage.setScene(new Scene(root));


      stage.show();
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }

}
