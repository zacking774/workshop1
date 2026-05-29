/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author user
 */
public class User implements Serializable{
    private int userId;
    private String phoneNumber;
    private String password;
    private String fullname;
    private String role;
    private String tierId;
    private int pointBalance;
    private double totalSpent;
    private int totalWashes;
    private Date createdAt;
    private boolean status;

    public User() {
    }

    public User(int userId, String phoneNumber, String password, String fullname, String role, String tierId, int pointBalance, double totalSpent, int totalWashes, Date createdAt, boolean status) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.fullname = fullname;
        this.role = role;
        this.tierId = tierId;
        this.pointBalance = pointBalance;
        this.totalSpent = totalSpent;
        this.totalWashes = totalWashes;
        this.createdAt = createdAt;
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTierId() {
        return tierId;
    }

    public void setTierId(String tierId) {
        this.tierId = tierId;
    }

    public int getPointBalance() {
        return pointBalance;
    }

    public void setPointBalance(int pointBalance) {
        this.pointBalance = pointBalance;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }

    public int getTotalWashes() {
        return totalWashes;
    }

    public void setTotalWashes(int totalWashes) {
        this.totalWashes = totalWashes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }   
}
