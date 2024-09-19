package com.example.myrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = intent.getIntExtra("NUMBER", 0)


        val taskList = arrayListOf<String>()

        for (i in 1..1000) {
            taskList.add("$num X $i = ${num * i}")
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = TaskAdapter(taskList)
        recyclerView.adapter = adapter
    }
}
