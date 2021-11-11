package com.example.recyclerviewmaterialdesign

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BannerAdaper(private val bannerList: List<Banner>) :
    RecyclerView.Adapter<BannerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val bannerView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main,parent,false)

        return BannerViewHolder(bannerView)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        val banner = bannerList[position]
        holder.Bind(banner)
    }

    override fun getItemCount(): Int {
       return bannerList.size
    }


}