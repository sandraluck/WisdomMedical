package com.dommy.qrcode;

/**
 * Created by Administrator on 2017/9/14.
 */
import java.util.ArrayList;
import java.util.List;

public class Project {//医学影像项目：主要类型包括：CT X射线 超声波 磁共振等
    //病人的某一医学影像包括（列式需要展示的）医学影像的名称+缩略图（数组）+后续在全屏窗口中需要展示文字信息（影像整体和主体size 时间）
    //传递病人名字 病历号等信息
    private String name;
    private int imageId;
    private String desc;
    //private SimpleDateFormat time;
    //年月日 时分秒

    //构造函数
    public Project(String name, int imageId, String desc) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }
    public static List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<Project>();
        projects.add(new Project("肺炎CT",R.drawable.lung,"size:1800x1600"));
        projects.add(new Project("肝硬化CT",R.drawable.liver,"size:1280x1080"));
        projects.add(new Project("胸部CT",R.drawable.chest,"size:720x560"));

        return projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

