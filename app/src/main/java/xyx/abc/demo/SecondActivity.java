package xyx.abc.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();
        Integer name=i.getIntExtra("name",0);
        int roll=i.getIntExtra("rollno",0);
        Toast.makeText(this, ""+name+ " "+roll , Toast.LENGTH_SHORT).show();
    }
}
