package muchbeer.raum.navigianna;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import muchbeer.raum.navigianna.ui.gianna.GiannaFragment;

public class GiannaActivity extends AppCompatActivity implements GadielFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gianna_activity);



        //We are going to use navigation component
       /* if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, GiannaFragment.newInstance())
                    .commitNow();
        }*/
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
