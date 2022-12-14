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
public class EncounterDirectory 
{
    private ArrayList<Encounter>encounterdirectory;
    
    public EncounterDirectory()
    {
        this.encounterdirectory = new ArrayList<Encounter>();
    }
     public ArrayList<Encounter> getEncounterDirectory() {
        return encounterdirectory;
    }

    public void setEncounterDirectory(ArrayList<Encounter> encounterdirectory) {
        this.encounterdirectory = encounterdirectory;
    }
    
    public Encounter addEncounter() 
    {
        int Encounter_ID = encounterdirectory.size();
        long id;
        if(Encounter_ID == 0) {
            id = 1;
        } else {
            id = (encounterdirectory.get(Encounter_ID - 1).encounterid+ 1);
        }
        Encounter encounterobj = new Encounter();
        encounterobj.setEncounterid(id);
        encounterdirectory.add(encounterobj);
        return encounterobj;
    }

    public void deleteEncounter(Encounter selectedEncounter) 
    {
        encounterdirectory.remove(selectedEncounter);
    }

    public void updateEncounter(Encounter selectedEncounter) 
    {
        encounterdirectory.set(0, selectedEncounter);
    }
    
    
}
