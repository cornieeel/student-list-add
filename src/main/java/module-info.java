module org.example.list {
  requires javafx.controls;
  requires javafx.fxml;

  opens org.example.list to javafx.fxml;
  exports org.example.list;
}