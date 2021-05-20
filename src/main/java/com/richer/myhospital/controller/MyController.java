package com.richer.myhospital.controller;

import com.richer.myhospital.model.*;
import com.richer.myhospital.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
public class MyController {

    private final String SUCCESS_MSG = "success";
    private final String FAIL_MSG = "fail";
    private final String RECORD_EXIST = "record is exist";
    @Autowired
    MyService myService;

    @ResponseBody
    @RequestMapping("/hello")
    public Result hello() {
        return setResult(200, SUCCESS_MSG, "Hello Richer");
    }

    @ResponseBody
    @RequestMapping(value = "/user/getAll", method = RequestMethod.GET)
    public Result getAllUser() {
        List<User> result = myService.getAllUser();
        if (result != null) {
            return setResult(200, SUCCESS_MSG, result);
        } else {
            return setResult(500, FAIL_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public Result getUserById(@PathVariable int id) {
        User result = myService.getUserById(id);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result register(@RequestBody User user) {
        int result = myService.register(user);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/login/{name}", method = RequestMethod.GET)
    public Result login(@PathVariable String name) {
        User result = myService.login(name);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/hospital/getAll/{city}", method = RequestMethod.GET)
    public Result getAllHospital(@PathVariable String city) {
        List<Hospital> result = myService.getAllHospital(city);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getHospital/{id}", method = RequestMethod.GET)
    public Result getHospitalById(@PathVariable int id) {
        Hospital result = myService.getHospitalById(id);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getExpert/{hospitalId}", method = RequestMethod.GET)
    public Result getAllExpert(@PathVariable int hospitalId) {
        List<Expert> result = myService.getAllExpert(hospitalId);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/reserve", method = RequestMethod.POST)
    public Result reserve(@RequestBody Reserve reserve) {
        List<Reserve> list = myService.queryReserve(reserve);
        if (list != null && !list.isEmpty()) {
            return setResult(501, RECORD_EXIST, null);
        }
        int result = myService.reserve(reserve);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/collectHospital", method = RequestMethod.POST)
    public Result collectHospital(@RequestBody Collect collect) {
        int result = myService.collectHospital(collect);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/unCollectHospital", method = RequestMethod.POST)
    public Result unCollectHospital(@RequestBody Collect collect) {
        int result = myService.unCollectHospital(collect);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getCollectedHospital/{userId}", method = RequestMethod.GET)
    public Result getCollectedHospital(@PathVariable int userId) {
        List<Hospital> result = myService.getCollectedHospital(userId);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/queryCollection", method = RequestMethod.POST)
    public Result queryCollection(@RequestBody Collect collect) {
        List<Collect> result = myService.queryCollection(collect);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping("/getReserveRecord/{userId}")
    public Result getReserveRecord(@PathVariable int userId) {
        List<ReserveRecord> result = myService.getReserveRecord(userId);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/unReserve", method = RequestMethod.POST)
    public Result unReserve(@RequestBody ReserveRecord record) {
        int result = myService.unReserve(record);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping("/getCities")
    public Result getCities() {
        List<City> result = myService.getCities();
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping("/searchHospital/{condition}")
    public Result searchHospital(@PathVariable String condition) {
        List<Hospital> result = myService.searchHospital(condition);
        if (result == null) {
            return setResult(500, FAIL_MSG, result);
        } else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public Result updateUser(@RequestBody User user) {
        int result = myService.updateUser(user);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        }else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public Result updatePassword(@RequestBody User user) {
        int result = myService.updatePassword(user);
        if (result == 0) {
            return setResult(500, FAIL_MSG, result);
        }else {
            return setResult(200, SUCCESS_MSG, result);
        }
    }


    private Result setResult(int status, String message, Object data) {
        Result result = new Result(status, message, data);
        return result;
    }

}
