package com.postgresAss3.postgresqlAss3.controller;

import com.postgresAss3.postgresqlAss3.entity.MergedView;
import com.postgresAss3.postgresqlAss3.service.MergedViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/view/item")
public class MergedViewController {
    @Autowired
    MergedViewService service;
    @GetMapping("/get")
    public List<MergedView> getAllRecords(){
        return service.findAllItems();
    }
}
