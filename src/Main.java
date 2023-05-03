import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Cube cube = new Cube();
        Ball ball = new Ball();
        Tetrahedron tetrahedron = new Tetrahedron();

        Scanner scanner = new Scanner(System.in);
        double surfaceArea = 0;

        System.out.println("podaj liczbe która będzie oznaczać pole całkowite dla kuli, sześcianu i czworościanu i na jej podstawie zostanie obliczona objętość");
        do {
            try{
                surfaceArea = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("eee");
                scanner.nextLine();
            }
            if (surfaceArea<0.01){
                System.out.println("liczba jest za mała lub wpisałeś coś dziwnego podaj jeszcze raz");
            }
        }while (surfaceArea<0.01);


        BigDecimal cubeVolume = BigDecimal.valueOf(cube.calculateVolumeFromSurfaceArea(surfaceArea)).setScale(4, RoundingMode.HALF_DOWN);
        BigDecimal ballVolume = BigDecimal.valueOf(ball.calculateVolumeFromSurfaceArea(surfaceArea)).setScale(4, RoundingMode.HALF_DOWN);
        BigDecimal tetrahedronVolume = BigDecimal.valueOf(tetrahedron.calculateVolumeFromSurfaceArea(surfaceArea)).setScale(4, RoundingMode.HALF_DOWN);

        System.out.println("Objętość sześcianu -> "+ cubeVolume);
        System.out.println("Objętość kuli -> "+ ballVolume);
        System.out.println("Objętość czworościanu -> "+ tetrahedronVolume);

    }
}
