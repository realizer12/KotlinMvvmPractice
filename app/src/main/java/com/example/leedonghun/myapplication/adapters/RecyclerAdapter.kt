package com.example.leedonghun.myapplication.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.leedonghun.myapplication.models.NicePlace

/**
 * MyApplication4
 * Class: RecyclerAdapter.
 * Created by leedonghun.
 * Created On 2020-05-14.
 * Description:
 */
class RecyclerAdapter constructor( private val context: Context, private val data: ArrayList<NicePlace> =ArrayList() ) :
    RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.Holder {
        TODO("Not yet implemented")

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.Holder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class Holder(itemView: View?):RecyclerView.ViewHolder(itemView!!){



    }


}