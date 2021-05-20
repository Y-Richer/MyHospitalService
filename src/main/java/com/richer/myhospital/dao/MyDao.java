package com.richer.myhospital.dao;

import com.richer.myhospital.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyDao {

    List<User> getAllUser();
    int register(User user);
    User getUserById(int id);
    User login(String name);
    List<Hospital> getAllHospital(String city);
    Hospital getHospitalById(int id);
    List<Expert> getAllExpert(int hospitalId);
    int reserve(Reserve reserve);
    List<Reserve> queryReserve(Reserve reserve);
    int collectHospital(Collect collect);
    List<Hospital> getCollectedHospital(int userId);
    int unCollectHospital(Collect collect);
    List<Collect> queryCollection(Collect collect);
    List<ReserveRecord> getReserveRecord(int userId);
    int unReserve(ReserveRecord record);
    List<City> getCities();
    List<Hospital> searchHospital(String condition);
    int updateUser(User user);
    int updatePassword(User user);

}
