package marla.bnv_with_viewpager;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class History extends AppCompatActivity {
    String[] daftar;
    ListView ListView01;
    Menu menu;
    TextView textView;
    Database dbcenter;
    protected Cursor cursor;
    public static History halaman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        halaman = this;
        dbcenter = new Database(this);
        RefreshList();




//    textView = (TextView) findViewById(R.id.hasil);
//
//        dbcenter = new Database(this);
//
//        final SQLiteDatabase db = dbcenter.getReadableDatabase();
//
//        cursor = db.rawQuery("SELECT * FROM history", null);
//
//        cursor.moveToPosition(cursor.getCount()-1);
//
//        textView.setText(cursor.getString(0)+" , "+cursor.getString(1)+" , "+cursor.getString(2)+" , "+cursor.getString(3));

        }

    public void RefreshList() {
        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM history", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc = 0; cc < cursor.getCount(); cc++) {
            cursor.moveToPosition(cc);
            String text = cursor.getString(0)+" , Tanggal "+cursor.getString(1)+" , GERD Akut : "+cursor.getString(2)+" , GERD Kronis : "+cursor.getString(3);
            daftar[cc] = text;
        }
        ListView01 = (ListView) findViewById(R.id.list);
        ListView01.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListView01.setSelected(true);
        ListView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
 //               Intent i = new Intent(getApplicationContext(), Detail.class);
//                final String selection = daftar[arg2]; //.getItemAtPosition(arg2).toString();
//                Log.d("DAFTAR", selection);
//                i.putExtra("nama_panti", selection);
//                startActivity(i);


    }
});
        ((ArrayAdapter) ListView01.getAdapter()).notifyDataSetInvalidated();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

}
