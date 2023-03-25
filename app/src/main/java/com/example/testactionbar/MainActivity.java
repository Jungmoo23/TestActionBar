package com.example.testactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.test1:
                Toast.makeText(this,"Test1 Click",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test2:
                Toast.makeText(this,"Test2 Click",Toast.LENGTH_SHORT).show();
                break;
            case R.id.test3:
                Toast.makeText(this,"Test3 Click",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}