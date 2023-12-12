package com.example.uas_individu

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val negaralist = listOf<Negara>(
            Negara(
                R.drawable.indonesia,
                "Indonesia",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.indonesia
            ),
            Negara(
                R.drawable.malaysia,
                "Malaysia",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.malaysia
            ),
            Negara(
                R.drawable.qatar,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.qatar
            ),
            Negara(
                R.drawable.china,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.china
            ),
            Negara(
                R.drawable.flipina,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.flipina
            ),
            Negara(
                R.drawable.japan,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.japan
            ),
            Negara(
                R.drawable.koreaselatan,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.koreaselatan
            ),
            Negara(
                R.drawable.laos,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.laos
            ),
            Negara(
                R.drawable.maroko,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.maroko
            ),
            Negara(
                R.drawable.meksiko,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.meksiko
            ),
            Negara(
                R.drawable.yaman,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.yaman
            ),
            Negara(
                R.drawable.uruguay,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.uruguay
            ),
            Negara(
                R.drawable.swiss,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.swiss
            ),
            Negara(
                R.drawable.spanyol,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.spanyol
            ),
            Negara(
                R.drawable.singapura,
                "Qatar",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum lorem lipsum",
                R.raw.singapura


            )
        )

        val recycleview = findViewById<RecyclerView>(R.id.rv_negara)
        recycleview.layoutManager = LinearLayoutManager(this)
        recycleview.setHasFixedSize(true)
        recycleview.adapter = NegaraAdapter(this,negaralist){
            val intent = Intent(this, DetailNegaraActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}