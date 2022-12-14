/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author risha
 */
public class Hospital {
    long hospital_id;
    String hospital_name;
    String hospital_type;
    String hospital_city;
    String hospital_state;
    String hospital_community;
    long hospital_mobile;
    String hospital_email;
    String hospital_password; 

    public long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(long hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospital_type() {
        return hospital_type;
    }

    public void setHospital_type(String hospital_type) {
        this.hospital_type = hospital_type;
    }

    public String getHospital_city() {
        return hospital_city;
    }

    public void setHospital_city(String hospital_city) {
        this.hospital_city = hospital_city;
    }

    public String getHospital_state() {
        return hospital_state;
    }

    public void setHospital_state(String hospital_state) {
        this.hospital_state = hospital_state;
    }

    public String getHospital_community() {
        return hospital_community;
    }

    public void setHospital_community(String hospital_community) {
        this.hospital_community = hospital_community;
    }

    public long getHospital_mobile() {
        return hospital_mobile;
    }

    public void setHospital_mobile(long hospital_mobile) {
        this.hospital_mobile = hospital_mobile;
    }

    public String getHospital_email() {
        return hospital_email;
    }

    public void setHospital_email(String hospital_email) {
        this.hospital_email = hospital_email;
    }

    public String getHospital_password() {
        return hospital_password;
    }

    public void setHospital_password(String hospital_password) {
        this.hospital_password = hospital_password;
    }

    @Override
    public String toString()
    {
        return hospital_name;
    }
}
