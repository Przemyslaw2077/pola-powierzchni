public class Cube {
    double calculateVolumeFromSurfaceArea(double surfaceArea){

        double width = Math.sqrt(surfaceArea / 6);
        return calculateVolume(width);

    }

    private double calculateVolume(double width){
        double volume = width*width*width;
        return volume;
    }
}
