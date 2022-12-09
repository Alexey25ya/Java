package Calc;

import Calc.Controllers.UserController;
import Calc.Model.Calc;
import Calc.Model.CalcImpl;
import Calc.Model.LogManager;
import Calc.Views.ViewCalc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        UserController userController = new UserController(calc);
        LogManager logManager = new LogManager("Calc/Log.log");
        ViewCalc viewCalc = new ViewCalc(userController, logManager);
        viewCalc.run();
    }
}
