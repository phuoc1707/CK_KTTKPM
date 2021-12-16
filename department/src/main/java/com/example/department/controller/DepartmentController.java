package com.example.department.controller;

import com.example.department.entity.department;
import com.example.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<department> getAll(){
        return service.getAll();
    }

    @PostMapping
    public department add(@RequestBody department department){
        return service.addDepartment(department);
    }
    @GetMapping("/{id}")
    public department findByid(@PathVariable Long id){
        System.out.println(id);
        return service.getByid(id);
    }

    @PostMapping("/{id}")
    public String delete(@PathVariable Long id){
        try {
            service.delete(id);
        }catch (Exception e){
            System.out.println(e);
            return "Xóa thất bại";
        }
        return "Xóa thành công";

    }
}
