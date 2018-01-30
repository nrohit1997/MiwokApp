package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by rohit on 1/25/2018.
 */

public class NumbersClickListener implements View.OnClickListener {


    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Open the list of the Numbers ",Toast.LENGTH_SHORT).show();
    }
}
