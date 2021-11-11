package com.example.recyclerviewmaterialdesign

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun Bind(banner: Banner)
    {
        val bannerImage : ImageView = itemView.findViewById(R.id.imagebaner)
        val bannerdescriptioin : TextView = itemView.findViewById(R.id.Description_text)

        bannerImage.setImageDrawable(itemView.context.getDrawable(banner.ImageR))
        bannerdescriptioin.text = banner.Description
    }


}