package com.its.dao;

import com.its.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<AccountEntity, Integer> {

}
