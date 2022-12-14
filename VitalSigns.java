/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author risha
 */
public class VitalSigns 
{
    long encounterid;
    double Height;
    double Weight;
    double temprature;
    String Blood_pressure;

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getTemprature() {
        return temprature;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public String getBlood_pressure() {
        return Blood_pressure;
    }

    public void setBlood_pressure(String Blood_pressure) {
        this.Blood_pressure = Blood_pressure;
    }

    public long getEncounterid() {
        return encounterid;
    }

    public void setEncounterid(long encounterid) {
        this.encounterid = encounterid;
    }
    
    
}
