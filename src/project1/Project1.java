

package project1;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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

//Personal information system to store the details of the employees
public class Project1 extends Application {
    
    //Database Connection
    //DBname:Employee
    public final Connection connection;
    public final Statement st;
    public Project1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        st = connection.createStatement();
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        //UI components
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
        
         //Stores all the input data to DB
         ok.setOnAction((javafx.event.ActionEvent event) -> {
             
             String name2,gender2,addr2,email2;
             int salary2,experience2,id2,age2;
             String dob2,dept2,phone2;
             String sql;
             name2 = name.getText();
             gender2 = gender.getText();
             addr2 = addr.getText();
             salary2 = Integer.parseInt(salary.getText());
             experience2 = Integer.parseInt(experience.getText());
             email2 = email.getText();
             id2 = Integer.parseInt(id.getText());
             age2 = Integer.parseInt(age.getText());
             dob2 = dob.getText();
             dept2 = dept.getText();
             phone2 = phone.getText();
            
             //SQL query statement
             sql = "INSERT INTO INFORMATION " + "VALUES ('" + name2 + "','" + id2 + "','" + dob2 + "','" + age2 + "','" + gender2 + "','" + dept2 + "','" + addr2 + "','" + phone2 + "','" + email2 + "','" + salary2 + "','" + experience2 + "');";
             try {
                 st.executeUpdate(sql);
             } catch (SQLException ex) {
                 Logger.getLogger(Project1.class.getName()).log(Level.SEVERE, null, ex);
             }
        });
        
         //closes the application
        cancel.setOnAction((javafx.event.ActionEvent event) -> {
           
            primaryStage.close();
        });
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

 }
