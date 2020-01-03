package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val values = arrayListOf("Samsung", "Apple", "Blackberry", "Lenovo", "Nokia")

        val mListView = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)

        mListView.adapter = adapter

        mListView.setOnItemClickListener{parent, view, position, id ->


            if (position==0){
                Toast.makeText(this@MainActivity, "This is Samsung",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "This is Apple",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "This is Blackberry", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "This is Lenovo",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "This is Nokia",  Toast.LENGTH_SHORT).show()
            }
        }
    }

}
