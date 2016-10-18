package com.marwilin.beatboxer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



/**
 * A simple {@link Fragment} subclass.
 */
public class LightFragment extends Fragment {

    private Button btnCymbal;
    private Button btnHat;
    private Button btnKick;
    private Button btnSnare;
    private Button btnShaker;
    private Button btnBass;
    private Button btnRattle;
    private Button btnSnap;

    View rootView;

    private SoundPool soundPool;
    private int cymbalID;
    private int hatID;
    private int kickID;
    private int snareID;
    private int shakerID;
    private int bassID;
    private int rattleID;
    private int snapID;

    boolean loaded = false;

    public LightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflejtam layout za fragment
        rootView = inflater.inflate(R.layout.fragment_light, container, false);

        initWidgets();
        setupListeners();
        loadSounds();

        return rootView;
    }

    private void loadSounds() {

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                loaded = true;
            }
        });

        cymbalID = soundPool.load(getContext(), R.raw.cymbal, 1);
        hatID = soundPool.load(getContext(), R.raw.hat, 1);
        kickID = soundPool.load(getContext(), R.raw.kick, 1);
        snareID = soundPool.load(getContext(), R.raw.snare, 1);
        shakerID = soundPool.load(getContext(), R.raw.shaker, 1);
        bassID = soundPool.load(getContext(), R.raw.bass, 1);
        rattleID = soundPool.load(getContext(), R.raw.rattle, 1);
        snapID = soundPool.load(getContext(), R.raw.snap, 1);
    }

    private void initWidgets() {
        btnCymbal = (Button) rootView.findViewById(R.id.btnCymbal);
        btnHat = (Button) rootView.findViewById(R.id.btnHat);
        btnKick = (Button) rootView.findViewById(R.id.btnKick);
        btnSnare = (Button) rootView.findViewById(R.id.btnSnare);
        btnShaker = (Button) rootView.findViewById(R.id.btnShaker);
        btnBass = (Button) rootView.findViewById(R.id.btnBass);
        btnRattle = (Button) rootView.findViewById(R.id.btnRattle);
        btnSnap = (Button) rootView.findViewById(R.id.btnSnap);
    }


    private void setupListeners() {
        btnCymbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(cymbalID, 1, 1, 1, 0, 1f);
                }
            }

        });
        btnHat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(hatID, 1, 1, 1, 0, 1f);
                }
            }
        });
        btnKick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(kickID, 1, 1, 1, 0, 1f);
                }
            }
        });
        btnSnare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(snareID, 1, 1, 1, 0, 1f);
                }
            }
        });
        btnShaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(shakerID, 1, 1, 1, 0, 1f);
                }
            }
        });
        btnBass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(bassID, 1, 1, 1, 0, 1f);
                }
            }
        });
        btnRattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(rattleID, 1, 1, 1, 0, 1f);
                }
            }
        });
        btnSnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loaded) {
                    soundPool.play(snapID, 1, 1, 1, 0, 1f);
                }
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
