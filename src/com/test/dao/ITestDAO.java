package com.test.dao;

import com.test.po.bo.BOTestBean;

import java.util.List;

public interface ITestDAO {

    List<BOTestBean> getAll() throws Exception;
}
