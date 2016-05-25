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
public class developers {
    
    private String key;
    private String email;
    private String name;
    //private Jpg picture;
    private String bio;

    /**
     * @return the email
     */
    developers(){}
    developers(String key, String name, String Email, String bio)
    {
    this.key = key;
    this.name = name;
    this.email = Email;
    this.bio = bio;
    }
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
}

