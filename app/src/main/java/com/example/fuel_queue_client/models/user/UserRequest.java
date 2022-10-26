/*
 * UserRequest: class - user request for the API call is represented
 * */
 
 package com.example.equeue_client.models.user;

public class UserRequest {
    private String email;
    private String username;
    private String password;
    private String role;
    private String vehicleType;

    public UserRequest(String email, String username, String password, String role, String vehicleType) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.vehicleType = vehicleType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
