/* Andrew Vaughn
 * Developed 5/7/18
 * Computer Science 2261
 * 
 * Objective: write a Java program that computes the future value of an investment, 
 * at a given interest rate for a specified number of years according to the formula: 
 * Future Value = Investment Amount * (1 + Monthly Interest Rate) Years * 12 
 */


//libraries
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Javafc extends Application {

//labels
Label initialI;
Label annualRate;
Label years;
Label finalValue;
Label finalT;

//text fields
TextField textInitialI;
TextField textAnnualRate;
TextField textYear;

public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {

//Header text and font
Label myLabel = new Label(" Financial Calculator");
myLabel.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 20));
myLabel.setPrefSize(250, 20); 

//Text for different variables
initialI = new Label("Investment Amount:"); 
annualRate = new Label("Annual Interest Rate:");
years=new Label("Number of Years:");
finalValue = new Label("Future Value:"); 
finalT = new Label(); 

//final value hide
finalValue.setVisible(false);
finalT.setVisible(false);

//Creating text fields for the user
textInitialI = new TextField(); 
textAnnualRate = new TextField();
textYear = new TextField(); 

//"Calculate button
Button btnCalculate = new Button("Calculate");

//Grid pane style 
btnCalculate.setOnAction(e -> calculate());
GridPane g = new GridPane();
g.setHgap(10);
g.setVgap(15);
g.add(initialI, 0, 0);
g.add(textInitialI, 1, 0);
g.add(annualRate, 0, 1);
g.add(textAnnualRate, 1, 1);
g.add(years, 0, 2);
g.add(textYear, 1, 2);
g.add(btnCalculate, 1, 3);
g.add(finalValue, 0, 4);
g.add(finalT, 1, 4);

//Flow pane style
FlowPane flowPane = new FlowPane();
flowPane.setVgap(20);
flowPane.setMargin(g, new Insets(0, 0, 0, 60));
flowPane.setMargin(myLabel, new Insets(0, 0, 0, 60)); 
flowPane.getChildren().addAll(myLabel, g);
Scene scene = new Scene(flowPane, 350, 400);
primaryStage.setTitle("Financial Calculator"); 
primaryStage.setScene(scene); 
primaryStage.show(); 
}

//User input variables
private void calculate() {
	
double initialI=Double.parseDouble(textInitialI.getText());
double annualRate=Double.parseDouble(textAnnualRate.getText());
int years=Integer.parseInt(textYear.getText());
double monthlyRate=annualRate/1200;
double finalFinancialFinalT=initialI*(Math.pow((1+monthlyRate),(years*12)));

//Final value show
finalValue.setVisible(true);
finalT.setText(String.format("%.2f",finalFinancialFinalT));
finalT.setVisible(true);

}

}
