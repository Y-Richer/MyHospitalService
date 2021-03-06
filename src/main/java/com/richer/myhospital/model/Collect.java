package com.richer.myhospital.model;

public class Collect {

    private int id;
    private int userId;
    private int hospitalId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", userId=" + userId +
                ", hospitalId=" + hospitalId +
                '}';
    }
}
