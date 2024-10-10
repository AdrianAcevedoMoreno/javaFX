/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 *
 * @author adrianacevedomoreno
 */
public class Ejercicio2 extends Application {
    private int intentos = 5;
    /*
    Hacer una GUI similar a esto (usando campos de texto y password, imagen y botón). 
    
    NO habrá que hacer el diseño exacto, solo que contenga estos elementos aunque no estén alineados. 
    
    Al pulsar el botón, si acertamos o si nos equivocamos más de 5 veces deberá informarlo de
    cualquier forma (Label, Alert o TextField).
    */
    public static void main(String[] args) {
        launch(args);
     }
    
    
      @Override
    public void start(Stage primaryStage) {
       // Image imagen = new Image("/Users/adrianacevedomoreno/Desktop/DAM/ DISEÑO DE INTERFACES/GESTOR RESERVA/x.png");
       // ImageView imageView = new ImageView(imagen);
        
        Label usernameTitle = new Label ("Username");
        TextField username = new TextField();
        
        Label passwordTitle = new Label ("Password");
        TextField password = new TextField();
        
        Button botoncillo = new Button ("Ok");
        VBox vbox = new VBox();
        
        vbox.getChildren().addAll(username,usernameTitle,password,passwordTitle,botoncillo);
        
        /*
        Hay que saber usuario y contraseña
        */
        String USER = "Adri";
        String CONTRA = "1234";
        
        /*Ahora habra que saber si lo que introduce el usuario con los valores que son coinciden*/
        botoncillo.setOnAction(evento -> {
           Alert alerta = new Alert(Alert.AlertType.INFORMATION);
           alerta.setTitle("ALERTA");
           
           //HAY QUE HACER UNA CONVERSIÓN DE LOS DATOS DEL LABEL PARA PODER USARLOS
          String usernameString = String.valueOf(username.getText());
          String passwordString = String.valueOf(password.getText());
          
          if(usernameString.equals(USER) && passwordString.equals(CONTRA)){
              alerta.setHeaderText("HA ACCEDIDO CORRECTAMENTE!!");
              alerta.setContentText("USTED HA ACCEDIDO CORRECTAMENTE");
              alerta.showAndWait();
          }else{
              intentos --;
              alerta.setHeaderText("USUARIO O CONTRASEÑA NO SON CORRECTOS");
              alerta.setContentText("ERROR AL ACCEDER, TE QUEDAN " +intentos+"/5");
              alerta.showAndWait();
          }
          
          
        });
         
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio2");
        primaryStage.show();
        

    }
}
