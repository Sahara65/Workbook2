package com.pluralsight;

public class Donut {
    String donutName;
    String donutDescription;
    double donutPrice;
    int calories;

    public Donut(String donutName, String donutDescription, double donutPrice, int calories) {
        this.donutName = donutName;
        this.donutDescription = donutDescription;
        this.donutPrice = donutPrice;
        this.calories = calories;
    }
    String boldStringDonut = "\033[40m \u001B[33m \033[1m Donut: \033[0m \u001B[33m";
    String boldStringDescription = "\u001B[34m \033[1m Description: \u001B[34m \033[0m";
    String boldStringPrice = "\u001B[36m \033[1m Price: \033[0m \u001B[36m";
    String boldStringCalories = "\u001B[31m \033[1m Calories: \033[0m \u001B[31m";
    @Override
    public String toString() {
        return boldStringDonut  + donutName + "\n" + boldStringDescription + donutDescription + "\n" + boldStringCalories + calories + boldStringPrice + donutPrice;
    }
}
