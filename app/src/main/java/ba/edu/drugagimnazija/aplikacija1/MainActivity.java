package ba.edu.drugagimnazija.aplikacija1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Button promijeniPozadinu;
    private WallpaperManager wpngr;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        promijeniPozadinu = findViewById(R.id.Button);
        promijeniPozadinu.setOnClickListener(new View.OnClickListener(){
        @SuppressLint("ResourceType")
        @Override
                public void  onClick(View v){
                wpngr = WallpaperManager.getInstance(MainActivity.this);
               try {
                   wpngr.setResource(R.drawable.wallpaper);
               }catch (IOException e) {
                   e.printStackTrace();
               }
        }
        });
    }
}
