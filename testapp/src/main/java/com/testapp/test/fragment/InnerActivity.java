
package com.testapp.test.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.testapp.test.R;


public class InnerActivity extends Activity implements View.OnClickListener {

    private Fragment1 fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("AActivity onCreate this=" + this);

        System.out.println("AActivity taskid=" + this.getTaskId());

        setContentView(R.layout.activity_a);
        findViewById(R.id.aaa).setOnClickListener(this);


        FragmentManager fragmentManager = this.getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment1 = new Fragment1();
        fragmentTransaction.add(fragment1, "permission");
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
//        Intent intent = new Intent(AActivity.this, BActivity.class);
//        startActivity(intent);
        fragment1.getPermisson();

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        System.out.println("AActivity onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("AActivity onSaveInstanceState");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        System.out.println("AActivity onNewIntent");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("AActivity onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("AActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("AActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("AActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("AActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("AActivity onDestroy");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println("AActivity onActivityResult");
    }
}
