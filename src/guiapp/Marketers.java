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
public class Marketers {
    
    private String key;
    private String name;
    private String email;
    private String bio;
    private String pegPng;

    /**
     * @return the key
     */
    Marketers(){}
    Marketers(String key, String name, String Email, String bio)
    {
    this.key = key;
    this.name = name;
    this.email = Email;
    this.bio = bio;
    }
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return the pegPng
     */
    public String getPegPng() {
        return pegPng;
    }

    /**
     * @param pegPng the pegPng to set
     */
    public void setPegPng(String pegPng) {
        this.pegPng = pegPng;
    }

}


