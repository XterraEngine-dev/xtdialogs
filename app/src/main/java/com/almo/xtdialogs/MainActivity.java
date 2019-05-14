package com.almo.xtdialogs;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    Button positive, negative;
    Dialog epicDialog;
    ImageView closePoppupPositiveImg, closePoppupNegativeImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epicDialog = new Dialog(this);

        positive = findViewById(R.id.positivePopput);
        negative = findViewById(R.id.negativePopput);


        positive.setOnClickListener(v -> acctionPositive());
        negative.setOnClickListener(v -> AcctionNegative());

    }

    private void acctionPositive() {
        epicDialog.setContentView(R.layout.epic_popup_positive);
        closePoppupPositiveImg = epicDialog.findViewById(R.id.epic_positive_close);
        closePoppupPositiveImg.setOnClickListener(v -> epicDialog.dismiss());
        Objects.requireNonNull(epicDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }

    private void AcctionNegative() {
        epicDialog.setContentView(R.layout.epic_popup_negative);
        closePoppupNegativeImg = epicDialog.findViewById(R.id.epic_negative_close);
        closePoppupNegativeImg.setOnClickListener(v -> epicDialog.dismiss());
        Objects.requireNonNull(epicDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }
}
