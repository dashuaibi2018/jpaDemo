package com.sujun.jpademo.service;

import java.util.List;
import java.util.Optional;

import com.sujun.jpademo.dao.AccountRepository;
import com.sujun.jpademo.entity.Account;
import com.sujun.jpademo.entity.RespStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AccountService {

    @Autowired
    AccountRepository accRep;

    public RespStat save(Account account) {
        /**
         * 返回的实体类，id带回来。
         */
        try {
            Account entity = accRep.save(account);
        } catch (Exception e) {
            return new RespStat(500, "发生错误", e.getMessage());
        }
        return new RespStat(200, "ok", "meiyou");
    }

    public List<Account> findAll() {
        // 查询所有数据

        // 自定义方法
        return accRep.findByIdBetween(1,6);
        //	return accRep.findAll();
    }

    public Optional<Account> findById(int id) {
        // 接口自带方法
        return accRep.findById(id);

    }

    public Object findxxx() {
        //	Account account = accRep.findByLoginNameAndPassword("张三", "123");
        List<Account> findbyxx = accRep.findbyxx2(2);
        return findbyxx;
    }

}
