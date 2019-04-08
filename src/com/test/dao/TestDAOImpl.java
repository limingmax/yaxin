package com.test.dao;

import com.ai.appframe2.util.criteria.Criteria;
import com.test.po.ivalues.IBOTestValue;
import com.test.po.bo.BOTestBean;
import com.test.po.bo.BOTestEngine;

import java.util.List;

public class TestDAOImpl implements ITestDAO {

    @Override
    public List<BOTestBean> getAll()throws Exception {
        Criteria sql = new Criteria();
        sql.addEqual(IBOTestValue.S_Id, 10010);
        BOTestBean[] iboSfCoAttrValues = BOTestEngine.getBeans(sql);
        System.out.println(iboSfCoAttrValues.length);
        return null;
    }
}
