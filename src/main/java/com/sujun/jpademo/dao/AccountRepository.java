package com.sujun.jpademo.dao;

import com.sujun.jpademo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findByIdBetween(int min, int max);

    Account findByLoginNameAndPassword(String loginName, String password);


    // 自定义 hql
    @Query("select acc from Account acc where acc.id=1 ")
    List<Account> findbyxx();
    @Query("select acc from Account acc where acc.id=?1 ")
    List<Account> findbyxx2(int id);
}
