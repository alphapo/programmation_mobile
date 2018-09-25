package com.esipe.barry.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int ACTIVITY_RESULT = 9;
    private static final String TAG = "MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddStudent = (Button) findViewById(R.id.lister_les_etudiants);

        buttonAddStudent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AjouterEtudiantActivity.class);
                startActivity(intent);
                Log.d("DEBUG", "ajout etudiant");

            }

            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                Log.d(TAG, requestCode + " - " + resultCode + " - " +data);
            }
        });

        Button buttonShowStudent = (Button) findViewById(R.id.ajouter_etudiant);

        buttonShowStudent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListerEtudiantActivity.class);
                startActivity(intent);
                Log.d("DEBUG", "liste des etudiants");

            }
        });
    }


}
