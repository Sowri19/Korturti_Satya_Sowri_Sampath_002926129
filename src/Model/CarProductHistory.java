package Model;


import Model.CarProduct;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dpsmv
 */
public class CarProductHistory {
    private ArrayList <CarProduct> history;
    public CarProductHistory()
    {
        this.history = new ArrayList<CarProduct>();
        
    }

    public ArrayList<CarProduct> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarProduct> history) {
        this.history = history;
    }
    public CarProduct addNewCarProduct(){
        CarProduct NewCar = new CarProduct();
        history.add(NewCar);
        return NewCar;
        
    }
    
    public void deletecars(CarProduct cp){
        history.remove(cp);
    }
}
