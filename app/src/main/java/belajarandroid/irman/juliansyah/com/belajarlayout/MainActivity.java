package belajarandroid.irman.juliansyah.com.belajarlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button btnMulai = (Button) findViewById(R.id.btnMulai);
    }

    public void pindahBtn(View view) {
        Intent pindah = new Intent(MainActivity.this, Utama.class);
        startActivity(pindah);
    }
}

