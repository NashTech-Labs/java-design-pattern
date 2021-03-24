package factory;

import repo.Car;
import repo.Hyundai;
import repo.Maruti;
import repo.Tata;

public class CarFactory {

    public Car getCar(String carType){
     if(carType == null) {
         return null;
     }
     if(carType.equalsIgnoreCase("Hyundai")) {
         return new Hyundai();
     }
     else if(carType.equalsIgnoreCase("Maruti")) {
         return new Maruti();
     }
     else if(carType.equalsIgnoreCase("Tata")) {
         return new Tata();
     }
     return null;
    }
}
