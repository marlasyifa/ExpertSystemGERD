package marla.bnv_with_viewpager.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import marla.bnv_with_viewpager.R;

public class EditorFragment extends Fragment {
    private static final String KEY_POSITION="position";

    public static EditorFragment newInstance(int position) {
        EditorFragment frag=new EditorFragment();
        Bundle args=new Bundle();

        args.putInt(KEY_POSITION, position);
        frag.setArguments(args);

        return(frag);
    }

    public static String getTitle(Context ctxt, int position) {
        String judul = null;
        switch (position) {
            case 0:
                judul = "Pengertian";
                break;
            case 1:
                judul = "Penyebab";
                break;
            case 2:
                judul = "Penanganan";
                break;
        }
        return(judul);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        int position=getArguments().getInt(KEY_POSITION, -1);
        View result = null;
        switch (position) {
            case 0:
                result = inflater.inflate(R.layout.pengertian, container, false);
                break;
            case 1:
                result=inflater.inflate(R.layout.penyebab, container, false);
                break;
            case 2:
                result=inflater.inflate(R.layout.penanganan, container, false);
                break;
        }
        return(result);
    }
}
