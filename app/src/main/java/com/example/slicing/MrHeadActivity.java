package com.example.slicing;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MrHeadActivity extends AppCompatActivity {

    private CheckBox beardCheckbox, hairCheckbox, eyebrowCheckbox, moustacheCheckbox;
    private ImageView beard, hair, eyebrow, moustache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_head);
//        Image
        beard = findViewById(R.id.beard);
        hair = findViewById(R.id.hair);
        eyebrow = findViewById(R.id.eyebrow);
        moustache = findViewById(R.id.moustache);

        beard.setVisibility(View.INVISIBLE);
        hair.setVisibility(View.INVISIBLE);
        eyebrow.setVisibility(View.INVISIBLE);
        moustache.setVisibility(View.INVISIBLE);

//        Checkbox
        beardCheckbox = findViewById(R.id.beardCheckbox);
        hairCheckbox = findViewById(R.id.hairCheckbox);
        eyebrowCheckbox = findViewById(R.id.eyebrowCheckbox);
        moustacheCheckbox = findViewById(R.id.moustacheCheckbox);

        beardCheckbox.setOnClickListener(checkBoxListener(beard, beardCheckbox));
        hairCheckbox.setOnClickListener(checkBoxListener(hair, hairCheckbox));
        eyebrowCheckbox.setOnClickListener(checkBoxListener(eyebrow, eyebrowCheckbox));
        moustacheCheckbox.setOnClickListener(checkBoxListener(moustache, moustacheCheckbox));
    }


    protected View.OnClickListener checkBoxListener(ImageView bodyPart, CheckBox bodyPartCheckBox){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bodyPartCheckBox.isChecked()){
                    bodyPart.setVisibility(View.VISIBLE);
                }
                else{
                    bodyPart.setVisibility(View.INVISIBLE);
                }
            }
        };
    }
}
