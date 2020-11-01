package com.example.recyclerreview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Sholat Tahajud Pk 01.00",
        "Bangun Subuhan Pk 04.00",
        "WakeUp Pk 05.00",
        "BacktoCollage Pk 06.00",
        "Bersih2 Rumah Pk 15.00",
        "Working Pk 16.00",
        "Working Again Pk 17.00",
        "Hang Out Pk 18.00",
        "Watching Movie Pk 19.00",
        "Dinner Pk 21.00",
        "BackToHome Pk 22.00"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager( this)
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i), "it's Time to"))
            if (listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                recyclerView.adapter = adapter
            }
        }
    }
}