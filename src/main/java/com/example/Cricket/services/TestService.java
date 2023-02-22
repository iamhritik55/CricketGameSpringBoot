//package com.example.Cricket.services;
//
//import com.example.Cricket.entity.Test;
//import com.example.Cricket.repo.TestRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class TestService {
//    @Autowired
//    private TestRepo testRepo;
//
//    public Test addName(Test test){
//        test.setTestId(UUID.randomUUID().toString().split("-")[0]);
//        return testRepo.save(test);
//    }
//    public List<Test> getTests(){
//        return testRepo.findAll();
//    }
//}
