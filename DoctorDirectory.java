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
public class DoctorDirectory 
{
    private ArrayList<Doctor>doctordirectory;
    
    public DoctorDirectory()
    {
        this.doctordirectory = new ArrayList<Doctor>();
    }
     public ArrayList<Doctor> getDoctorDirectory() {
        return doctordirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctordirectory) {
        this.doctordirectory = doctordirectory;
    }
    
    public Doctor addDoctor() 
    {
        int Doctor_ID = doctordirectory.size();
        long id;
        if(Doctor_ID == 0) {
            id = 20000;
        } else {
            id = (doctordirectory.get(Doctor_ID - 1).getDoctor_id()+ 1);
        }
        Doctor doctorobj = new Doctor();
        doctorobj.setDoctor_id(id);
        doctordirectory.add(doctorobj);
        return doctorobj;
    }

    public void deleteDoctor(Doctor selectedDoctor) 
    {
        doctordirectory.remove(selectedDoctor);
    }

    public void updateHospital(Doctor selectedDoctor) 
    {
        doctordirectory.set(0, selectedDoctor);
    }
    
    public int doctorDirectorySize()
    {
        int len;
        len = doctordirectory.size();
        return len;
    }
    
}
