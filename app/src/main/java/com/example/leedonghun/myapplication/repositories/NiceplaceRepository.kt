package com.example.leedonghun.myapplication.repositories

import androidx.lifecycle.MutableLiveData
import com.example.leedonghun.myapplication.models.NicePlace

/**
 * MyApplication4
 * Class: NiceplaceRepository.
 * Created by leedonghun.
 * Created On 2020-05-15.
 * Description:  singleton적용
 */

class NiceplaceRepository constructor() {




    companion object{

        @Volatile private  var instance: NiceplaceRepository?=null

         //singleton 적용됨.
        @JvmStatic fun getInstance():NiceplaceRepository=instance ?: synchronized(this) {
              instance ?: NiceplaceRepository().also {
                  instance =it
              }
        }
     }


   private var  dataset:ArrayList<NicePlace> =ArrayList()

    fun getNicePlaces():MutableLiveData<List<NicePlace>>{

        setNicePlaces()

        val data=MutableLiveData<List<NicePlace>>()
        data.value=dataset

        return data
    }


    private fun setNicePlaces(){

        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지1"))
        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지2"))

        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지3"))
        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지4"))
        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지5"))

        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지6"))

        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지7"))

        dataset.add(NicePlace("https://ifh.cc/g/MKb3Ng.png","이미지8"))


    }




}