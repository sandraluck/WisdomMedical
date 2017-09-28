package com.dommy.qrcode;

/**
 * Created by Administrator on 2017/9/19.
 */

public class Patient {//病人基本信息：姓名 病历号 性别 年龄 联系电话 联系地址
    private String pName;
    private String pNum;
    private String pSex;
    private int pAge;
    private String phone;
    private String pAddress;
    public Patient(String pName,String pNum,String pSex,int pAge,String phone,String pAddress)
    {
        this.pName=pName;
        this.pNum=pNum;
        this.pSex=pSex;
        this.pAge=pAge;
        this.phone=phone;
        this.pAddress=pAddress;
    }
}
