package com.example.recyclerviewmaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bannerList:List<Banner> = listOf(
            Banner(R.drawable.chestnmusweb,"1 банер"),
            Banner(R.drawable.chestnmusweb,"2 банер"),
            Banner(R.drawable.chestnmusweb,"3 банер"),
            Banner(R.drawable.chestnmusweb,"4 банер"),
            Banner(R.drawable.chestnmusweb,"5 банер"),
            Banner(R.drawable.chestnmusweb,"6 банер"),
            Banner(R.drawable.chestnmusweb,"7 банер"),
            Banner(R.drawable.chestnmusweb,"8 банер")
        )

        val PeoleList:List<People> = listOf(
            People.Man("Иван",22,"899900009034"),
            People.Woman("Ирина",33,"irisha@mail.ru"),
            People.Man("Соловат",19,"891234590434"),
            People.Woman("Соня",34,"sonua@gmail.com")

        )


        val bannerRecyclerView: RecyclerView = findViewById(R.id.RecyclerViewBaner)
            bannerRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

            bannerRecyclerView.adapter = BannerAdaper(bannerList)
    }
}