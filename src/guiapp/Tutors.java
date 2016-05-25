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
public class Tutors {
    
    private String key;
    private String id;
    private String email;
    private String name;
    private String subject;
    private String major;
    private String languages;
    //private Jpg picture;
    private String bio;
    private String payrate;
    private String reviews;

    /**
     * @return the email
     */
    Tutors(){}
    Tutors(String name,String id,String payrate )
    {
    this.name = name;
    this.id = id;
    this.payrate = payrate;
    }
    
    Tutors(String key, String name, String Email, String bio,String languages,
            String subject)
    {
    this.key = key;
    this.name = name;
    this.email = Email;
    this.bio = bio;
    this.languages = languages;
    this.subject = subject;
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
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the languages
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(String languages) {
        this.languages = languages;
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
     * @return the reviews
     */
    public String getReviews() {
        return reviews;
    }

    /**
     * @param reviews the reviews to set
     */
    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    /**
     * @return the key
     */
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the payrate
     */
    public String getPayrate() {
        return payrate;
    }

    /**
     * @param payrate the payrate to set
     */
    public void setPayrate(String payrate) {
        this.payrate = payrate;
    }
}



