package Day13;

class ShapeCalculator {
    static double circleArea(double r){
        return Math.PI * r * r;
    }

    static double cylinderVolume( double r, double h){
        return circleArea(r) * h; // it reuses circleArea
    }

    static double cylinderSurface(double r, double h){
        return 2 * circleArea(r) + 2 * Math.PI * r * h;
    }

    static double round2( double val){
        return Math.round( val * 100.0) /100.0;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        double r = 4, h = 10;
        System.out.println("Circle area  : " + ShapeCalculator.round2(ShapeCalculator.circleArea(r)));
        System.out.println("Cylinder volume  : " + ShapeCalculator.round2(ShapeCalculator.cylinderVolume(r, h)));
        System.out.println("Cylinder surface : " + ShapeCalculator.round2(ShapeCalculator.cylinderSurface(r, h)));
    }
}
