package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        double donutPrice = 0.0;
        //
        Donut vanillaGlazed = new Donut("Vanilla Glazed", "Freshly baked and freshly glazed vanilla donut!", 1.75, 290);
        Donut chocolateGlazed = new Donut("Chocolate Glazed", "A donut glazed with chocolate-ty goodness!", 2.49, 250);
        Donut blueberry = new Donut("Blueberry", "A wonderful, blueberry donut.", 2.59, 300);
        Donut strawberryGlazed = new Donut("Strawberry Glazed", "Fresh strawberry glazed donut!", 2.59, 260);
        Donut bostonCream = new Donut("Boston Cream", "Custardy, cream filled donut. Yum!", 2.69, 300);
        Donut powdered = new Donut("Powdered", "Powdery goodness!", 2.69, 270);
        Donut glazed = new Donut("Glazed", "A beautifully, sugary, glazed donut", 2.49, 190);
        Donut cider = new Donut("Cider", "Made with the finest apples of Ithaca, NY!", 2.65, 290);
        Donut jelly = new Donut("Jelly", "A jelly filled donut!", 2.69, 300);
        Donut oldFashioned = new Donut("Old Fashioned", "A pure donut. No frosting, no fillings. Just donut!", 2.59, 290);


        Donut[] donutsMenu = {vanillaGlazed, chocolateGlazed, blueberry, strawberryGlazed, bostonCream, powdered, glazed, cider, jelly, oldFashioned};
        // Utilized ANSI Escape Codes to change font colors, bolden and italicize text
        System.out.println("\033[40m\033[1m Here's a menu our best and freshly baked donuts:\033[1m\033[40m");
        for (Donut d : donutsMenu) {
            System.out.println(d);
            donutPrice += d.donutPrice;
        }

        System.out.println("\u001B[32m \033[3m Your grand total for all donuts is: $\033[3m\u001B[32m" + donutPrice);

        }
    }






