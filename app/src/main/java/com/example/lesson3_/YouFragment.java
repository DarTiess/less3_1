package com.example.lesson3_;

import android.webkit.WebView;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.AsyncTask;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class YouFragment extends Fragment {

    WebView webYou;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.you_fragment, container, false);
        webYou=(WebView)view.findViewById(R.id.webYou);

        Button buttDownload=(Button) view.findViewById(R.id.downloadBut);
        buttDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webYou.loadUrl("https://www.youtube.com/");

            }
        });

        return view;
    }


    private class ProgresTask extends AsyncTask {
        @Override
        protected Object doInBackground(Object[] objects) {


            return null;
        }
    }
}
