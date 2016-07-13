package com.location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * 兼容性的问题
     * @param savedInstanceState
     * 第二次提交
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 这是一个测试方法
     * @param args
     */
    public void test(String[] args){

    }

    /**
     * 这是第二个测试方法
     */
    public void test2(){

    }

    /**
     * 合并分支
     */
    public void commitBranch(){
        
    }

}
