package com.dommy.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class PatientActivity extends AppCompatActivity {

    EditText edtTxtNum;//病历号
    EditText edtTxtName;//姓名
    Spinner spinner;//性别
    EditText edtTxtAge;//年龄
    EditText edtTxtPhone;//电话
    EditText edtTxtAddress;//联系地址


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        edtTxtNum= (EditText) findViewById(R.id.edtTxtNum);
        edtTxtName= (EditText) findViewById(R.id.edtTxtName);
        edtTxtAge= (EditText) findViewById(R.id.edtTxtAge);
        edtTxtPhone= (EditText) findViewById(R.id.edtTxtPhone);
        edtTxtAddress= (EditText) findViewById(R.id.edtTxtAddress);

        //取得启动该Activity的Intent对象
        Intent intent =getIntent();
                /*取出Intent中附加的数据*/
        edtTxtNum.setText(intent.getStringExtra("edtTxtNum"));
        edtTxtName.setText("张三");
        edtTxtAge.setText("23");
        edtTxtPhone.setText("18755962356");
        edtTxtAddress.setText("浙江省杭州市西湖区");
        //初始化一个Adapter
        ProjectAdapter projectAdapter = new ProjectAdapter(this, R.layout.project_item, Project.getAllProjects());

        //通过ID获取listView
        ListView listView = (ListView) findViewById(R.id.lvImage);

        //设置listView的Adapter
        listView.setAdapter(projectAdapter);
    }
}
