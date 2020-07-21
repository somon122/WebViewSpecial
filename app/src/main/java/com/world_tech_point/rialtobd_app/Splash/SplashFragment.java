package com.world_tech_point.rialtobd_app.Splash;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.world_tech_point.rialtobd_app.MainActivity;
import com.world_tech_point.rialtobd_app.R;


public class SplashFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_splash, container, false);


        init();

        return  root;

    }

    private void init() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               startApp();
            }
        },3000);


    }

    private void startApp() {
        Intent intent = new Intent(getContext(), MainActivity.class);
        startActivity(intent);


    }


}