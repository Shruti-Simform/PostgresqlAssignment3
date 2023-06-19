package com.postgresAss3.postgresqlAss3.repository;

import com.postgresAss3.postgresqlAss3.entity.MergedView;
import org.springframework.stereotype.Repository;

@Repository
public interface MergedViewRepository extends ReadOnlyRepository<MergedView,String> {
//    @Query(nativeQuery = true,value = "Select * from v_merge_billing")
//    @Query("Select v from v_merge_billing v")
//    public List<ItemView> getRecords();
}
