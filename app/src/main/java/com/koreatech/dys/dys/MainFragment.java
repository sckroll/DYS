package com.koreatech.dys.dys;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MainFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // 프래그먼트 선언
    private Fragment timeFragment;
    private Fragment creditFragment;

    // 각 버튼(FrameLayout) 선언
    FrameLayout schedule;
    FrameLayout timetable;
    FrameLayout studyPlanner;
    FrameLayout reminder;
    FrameLayout lab;
    FrameLayout settings;

    public MainFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        timeFragment = new TimetableFragment();
        creditFragment = new CreditFragment();

        schedule = (FrameLayout) view.findViewById(R.id.tile_schedule);
        timetable = (FrameLayout) view.findViewById(R.id.tile_timetable);
        studyPlanner = (FrameLayout) view.findViewById(R.id.tile_study_planner);
        reminder = (FrameLayout) view.findViewById(R.id.tile_reminder);
        lab = (FrameLayout) view.findViewById(R.id.tile_lab);
        settings = (FrameLayout) view.findViewById(R.id.tile_settings);

        schedule.setOnClickListener(this);
        timetable.setOnClickListener(this);
        studyPlanner.setOnClickListener(this);
        reminder.setOnClickListener(this);
        lab.setOnClickListener(this);
        settings.setOnClickListener(this);

//        schedule.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        timetable.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//
//                transaction.replace(R.id.container, timeFragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
//            }
//        });
//        studyPlanner.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        reminder.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        lab.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        settings.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        getActivity().setTitle(R.string.title_main);

        // Inflate the layout for this fragment
        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (id == R.id.tile_schedule) {

        } else if (id == R.id.tile_timetable) {
            transaction.replace(R.id.container, timeFragment);
        } else if (id == R.id.tile_study_planner) {

        } else if (id == R.id.tile_reminder) {

        } else if (id == R.id.tile_lab) {

        } else if (id == R.id.tile_settings) {

        }

        transaction.addToBackStack(null);
        transaction.commit();
    }
}
