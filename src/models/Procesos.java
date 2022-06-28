package models;

import java.util.PrimitiveIterator;

public class Procesos {
    public static double procesos(double longitudMateria){
        double v = (4.0 / 3.0) * Math.PI * (longitudMateria * longitudMateria * longitudMateria);
        return v;
    }
}
