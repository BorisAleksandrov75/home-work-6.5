import Figure.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean b = true;

        System.out.println("Привет! Это программа для расчета площади и периметра простых фигур");

        do {
            System.out.println("Выберите действие: 1-Расчет для квадрата, 2-Расчет для прямоугольного треугольника," +
                    " 3-Расчет для прямоугольника, 4-Расчет для круга, 5-Расчет для трапеции, 6-Выход");
            int a = scn.nextInt();
            switch (a) {
                case 1:
                    System.out.println("введите значение сторон квадрата");
                    square squar = new square(scn.nextInt(), scn.nextInt());
                    System.out.println("Площадь = " + squar.areaCalculation());
                    System.out.println("Периметр = " + squar.perimetrCalculation());
                    break;
                case 2:
                    System.out.println("введите значение сторон прямоугольного треугольника");
                    righttriangle righttriangl = new righttriangle(scn.nextInt(), scn.nextInt());
                    System.out.println("Площадь = " + righttriangl.areaCalculation());
                    System.out.println("Периметр = " + righttriangl.perimetrCalculation());
                    break;
                case 3:
                    System.out.println("введите значение сторон прямоугольника");
                    rectangle rectangl = new rectangle(scn.nextInt(), scn.nextInt());
                    System.out.println("Площадь = " + rectangl.areaCalculation());
                    System.out.println("Периметр = " + rectangl.perimetrCalculation());
                    break;
                case 4:
                    System.out.println("введите радиус круга");
                    circle circl = new circle(scn.nextInt());
                    System.out.println("Площадь = " + circl.areaCalculation());
                    System.out.println("Периметр = "+ circl.perimetrCalculation());
                    break;
                case 5:
                    System.out.println("введите значения основания и высоты трапеции");
                    Trapeze trap = new Trapeze(scn.nextInt(), scn.nextInt(), scn.nextInt());
                    System.out.println("Площадь = "+ trap.areaCalculation());
                    System.out.println("Периметр = "+ trap.perimetrCalculation());
                    break;
                case 6:
                    b = false;
                    break;
                default:
                    System.out.println("Повторите ввод");
            }
        } while (b);

    }

}
