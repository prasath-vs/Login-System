package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int count=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.button);
        EditText t1=(EditText) findViewById(R.id.login);
        EditText t2=(EditText) findViewById(R.id.pass);

        TextView txt=(TextView) findViewById(R.id.attempt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=t1.getText().toString();
                String b=t2.getText().toString();

                if(a.equals("Prasath") && (b.equals("1234")) )
                {
                    Toast.makeText(getApplicationContext(),"Login Success!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    count=count-1;
                    Toast.makeText(getApplicationContext(),"Login Failed!",Toast.LENGTH_LONG).show();
                    txt.setText("Attempts left : "+count);

                    if(count==0)
                    {
                        b1.setEnabled(false);
                    }
                }
            }
        });

    }
}
