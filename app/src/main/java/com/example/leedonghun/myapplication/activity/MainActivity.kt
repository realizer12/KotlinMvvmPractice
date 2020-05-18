package com.example.leedonghun.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property.of
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leedonghun.myapplication.R
import com.example.leedonghun.myapplication.adapters.RecyclerAdapter
import com.example.leedonghun.myapplication.models.NicePlace
import com.example.leedonghun.myapplication.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.EnumSet.of
import java.util.Optional.of
import java.util.stream.Collector.of

/*
mvvm 을  이용한  리사이클러뷰 이미지 프로필과 이름 넣기 프로젝트
*/
class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainActivityViewModel:MainActivityViewModel =  ViewModelProvider(this@MainActivity)[MainActivityViewModel::class.java]
        var madapter=RecyclerAdapter(this@MainActivity, mainActivityViewModel.getNicePlaces().value as? ArrayList<NicePlace> ?:return)//리사이클러뷰 어뎁터
        var layoutManager=LinearLayoutManager(this@MainActivity)//리니어 레이아웃 메니져


        mainActivityViewModel.init()


        mainActivityViewModel.getNicePlaces().observe(this@MainActivity, Observer {

            madapter.notifyDataSetChanged()

        })

        //새로운 데이터  추가 시키는 옵져버
        mainActivityViewModel.getIsUpdating().observe(this@MainActivity, Observer {

            if (it){//truen일떄

                showProgress()//true일때  progress bar 보여주기

            }else{//false일때

                hideProgress()//false이므로  progress bar 숨겨준다.

                //스크롤 포지션  ->  -1 로 위치하게 해준다.
                recyclerView.smoothScrollToPosition((mainActivityViewModel.getNicePlaces().value as ArrayList<NicePlace>).size-1)

            }
        })


        //플로팅 버튼 누르면  새로운  값 추가 시켜줘야 하므로,
        // 클릭시  ->  값추가  로직 들어감.
         floatingbtn.setOnClickListener {

              mainActivityViewModel.addnewvalue(NicePlace("https://ifh.cc/g/MKb3Ng.png","새롭게 추가"))


         }

        initRecycelerView(layoutManager,madapter)


    }//onCreate()끝

    //코틀린에서  public은  default여서  안써도 됨.
    //Unit  코틀린에서는  이게  자바의 void 역할
    private fun initRecycelerView(layoutManager: LinearLayoutManager,madapter:RecyclerAdapter) : Unit{

         recyclerView.layoutManager=layoutManager//리사이클러뷰와 레이아웃 매니저 연결
         recyclerView.adapter=madapter//리사이클러뷰와  어뎁터 연결
         recyclerView.setHasFixedSize(true)
     }


    //프로그래스바  보이기
    private fun showProgress(){

        ProgressBar.visibility= View.VISIBLE//보이는 상태

    }


    //프로그래스바  숨기기
    private fun hideProgress(){

        ProgressBar.visibility=View.INVISIBLE// 보이지 않는 상태

    }




}//MainActivity 끝
