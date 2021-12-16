package com.example.employee.controller;

import com.example.employee.config.RedisMessagePublisher;
import com.example.employee.config.RedisMessageSubscriber;
import com.example.employee.entity.VO;
import com.example.employee.entity.employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeRestcontroller {

    @Autowired
    private EmployeeService service;

    @Autowired
    private RedisMessagePublisher messagePublisher;

    @GetMapping
    public List<VO> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public VO getByid(@PathVariable Long id){
        return service.getByID(id);
    }
    @PostMapping
    public employee add(@RequestBody employee employee){
        employee e= service.addEmployee(employee);
        messagePublisher.publish(e.toString());
        return e ;
    }
    @PostMapping("/{id}")
    public String delete(@PathVariable Long id){
        try {
            service.delete(id);
        }catch (Exception e){
            System.out.println(e);
            return "Xóa thất bại";
        }

        return "xóa thành công";
    }

    @GetMapping("/subsribe")
    public List<String> get(){
        return RedisMessageSubscriber.messageList;
    }
}
