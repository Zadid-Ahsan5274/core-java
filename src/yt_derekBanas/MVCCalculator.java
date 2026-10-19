package yt_derekBanas;

public class MVCCalculator {
    void main(){
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView,theModel);
        theView.setVisible(true);
    }
}
