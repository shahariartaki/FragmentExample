package com.example.taki.fragmentexample2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button frag1,frag2,frag3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag1=findViewById(R.id.frag1);
        frag2=findViewById(R.id.frag2);
        frag3=findViewById(R.id.frag3);
    }

    public void selectfrag1(View view) {

        switch (view.getId()){
            case R.id.frag1:
                // select button 1
                Toast.makeText(this, "Button one pressed", Toast.LENGTH_SHORT).show();
                addFragment(new fragment1());
                break;

            case R.id.frag2:
                // select button 2
                Toast.makeText(this, "Button two pressed", Toast.LENGTH_SHORT).show();
                addFragment(new fragment2());
                break;

            case R.id.frag3:
                // select button 3
                Toast.makeText(this, "Button three pressed", Toast.LENGTH_SHORT).show();
                addFragment(new fragment3());
                break;

        }


    }

    private void addFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.fragment_place,fragment);
        transaction.commit();

    }
}
