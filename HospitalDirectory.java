/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author risha
 */
public class HospitalDirectory {
    private ArrayList<Hospital>hospitaldirectory;
    
    public HospitalDirectory()
    {
        this.hospitaldirectory = new ArrayList<Hospital>();
    }
     public ArrayList<Hospital> getHospitalDirectory() {
        return hospitaldirectory;
    }

    public void setPersonDirectory(ArrayList<Hospital> hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }
    
    public Hospital addHospital() 
    {
        int Hospital_ID = hospitaldirectory.size();
        long id;
        if(Hospital_ID == 0) {
            id = 50000;
        } else {
            id = (hospitaldirectory.get(Hospital_ID - 1).getHospital_id()+ 1);
        }
        Hospital hospitalobj = new Hospital();
        hospitalobj.setHospital_id(id);
        hospitaldirectory.add(hospitalobj);
        return hospitalobj;
    }

    public void deleteHospital(Hospital selectedHospital) 
    {
        hospitaldirectory.remove(selectedHospital);
    }

    public void updateHospital(Hospital selectedHospital) 
    {
        hospitaldirectory.set(0, selectedHospital);
    }
    
}
