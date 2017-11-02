package com.example.mathijs.mathijsparmentier_pset1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView arms;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView moustache;
    ImageView nose;
    ImageView shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // VIEWS
        arms = (ImageView) findViewById(R.id.arms);
        ears = (ImageView) findViewById(R.id.ears);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        glasses = (ImageView) findViewById(R.id.glasses);
        hat = (ImageView) findViewById(R.id.hat);
        mouth = (ImageView) findViewById(R.id.mouth);
        moustache = (ImageView) findViewById(R.id.moustache);
        nose = (ImageView) findViewById(R.id.nose);
        shoes = (ImageView) findViewById(R.id.shoes);


    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("armsState", arms.getVisibility());
        outState.putInt("earsState", ears.getVisibility());
        outState.putInt("eyebrowsState", eyebrows.getVisibility());
        outState.putInt("eyesState", eyes.getVisibility());
        outState.putInt("glassesState", glasses.getVisibility());
        outState.putInt("hatState", hat.getVisibility());
        outState.putInt("mouthState", mouth.getVisibility());
        outState.putInt("moustacheState", moustache.getVisibility());
        outState.putInt("noseState", nose.getVisibility());
        outState.putInt("shoesState", shoes.getVisibility());
    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        arms.setVisibility(inState.getInt("armsState"));
        ears.setVisibility(inState.getInt("earsState"));
        eyebrows.setVisibility(inState.getInt("eyebrowsState"));
        eyes.setVisibility(inState.getInt("eyesState"));
        glasses.setVisibility(inState.getInt("glassesState"));
        hat.setVisibility(inState.getInt("hatState"));
        mouth.setVisibility(inState.getInt("mouthState"));
        moustache.setVisibility(inState.getInt("moustacheState"));
        nose.setVisibility(inState.getInt("noseState"));
        shoes.setVisibility(inState.getInt("shoesState"));

    }

    public void toggleArms(View view) {
        if(arms.getVisibility()==View.INVISIBLE)
            arms.setVisibility(View.VISIBLE);
        else
            arms.setVisibility(View.INVISIBLE);
    }

    public void toggleEars(View view) {
        if(ears.getVisibility()==View.INVISIBLE)
            ears.setVisibility(View.VISIBLE);
        else
            ears.setVisibility(View.INVISIBLE);
    }

    public void toggleEyebrows(View view) {
        if(eyebrows.getVisibility()==View.INVISIBLE)
            eyebrows.setVisibility(View.VISIBLE);
        else
            eyebrows.setVisibility(View.INVISIBLE);
    }

    public void toggleEyes(View view) {
        if(eyes.getVisibility()==View.INVISIBLE)
            eyes.setVisibility(View.VISIBLE);
        else
            eyes.setVisibility(View.INVISIBLE);
    }

    public void toggleGlasses(View view) {
        if(glasses.getVisibility()==View.INVISIBLE)
            glasses.setVisibility(View.VISIBLE);
        else
            glasses.setVisibility(View.INVISIBLE);
    }

    public void toggleHat(View view) {
        if(hat.getVisibility()==View.INVISIBLE)
            hat.setVisibility(View.VISIBLE);
        else
            hat.setVisibility(View.INVISIBLE);
    }

    public void toggleMouth(View view) {
        if(mouth.getVisibility()==View.INVISIBLE)
            mouth.setVisibility(View.VISIBLE);
        else
            mouth.setVisibility(View.INVISIBLE);
    }

    public void toggleMoustache(View view) {
        if(moustache.getVisibility()==View.INVISIBLE)
            moustache.setVisibility(View.VISIBLE);
        else
            moustache.setVisibility(View.INVISIBLE);
    }

    public void toggleNose(View view) {
        if(nose.getVisibility()==View.INVISIBLE)
            nose.setVisibility(View.VISIBLE);
        else
            nose.setVisibility(View.INVISIBLE);
    }

    public void toggleShoes(View view) {
        if(shoes.getVisibility()==View.INVISIBLE)
            shoes.setVisibility(View.VISIBLE);
        else
            shoes.setVisibility(View.INVISIBLE);
    }
}
