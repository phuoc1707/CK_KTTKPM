package com.example.department.service;

import com.example.department.entity.department;
import com.example.department.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private Repository repository;

    @Autowired
    private RedisTemplate redisTemplate;

    public department addDepartment(department department){

        return  repository.save(department);
    }

    public List<department> getAll(){
        List<department> list= new ArrayList<department>();
        list= redisTemplate.opsForHash().values("DEPARTMENT");
        if(list.size() >0){
            System.out.println("111111111111111111111");
            return list;
        }
        repository.findAll().forEach(d ->{
            redisTemplate.opsForHash().put("DEPARTMENT", d.getId(), d);
        });
        return repository.findAll();
    }

    public department getByid(Long id){
        department department= (com.example.department.entity.department) redisTemplate.opsForHash().get("DEPARTMENT", id);
        if(department != null){
            System.out.println("111111111111111111111");
            return department;
        }
        redisTemplate.opsForHash().put("DEPARTMENT", repository.findById(id).get().getId(), repository.findById(id).get());
        return repository.findById(id).get();
    }

    public void delete(Long id){
        redisTemplate.opsForHash().delete("DEPARTMENT",id);
        repository.deleteById(id);
    }
}
