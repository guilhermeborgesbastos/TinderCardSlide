package guilhermeborgesbastos.com.br.tindercardslide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import guilhermeborgesbastos.com.br.tindercardslide.fragment.SlideCardFragment;

/**
 * Created by Guilherme Borges Bastos on 02/17/2016.
 * guilhermeborgesbastos@gmail.com
 */

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private SlideCardFragment slideCardFragment;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        slideCardFragment = new SlideCardFragment(this);

        FragmentManager fm = getSupportFragmentManager();
        fragment = fm.findFragmentByTag("SlideCardFragment");

        if (fragment == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.content, slideCardFragment, "SlideCardFragment");
            ft.commit();
        }

        setContentView(R.layout.main_activity);

    }

}
