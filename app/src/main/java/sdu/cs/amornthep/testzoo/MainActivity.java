package sdu.cs.amornthep.testzoo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static sdu.cs.amornthep.testzoo.R.*;

public class MainActivity extends AppCompatActivity {

    MediaPlayer MySound ;
    ImageView imvZoo;
    ImageButton imbG,imbC,imbH,imbE,imbL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
         imbH = (ImageButton)findViewById(id.imbH);
         imbH.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MediaPlayer MySound = MediaPlayer.create(MainActivity.this, R.raw.horse);
                MySound.start();

             }
         });
         imbE = (ImageButton)findViewById(id.imbE);
         imbE.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MediaPlayer MySound =MediaPlayer.create(MainActivity.this, R.raw.elephant);
                 MySound.start();
             }
         });
         imbL = (ImageButton)findViewById(id.imbL);
         imbL.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MediaPlayer MySound =MediaPlayer.create(MainActivity.this, R.raw.lion);
                 MySound.start();
             }
         });

    }


}
