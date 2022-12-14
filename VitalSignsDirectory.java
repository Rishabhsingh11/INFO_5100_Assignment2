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
public class VitalSignsDirectory 
{
     private ArrayList<VitalSigns>vitalsignsdirectory;
    
    public VitalSignsDirectory()
    {
        this.vitalsignsdirectory = new ArrayList<VitalSigns>();
    }
     public ArrayList<VitalSigns> getVitalSignsDirectory() {
        return vitalsignsdirectory;
    }

    public void setVitalSignsDirectory(ArrayList<VitalSigns> vitalsignsdirectory) {
        this.vitalsignsdirectory = vitalsignsdirectory;
    }
    
    public VitalSigns addVitalSigns() 
    {
        
        VitalSigns vs = new VitalSigns();
        vitalsignsdirectory.add(vs);
        return vs;
    }

    public void deleteVitalSigns(VitalSigns selectedVs) 
    {
        vitalsignsdirectory.remove(selectedVs);
    }

    public void updateVitalSigns(VitalSigns selectedVs) 
    {
        vitalsignsdirectory.set(0, selectedVs);
    }
}
