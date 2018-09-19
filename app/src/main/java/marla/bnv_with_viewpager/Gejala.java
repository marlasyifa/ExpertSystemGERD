package marla.bnv_with_viewpager;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;



public class Gejala extends Fragment {

    Button btnSubmit, btnReset;
    CheckBox[] checkBox;
    double[] HasilDiagnosa;
    boolean flag=true;

    public Gejala() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_diagnosis, container, false);

        checkBox = new CheckBox[11];
        for(int i = 1;i <= 10; i++){
            String checkBoxID = "CheckBox"+(i);
            Log.d("TEST", checkBoxID);
            int resID = getResources().getIdentifier(checkBoxID, "id", getActivity().getPackageName());

            checkBox[i] = ((CheckBox) view.findViewById(resID));
        }


        btnSubmit = (Button) view.findViewById(R.id.submit);
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                HasilDiagnosa = new double[11];
//                boolean first = checkBox[1].isChecked();
//                for (int i = 1; i <= 10; i++) {
//                    if (checkBox[i].isChecked()) {
//                        HasilDiagnosa[i] = 1;
//                    } else {
//                        HasilDiagnosa[i] = 0;
//                    }
//
//                    if (checkBox[i].isChecked() != first | checkBox[1].isChecked()) flag = false;
//                }
//                if (flag) {
//                    Log.d("AAA", "TEST");
//                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
//                    alertDialog.setMessage("Pilih gejala terlebih dahulu");
//                    alertDialog.setTitle("Error");
//                    alertDialog.setPositiveButton("OK",
//                            new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//
//                                }
//                            });
//                    alertDialog.setCancelable(true);
//                    alertDialog.create().show();
//                }else{
//
//                    Intent intent = new Intent(getActivity(), Hasil.class);
//                    intent.putExtra("ArrayHasil", HasilDiagnosa);
//                    startActivity(intent);
//                }
//
//            }
//        });

        btnReset = (Button) view.findViewById(R.id.reset);
//        btnReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                for (int i = 1; i <= 10; i++) {
//                    checkBox[i].setChecked(false);
//                }
//            }
//        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Resources r = getResources();
//        checkBox = new CheckBox[11];
//        for(int i = 1;i <= 10; i++){
//            String checkBoxID = "CheckBox"+(i);
//            Log.d("TEST", checkBoxID);
//            int resID = getResources().getIdentifier(checkBoxID, "id", getActivity().getPackageName());
//
//            checkBox[i] = ((CheckBox) getView().findViewById(resID));
//        }
//
//
//        btnSubmit = (Button) getView().findViewById(R.id.submit);
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                HasilDiagnosa = new double[11];
//                boolean first = checkBox[1].isChecked();
//                for (int i = 1; i <= 10; i++) {
//                    if (checkBox[i].isChecked()) {
//                        HasilDiagnosa[i] = 1;
//                    } else {
//                        HasilDiagnosa[i] = 0;
//                    }
//
//                    if (checkBox[i].isChecked() != first | checkBox[1].isChecked()) flag = false;
//                }
//                if (flag) {
//                    Log.d("AAA", "TEST");
//                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
//                    alertDialog.setMessage("Pilih gejala terlebih dahulu");
//                    alertDialog.setTitle("Error");
//                    alertDialog.setPositiveButton("OK",
//                            new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//
//                                }
//                            });
//                    alertDialog.setCancelable(true);
//                    alertDialog.create().show();
//                }else{
//
//                    Intent intent = new Intent(getActivity(), Hasil.class);
//                    intent.putExtra("ArrayHasil", HasilDiagnosa);
//                    startActivity(intent);
//                }
//
//            }
//        });
//
//        btnReset = (Button) getView().findViewById(R.id.reset);
//        btnReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                for (int i = 1; i <= 10; i++) {
//                    checkBox[i].setChecked(false);
//                }
//            }
//        });
    }
}
