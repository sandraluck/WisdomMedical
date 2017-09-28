package com.dommy.qrcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DisplayActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private ImageView imageView;
    private SeekBar seekBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // 从Intent获取数据
        int imageId = getIntent().getIntExtra("project_image", 0);
        String desc = getIntent().getStringExtra("project_desc");

        // 获取特定的视图
        imageView = (ImageView) findViewById(R.id.project_image);
        textView = (TextView) findViewById(R.id.project_desc);

        // 根据数据设置视图展现
        imageView.setImageResource(imageId);
        textView.setText(desc);

        seekBar= (SeekBar) findViewById((R.id.seekBar));
        seekBar.setOnSeekBarChangeListener(this);

    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        seekBar.setMax(360);
        imageView.setRotation(progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }

}
