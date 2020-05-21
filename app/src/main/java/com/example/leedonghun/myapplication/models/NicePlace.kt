package com.example.leedonghun.myapplication.models

/**
 * MyApplication4
 * Class: NicePlace.
 * Created by leedonghun.
 * Created On 2020-05-14.
 * Description:
 *
 * 데이터베이스와  통신하는  곳  데이터 처리 담당  데이터 어떻게 처리 할지 규격
 *
 */

class NicePlace(imageUrl:String,title:String) {

  //리사이클러뷰 리스트 중  타이틀에 해당 되는  값.받기 위함.
  var title:String =""

      get() = field//title  getter

      set(value) {//title  setter
          field = value
      }

    init {
      this.title=title // 내부 타이틀   생성자에서 받아온 값으로 넣어줌.
  }

  //리사이클러뷰 리스트 중  imageUrl 에  해당 되는 값 받기 위함
   var imageUrl:String =""


      get() = field//imageUrl getter

      set(value) {//imageUrl setter

          field = value
      }

    init {
       this.imageUrl=imageUrl//내부 imageUrl 생성자에 받아온 값으로 넣어줌.

   }





}


