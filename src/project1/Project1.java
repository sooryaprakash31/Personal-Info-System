/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField; 
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Soorya Prakash
 */
public class Project1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text name1 = new Text("Name :");
        Text age1 = new Text("Age :");
        Text id1 = new Text("ID :");
        Text gender1 = new Text("Gender :");
        Text phone1 = new Text("Phone :");
        Text email1 = new Text("Email :");
        Text dept1 = new Text("Department :");
        Text salary1 = new Text("Salary :");
        Text experience1 = new Text("Experience :");
        Text addr1 = new Text("Address :");
        Text dob1 = new Text("Date of Birth :");
        
        TextField name = new TextField();
        TextField dob = new TextField();
        TextField age = new TextField();
        TextField id = new TextField();
        TextField dept = new TextField();
        TextField addr = new TextField();
        TextField phone = new TextField();
        TextField email = new TextField();
        TextField gender = new TextField();
        TextField salary = new TextField();
        TextField experience = new TextField();
        
        Button ok = new Button();
        Button cancel = new Button();
        
     //   StackPane root = new StackPane();
      //  root.getChildren().add(btn);
        VBox vb = new VBox();
        vb.setPadding(new Insets(20, 50, 50, 50));
        vb.setSpacing(60);
        
        GridPane g = new GridPane();
        g.setVgap(10.0);
        g.setHgap(5.0);
        vb.getChildren().add(g);
        g.add(name1,1,0);
        g.add(name,2,0);
        g.add(id1,1,1);
        g.add(id,2,1);
        g.add(dob1,1,2);
        g.add(dob,2,2);
        g.add(age1,1,3);
        g.add(age,2,3);
        g.add(gender1,1,4);
        g.add(gender,2,4);
        g.add(dept1,1,5);
        g.add(dept,2,5);
        g.add(addr1, 1,6);
        g.add(addr,2,6);
        g.add(phone1,1,7);
        g.add(phone,2,7);
        g.add(email1,1,8);
        g.add(email,2,8);
        g.add(salary1,1,9);
        g.add(salary,2,9);
        g.add(experience1,1,10);
        g.add(experience,2,10);
        
        
        ok.setText("Submit");
        cancel.setText("Cancel");
        
        HBox hb = new HBox();
        hb.setSpacing(10);
        hb.getChildren().add(ok);
        hb.getChildren().add(cancel);
        
        vb.getChildren().add(hb);
        
        Scene scene = new Scene(vb,500,600);
        
        primaryStage.setTitle("Personal Information System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
