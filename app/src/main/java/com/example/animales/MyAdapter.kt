package com.example.animales

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.animales.databinding.ItemAnimalesBinding
import com.squareup.picasso.Picasso

class MyAdapter(private val context: Context, private val arrayList: java.util.ArrayList<extincion>):
    BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val binding = ItemAnimalesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        var convertView = convertView
        convertView = binding.root

        binding.txtTitle.text = arrayList[position].nombre
        binding.txtCientifico.text = "${arrayList[position].cientifico}"

        if(arrayList[position].URL != null) {
            Picasso.get().load(arrayList[position].URL).into(binding.foto)
        }
        return convertView
    }

}