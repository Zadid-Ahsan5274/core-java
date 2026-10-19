package yt_derekBanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent args0) {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumbers(firstNumber,secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch(NumberFormatException exp){
                theView.displayErrorMessage("You need to add 2 integers");
            }
        }
    }
}
