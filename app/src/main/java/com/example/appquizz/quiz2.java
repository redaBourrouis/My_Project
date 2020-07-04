package com.example.appquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quiz2 extends AppCompatActivity {
    public static final String finalScore ="int value";
    private int i ;
    private TextView t ;
    Button btnNext;
    RadioGroup Rg;
    RadioButton rb2;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        Rg=findViewById(R.id.RG);
        rb2 = findViewById(R.id.Rb2);
        btnNext=findViewById(R.id.BtnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score=getIntent().getIntExtra(quiz1.yourScore,0);

                if(Rg.getCheckedRadioButtonId()== -1)
                {
                    Toast.makeText(quiz2.this, "Veuillez selectionner une réponse !", Toast.LENGTH_SHORT).show();
                }else
                {

                    if(Rg.getCheckedRadioButtonId()==rb2.getId())
                    {
                        score++;
                    }
                    Intent intent=new Intent(quiz2.this,ActivityScore.class);

                    intent.putExtra(finalScore,score);
                    startActivity(intent);
                }
            }
        });
    }
}
