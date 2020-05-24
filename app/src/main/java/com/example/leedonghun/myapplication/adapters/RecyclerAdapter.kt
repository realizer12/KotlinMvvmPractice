package com.example.leedonghun.myapplication.adapters

import android.app.Application
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.leedonghun.myapplication.R
import com.example.leedonghun.myapplication.models.NicePlace
import kotlinx.android.synthetic.main.recyclerviewitem.view.*

/**
 * MyApplication4
 * Class: RecyclerAdapter.
 * Created by leedonghun.
 * Created On 2020-05-14.
 * Description:
 */

//현재  생성자에서 context랑   data(어레이리스트) 받아옴.
class RecyclerAdapter constructor( private val context: Context, private val data: ArrayList<NicePlace> =ArrayList() ) :
    RecyclerView.Adapter<RecyclerAdapter.niceplace_viewholer>() {


    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): niceplace_viewholer {

        Log.v("check_iewholder","시작됨")

        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewitem,parent,false)

        return niceplace_viewholer(inflater)
    }

    override fun getItemCount(): Int {



        Log.v("check_count", data.size.toString())
        return data.size//데이터 길이 보여줌.

    }


    override fun onBindViewHolder(holder: niceplace_viewholer, position: Int) {


        (holder as? niceplace_viewholer)?.bind(data[position],context)

//        holder?.bind(data[position], context)
//        holder?.itemView?.run {
//
//
//        }


    }

   class niceplace_viewholer(v:View):RecyclerView.ViewHolder(v){

      var title:TextView?=null
      var image:ImageView?=null

       init {
           title = v.findViewById(R.id.textView_for_recyclerview)
           image = v.findViewById(R.id.imageView_for_recyclerview)
       }

       fun bind(nicePlace: NicePlace,context: Context){

           itemView.run {

               Glide.with(context).load(nicePlace.imageUrl).into(this.imageView_for_recyclerview)

           }

           //title?.text=nicePlace.title
           //Glide.with(context).load(nicePlace.imageUrl).into(this.image!!)


       }

   }//niceplace_viewholer 뷰홀더 끝.




}

