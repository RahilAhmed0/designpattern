package calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

public class Calculator {
    ScriptEngineManager mgr;
    ScriptEngine engine;

    Calculator() {
        mgr = new ScriptEngineManager();
        engine = mgr.getEngineByName("JavaScript");
    }

    double add(double... values) {
        return Arrays.stream(values).sum();
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double multiply(double... values) {
        return Arrays.stream(values).reduce(1, (a, b) -> a * b);
    }

    Object expressionEval(String s) {
        try {
            return engine.eval(s);
        } catch (ScriptException e) {
            return "Wrong Expression";
        }
    }

}
