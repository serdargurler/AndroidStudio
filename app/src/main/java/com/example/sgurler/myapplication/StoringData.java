package com.example.sgurler.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StoringData extends AppCompatActivity {
    EditText editText;
    TextView editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storing_data);
        editText =findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);

        //minik bir veri tabanı sadece benim uygulamamdan ulaşılması için mode private. Shared Prefences kullanımı bu kod bloğu ile mümkün değil.
        SharedPreferences SharedPreferences = this.getSharedPreferences("com.example.sgurler.myapplication",Context.MODE_PRIVATE);


    }
    public void save(View view){

    if (!editText.getText().toString().matches("")){
        int value=Integer.parseInt(editText.getText().toString());
        editText2.setText("YOUR VALUE: "+value);

}



    }
}
