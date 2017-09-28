package com.dommy.qrcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class PatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);


        //初始化一个Adapter
        ProjectAdapter projectAdapter = new ProjectAdapter(this, R.layout.project_item, Project.getAllProjects());

        //通过ID获取listView
        ListView listView = (ListView) findViewById(R.id.lvImage);

        //设置listView的Adapter
        listView.setAdapter(projectAdapter);
    }
}
