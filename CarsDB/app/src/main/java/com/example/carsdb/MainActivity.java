package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Log.d("CarsCount", String.valueOf(databaseHandler.getCarsCount()));

        /*databaseHandler.addCar(new Car("Toyota", "30 000 $"));
        databaseHandler.addCar(new Car("Audi", "45 000 $"));
        databaseHandler.addCar(new Car("Porsche", "60 000 $"));
        databaseHandler.addCar(new Car("Mercedes", "55 000 $"));
        databaseHandler.addCar(new Car("Tesla", "50 000 $"));
        databaseHandler.addCar(new Car("Ferrari", "90 000 $"));
        databaseHandler.addCar(new Car("Lamborghini", "120 000 $"));
        databaseHandler.addCar(new Car("Maserati", "100 000 $"));*/

        List<Car> carList = databaseHandler.getAllCars();

        /*Car deletingCar = databaseHandler.getCar(1);
        databaseHandler.deleteCar(deletingCar);*/

        for (Car car : carList) {
            Log.d("Carinfo ","Id " + car.getId() + ", Name " + car.getName() + ", Price " + car.getPrice());
        }

        /*Car car = databaseHandler.getCar(1);
        Log.d("Car info ",  "Id " + car.getId() + ", Name " + car.getName() + ", Price " + car.getPrice());

        car.setName("Tesla");
        car.setPrice("55 000 $");
        databaseHandler.updateCar(car);

        Log.d("Car info ",  "Id " + car.getId() + ", Name " + car.getName() + ", Price " + car.getPrice());*/
    }
}