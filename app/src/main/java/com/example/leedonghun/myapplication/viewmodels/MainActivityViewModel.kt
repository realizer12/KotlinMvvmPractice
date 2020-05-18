package com.example.leedonghun.myapplication.viewmodels

import android.os.AsyncTask
import android.os.SystemClock
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leedonghun.myapplication.models.NicePlace
import com.example.leedonghun.myapplication.repositories.NiceplaceRepository

/**
 * MyApplication4
 * Class: MainActivityViewModel.
 * Created by leedonghun.
 * Created On 2020-05-14.
 * Description:
 */
class MainActivityViewModel: ViewModel() {

    private var livedata=MutableLiveData<List<NicePlace>>()
    private var mRepo=NiceplaceRepository.getInstance()
    private var mIsUpdating = MutableLiveData<Boolean>()

    fun init(){

        if(livedata !=null){

            return
        }

            livedata=mRepo.getNicePlaces()
    }

    //새로운 장소목록 추가시킨다.
    fun addnewvalue(nicePlace: NicePlace){

        mIsUpdating.value=true


    }



    // 현재 장소 목록
    fun getNicePlaces():LiveData<List<NicePlace>>{

        return  livedata
    }


    //뷰가  업데이트 함을  boolean 값으로 알림
    fun getIsUpdating():LiveData<Boolean>{

        return mIsUpdating
    }




}