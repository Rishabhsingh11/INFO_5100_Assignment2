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
public class CommunityDirectory 
{
    private ArrayList<Community>communitydirectory;
    
    public CommunityDirectory()
    {
        this.communitydirectory = new ArrayList<Community>();
    }
     public ArrayList<Community> getCommunityDirectory() {
        return communitydirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communitydirectory) {
        this.communitydirectory = communitydirectory;
    }
    
    public Community addCommunity() 
    {
        
        Community communityobj = new Community();
        communitydirectory.add(communityobj);
        return communityobj;
    }

    public void deleteCommunity(Community selectedCommunity) 
    {
        communitydirectory.remove(selectedCommunity);
    }

    public void updateCommunity(Community selectedCommunity) 
    {
        communitydirectory.set(0, selectedCommunity);
    }
}
