package com.example.ogor.tmandroidclient.model;

/**
 * Created by OGOR on 2016-11-07.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Rest_Model {

    @SerializedName("login_email")
    @Expose
    private String loginEmail;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     *
     * @return
     * The loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }

    /**
     *
     * @param loginEmail
     * The login_email
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    /**
     *
     * @return
     * The password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     * The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}