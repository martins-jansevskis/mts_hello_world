package lv.martins.vrvthello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("VRVT", "onCreate method");

        Button gotonext = findViewById(R.id.button);
        gotonext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, FullscreenActivity.class));
                Snackbar.make(v, "This is snackbar", Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("VRVT", "onPause method");
    }
}
