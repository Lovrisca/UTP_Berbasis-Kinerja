package lovre;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("-".repeat(44));
        System.out.println("Nama            : Lovrisca Pritania Widianti");
        System.out.println("NIM             : 215150700111027");
        System.out.println("-".repeat(44));

        CarRider Jennie = new CarRider("Jennie Kim", 26, "08xx xxxx xxxx");
        CarRider Jisoo = new CarRider("Jisoo Kim", 27, "08yy yyyy yyyy");
        CarRider Rose = new CarRider("Chae-young Park", 25, "08nn nnnn nnnn");
        CarRider Lisa = new CarRider("Lalisa Manoban", 25, "08mm mmmm mmmm");

        CarData data = new CarData();
        data.addCarr("Porsche Turbo 911 S", "xx xxx xx", "Porsche");
        data.addCarr("Chevrolet Tahoe", "yy yyy yy", "Chevrolet");
        data.addCarr("Jaguar I-Pace", "nn nnn nn", "Jaguar");
        data.addCarr("BMW Series 3", "mm mmm mm", "BMW");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(Jennie, data.carList.get(0), 9);
        arsip.Rent(Jisoo, data.carList.get(0), 9);
        arsip.Rent(Rose, data.carList.get(2), 15);
        arsip.Rent(Lisa, data.carList.get(3),3);

        System.out.println("");
        arsip.info();
    }
}
