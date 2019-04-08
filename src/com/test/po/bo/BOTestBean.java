package com.test.po.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.test.po.ivalues.IBOTestValue;


public class BOTestBean extends DataContainer implements DataContainerInterface, IBOTestValue {

    private static String  m_boName = "com.test.po.bo.BOTestBean";


    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setPassword(String value) {

    }

    @Override
    public void setUsername(String value) {

    }

    @Override
    public void setId(int value) {

    }

    public static ObjectType S_TYPE = null;
    static{
        try {
            S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public BOTestBean() throws AIException{
        super(S_TYPE);
    }

    public static ObjectType getObjectTypeStatic() throws AIException{
        return S_TYPE;
    }

    public void setObjectType(ObjectType  value) throws AIException{
        //此种数据容器不能重置业务对象类型
        throw new AIException("Cannot reset ObjectType");
    }





}

