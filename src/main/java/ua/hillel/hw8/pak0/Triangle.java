package ua.hillel.hw8.pak0;
/*
Формула Герона
S = √p(p - a)(p - b)(p - c)
 */

import ua.hillel.hw8.pak0.AbstractShape;

public class Triangle extends AbstractShape {
    private double aSide;
    private double bSide;
    private double cSide;

    public double squareFigures() {
        return Math.sqrt(((aSide + bSide + cSide) * 0.5) * (((aSide + bSide + cSide) * 0.5) - aSide) * (((aSide + bSide + cSide) * 0.5) - bSide) * (((aSide + bSide + cSide) * 0.5) - cSide));
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    public void setcSide(double cSide) {
        this.cSide = cSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                ", cSide=" + cSide +
                '}';
    }
}
