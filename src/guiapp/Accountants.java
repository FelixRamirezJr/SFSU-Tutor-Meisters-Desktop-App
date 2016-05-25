/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiapp;

/**
 *
 * @author Felix
 */
public class Accountants {

    private String key;
    private String Aname;
    private String Aemail;
    private String Abio;
    private String jpegPng;

   
    Accountants(){};
    
    Accountants(String key,String name,String Email)
    {
    this.key = key;
    this.Aname = name;
    this.Aemail = Email;
    }
    public String getKey() {
        return key;
    }

   
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the Aname
     */
    public String getAname() {
        return Aname;
    }

    /**
     * @param Aname the Aname to set
     */
    public void setAname(String Aname) {
        this.Aname = Aname;
    }

    /**
     * @return the Aemail
     */
    public String getAemail() {
        return Aemail;
    }

    /**
     * @param Aemail the Aemail to set
     */
    public void setAemail(String Aemail) {
        this.Aemail = Aemail;
    }

    /**
     * @return the Abio
     */
    public String getAbio() {
        return Abio;
    }

    /**
     * @param Abio the Abio to set
     */
    public void setAbio(String Abio) {
        this.Abio = Abio;
    }

    /**
     * @return the jpegPng
     */
    public String getJpegPng() {
        return jpegPng;
    }

    /**
     * @param jpegPng the jpegPng to set
     */
    public void setJpegPng(String jpegPng) {
        this.jpegPng = jpegPng;
    }
    
}
