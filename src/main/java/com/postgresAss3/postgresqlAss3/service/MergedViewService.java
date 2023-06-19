package com.postgresAss3.postgresqlAss3.service;

import com.postgresAss3.postgresqlAss3.entity.MergedView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MergedViewService {
    public List<MergedView> findAllItems();
}
