public class Tetrahedron {
    double calculateVolumeFromSurfaceArea(double surfaceArea){

        double a = surfaceArea / Math.sqrt(3);

        return calculateVolume(Math.sqrt(a));

    }

     private double calculateVolume(double width){
        double volume = width*width*width;
         return volume*Math.sqrt(2)/12;
    }
}
