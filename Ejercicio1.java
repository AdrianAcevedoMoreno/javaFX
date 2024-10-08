/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;


import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author adrianacevedomoreno
 */
public class Ejercicio1 extends Application{
    
    
    /*
    Hacer una GUI donde aparezcan dos TextField (precio y %descuento) y un botón. 
    Al pulsar el botón deberá aparecer un mensaje (Alert) indicando el descuento que se aplica y el precio final.
    */
    
     public static void main(String[] args) {
        launch(args);
     }
     
       @Override
    public void start(Stage primaryStage) {
        //Se compone la interfaz
        Label etiquetaPrecio = new Label ("Precio en euros");
        TextField precio = new TextField();
        Label etiquetaDescuento = new Label ("Descuento ");
        TextField descuento = new TextField();
        Button boton = new Button ("Calcular");
        VBox vbox = new VBox();
        
        vbox.getChildren().addAll(precio,etiquetaPrecio,descuento,etiquetaDescuento,boton);
        
        //Aquí no se validan los campos
        boton.setOnAction(evento -> {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Info");
            
            //Hay que hacer conversiones
            Float precioFloat = Float.valueOf(precio.getText());
            Float descuentoFloat = Float.valueOf(descuento.getText());
            
            Float desc = precioFloat * (descuentoFloat/100);
            Float resta = precioFloat-desc;
            
            alerta.setHeaderText("Descuento aplicado. Precio final: "+precio.getText());
            alerta.setContentText("Descuento "+desc.toString()+" Precio final: "+resta.toString());
            alerta.show();
            
            
        });
        
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio 1");
        primaryStage.show();
        
           
          };
          
           
           
           
    }
    
    
    
    
    
    

