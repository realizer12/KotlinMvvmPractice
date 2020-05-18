package com.example.leedonghun.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leedonghun.myapplication.R
import com.example.leedonghun.myapplication.models.NicePlace

/**
 * MyApplication4
 * Class: RecyclerAdapter.
 * Created by leedonghun.
 * Created On 2020-05-14.
 * Description:
 */
class RecyclerAdapter constructor( private val context: Context, private val data: ArrayList<NicePlace> =ArrayList() ) :
    RecyclerView.Adapter<RecyclerAdapter.niceplace_viewholer>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.niceplace_viewholer {
        TODO("Not yet implemented")

        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewitem,parent,false)

        return RecyclerAdapter.niceplace_viewholer(inflater)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.niceplace_viewholer, position: Int) {
        TODO("Not yet implemented")

        


    }

   class niceplace_viewholer(v:View):RecyclerView.ViewHolder(v){

     private var title:TextView?=null
     private var image:ImageView?=null

       init {
           title = v.findViewById(R.id.textView_for_recyclerview)
           image = v.findViewById(R.id.imageView_for_recyclerview)
       }

   }//niceplace_viewholer 뷰홀더 끝.




}

