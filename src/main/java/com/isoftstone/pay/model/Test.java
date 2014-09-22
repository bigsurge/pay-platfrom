/**
 * 
 */
package com.isoftstone.pay.model;

import java.io.Serializable;

/**
 * @author lllianga
 * 2014年9月17日下午1:02:35
 */
public class Test implements Serializable{
    
 
    private static final long serialVersionUID = -4938263989804524474L;
    
    private String id;
    private String username;
    private String password;
    
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
