package com.binar.foodorder.adapter

import androidx.recyclerview.widget.RecyclerView
import com.binar.foodorder.data.Food
import com.binar.foodorder.databinding.ItemFoodFullWidthBinding
import com.bumptech.glide.Glide

/**
 * Created by Rahmat Hidayat on 10/09/2023.
 */
class ListViewHolder(private val fullWidthBinding: ItemFoodFullWidthBinding) :
    RecyclerView.ViewHolder(fullWidthBinding.root) {
    private val name = fullWidthBinding.tvFoodname
    private val price = fullWidthBinding.tvFoodprice
    private val image = fullWidthBinding.tvFoodimage

    fun bindFullWidth(food: Food) {
        val formattedPrice = "Rp ${food.Price.toInt()}"
        name.text = food.name
        price.text = formattedPrice
        Glide.with(itemView.context)
            .load(food.Image)
            .into(image)

    }

}