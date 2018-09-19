package marla.bnv_with_viewpager;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class IsiArtikel extends AppCompatActivity {
    ImageView gambar;
    TextView isi, judul;
    int position;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_artikel);

        gambar= (ImageView) findViewById(R.id.gambarartikel);
        isi = (TextView) findViewById(R.id.isiartikel);
        judul = (TextView) findViewById(R.id.judul);

        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        if (mediaController == null) {
            // create an object of media controller class
            mediaController = new MediaController(IsiArtikel.this);
            mediaController.setAnchorView(videoView);
        }
        videoView.setMediaController(mediaController);

        position = getIntent().getIntExtra("POSITION", 0);

        switch (position) {
            case 1:
                judul.setText("Kenali Gejala Penyakit GERD");
                isi.setText("     Gastroesophageal Reflux Disease merupakan gangguan pencernaan akibat naiknya asam lambung ke kerongkongan. Penyakit ini bisa menyebabkan seseorang khawatir akan nyeri dada pada serangan jantung, padahal bisa saja itu merupakan gejala dari GERD. Apabila GERD berlangsung lama akan menyebabkan kerusakan pada lapisan kerongkongan yang memicu timbulnya erosi, penyempitan bahkan kanker kerongkongan.\n" +
                        "\n" +
                        "     GERD juga bisa disebabkan oleh banyak faktor seperti tekanan pada perut ibu hamil yang bertambah seiring dengan pertumbuhan janin menyebabkan arus balik isi lambung ke kerongkongan, merokok yang memicu kerusakan selaput lendir, meningkatkan sekresi asam, dan melemahkan LES, dan mengonsumsi makanan atau minuman yang mengandung cokelat, bawang merah, bawang putih, kopi, teh, alkohol, tomat, cabai, dan soda berlebihan, ucap Dokter spesialis penyakit dalam dengan subspesialis gastroenterologi dan hepatologi Digestive Clinic Siloam Hospitals Kebon Jeruk, dr Hardianto dalam Media Gathering Definisi dan Penyebab GERD di Siloam Kebon Jeruk, Jakarta.\n" +
                        "\n" +
                        "     Ia juga menuturkan GERD dipengaruhi oleh stress berlebihan, obat anti darah tinggi, obat anti diare dan orang yang terkena diabetes. Sedangkan, gejala dari GERD adalah rasa terbakar pada dada yang kadang menuju kerongkongan disertai dengan naiknya rasa asam ke mulut, nyeri dada mendadak, kesulitan menelan, suara serak, sakit tenggorokan, sering sendawa, karang gigi belakang, sinusitis berulang, dan kembung pada lambung.\n" +
                        "\n" +
                        "     Pada pasien dengan penyakit GERD, penting untuk menegakan diagnosa yang baik, disaat sedang sakit GERD alangkah baiknya jangan terlalu banyak mengonsumsi obat sakit maag, karena tidak semua sakit maag harus diobati dengan obat maag, perlu diagnose yang tepat agar tidak memakai obat dalam jumlah yang besar, GERD itu merupakan asam lambung yang naik, jika terus menerus minum obat sakit maag asam lambung akan semakin rendah dan bisa menyebabkan osteoporosis.\n" +
                        "\n" +
                        "     Ia menyarankan Jika GERD kambuh sebaiknya tidak panik, contohnya pada orang yang suka nyeri dada banyak orang yang mengira itu serangan jantung tapi setelah datang ke dokter jantungnya tidak apa-apa dan itu hanya GERD.\n" +
                        "\n" +
                        "     Membedakan sakit nyeri dada GERD dengan serangan jantung bisa dicoba jika sedang nyeri dada, minum air hangat ditambah obat maag lalu istirahat dan nyeri dadanya reda itu mungkin hanya GERD, tapi jika nyeri dadanya menetap ditambah nadi yang cepat itu baru serangan jantung.\n" +
                        "\n" +
                        "     Tahap awal pengobatan bisa dengan cara mengatur pola hidup dan menu makanan bagi penderita GERD, yaitu seperti tidak makan terlalu berlebih, tidak berbaring setelah makan minimal 3 jam, beralih mengkonsumsi makan-makanan yang rendah lemak, tidak terlalu asin, maupun terlalu pedas dan lain-lain. Tapi bila hal tersebut belum berhasil, obat-obatan bisa digunakan untuk meredakan gejala yang dirasakan, ungkap dr Hardianto.");
                gambar.setImageResource(R.drawable.satu);
                break;
            case 2:
                judul.setText("Beda Sakit Mag, GERD, dan Tukak Lambung");
                isi.setText("     Penyakit mag, GERD dan tukak lambung sebenarnya adalah tiga penyakit yang berbeda. Akan tetapi, sebagian besar orang awam menganggap tiga penyakit tersebut adalah penyakit yang sama. Meski jika dilihat dari gejalanya, ketiganya memang menunjukkan gejala yang sama.\n" +
                        "\n" +
                        "     Menurut dokter spesialis penyakit dalam, dr Muhammad Anshory, SpPD atau yang akrab disapa dr Anshory, mag merupakan istilah umum dari penyakit lambung, istilah tersebut berasal dari bahasa Belanda yang berarti 'lambung'. Penyakit ini bisa terjadi di kerongkongan sampai lambung. Gejalanya atau biasa disebut sebagai sindroma dispepsia berupa nyeri atau rasa tidak nyaman di ulu hati, kembung, mual, muntah, sendawa, rasa cepat kenyang, atau perut terasa penuh. \n" +
                        "\n" +
                        "     Sedangkan GERD atau Gastro Esophageal Reflux Disease merupakan kondisi di mana adanya refluks (keluarnya) cairan lambung ke dalam esofagus (kerongkongan). Salah satu gejala yang kerap muncul adalah rasa nyeri di daerah dada bagian bawah. \n" +
                        "\n" +
                        "     Sementara itu, tukak lambung adalah akibat dari kerusakan lapisan lambung yang terus menerus berlanjut dan menyebabkan luka atau tukak yaitu luka terbuka di lambung. Gejala yang timbul dapat sebagai dispepsia seperti nyeri atau rasa tidak nyaman di ulu hati, kembung, mual, muntah, sendawa, rasa cepat kenyang, atau perut terasa penuh.");
                gambar.setImageResource(R.drawable.dua);
                break;
            case 3:
                judul.setText("Mengenal GERD, Asam Lambung Mematikan");
                isi.setText("     Dokter Imam Susilo menjelaskan, Jika asam lambung itu naik ke daerah dada, maka kelak di seputar dada akan terasa panas seperti terbakar. Jika ia naik mengenai area jantung, maka ritme detak jantung bisa terganggu sehingga jantung bisa berdebar-debar kencang sehingga debarannya seperti lonceng yang rasanya seperti mau copot saja. \n" +
                        "\n" +
                        "     Jika asam lambung itu naik ke bagian THT (Tenggorokan, Hidung dan Telinga), maka tenggorokan akan sering terjadi radang, tenggorokan akan sulit menelan. Jika tenggorokan terjadi infeksi, dan kemudian menyempit, inilah yang membuat penderita akan merasakan bila tidur seperti dicekik orang, dan tenggorokan senantiasa terasa ada yang mengganjal. \n" +
                        "\n" +
                        "     Lalu apa yang terjadi pada hidung jika sering terkena asam lambung yang naik? Hidung bisa mengalami sinusitis. Gejalanya seperti flu yang tak sembuh-sembuh sepanjang tahun. Bayangkan. Flu satu hari saja rasanya tak enak banget, bagaimana jika itu terjadi dalam sehari-hari selama sepanjang tahun? \n" +
                        "\n" +
                        "     Lalu bagaimana pula jika asam lambung merembes ke bagian telinga? Orang yang terkena maag kronis, yang kemudian berkembang menjadi GERD, sering kemudian pendengaran menjadi berkurang, bahkan bisa kehilangan pendengarannya sama sekali. Sangat memprihatinkan. \n" +
                        "\n" +
                        "     Bukan hanya Tenggorokan, Hidung dan Telinga saja yang kemudian bisa terganggu. Namun, mata pun bisa terkena dampak dari naiknya asam lambung ke mana-mana. Penglihatan orang sakit maag dan GERD sering menjadi terganggu karena syaraf-syaraf mata terganggu oleh asam lambung yang merembes ke mata. Sehingga menjadi kabur penglihatannya.\n" +
                        "\n" +
                        "     Bukan itu saja penderitaan maag kronis dan GERD. Karena jika banyak organ menjadi terganggu fungsinya oleh naiknya asam lambung, maka penderitaan yang mereka alami sungguh sangat memprihatinkan. Kecuali lambung rasanya seperti disayat-sayat pisau, maka mereka juga akan sesak nafas, dan jantung berdebar.");
                gambar.setImageResource(R.drawable.tiga);
                break;
            case 4:
                judul.setText("Ketika Asam Lambung Naik Hingga ke Kerongkongan");
                isi.setText("     Asam lambung memegang peranan penting dalam fungsi pencernaan. Zat yang diproduksi lambung ini bisa mengurai makanan agar mudah diserap oleh tubuh. Hanya saja, jika sampai keluar dari area lambung, asam lambung bisa membawa petaka.\n" +
                        "\n" +
                        "     Salah satu kasus yang sering terjadi adalah asam lambung ke luar dari lambung dan naik ke kerongkongan. Dalam dunia kedokteran penyakit yang muncul akibat naiknya asam lambung ini dikenal dengan istilah gastro esophageal reflux disesase (GERD).\n" +
                        "\n" +
                        "     Gambaran singkatnya begini. Dalam proses pencernaan sebelum masuk ke lambung, makanan yang masuk dari mulut harus melewati saluran esophagus atau kerongkongan. Panjang kerongkongan bukan sebatas leher saja, tapi juga di bagian dada sebelum lambung. Dalam GERD, makanan dan cairan yang sudah masuk ke lambung kembali naik ke kerongkongan.\n" +
                        "\n" +
                        "     Gejala-gejala umum GERD adalah rasa perih yang hebat di lambung dan ulu hati. Karena nyeri tersebut, penderita GERD sering merasa mual dan muntah-muntah, bahkan sampai muntah kering.\n" +
                        "\n" +
                        "     Pada saat muntah, biasanya asam lambung naik sampai kerongkongan dan menyebabkan perih. Selain itu, dada terasa terbakar dan panas. \"Gejala lainnya sulit menelan, batuk kronis, radang tenggorokan, dan sering sendawa,\" kata Suhanto Kasmali, dokter umum dan Kepala Bidang Pelayanan Medik Rumah Sakit Mediros, Jakarta Timur.\n" +
                        "\n" +
                        "     GERD terjadi karena klep atau otot cincin pada perbatasan kerongkongan dengan lambung melemah. Dalam keadaan normal, otot cincin itu mengunci agar makanan yang masuk tak keluar lagi ke kerongkongan. Tekanan tinggi akibat produksi. asam lambung yang berlebihan juga menjadi faktor utamanya.\n" +
                        "\n" +
                        "     Dalam jangka panjang, GERD akan menyebabkan komplikasi di daerah kerongkongan, seperti radang, pendarahan, dan penyempitan. Beredarnya cairan lambung di daerah yang tidak seharusnya juga bisa menyebabkan kesulitan menelan, pencetus asma, batuk menahun, bahkan bisa menimbulkan kanker kerongkongan. Jadi, jangan sepelekan penyakit yang diakibatkan asam lambung ini.\n" +
                        "\n" +
                        "\n" +
                        "Video : www.youtube.com/eMedTV");
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
                Log.d("TEST", String.valueOf(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video)));
                videoView.setZOrderOnTop(true);
                videoView.setVisibility(View.VISIBLE);
                videoView.requestFocus();
                videoView.start();
                gambar.setImageResource(R.drawable.empat);
                break;
            case 5:
                judul.setText("Hindari Penyakit Asam Lambung, Ketahui Kapan Harus Makan");
                isi.setText("     Masalah asam lambung merupakan kondisi naiknya asam lambung dari lambung ke kerongkongan atau disebut dengan gastroesophageal reflux disease (GERD). Menurut dokter spesialis penyakit dalam, yang juga Wakil Ketua Perkumpulan Gastroenterologi Indonesia, Ari Fahrial Syam, masalah asam lambung lazim terjadi, tapi kerap diabaikan.\n" +
                        "\n" +
                        "     Ari menjelaskan, gaya hidup yang kurang tepat merupakan penyebab utama masalah asam lambung. Aktivitas sehari-hari yang dapat meningkatkan risiko penyakit asam lambung antara lain makan terlalu banyak, makan terburu-buru atau terlalu cepat, tidur terlentang dengan kepala sejajar atau lebih rendah dari tubuh, minum alkohol, minum kafein berlebihan, stres, dan merokok.\n" +
                        "\n" +
                        "    \"Cara terbaik menghindari penyakit asam lambung adalah mengubah gaya hidup, terutama dengan makan makanan sehat dan istirahat yang baik. Hindari rokok dan alkohol. Selain itu, ingat, perokok pasif juga mendapat dampak yang sama dengan orang yang merokok,\" ucapnya. \n" +
                        "\n" +
                        "     Ari menjelaskan, proses pengolahan makanan di lambung berlangsung selama 6-8 jam, tapi sebaiknya perut diisi setiap empat jam. Mengisi perut tidak harus selalu dengan makanan berat. \"Cukup diisi dengan makanan sehat, seperti sayur dan buah,\" ujarnya. Hindari cokelat, keju, makanan berlemak, makanan yang asam dan pedas, terutama sebelum tidur. \"Makan juga tidak boleh terburu-buru dan selambat-lambatnya satu jam sebelum tidur.\n" +
                        "\n" +
                        "     Setiap hari, kata Ari, kita mesti membagi waktu dalam tiga sesi, yakni untuk bekerja, kegiatan ringan, dan tidur masing-masing delapan jam. \"Tidur di malam hari tidak bisa digantikan dengan apa pun, termasuk oleh tidur siang,\" ujarnya. Waktu tidur ideal adalah delapan jam, tapi untuk orang dewasa minimal enam jam tidur pada malam hari.");
                gambar.setImageResource(R.drawable.lima);
                break;
            case 6:
                judul.setText("Posisi Tidur yang Pas Supaya Asam Lambung Tak Naik");
                isi.setText("     Orang tua selalu mengingatkan agar tidak langsung tidur atau rebahan setelah makan. Menurut dokter spesialis penyakit dalam, Ari Fahrial Syam, ucapan itu ada benarnya. \"Posisi tidur terlentang setelah makan dapat menyebabkan asam lambung naik,\" katanya.\n" +
                        "\n" +
                        "     Penyakit asam lambung, menurut dia, berbeda dengan maag. Asam lambung dapat merembet ke tenggorokan dan bagian tubuh lainnya atau disebut dengan penyakit GERD atau gastroesophageal reflux disease. Kebiasaan sehari-hari, seperti pola makan yang teratur dan tidur cukup, Ari Fahrial mengatakan, dapat membantu menghindari penyakit asam lambung.\n" +
                        "\n" +
                        "     Hanya saja, banyak yang belum mengetahui kalau posisi tidur juga menjadi suatu hal penting untuk menghindari penyakit asam lambung. Ada beberapa hal yang perlu diperhatikan saat tidur untuk memastikan tidak berbahaya buat lambung. Yang utama adalah, jangan makan sebelum tidur. Beri jeda makan dan tidur sedikitnya 1 jam untuk memastikan asam lambung tidak naik ke tenggorokan.\n" +
                        "\n" +
                        "     Bila ingin tidur terlentang beberapa saat setelah makan, kepala harus diganjal dengan bantal hingga setinggi 15-16 sentimeter dari tubuh. Jika kepala dalam posisi sejajar atau lebih rendah dari tubuh, maka kemungkinan asam lambung akan naik ke tenggorokan, atau cairan di lambung berbalik naik ke kerongkongan.\n" +
                        "\n" +
                        "     Tidur tengkurap juga tidak dianjurkan, terutama untuk pasien yang menderita GERD, atau yang ingin menghindari penyakit tersebut, terutama buat orang yang perutnya buncit. Sebab, Ari Fahrial melanjutkan, lambung ibarat kantong yang kalau terdorong akan mengeluarkan apa yang ada di dalamnya.\n" +
                        "\n" +
                        "     Wakil Ketua Perkumpulan Gastroenterologi Indonesia itu menganjurkan tidur miring untuk menghindari asam lambung. \"Sebaiknya tidur miring menghadap ke kiri karena letak lambung di sebelah kiri perut, sehingga lambung berada di posisi yang lebih rendah,\" ucapnya.");
                gambar.setImageResource(R.drawable.enam);
                break;
            case 7:
                judul.setText("Ciri Ciri Asam Lambung Naik Ke Dada Dan Kerongkongan");
                isi.setText("     Dalam dunia medis naiknya asam lambung ke dada dan kerongkongan disebut dengan istilah GERD (Gastro Esophagel Reflux Disease) yakni kondisi dimana adanya arus balik isi lambung ke atas menuju kerongkongan.\n" +
                        "\n" +
                        "     Hal tersebut terjadi akibat dari melemahnya LES ( lower esophageal sphinchter ) yakni otot yang terdapat pada bagian bawah esofagus disertai meningkatnya kandungan asam yang berada di dalam lambung.\n" +
                        "\n" +
                        "     Fungsi dari asam lambung sendiri adalah sebagai pemusnah bakteri penyakit yang masuk ke dalam lambung, menstabilkan kandungan gula serta membantu pembentukan protein enzim pencernaan pada lambung sehingga keberadaannya diperlukan oleh tubuh. Namun jika level keasaman jauh diatas angka normal (asam lambung tinggi) maka dapat menyebabkan timbulnya masalah sehingga membuat rasa tidak nyaman bagi penderitanya.\n" +
                        "\n" +
                        "     Dan berikut ini adalah beberapa ciri ciri asam lambung naik ke dada atau kerongkongan, yang umumnya dialami oleh penderita asam lambung, yakni :\n" +
                        "\n" +
                        "     1. Munculnya Nyeri Disertai Sensai Terbakar Pada Dada\n" +
                        "\n" +
                        "     Salah satu indikasi atau gejala utama penyakit asam lambung adalah munculnya rasa nyeri dan panas pada dada atau ulu hati. Hal tersebut muncul akibat dari naiknya asam lambung menuju ke dada atau kerongkongan. Tidak hanya itu, naiknya asam lambung ke dada dan kerongkongan juga bisa menyebabkan sakit tenggorokan sehingga susah menelan.\n" +
                        "\n" +
                        "     2. Perut Terasa Nyeri Dan Perih\n" +
                        "\n" +
                        "     Asam lambung memiliki gejala yang mirip dengan penyakit maag yakni bisa menyebabkan perut terasa nyeri dan perih. Namun hal yang membedakannya adalah rasa nyeri dan perih yang disebabkan oleh naiknya asam lambung biasanya akan muncul ketika mengkonsumsi makanan tertentu yang dapat menyebabkan naiknya asam lambung pada tubuh seperti : cuka, buah asam dan nangka.\n" +
                        "\n" +
                        "     3. Perut Terasa Mual Dan Kembung\n" +
                        "\n" +
                        "     Lebih lanjut gejala dari penyakit asam lambung adalah munculnya rasa mual dan perut terasa kembung utamanya jika penderita mengkonsumsi makanan yang bersifat asam.\n" +
                        "\n" +
                        "     4. Muntah\n" +
                        "\n" +
                        "     Berbeda dengan muntah biasa atau karenga penyakit tertentu, muntah akibat penyakit asam lambung di awali oleh aiknya asam lambung ke kerongkongan hingga mulut dan diikuti dengan lambung yang terasa mual dan kembung setelah mengkonsomsi makanan yang memiliki kadar asam yang tinggi.\n" +
                        "\n" +
                        "     5. Sendawa Terus Menerus\n" +
                        "\n" +
                        "     Seseorang yang menderita penyakit asam lambung juga biasanya akan mengalami sendawa yang terus menerus utamanya pada saat asam lambung naik ke dada dan kerongkongan.");
                gambar.setImageResource(R.drawable.tujuh);
                break;
            case 8:
                judul.setText("Jangan Anggap Remeh Sakit Maag dan Asam Lambung");
                isi.setText("     Penyakit maag atau indigestion adalah peradangan mukosa atau lapisan kulit dalam lambung yang disebabkan banyak faktor. Beberapa faktor tersebut adalah stres, luka pada dinding atau tukak lambung, dan bakteri Helicobacter pylori. Gejala penyakit maag yang muncul biasanya kembung, mual, muntah, serdawa berlebih, dan sakit pada bagian ulu hati.\n" +
                        "\n" +
                        "     Penyakit ini sering dianggap sindrom 'anak mahasiswa' dan dianggap sepele. Padahal, penyakit maag dapat menyebabkan komplikasi seperti penyempitan kerongkongan hingga sulit menelan, esofagus barret, atau terpapar asam lambung pada kerongkongan, hingga 'bocornya' asam lambung hingga usus halus. Bila terserang penyakit maag, penyebab secara mandiri dapat dilakukan. Beberapa obat dapat menangani maag seperti antasida, alginat, antibiotik, dan antidepresan.Namun perlu pemeriksaan lebih lanjut jika gejala sampai tahap muntah, kehilangan berat badan, hingga sulit menelan.\n" +
                        "\n" +
                        "     Berbeda dengan penyakit maag, penyakit asam lambung atau gastroestophageal reflux merupakan kondisi naiknya asam lambung menuju kerongkongan. Penderita penyakit ini akan merasakan pahit yang muncul di kerongkongan dan menimbulkan nyeri pada ulu hati atau sensasi terbakar di dada. Gejala ini sering dianggap sebagai serangan jantung.\n" +
                        "\n" +
                        "     Penyakit ini muncul karena tidak berfungsinya katup yang ada di ujung lambung. Katup bernama lower esophageal sphincter (LES) ini berfungsi sebagai pintu otomatis saat makanan atau minuman lewat dan tertutup guna mencegah asam lambung dan makanan yang dicerna naik ke kerongkongan.Longgarnya LES akan menyebabkan kebocoran asam lambung dan menyebabkan gejala karena asam pencernaan itu bersifat korosif sehingga memungkinkan dinding saluran pencernaan terkikis dan meradang.\n" +
                        "\n" +
                        "     Penyakit asam lambung juga diketahui dapat memicu kanker esofagus bila tidak mendapatkan penyebab serius dan segera. Ada beberapa cara menjaga diri agar tidak terkena penyakit ini, seperti menjaga berat badan, hindari obesitas, jaga pola makan, hindari makanan berlemak dan yang memicu asam lambung. Beberapa makanan yang memicu asam lambung adalah alkohol, kafein, cokelat, buah jeruk, dan makanan berbau tajam. Selain itu, merokok juga dapat memicu naiknya asam lambung.");
                gambar.setImageResource(R.drawable.delapan);
                break;
            case 9:
                judul.setText("Asam Lambung yang Tak Boleh Disepelekan");
                isi.setText("     Asam lambung merupakan gangguan yang paling sering dialami orang dewasa. Situs kesehatan Heatlh Line menyebutkan, 60 persen populasi orang dewasa akan mengalami masalah asam lambung dalam hidupnya. Ini yang membuat kebanyakan orang tak terlalu serius menanggapi penyakit ini.\n" +
                        "\n" +
                        "     Asam lambung yang punya nama gastroesophageal reflux disease (GERD) dalam bahasa Inggris, sederhananya adalah masalah pencernaan. Secara etimologi, gastroesophageal berarti perut dan esophagus. Sementara reflux berarti mengalir bolak-balik. Sehingga WebMD, salah satu situs kesehatan AS, mengartikan GERD sebagai gangguan yang membuat isi perut masuk naik ke esophagus.\n" +
                        "\n" +
                        "     Dalam proses pencernaan normal, bagian bawah esophagus, disebut lower esophageal sphincter (LES), terbuka agar makanan bisa masuk ke perut dan kembali tertutup untuk mencegah makanan dan asam di lambung mengalir lagi ke esophagus. GERD alias gangguan asam lambung terjadi karena LES yang lemah dan susah menutup.\n" +
                        "\n" +
                        "     Penelitian menemukan, gaya hidup dan konsumsi makanan jadi fakor pemicu munculnya asam lambung. Selain menyebabkan kanker, gangguan paru-paru, kemandulan, dan marabahaya lainnya, merokok ternyata juga bisa bikin LES kendur. Sementara dari departemen makanan, cokelat, daun mint, gorengan, makanan berlemak, kopi, dan minuman beralkohol bisa memicu mulas dan naiknya asam lambung.\n" +
                        "\n" +
                        "     Gejala paling awam yang terjadi pada penderita asam lambung adalah mulas, yang ditandai dengan rasa terbakar di dada dan rasa asam di mulut. Lebih dari 60 juta orang dewasa di AS merasakan setidaknya mulas sekali dalam sebulan. Sementara 15 juta orang di antaranya mengalami mulas setiap hari.\n" +
                        "\n" +
                        "     Sebagai masalah pencernaan, asam lambung erat dengan persoalan makanan, demikian pula cara penanggulangannya. Caranya menghindari makanan-makanan yang punya kecenderungan merusak fungsi LES, juga tak kalah penting mengatur pola makan. WebMD menyarankan, mengurangi porsi makan juga dapat mengontrol gejala asam lambung. Makan dua hingga tiga jam sebelum tidur dapat mengurangi asam di dalam perut. Bagi Anda yang sudah terkena penyakit ini, mengatur pola makan jadi rumus yang wajib. Kelebihan berat badan juga punya efek langsung pada penderita asam lambung. Jadi, jangan menunggu asam lambung datang dan menghinggapi diri Anda.");
                gambar.setImageResource(R.drawable.sembilan);
                break;
            case 10:
                judul.setText("3 Fakta Menarik Seputar Asam Lambung");
                isi.setText("     Asam lambung sangatlah keras hingga dapat mengganggu kerja organ lainnya. Nah, bicara seputar asam lambung, ada tiga fakta menarik seputar asam lambung yang mungkin belum kamu tahu, mau tahu?\n" +
                        "\n" +
                        "     Pertama, asam lambung dapat hancurkan metal. Tingkat keasaman asam lambung ada pada kisaran 1-3pH. Pada tingkat keasaman tersebut, senyawa metal seperti besi, seng, dan kuningan bias dihancurkan dengan mudah. Hanya saja, tubuh kita tercipta dan terstruktur dengan sangat baik sehingga kerasnya asam lambung tidak merusak organ mana pun.\n" +
                        "\n" +
                        "     Kedua, asam lambung diproduksi sekitar dua liter dalam sehari. Ya, normalnya, lambung memproduksi asam lambung sekitar 1,5-2 liter dan itu cukup untuk mencerna makanan di dalam lambung.\n" +
                        "\n" +
                        "     Ketiga, kandungan asam lambung digunakan pada cairan pembersih. Salah satu zat yang terdapat pada asam lambung adalah hidroklorida (HCI) biasa digunakan pada cairan pembersih karat pada logam dan noda pada keramik.");
                gambar.setImageResource(R.drawable.sepuluh);
                break;
        }

        int checkExistence = getResources().getIdentifier("video", "raw", getPackageName());
        boolean result;
        if ( checkExistence != 0 ) {  // the resouce exists...
            result = true;
            Log.d("AA", String.valueOf(result));
        }
        else {  // checkExistence == 0  // the resouce does NOT exist!!
            result = false;
            Log.d("BB", String.valueOf(result));
        }

    }
}
