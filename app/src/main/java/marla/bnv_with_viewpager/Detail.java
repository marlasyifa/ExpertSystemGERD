//package marla.bnv_with_viewpager;
//
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.widget.TextView;
//
//import java.util.Arrays;
//
//public class Detail extends AppCompatActivity {
//
//    TextView namapenderita;
//    Bundle data;
//    String NAMA;
//
//    String[] KodeGejala, NamaGejala;
//    Database dbcenter;
//    protected Cursor cursor;
//    TextView txtKode, txtGejala;
//    String test1, test2, nama;
//    String TAG_NAMA = "nama_penderita";
//
//    TextView txtHasilAkut, txtHasilKronis, txtBanding;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil);
//
//        dbcenter = new Database(this);
//
//        final SQLiteDatabase db = dbcenter.getReadableDatabase();
//
//        namapenderita = (TextView) findViewById(R.id.nama);
//
//        data = getIntent().getExtras();
//
//
//
//
//        Bundle extras = getIntent().getExtras();
//        nama = extras.getString(TAG_NAMA);
//
//
//        namapenderita.setText(nama);
//
//
//        txtKode = (TextView) findViewById(R.id.TxtKode);
//        txtGejala = (TextView) findViewById(R.id.TxtGejala);
//        test1 = "";
//        test2 = "";
//
//        cursor = db.rawQuery("SELECT * FROM gejala", null);
//        KodeGejala = new String[cursor.getCount()];
//        NamaGejala = new String[cursor.getCount()];
//        cursor.moveToFirst();
//
//        double[] HasilDiagnosa = getIntent().getDoubleArrayExtra("ArrayHasil");
//        double[] DaftarCF = new double[cursor.getCount()+1];
//        Log.d("l", Arrays.toString(HasilDiagnosa));
//
//        for (int cc = 0; cc < cursor.getCount(); cc++) {
//            cursor.moveToPosition(cc);
//            KodeGejala[cc] = cursor.getString(0);
//            Log.d("HASIL", KodeGejala[cc]);
//            NamaGejala[cc] = cursor.getString(1);
//            Log.d("HASIL", NamaGejala[cc]);
//            Log.d("DIAGNOSA", String.valueOf(HasilDiagnosa[cc+1]));
//            DaftarCF[cc] = Double.parseDouble(cursor.getString(2));
//            if(HasilDiagnosa[cc+1] == 1.0) {
//                test1 += KodeGejala[cc] + "\n";
//                test2 += NamaGejala[cc] + "\n";
//            }
//        }
//
//        txtKode.setText(test1);
//        txtGejala.setText(test2);
//
//        double[] gejala = new double[11];
//        double[] combine = new double[11];
//
//        for (int i = 1;i<=4;i++) {
//            gejala[i] = HasilDiagnosa[i+1] * DaftarCF[i];
//            Log.d( "daftar cf *", String.valueOf(DaftarCF[i]));
//            Log.d( "GEJALA *", String.valueOf(gejala[i]));
//        }
//        combine[1] = gejala[0]+gejala[1]*(1-gejala[0]);
//        Log.d( "combine[1]", String.valueOf(combine[1]));
//        combine[2] = combine[1]+gejala[2]*(1-combine[1]);
//        Log.d( "combine[2]", String.valueOf(combine[2]));
//        combine[3] = combine[2]+gejala[3]*(1-combine[2]);
//        Log.d( "combine[3]", String.valueOf(combine[3]));
//        combine[4] = combine[3]+gejala[4]*(1-combine[3]);
//        Log.d( "combine[4]", String.valueOf(combine[4]));
//
//        Log.d("ASFA", String.valueOf(combine[4]));
//        String NilaiAkut = String.valueOf(combine[4]*100);
//        Log.d("GGG", NilaiAkut);
//
//        txtHasilAkut = (TextView)findViewById(R.id.TxtHasilAkut);
//        txtHasilAkut.setText(NilaiAkut+" %");
//
//        for (int i = 6;i<=10;i++) {
//            gejala[i] = HasilDiagnosa[i] * DaftarCF[i];
//
//        }
//        combine[6] = gejala[6]+gejala[7]*(1-gejala[6]);
//        combine[7] = combine[6]+gejala[8]*(1-combine[6]);
//        combine[8] = combine[7]+gejala[9]*(1-combine[7]);
//        combine[9] = combine[8]+gejala[10]*(1-combine[8]);
//
//        Log.d("ASFA", String.valueOf(combine[9]));
//        String NilaiKronis = String.valueOf(combine[9]*100);
//        Log.d("GGG", NilaiKronis);
//
//        txtHasilKronis = (TextView)findViewById(R.id.TxtHasilKronik);
//        txtHasilKronis.setText(NilaiKronis+" %");
//
//        txtBanding = (TextView)findViewById(R.id.TxtBanding);
//        if (combine[4]<=combine[9]){
//            txtBanding.setText("Gastroesophageal Reflux Disease Kronis. Segera periksakan diri ke dokter untuk mendapatkan penanganan lebih lanjut");
//        } else {
//            txtBanding.setText("Gastroesophageal Reflux Disease Akut. Ubah kebiasaan menunda waktu makan agar tidak terjadi kenaikan asam lambung");
//        }
//
//    }
//}
//
