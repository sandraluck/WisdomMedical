package com.dommy.qrcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/19.
 */

public class Patient {//病人基本信息：姓名 病历号 性别 年龄 联系电话 联系地址
    private String pNum;
    private String pName;
    private String pSex;
    private int pAge;
    private String phone;
    private String pAddress;
    public Patient(String pName,String pNum,String pSex,int pAge,String phone,String pAddress)
    {

        this.pNum=pNum;
        this.pName=pName;
        this.pSex=pSex;
        this.pAge=pAge;
        this.phone=phone;
        this.pAddress=pAddress;
    }
    public static List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("201709160001","张三","男",23,"18755962356","浙江省杭州市西湖区"));
        patients.add(new Patient("201709160002","李四","男",22,"15687412286","北京市海淀区"));

        return patients;
    }
    public String getpNum() { return pNum; }//病历号

    public void setpNum(String pNum) { this.pNum = pNum;}

    public String getpName() {
        return pName;
    }//姓名

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpSex() { return pSex; }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public int getpAge() { return pAge; }

    public void setpAge(int pAge) { this.pAge = pAge; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) {
        this.pSex = phone;
    }

    public String getpAddress() { return pAddress; }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }
}
