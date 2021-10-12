package com.yxy.gitsubmodule.module;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.yxy.gitsubmodule.R;


public class Builder extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //创建者模式
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher)
                .setTitle("")
                .create()
                .show();
    }

    //克隆模式
    private void cloneyxy() {
        Uri uri = Uri.parse("smsto:10086");
        Intent intent = new Intent(Intent.ACTION_SEND, uri);

        Intent intentnew = (Intent) intent.clone();
    }
}
