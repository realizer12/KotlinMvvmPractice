package com.example.leedonghun.myapplication.viewmodels

import android.os.AsyncTask
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

    fun addnewvalue(nicePlace: NicePlace){

        mIsUpdating.value=true

        var synctask :sync=sync(nicePlace)
         synctask.execute()



    }


   inner class sync(nicePlace: NicePlace) :AsyncTask<Void,Void,Void>(){



       override fun doInBackground(vararg params: Void?): Void {
           TODO("Not yet implemented")
       }

       override fun onPostExecute(result: Void?) {
           super.onPostExecute(result)
            val currentplaces:List<NicePlace>? = livedata.value
           //currentplaces.get()



       }
   }



    fun getNicePlaces():LiveData<List<NicePlace>>{

        return  livedata
    }




}