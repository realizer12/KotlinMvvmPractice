package com.example.leedonghun.myapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leedonghun.myapplication.models.NicePlace

/**
 * MyApplication4
 * Class: MainActivityViewModel.
 * Created by leedonghun.
 * Created On 2020-05-14.
 * Description:
 */
class MainActivityViewModel: ViewModel() {

    val livedata=MutableLiveData<List<NicePlace>>()


    fun init(){

    }

    fun getNicePlaces():LiveData<List<NicePlace>>{

        return  livedata
    }




}