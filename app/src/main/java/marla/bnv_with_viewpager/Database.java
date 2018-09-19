package marla.bnv_with_viewpager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="db_gerd.db";
    private static final int DATABASE_VERSION = 1;
    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table gejala(kode_gejala text not null, nama_gejala text not null, nilai_cf int not null); ";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G01', 'Mual', '0.7');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G02', 'Muntah', '0.8');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G03', 'Suara serak', '0.3');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G04', 'Terasa sakit ketika menelan', '0.8');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G05', 'Otot perut terasa kejang', '0.6');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G06', 'Rasa panas di bagian dada', '0.9');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G07', 'Rasa asam di mulut', '0.8');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G08', 'Rasa terbakar di ulu hati', '1');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G09', 'Rasa terbakar di tenggorokan', '1');";
        db.execSQL(sql);
        sql = "INSERT INTO gejala (kode_gejala, nama_gejala, nilai_cf) VALUES ('G10', 'Penurunan berat badan', '0.5');";
        db.execSQL(sql);

        sql = "create table history(nama_user text not null, tanggal text not null, hasilakut text not null, hasilkronis text not null);";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
//        db.execSQL("DROP TABLE IF EXISTS GEJALA");
//        db.execSQL("DROP TABLE IF EXISTS HISTORY");
    }
}

