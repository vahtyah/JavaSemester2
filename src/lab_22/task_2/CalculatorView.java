package src.lab_22.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView{

    public static void calculator(double n, CalculatorModel calculatorModel) {
        if (calculatorModel.getOperator().equals("+")) {
            calculatorModel.setResult(calculatorModel.getResult() + n);
        } else if (calculatorModel.getOperator().equals("-")) {
            calculatorModel.setResult(calculatorModel.getResult() - n);
        } else if (calculatorModel.getOperator().equals("*")) {
            calculatorModel.setResult(calculatorModel.getResult() * n);
        } else if (calculatorModel.getOperator().equals("/")) {
            calculatorModel.setResult(calculatorModel.getResult() / n);
        } else if (calculatorModel.getOperator().equals("=")) {
            calculatorModel.setResult(n);
        }
        calculatorModel.setResult(Double.parseDouble(calculatorModel.getResult() + ""));
    }

}
