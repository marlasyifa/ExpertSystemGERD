package marla.bnv_with_viewpager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    //deklarasi variable context

    private final Context context;

    String [] name={"Kenali Gejala Penyakit GERD","Beda Sakit Mag, GERD, dan Tukak Lambung","Mengenal GERD, Asam Lambung Mematikan","Ketika Asam Lambung Naik Hingga ke Kerongkongan", "Hindari Penyakit Asam Lambung, Ketahui Kapan Harus Makan", "Posisi Tidur yang Pas Supaya Asam Lambung Tak Naik","Ciri Ciri Asam Lambung Naik Ke Dada Dan Kerongkongan","Jangan Anggap Remeh Sakit Maag dan Asam Lambung","Asam Lambung yang Tak Boleh Disepelekan", "3 Fakta Menarik Seputar Asam Lambung"};
    int [] image = {R.drawable.satuawal,R.drawable.duaawal,R.drawable.tigaawal,R.drawable.empatawal,R.drawable.limaawal,R.drawable.enamawal,R.drawable.tujuhawal,R.drawable.delapanawal,R.drawable.sembilanawal,R.drawable.sepuluhawal};
    String [] deskripsi={"sumber : lifestyle.sindonews.com","sumber : health.detik.com","sumber : www.netralnews.com","sumber : lifestyle.kompas.com", "sumber : cantik.tempo.co", "sumber : cantik.tempo.co","sumber : www.asamlambung.niherbal.com","sumber : www.cnnindonesia.com","sumber : www.tirto.id", "sumber : www.ahlinyalambung.com"};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(image[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);
        holder.tv2.setText(deskripsi[position]);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//memberi aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition()+1;

            Intent intent = new Intent(context , IsiArtikel.class);
            intent.putExtra("POSITION", position);
            context.startActivity(intent);
        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
