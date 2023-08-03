package com.example.mainprojectprototype;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class tueFragment extends Fragment {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public tueFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment thuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static thuFragment newInstance(String param1, String param2) {
        thuFragment fragment = new thuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);



        TextView andrlabone,andrlabtwo,breakone,ds,cn,breaktwo,pylabone,pylabtwo;
        andrlabone=view.findViewById(R.id.andrlabone);
        andrlabtwo=view.findViewById(R.id.andrlabtwo);
        breakone=view.findViewById(R.id.breakone);
        ds=view.findViewById(R.id.ds);
        cn=view.findViewById(R.id.cn);
        breaktwo=view.findViewById(R.id.breaktwo);
        pylabone=view.findViewById(R.id.pylabone);
        pylabtwo=view.findViewById(R.id.pylabtwo);







//3
        if (day == 3){


            if (hour == 9 && minute >= 0 && minute < 60) {
                //andrlabone
                andrlabone.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if (hour == 10 && minute >= 0 && minute < 60) {
                //andrlabtwo
                andrlabtwo.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if(hour == 11 && minute >= 0 && minute < 30) {
                // BREAK

                breakone.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if(hour == 11 && minute >= 30 && minute < 60 || hour == 12 && minute >= 0 && minute < 30) {
                // ds
                ds.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if (hour == 12 && minute >= 30 || hour == 13 && minute < 30) {
                //cn
                cn.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if (hour == 13 && minute >= 30 && minute < 45) {
                //break
                breaktwo.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if (hour == 13 && minute >= 45 || hour == 14 && minute < 45) {
                //pylabone
                pylabone.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }
            else if (hour == 14 && minute >= 45 || hour == 15 && minute < 45) {
                //pylabtwo
                pylabtwo.setBackgroundColor(Color.parseColor("#8BBEE8FF"));
            }




        }


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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tue, container, false);
    }
}



//fragment_tue