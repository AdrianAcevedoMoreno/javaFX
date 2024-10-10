package Ejercicio3; //Modificar al package correcto

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;


/**
 * Plantilla JAVAFX
 * Autor: Adrián Acevedo Moreno
 * Curso y año:
 * Objetivo de esta clase:
 */
public class Ejercicio3 extends Application {

    /*
    Hacer una GUI donde aparezca un Label (conversión), un TexTield (cantidad), un desplegable
    (combobox o choicebox) donde aparezcan distintos tipos de moneda (dólares, libras, yens, etc) y un botón. 
    Al pulsar el botón deberá mostrar en el Label la cantidad convertida a la moneda escogida.
    */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        
        VBox vbox = new VBox();
        Label conversion = new Label ("Conversión");
        
        TextField cantidad = new TextField();
        
        ComboBox<String> seleccion = new ComboBox<>();               
        seleccion.getItems().addAll(
                "Dolar",
                "Euros",
                "Yenes",
                "Libras"
        
        );
        
        Button boton = new Button("Convertir");
        
    
        vbox.getChildren().addAll(conversion, cantidad,seleccion ,boton);
        
        boton.setOnAction(evento -> {
            //String cantidadString = String.valueOf(cantidad.getText());
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("ALERTA");
            
            //HAY QUE OBTENER EL VALOR DEL VBOX
            String moneda = seleccion.getValue();
            
            switch (moneda) {
                case "Dolar" ->                     {
                        Double cantidad2 = Double.parseDouble(cantidad.getText())*1.09;
                        alerta.setContentText(cantidad2 + " Dólares");
                        alerta.showAndWait();
                    }
                case "Euros" ->                     {
                        Double cantidad2 = Double.parseDouble(cantidad.getText())*1;
                        alerta.setContentText(cantidad2 + " Euros");
                        alerta.showAndWait();
                    }
                case "Yenes" ->                     {
                        Double cantidad2 = Double.parseDouble(cantidad.getText())*162.33;       
                        alerta.setContentText(cantidad2 + " Yenes");
                        alerta.showAndWait();
                    }
                case "Libras" ->                     {
                        Double cantidad2 = Double.parseDouble(cantidad.getText())*0.84;
                        alerta.setContentText(cantidad2 + " Libras");
                        alerta.showAndWait();
                    }
                default -> alerta.setContentText("ALGO NO HA FUNCIONADO COMO SE ESPERABA");
                
            }
        } 
        
        );
    
        
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio3");
        primaryStage.show();
        
    }

}
