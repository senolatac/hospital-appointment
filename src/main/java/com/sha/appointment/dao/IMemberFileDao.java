package com.sha.appointment.dao;

import com.sha.appointment.model.MemberFile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMemberFileDao extends PagingAndSortingRepository<MemberFile, Long> {
}
