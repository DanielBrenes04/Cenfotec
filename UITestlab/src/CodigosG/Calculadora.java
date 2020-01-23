/*
Ultima Fech:27 de diciembre del 2019
Autor:Yo
 */
package CodigosG;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Calculadora extends Application {
    
    //Se definen los botonoes/campos de texto
    TextField tfNum1;
    TextField tfNum2;
    Button btnDivide;
    Button btnMultiply;
    Button btnAddition;
    Button btnSubtraction;
    Button btnClear;
    Label lblAnswer;
    //Se asignan variable a cada pieza de la calculadora
    @Override
    public void start(Stage primaryStage) {
        
        tfNum1 = new TextField();
        tfNum2 = new TextField();
        btnDivide = new Button("/");
        btnMultiply = new Button("*");
        btnAddition = new Button("+");
        btnSubtraction = new Button("-");
        btnClear = new Button("Limpiar resultado");
        lblAnswer = new Label("Su resultado se muestra aqui");
        //Colocacion y modificacion de atributos del texto de respuesta
        lblAnswer.setAlignment(Pos.CENTER);
        lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
        //Codigo del panel
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        //Se le asignan ubicaciones a los botones
        root.setHgap(10);
        root.setVgap(10);
        
        root.add(btnDivide, 0, 0);
        root.add(btnMultiply, 1, 0);
        root.add(btnAddition, 0, 1);
        root.add(btnSubtraction, 1, 1);
        root.add(btnClear, 0, 4, 2, 1);
        
        root.add(tfNum1, 0, 2);
        root.add(tfNum2, 1, 2);
        root.add(lblAnswer, 0, 3, 2, 1);
        //Se le asignan las pocisiones de los botones
        setWidths();
        attachCode();
        //Ajustes de la ventana
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("CalculadoraFX 1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//Se asignan dimesnsiones de los botones
    private void setWidths() {
        tfNum1.setPrefWidth(320);
        tfNum2.setPrefWidth(320);
        btnDivide.setPrefWidth(320);
        btnMultiply.setPrefWidth(320);
        btnAddition.setPrefWidth(320);
        btnSubtraction.setPrefWidth(320);
        btnClear.setPrefWidth(680);
        lblAnswer.setPrefWidth(680);
    }
//Se dean las funciones de sumar,restar,multiplicar y dividir a los botones
    public void attachCode() {
        //have each button run BTNCODE when clicked
        btnAddition.setOnAction(e -> btncode(e));
        btnSubtraction.setOnAction(e -> btncode(e));
        btnMultiply.setOnAction(e -> btncode(e));
        btnDivide.setOnAction(e -> btncode(e));
        btnClear.setOnAction(e -> btncode(e));
    }

    public void btncode(ActionEvent e) {
        int num1, num2, answer;
        char symbol;
        //Determina cual operacion fue escogida
        if (e.getSource() == btnClear) {
            tfNum1.setText("");
            tfNum2.setText("");
            lblAnswer.setText("?");
            tfNum1.requestFocus();
            return;
        }
        //recupera de los numeros en los campos de texto
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        if (e.getSource() == btnAddition) {
            symbol = '+';
            answer = num1 + num2;
        } else if (e.getSource() == btnSubtraction) {
            symbol = '-';
            answer = num1 - num2;
        } else if (e.getSource() == btnMultiply) {
            symbol = 'x';
            answer = num1 * num2;
        } else {
            symbol = '/';
            answer = num1 / num2;
        }
        //Muestra la respuesta
        lblAnswer.setText("" + num1 + ""+ symbol + "" + num2 + "=" + answer);
    }
    //Main que inicia el programa
    public static void main(String[] args) {
        launch(args);
    }
}
