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
                intent.putExtra("videoUrl", "https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8");
                intent.putExtra("imageUrl","https://github.com/mkaflowski/HybridMediaPlayer/blob/master/images/cover.jpg?raw=true");
                intent.putExtra("showTV",false);
                startActivity(intent);
            }
        });
    }
}
