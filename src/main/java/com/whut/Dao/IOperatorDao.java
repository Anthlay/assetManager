package com.whut.Dao;

import com.whut.beans.Operator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOperatorDao {
    public List<Operator> findAll();
    public void addOperator(Operator operator);
    public void deleteOperator(Operator operator);
    public boolean updateOperator(Operator operator);
    Operator searchbyID(int id);
    public  List<Operator> showOperatorbyName(String operatorname);
    List<Operator> findOperatorByName(@Param("operatorName") String operatorName);
}
