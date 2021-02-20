package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.like.LikeButton;
import com.like.OnLikeListener;

import java.util.Random;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageButton;

public class reviewpage extends AppCompatActivity {

    LikeButton cmt1, cmt2, cmt3, send1, send2, send3,l1,dl1,l2,dl2,l3,dl3;
    LinearLayout edt1, edt2, edt3;
    EditText ed1,ed2,ed3;
//    CardView fab;
    CardView card1,card2,card3;
//    GifImageButton fab;
    TextView r1,r2,r3,n1,n2,n3,d1,d2,d3,p1,p2,p3;
//    FloatingActionButton fab;
    String[] nmset1 ={
            "AKSHAYAA.S",
            "ANITHA.D",
            "ASHA. D",
            "ASVINA S",
            "DEEPIKHA.T",
            "EZHILAN.V",
            "GAYATHRI G",
            "GOPISANKAR.M",
            "JANANI.R",
            "ABILASH.A"
    };
    String[] nmset2 ={
            "ABIRAMY. V",
            "AKSHANA N SHETTY",
            "ALWIN GREGORY.C",
            "ARISHKANNAN.B",
            "ARULSEMBIAN.A",
            "BALAJI.S",
            "BALARAMAN.D",
            "DEEPEGA.B",
            "DHARSHANA.U",
            "DURGA PRIYA.B"
    };
    String[] nmset3 ={
            "GOKULNATH. P",
            "HUMAIRA BEGAM. A",
            "ILAKIIAN. K. R",
            "JAGATHESHWARI.T",
            "JYOTHIKA. R",
            "KADHIR.M",
            "KALPANA DEVI.K",
            "KAMALESH. S",
            "RISHWANA.J",
            "MAMTHA. K"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewpage);
        Intent intent=getIntent();
        String value=intent.getStringExtra("PDT_NAME");
        String Temp;
        Random r=new Random();
        int randomnumber=r.nextInt(10);
        //review tag ==>>1------------------------------
        p1=findViewById(R.id.profile1);
        n1=findViewById(R.id.author);
        p1.setText(nmset1[randomnumber].substring(0,1));
        n1.setText(nmset1[randomnumber]);
        r1=findViewById(R.id.description);
        Temp=value.concat("_r1");
        r1.setText(getStringByIdName(Temp));
        //review tag ==>>2------------------------------
        p2=findViewById(R.id.profile2);
        n2=findViewById(R.id.author2);
        p2.setText(nmset2[randomnumber].substring(0,1));
        n2.setText(nmset2[randomnumber]);
        r2=findViewById(R.id.description2);
        Temp=value.concat("_r2");
        r2.setText(getStringByIdName(Temp));
        //review tag ==>>3------------------------------
        p3=findViewById(R.id.profile3);
        n3=findViewById(R.id.author3);
        p3.setText(nmset3[randomnumber].substring(0,1));
        n3.setText(nmset3[randomnumber]);
        r3=findViewById(R.id.description3);
        Temp=value.concat("_r3");
        r3.setText(getStringByIdName(Temp));
        d1=findViewById(R.id.date);
        Temp="2021" + " " + "JAN" + " " +(r.nextInt((31 - 1) + 1) + 1);
        d1.setText(Temp);
        d2=findViewById(R.id.date2);
        Temp="2021" + " " + "JAN" + " " +(r.nextInt((31 - 1) + 1) + 1);
        d2.setText(Temp);
        d3=findViewById(R.id.date3);
        Temp="2021" + " " + "JAN" + " " +(r.nextInt((31 - 1) + 1) + 1);
        d3.setText(Temp);
        cmt1 = findViewById(R.id.cmt1);
        cmt2 = findViewById(R.id.cmt2);
        cmt3 = findViewById(R.id.cmt3);
        send1=findViewById(R.id.send1);
        send2=findViewById(R.id.send2);
        send3=findViewById(R.id.send3);
        ed1=findViewById(R.id.edit1);
        ed2=findViewById(R.id.edit2);
        ed3=findViewById(R.id.edit3);
        l1=findViewById(R.id.like1);
        l2=findViewById(R.id.like2);
        l3=findViewById(R.id.like3);
        dl1=findViewById(R.id.dislike1);
        dl2=findViewById(R.id.dislike2);
        dl3=findViewById(R.id.dislike3);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        edt1 = findViewById(R.id.editTextTextPersonName1);
        edt2 = findViewById(R.id.editTextTextPersonName2);
        edt3 = findViewById(R.id.editTextTextPersonName3);
        //card animator-----------------------------------------------
        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.swing_up_left);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.swing_up_right);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_row);
        card3.startAnimation(animation3);
        card2.startAnimation(animation2);
        card1.startAnimation(animation1);
        //openning dialog activity..........................................
//        fab.findViewById(R.id.fab);
//        fab.setOnClickListener(v -> {
//            //intent to the new dialog box or activity
//            Intent i=new Intent(this,startchat.class);
//            startActivity(i);
//        });
//        fab.findViewById(R.id.fab);
//        fab.setOnClickListener(v ->{ Intent i=new Intent(this,startchat.class);startActivity(i);});
        //layout visibility.................................................
        cmt1.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {

                edt1.setVisibility(View.VISIBLE);
                edt2.setVisibility(View.GONE);
                cmt2.setLiked(false);
                edt3.setVisibility(View.GONE);
                cmt3.setLiked(false);
                send1.setLiked(false);
                ed1.setText("");
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                edt1.setVisibility(View.GONE);
            }
        });
        cmt2.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                edt2.setVisibility(View.VISIBLE);
                edt1.setVisibility(View.GONE);
                cmt1.setLiked(false);
                edt3.setVisibility(View.GONE);
                cmt3.setLiked(false);
                send2.setLiked(false);
                ed2.setText("");

            }

            @Override
            public void unLiked(LikeButton likeButton) {
                edt2.setVisibility(View.GONE);


            }
        });
        cmt3.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                edt3.setVisibility(View.VISIBLE);
                edt1.setVisibility(View.GONE);
                edt2.setVisibility(View.GONE);
                ed3.setText("");
                cmt1.setLiked(false);
                cmt2.setLiked(false);
                send3.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {
                edt3.setVisibility(View.GONE);

            }
        });

        //send icon operation inside layout................................
        send1.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                edt1.setVisibility(View.GONE);
                cmt1.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
        send2.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                edt2.setVisibility(View.GONE);
                cmt2.setLiked(false);


            }

            @Override
            public void unLiked(LikeButton likeButton) {


            }
        });
        send3.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                edt3.setVisibility(View.GONE);
                cmt3.setLiked(false);
            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });

        // working on liking buttons........................................
        l1.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                dl1.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
        l2.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                dl2.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
        l3.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                dl3.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
        dl1.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                l1.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
        dl2.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                l2.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
        dl3.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                l3.setLiked(false);

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });

    }

    public String getStringByIdName(String idName) {
        Resources res=getResources();
        int strid;
        try {
            strid = res.getIdentifier(idName, "string", getPackageName());
            return res.getString(strid);
        }catch (Exception e){
            return getString(R.string.problem_occured);
        }

      }
      public void startchat(View view){ Intent i=new Intent(this,startchat.class);startActivity(i);}
}