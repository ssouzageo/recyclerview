package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
    }

    // Create data class
    // Create list From data class type
    // Create Adapter
    // Set Adapter
    // Linear layout manager

    val rvList = findViewById<RecyclerView>(R.id.rv_list)
}

val contacts = listOf(
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