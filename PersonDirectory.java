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
public class PersonDirectory 
{
    private ArrayList<Person>persondirectory;
    
    public PersonDirectory()
    {
        this.persondirectory = new ArrayList<Person>();
    }
     public ArrayList<Person> getPersonDirectory() {
        return persondirectory;
    }

    public void setPersonDirectory(ArrayList<Person> persondirectory) {
        this.persondirectory = persondirectory;
    }
    
    public Person addPerson() 
    {
        int SSN_ID = persondirectory.size();
        long id;
        if(SSN_ID == 0) {
            id = 10000;
        } else {
            id = (persondirectory.get(SSN_ID - 1).getSSN_id()+ 1);
        }
        Person personobj = new Person();
        personobj.setSSN_id(id);
        persondirectory.add(personobj);
        return personobj;
    }

    public void deletePerson(Person selectedPerson) 
    {
        persondirectory.remove(selectedPerson);
    }

    public void updatePerson(Person selectedPerson) 
    {
        persondirectory.set(0, selectedPerson);
    }
}
