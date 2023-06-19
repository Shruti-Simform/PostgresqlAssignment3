package com.postgresAss3.postgresqlAss3.service;

import com.postgresAss3.postgresqlAss3.entity.MergedView;
import com.postgresAss3.postgresqlAss3.repository.MergedViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MergedViewServiceImpl implements MergedViewService {
    @Autowired
    MergedViewRepository repository;
    @Override
    public List<MergedView> findAllItems() {
        return repository.findAll();
    }
}
