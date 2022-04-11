package lovre;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur) {
        CarRent carRent = new CarRent(rider, car, rentDur);
        if (car.isStatus()) {
            System.out.println("Mobil berhasil disewa");
            rentData.add(carRent);
            car.setStatus(false);
        }
        else if (!car.isStatus()) {
            System.out.println("Maaf, mobil sudah disewa");
            rentData.add(carRent);
        }
    }

    public void info() {
        for(CarRent cr : rentData) {
            //System.out.println("--------------------------------------------");
            System.out.println("-".repeat(44));
            System.out.println("             INFORMASI PELANGGAN");
            //System.out.println("--------------------------------------------");
            System.out.println("-".repeat(44));
            System.out.println("Nama Peminjam   : " + cr.getRider().getName());
            System.out.println("Tipe Mobil      : " + cr.getCar().getCarType());
            System.out.println("No Polisi       : " + cr.getCar().getPolNum());
            System.out.println("Lama Rental     : " + cr.getRentDur());
        }
    }
}
