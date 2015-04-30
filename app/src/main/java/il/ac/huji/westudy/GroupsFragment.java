package il.ac.huji.westudy;

/**
 * Created by LM on 30/04/2015.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GroupsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = new View(getActivity());
        view.setBackgroundColor(Color.BLACK);
        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
