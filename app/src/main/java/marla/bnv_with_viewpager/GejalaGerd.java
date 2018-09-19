package marla.bnv_with_viewpager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class GejalaGerd extends AppCompatActivity {
    Button btnSubmit, btnReset;
    CheckBox[] checkBox;
    String nama, jeniskelamin, umur;
    String TAG_NAMA = "nama_penderita";
    String TAG_JK = "jk_penderita";
    String TAG_UMUR = "umur_penderita";
    double[] HasilDiagnosa;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala_gerd);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(TAG_NAMA);
        jeniskelamin = extras.getString(TAG_JK);
        umur = extras.getString(TAG_UMUR);

        checkBox = new CheckBox[11];
        for (int i = 1; i <= 10; i++) {
            String checkBoxID = "CheckBox" + (i);
            Log.d("TEST", checkBoxID);
            int resID = getResources().getIdentifier(checkBoxID, "id", getPackageName());

            checkBox[i] = ((CheckBox) findViewById(resID));
        }


        btnSubmit = (Button) findViewById(R.id.submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilDiagnosa = new double[11];
                boolean first = checkBox[1].isChecked();
                for (int i = 1; i <= 10; i++) {
                    if (checkBox[i].isChecked()) {
                        HasilDiagnosa[i] = 1;
                    } else {
                        HasilDiagnosa[i] = 0;
                    }

                    if (checkBox[i].isChecked() != first | checkBox[1].isChecked()) flag = false;
                }
                if (flag) {
                    Log.d("AAA", "TEST");
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(GejalaGerd.this);
                    alertDialog.setMessage("Pilih gejala terlebih dahulu");
                    alertDialog.setTitle("Error");
                    alertDialog.setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    alertDialog.setCancelable(true);
                    alertDialog.create().show();
                } else {

                    Intent intent = new Intent(GejalaGerd.this, Hasil.class);
                    intent.putExtra(TAG_NAMA, nama);
                    intent.putExtra(TAG_UMUR, umur);
                    intent.putExtra(TAG_JK, jeniskelamin);
                    intent.putExtra("ArrayHasil", HasilDiagnosa);
                    startActivity(intent);
                }

            }
        });

        btnReset = (Button) findViewById(R.id.reset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 1; i <= 10; i++) {
                    checkBox[i].setChecked(false);
                }
            }
        });


//        @Override
//        public void(Bundle savedInstanceState){
//            super.onActivityCreated(savedInstanceState);
//
//            Resources r = getResources();
//            checkBox = new CheckBox[11];
//            for (int i = 1; i <= 10; i++) {
//                String checkBoxID = "CheckBox" + (i);
//                Log.d("TEST", checkBoxID);
//                int resID = getResources().getIdentifier(checkBoxID, "id", getActivity().getPackageName());
//
//                checkBox[i] = ((CheckBox) getView().findViewById(resID));
//            }
//
//
//            btnSubmit = (Button) getView().findViewById(R.id.submit);
//            btnSubmit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    HasilDiagnosa = new double[11];
//                    boolean first = checkBox[1].isChecked();
//                    for (int i = 1; i <= 10; i++) {
//                        if (checkBox[i].isChecked()) {
//                            HasilDiagnosa[i] = 1;
//                        } else {
//                            HasilDiagnosa[i] = 0;
//                        }
//
//                        if (checkBox[i].isChecked() != first | checkBox[1].isChecked())
//                            flag = false;
//                    }
//                    if (flag) {
//                        Log.d("AAA", "TEST");
//                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
//                        alertDialog.setMessage("Pilih gejala terlebih dahulu");
//                        alertDialog.setTitle("Error");
//                        alertDialog.setPositiveButton("OK",
//                                new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                                    }
//                                });
//                        alertDialog.setCancelable(true);
//                        alertDialog.create().show();
//                    } else {
//
//                        Intent intent = new Intent(getActivity(), Hasil.class);
//                        intent.putExtra("ArrayHasil", HasilDiagnosa);
//                        startActivity(intent);
//                    }
//
//                }
//            });
//
//            btnReset = (Button) getView().findViewById(R.id.reset);
//            btnReset.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    for (int i = 1; i <= 10; i++) {
//                        checkBox[i].setChecked(false);
//                    }
//                }
//            });
//        }
    }
}

