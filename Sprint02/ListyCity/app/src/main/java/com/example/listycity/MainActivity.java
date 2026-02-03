package com.example.listycity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView cityListView;
    private EditText cityNameInput;
    private Button addButton;

    private ArrayList<String> cityList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityListView = findViewById(R.id.lv_cities);
        cityNameInput = findViewById(R.id.et_city_name);
        addButton = findViewById(R.id.btn_add);

        cityList = new ArrayList<>();
        cityList.add("Halifax");
        cityList.add("Winnipeg");
        cityList.add("Ottawa");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cityList);
        cityListView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = cityNameInput.getText().toString().trim();

                if (input.length() > 0) {
                    cityList.add(input);
                    adapter.notifyDataSetChanged();

                    cityNameInput.setText("");
                    Toast.makeText(MainActivity.this, "Added: " + input, Toast.LENGTH_SHORT).show();
                } else {
                    cityNameInput.setError("Name cannot be empty");
                }
            }
        });

        cityListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String removedCity = cityList.get(position);

                cityList.remove(position);
                adapter.notifyDataSetChanged();

                Toast.makeText(MainActivity.this, "Deleted: " + removedCity, Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }
}