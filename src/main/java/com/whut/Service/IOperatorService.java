package com.whut.Service;

import com.whut.beans.Operator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOperatorService {
    public List<Operator> findAll(int page, int size);
    public void addOperator(Operator operator);
    public void deleteOperator(Operator operator);
    public boolean updateOperator(Operator operator);
    List<Operator> findOperatorByName(@Param("operatorName") String operatorName);
    Operator searchbyID(int id);
    public  List<Operator> showOperatorbyName(String operatorname);
}

