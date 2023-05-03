public class Ball {

    private final double PI = Math.PI;

    double calculateVolumeFromSurfaceArea(double surfaceArea){

         double fourPI = 4 * PI;
         double radius = Math.sqrt(surfaceArea/fourPI);
         return calculateVolume(radius);

    }

     private double calculateVolume(double radius){
         return (4.0 / 3.0)*PI* radius*radius*radius;
    }
}
