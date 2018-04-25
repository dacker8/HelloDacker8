package th.in.androidthai.hellodacker8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import th.in.androidthai.hellodacker8.fragment.Mainfragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new Mainfragment())
                    .commit();

        }


    }   // Main Method
}   // Main Class
