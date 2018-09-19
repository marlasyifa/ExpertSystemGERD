package marla.bnv_with_viewpager.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import marla.bnv_with_viewpager.GejalaGerd;
import marla.bnv_with_viewpager.History;
import marla.bnv_with_viewpager.R;



public class DiagnosisFragment extends Fragment implements View.OnClickListener {
    TextView nama, jeniskelamin, umur;
    EditText edt_nama, edt_jk, edt_umur;
    Button next, history;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_diagnosis, container, false);

        edt_nama = (EditText) view.findViewById(R.id.editnama);
        edt_jk = (EditText) view.findViewById(R.id.editjk);
        edt_umur = (EditText) view.findViewById(R.id.editumur);
        next = (Button) view.findViewById(R.id.next);
        history = (Button) view.findViewById(R.id.history);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpan = new Intent(getActivity(), History.class);
                startActivity(simpan);
            }
        });
        nama = (TextView) view.findViewById(R.id.textnama);
        jeniskelamin = (TextView) view.findViewById(R.id.textjk);
        umur = (TextView) view.findViewById(R.id.textumur);
        next.setOnClickListener(this);
//            @Override
//            public void onClick(View view) {
//                Intent informasi = new Intent(getActivity(), Hasil.class);
//                informasi.putExtra("nama_penderita", edt_nama.getText().toString());
//                informasi.putExtra("jk_penderita", edt_jk.getText().toString());
//                informasi.putExtra("umur_penderita", edt_umur.getText().toString());
//                startActivity(informasi);
//            }
//        });
        return view;
        }


    @Override
    public void onClick(View view) {
        Intent informasi = new Intent(getActivity(), GejalaGerd.class);
        informasi.putExtra("nama_penderita", edt_nama.getText().toString());
        informasi.putExtra("jk_penderita", edt_jk.getText().toString());
        informasi.putExtra("umur_penderita", edt_umur.getText().toString());
        startActivity(informasi);



//        Fragment fragment = new GejalaGerd();
//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
//        transaction.replace(R.id.viewpager, fragment);
//        transaction.addToBackStack(null);
//        Bundle bundle = new Bundle();
//        bundle.putString("nama_penderita", edt_nama.getText().toString());
//        bundle.putString("jk_penderita", edt_jk.getText().toString());
//        bundle.putString("umur_penderita", edt_umur.getText().toString());
//        fragment.setArguments(bundle);
//        transaction.commit();
    }

}

