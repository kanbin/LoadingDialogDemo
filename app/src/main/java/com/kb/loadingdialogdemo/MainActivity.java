package com.kb.loadingdialogdemo;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_loading = null;

    private Dialog dlg_loading = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initListeners();
    }


    private void initUI() {
        btn_loading = (Button) findViewById(R.id.main_btn_show_loading_dialog);

    }

    private void initListeners() {
        btn_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dlg_loading = DialogUtil.createLoadingDialog(MainActivity.this, "加载中...");
            }
        });
    }

}
