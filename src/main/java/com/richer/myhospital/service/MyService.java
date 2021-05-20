package com.richer.myhospital.service;

import com.richer.myhospital.dao.MyDao;
import com.richer.myhospital.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    MyDao myDao;

    public List<User> getAllUser() {
        return myDao.getAllUser();
    }

    public User getUserById(int id) {
        return myDao.getUserById(id);
    }

    public int register(User user) {
        return myDao.register(user);
    }

    public User login(String name) {
        return myDao.login(name);
    }

    public List<Hospital> getAllHospital(String city) {
        return myDao.getAllHospital(city);
    }

    public Hospital getHospitalById(int id) {
        return myDao.getHospitalById(id);
    }

    public List<Expert> getAllExpert(int hospitalId) {
        return myDao.getAllExpert(hospitalId);
    }

    public int reserve(Reserve reserve) {return myDao.reserve(reserve);}

    public List<Reserve> queryReserve(Reserve reserve) {return myDao.queryReserve(reserve);}

    public int collectHospital(Collect collect) {return myDao.collectHospital(collect);}

    public List<Hospital> getCollectedHospital(int userId) {return myDao.getCollectedHospital(userId);}

    public int unCollectHospital(Collect collect) {
        return myDao.unCollectHospital(collect);
    }

    public List<Collect> queryCollection(Collect collect) {
        return myDao.queryCollection(collect);
    }

    public List<ReserveRecord> getReserveRecord(int userId) {
        return myDao.getReserveRecord(userId);
    }

    public int unReserve(ReserveRecord record) {
        return myDao.unReserve(record);
    }

    public List<City> getCities() {
        return myDao.getCities();
    }

    public List<Hospital> searchHospital(String condition) {
        return myDao.searchHospital(condition);
    }

    public int updateUser(User user) {
        return myDao.updateUser(user);
    }

    public int updatePassword(User user) {
        return myDao.updatePassword(user);
    }

}
