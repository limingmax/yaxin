package com.test.po.ivalues;

import com.ai.appframe2.common.DataStructInterface;

public interface IBOTestValue extends DataStructInterface{

  public final static  String S_Password = "PASSWORD";
  public final static  String S_Username = "USERNAME";
  public final static  String S_Id = "ID";


public String getPassword();

public String getUsername();

public int getId();


public  void setPassword(String value);

public  void setUsername(String value);

public  void setId(int value);
}
