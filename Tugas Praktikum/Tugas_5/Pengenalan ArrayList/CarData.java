package lovre;

import java.util.ArrayList;

public class CarData {
    public static ArrayList<Car> carList = new ArrayList<>();

    public void addCarr(String carType, String polNum, String merk) {
        Car car = new Car(carType, polNum, merk, true);
        carList.add(car);
    }

    public void listOfCar() {
        for(Car cr : carList) {
            System.out.println("=".repeat(16) + "Daftar Mobil" + "=".repeat(16));
            //System.out.println("--------------------------------------------");
            System.out.println("-".repeat(44));
            System.out.println("Tipe Mobil      : " + cr.getCarType());
            System.out.println("No Polisi       : " + cr.getPolNum());
            System.out.println("Merek Mobil     : " + cr.getMerk());
            System.out.println("-".repeat(44));
        }

    }
}
