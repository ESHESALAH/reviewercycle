package com.example.recycleview

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import javax.swing.text.View

import java.util.ArrayList


class MainActivity : AppCompatActivity(), MyRecyclerViewAdapter.ItemClickListener {
    var adapter: MyRecyclerViewAdapter? = null
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personNames: kotlin.util.ArrayList<String> = kotlin.util.ArrayList()
        personNames.add("Eshe", "faim", "moha","ramz", "zam", "zani", "kais", "sam", "raz", "kons", "zuby")
        personAge.add(23, 24, 25, 26, 27, 28, 29, 30, 31, 32,)
        personDob.add(1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988,)
        personHobby.add("football")

        val recyclerView: RecyclerView = findViewById(R.id.rvperson)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        adapter = MyRecyclerViewAdapter(this, personNames)
        adapter = MyRecyclerViewAdapter(this, personAge)
        adapter = MyRecyclerViewAdapter(this, personDob)
        adapter = MyRecyclerViewAdapter(this, personHobby)


        adapter.setClickListener(this)
        recyclerView.setAdapter(adapter)
    }

    fun onItemClick(view: View?, position: Int) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).toString() + " on row number " + position, Toast.LENGTH_SHORT).show()
    }
}



