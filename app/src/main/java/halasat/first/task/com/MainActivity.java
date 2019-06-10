package halasat.first.task.com;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.activity2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                intent.putExtra("title", "Test");
                intent.putExtra("videoUrl", "http://halasat2.vodu.me:80/vod/playlist_2_77636562545130.json/master.m3u8");
                startActivity(intent);
            }
        });
    }
}