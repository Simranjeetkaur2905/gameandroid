package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    /*
    * 0 is player red
    * * 1 is payer yellow
     */
    private int player = 0;

    private int[] gamestate = {-1,-1,-1,-1,-1,-1,-1,-1};
 public void  dropImage(View v){
     ImageView imageView = (ImageView)v;

     int state = Integer.valueOf(imageView.getTag().toString());

     if(gamestate[state] == -1) {


         gamestate[state] = player;
         imageView.setTranslationY(-1500);

         imageView.setImageResource(R.drawable.yellow);

         imageView.animate().translationYBy(1500).setDuration(300);
         if (player == 0) {
             imageView.setImageResource(R.drawable.yellow);
             player = 1;
         } else {
             imageView.setImageResource(R.drawable.red);
             player = 0;
         }
     }


 }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
