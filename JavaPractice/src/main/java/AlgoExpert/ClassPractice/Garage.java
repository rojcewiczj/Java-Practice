package AlgoExpert.ClassPractice;

import java.util.List;

public class Garage {
    public List<Vehicle> vehicles;

    public Garage(List<Vehicle> _vehicles){
        vehicles = _vehicles;
    }

    public Integer TotalBill(){
        Integer bill = 0;
        for(Vehicle v : vehicles){
            if (v instanceof MotorCycle){
                bill += 10;
            }
            else{
                bill += 30;
            }
        }
        return bill;
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }
    
    public Integer specificBill(Vehicle v){
        Integer bill = 0;
        if(v instanceof MotorCycle){
            bill += 10;
        }
        else if(v instanceof Car){
            bill += 30;
        }
        for(Vehicle find : vehicles){
            if(find.name == v.name){
                bill += 50;
                return bill;
            }
        }
        return 0;
    }
}


