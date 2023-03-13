package com.example.viewpagertwoapp.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagertwoapp.R
import com.example.viewpagertwoapp.model.Fruits
import kotlinx.android.synthetic.main.item_rv.view.*


class FruitsAdapter(val context:Context, val fruitsList: ArrayList<Fruits>): RecyclerView.Adapter<FruitsAdapter.Vh>() {

    inner class Vh(var itemRv: View) : RecyclerView.ViewHolder(itemRv) {
        fun onBind(item: Fruits) {
            itemRv.imageViewRv.setImageResource(item.imageView)
            itemRv.textViewRv.text = item.textView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))

    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(fruitsList[position])
        Log.d("onBindViewHolder", "position $position")
    }

    override fun getItemCount(): Int = fruitsList.size

}
