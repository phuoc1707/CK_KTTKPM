package com.example.employee.service;

import com.example.employee.entity.VO;
import com.example.employee.entity.department;
import com.example.employee.entity.employee;
import com.example.employee.repository.RepositoryDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RepositoryDepartment repositoryDepartment;

    public List<VO> getAll(){
        List<VO> list= new ArrayList<VO>();
        List<employee> listE= repositoryDepartment.findAll();

        for (employee e: listE ) {
            department department= restTemplate.getForObject("/"+e.getIdDepartment(),department.class);
            list.add(new VO(e,department));
        }

        return list;
    }

    public VO getByID(Long id){
        employee employee= repositoryDepartment.findById(id).get();

        department department= restTemplate.getForObject("/"+employee.getIdDepartment(),department.class);
        return new VO(employee,department);
    }

    public employee addEmployee(employee employee){
        return  repositoryDepartment.save(employee);
    }

    public  void delete(Long id){
        repositoryDepartment.deleteById(id);
    }

}
