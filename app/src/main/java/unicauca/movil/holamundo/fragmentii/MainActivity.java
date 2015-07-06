package unicauca.movil.holamundo.fragmentii;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import unicauca.movil.holamundo.fragmentii.fragments.ColorFragment;


public class MainActivity extends ActionBarActivity {

    ColorFragment azul, rojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        azul =  new ColorFragment();
        azul.init(ColorFragment.COLOR_AZUL);

        rojo = new ColorFragment();
        rojo.init(ColorFragment.COLOR_ROJO);

        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();

        fT.replace(R.id.container, azul);
        fT.replace(R.id.container2, rojo);

        fT.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
