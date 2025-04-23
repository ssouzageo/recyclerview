package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)

        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->
            val intent = Intent(this, ContactDetailActivity::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            startActivity(intent)
        }
    }

    private val contacts = listOf(
        Contact(
            "Geo",
            "(82) 988987412",
            R.drawable.sample1
        ),
        Contact(
            "Janaina",
            "(82) 956321478",
            R.drawable.sample2
        ),
        Contact(
            "Jane Cléa",
            "(82) 978456321",
            R.drawable.sample3
        ),
        Contact(
            "Edmilson",
            "(82) 978451236",
            R.drawable.sample4
        ),
        Contact(
            "Elza",
            "(82) 932569874",
            R.drawable.sample5
        ),
        Contact(
            "JP",
            "(82) 923565874",
            R.drawable.sample6
        ),
        Contact(
            "Maurício",
            "(82) 912457895",
            R.drawable.sample7
        ),
        Contact(
            "Elvis",
            "(82) 945698745",
            R.drawable.sample8
        ),
        Contact(
            "Gustavo",
            "(82) 987456325",
            R.drawable.sample9
        ),
        Contact(
            "Neguet",
            "(82) 945697898",
            R.drawable.sample10
        ),
        Contact(
            "Ariel",
            "(82) 923569874",
            R.drawable.sample11
        ),
        Contact(
            "Júlio Cezar",
            "(82) 912456532",
            R.drawable.sample12
        ),
        Contact(
            "Neto",
            "(82) 912321256",
            R.drawable.sample13
        ),
        Contact(
            "Alex",
            "(82) 945784563",
            R.drawable.sample14
        ),
        Contact(
            "Alan",
            "(82) 945452132",
            R.drawable.sample15
        ),
        Contact(
            "Lucas",
            "(82) 945126358",
            R.drawable.sample16
        )
    )
}