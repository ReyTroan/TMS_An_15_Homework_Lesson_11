package com.teachmeskills.lesson11.part2;

import java.util.ArrayList;

/**
 * Implemented a method for adding classes of shapes to the list
 *      and calling them a method for calculating the perimeter of each figure in the list
 */
public class CollectionFigures {

    public static void fillingCollectionShapes(){
        ArrayList<IFigures> arrayList = new ArrayList<>();

        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(3, 3,3);
        Rectangle rectangle = new Rectangle(3,3);
        arrayList.add(circle);
        arrayList.add(triangle);
        arrayList.add(rectangle);

        //output the perimeter of all shapes in the list
        for (IFigures figures : arrayList){
            System.out.println(figures.getPerimeter());
        }
    }

}
