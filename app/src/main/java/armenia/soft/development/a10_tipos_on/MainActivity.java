package armenia.soft.development.a10_tipos_on;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final static String MENSAJE = "Se esta ejecutando: ";

    /*1. Oncreate
     * 1.? OnRestart --> Solo si ya se ejecuto previamente
     * 2. OnStart
      * 3. OnResume
      * 4. OnPause
      * 5. OnStop*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MENSAJE, "On Create .....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MENSAJE, "On Restart .....");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MENSAJE, "On Start .....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MENSAJE, "On Resume .....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MENSAJE, "On Pause .....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MENSAJE, "On Stop .....");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MENSAJE, "On Destroy .....");
    }


    public void abrir(View view) {
        Intent intent = new Intent(this, SegundoActivity.class);
        startActivity(intent);
    }

    public void finalizar(View view) {
        finish();
    }


}
