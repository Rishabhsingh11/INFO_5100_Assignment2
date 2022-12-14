/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author risha
 */
public class Encounter 
{
    
        long encounterid;
        long patientid;
        String doctor_Name;
        String hospital_Name;
        String encounter_date;
        String encounter_time;

    public long getPatientid() {
        return patientid;
    }

    public void setPatientid(long patientid) {
        this.patientid = patientid;
    }

  
        
    public long getEncounterid() {
        return encounterid;
    }

    public void setEncounterid(long encounterid) {
        this.encounterid = encounterid;
    }
      

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public String getHospital_Name() {
        return hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        this.hospital_Name = hospital_Name;
    }

    public String getEncounter_date() {
        return encounter_date;
    }

    public void setEncounter_date(String encounter_date) {
        this.encounter_date = encounter_date;
    }

    public String getEncounter_time() {
        return encounter_time;
    }

    public void setEncounter_time(String encounter_time) {
        this.encounter_time = encounter_time;
    }

    @Override
    public String toString() {
        return doctor_Name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
         
    
}
