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
public class PatientDirectory 
{
    private ArrayList<Patient>patientdirectory;
    
    public PatientDirectory()
    {
        this.patientdirectory = new ArrayList<Patient>();
    }
     public ArrayList<Patient> getPatientDirectory() {
        return patientdirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    
    public Patient addPatient() 
    {
        int Patient_ID = patientdirectory.size();
        long id;
        if(Patient_ID == 0) {
            id = 30000;
        } else {
            id = (patientdirectory.get(Patient_ID - 1).getPatient_id()+ 1);
        }
        Patient patientobj = new Patient();
        patientobj.setPatient_id(id);
        patientdirectory.add(patientobj);
        return patientobj;
    }

    public void deletePatient(Patient selectePatient) 
    {
        patientdirectory.remove(selectePatient);
    }

    public void updatePatient(Patient selectePatient) 
    {
        patientdirectory.set(0, selectePatient);
    }
    public int patientDirectorySize()
    {
        int len;
        len = patientdirectory.size();
        return len;
    }
}
