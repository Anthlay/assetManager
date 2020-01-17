package com.whut.Service;

import com.github.pagehelper.PageHelper;
import com.whut.beans.Operator;
import com.whut.Dao.IOperatorDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OperaterService implements IOperatorService {

    @Autowired
    private IOperatorDao operatorDao;
    @Override
    public List<Operator> findAll(int page,int size) {

        PageHelper.startPage(page, size) ;
        return operatorDao.findAll();
    }
    @Override
    public void addOperator(Operator operator){
        operatorDao.addOperator(operator);
    }

    @Override
    public void deleteOperator(Operator operator){
        operatorDao.deleteOperator(operator);
    }
    @Override
    public boolean updateOperator(Operator operator){
        return operatorDao.updateOperator(operator);
    }
    @Override
    public List<Operator> findOperatorByName(@Param("operatorName") String operatorName){
        return operatorDao.findOperatorByName(operatorName);
    }

    @Override
    public Operator searchbyID(int id){
        return operatorDao.searchbyID(id);
    }
    @Override
    public  List<Operator> showOperatorbyName(String operatorname){
        return operatorDao.showOperatorbyName(operatorname);
    }
}
