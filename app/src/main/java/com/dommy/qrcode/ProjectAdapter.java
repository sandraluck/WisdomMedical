package com.dommy.qrcode;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/9/14.
 */

public class ProjectAdapter extends ArrayAdapter<Project> {

    public ProjectAdapter(Context context, int resource, List<Project> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 获取影像的数据
        final Project project = getItem(position);

        // 创建布局
        View oneprojectView = LayoutInflater.from(getContext()).inflate(R.layout.project_item, parent, false);

        // 获取ImageView和TextView
        ImageView imageView = oneprojectView.findViewById(R.id.project_image);
        TextView textView = oneprojectView.findViewById(R.id.project_name);

        // 根据数据设置ImageView和TextView
        imageView.setImageResource(project.getImageId());
        textView.setText(project.getName());

        oneprojectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  初始化一个准备跳转到DisplayActivity的Intent
                Intent intent = new Intent(getContext(), DisplayActivity.class);
                // 往Intent中传入Project相关的数据，供DisplayActivity使用
                intent.putExtra("project_image", project.getImageId());
                intent.putExtra("project_desc", project.getDesc());
                // 准备跳转
                getContext().startActivity(intent);
            }
        });

        return oneprojectView;
    }
}
