package com.orbitalsonic.koindependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {
    val tag = "KoinTestingTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /***
         * Simple Create instances and see the memory locations
         * whe we create instance it allocate new location in memory
          */
//
//        val firstClass1 = FirstClass()
//        Log.i(tag,firstClass1.getFirstClassData())
//        Log.i(tag,"$firstClass1")
//
//        val firstClass2 = FirstClass()
//        Log.i(tag,firstClass2.getFirstClassData())
//        Log.i(tag,"$firstClass2")
//
//        val secondClass1 = SecondClass()
//        Log.i(tag,secondClass1.getSecondClassData())
//        Log.i(tag,"$secondClass1")
//
//        val secondClass2 = SecondClass()
//        Log.i(tag,secondClass2.getSecondClassData())
//        Log.i(tag,"$secondClass2")


        /***
         * here is implementation of koin
          */
        val firstClass1 = get<FirstClass>()
        Log.i(tag,firstClass1.getFirstClassData())
        Log.i(tag,"$firstClass1")

        val firstClass2 = get<FirstClass>()
        Log.i(tag,firstClass2.getFirstClassData())
        Log.i(tag,"$firstClass2")

        val secondClass1 = get<SecondClass>()
        Log.i(tag,secondClass1.getSecondClassData())
        Log.i(tag,"$secondClass1")

        val secondClass2 =get<SecondClass>()
        Log.i(tag,secondClass2.getSecondClassData())
        Log.i(tag,"$secondClass2")


    }
}