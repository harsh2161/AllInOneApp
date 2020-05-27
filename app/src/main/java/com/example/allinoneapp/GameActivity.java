package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter.add("Zero Cross Game");
        adapter.add("Luck Game");
        adapter.add("Chess Game");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = adapter.getItem(position);
        if(item=="Zero Cross Game")
        {
            Intent intent3 = new Intent(GameActivity.this,GameZeroCross.class);
            startActivity(intent3);
        }
        if(item=="Luck Game")
        {
            Intent intent4 = new Intent(GameActivity.this,GameLuckMoney.class);
            startActivity(intent4);
        }
        if(item=="Chess Game")
        {
            Intent intent5 = new Intent(GameActivity.this,FirstPageChessGame.class);
            startActivity(intent5);
        }
    }
}
