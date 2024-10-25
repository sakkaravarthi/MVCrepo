package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TemperatureModel model = new TemperatureModel();
        TemperatureView view = new TemperatureView();
        TemperatureController controller = new TemperatureController(model, view);
        view.setVisible(true);

    }
}