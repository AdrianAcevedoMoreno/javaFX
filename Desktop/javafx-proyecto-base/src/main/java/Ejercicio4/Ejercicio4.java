package Ejercicio4; //Modificar al package correcto

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Plantilla JAVAFX
 * Autor: Adrián Acevedo Moreno
 * Curso y año:
 * Objetivo de esta clase:
 */
public class Ejercicio4 extends Application {

    
    /*
    Repetir el ejercicio anterior pero en vez de utilizar un desplegable para elegir moneda, utilizar
    RadioButtons dependientes de un grupo (para que al pulsar uno se desactiven los otros).
    */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField cantidad = new TextField();
        
        VBox vbox = new VBox();
        //vamos a crear los radio butto
        RadioButton Euros = new RadioButton("Euros");
        RadioButton Dolares = new RadioButton("Dolares");
        RadioButton Yenes = new RadioButton("Yenes");
        RadioButton Libras = new RadioButton("libras");
        
        
        ToggleGroup group = new ToggleGroup();
        
        Euros.setToggleGroup(group);
        Dolares.setToggleGroup(group);
        Yenes.setToggleGroup(group);
        Libras.setToggleGroup(group);
        
        Button boton = new Button("convertir");
        
        vbox.getChildren().addAll(cantidad,Euros,Dolares,Yenes,Libras,boton );
        
        boton.setOnAction(event -> {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("ALERTA");
            
            
            String cantidadString = cantidad.getText();
            
            
            if (Euros.isSelected()){
                Double cantidad2 = Double.parseDouble(cantidadString)*1;
                alerta.setContentText(cantidad2 + " Euros");
                alerta.showAndWait();
            }else if(Dolares.isSelected()){
                Double cantidad2 = Double.parseDouble(cantidadString)*1.09;
                alerta.setContentText(cantidad2 + " Dolares");
                alerta.showAndWait();
            }else if(Yenes.isSelected()){
                Double cantidad2 = Double.parseDouble(cantidadString)*162.33;
                alerta.setContentText(cantidad2 + " Yenes");
                alerta.showAndWait();
            }else if(Libras.isSelected()){
                Double cantidad2 = Double.parseDouble(cantidadString)*0.8;
                alerta.setContentText(cantidad2 + " Libras");
                alerta.showAndWait();
            }else{
                alerta.setContentText("ALGO NO HA FUNCIONADO COMO SE ESPERABA");
                alerta.showAndWait();
            }
                 
        }
        
        );
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio4");
        primaryStage.show();
        
        
    }

}
