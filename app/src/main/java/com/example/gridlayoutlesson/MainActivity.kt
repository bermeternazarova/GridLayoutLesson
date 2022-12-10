package com.example.gridlayoutlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridlayoutlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    lateinit var rv:RecyclerView //courseRV
    lateinit var adapterClass: AdapterClass //courseRVAdapter
    lateinit var list: ArrayList<ModelClass> //courselist

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         rv = binding.rv
        list= ArrayList()
         val layoutManager = GridLayoutManager(this,2)
        rv.layoutManager= layoutManager
        adapterClass= AdapterClass(list,this)
        rv.adapter= adapterClass
        imageSet()

        adapterClass.notifyDataSetChanged()
    }
    fun imageSet(){
        list.add(ModelClass("develop01",R.drawable.logo01))
        list.add(ModelClass("develop02",R.drawable.logo02))
        list.add(ModelClass("develop03",R.drawable.logo03))
        list.add(ModelClass("develop04",R.drawable.logo04))
        list.add(ModelClass("develop05",R.drawable.logo03))
        list.add(ModelClass("develop06",R.drawable.logo02))
        list.add(ModelClass("develop07",R.drawable.logo01))
        list.add(ModelClass("develop08",R.drawable.logo01))
        list.add(ModelClass("develop09",R.drawable.logo02))
        list.add(ModelClass("develop10",R.drawable.logo03))
        list.add(ModelClass("develop11",R.drawable.logo04))
        list.add(ModelClass("develop12",R.drawable.logo03))
        list.add(ModelClass("develop13",R.drawable.logo02))
        list.add(ModelClass("develop14",R.drawable.logo01))
        list.add(ModelClass("develop15",R.drawable.logo03))
        list.add(ModelClass("develop16",R.drawable.logo02))
        list.add(ModelClass("develop17",R.drawable.logo02))
    }
}