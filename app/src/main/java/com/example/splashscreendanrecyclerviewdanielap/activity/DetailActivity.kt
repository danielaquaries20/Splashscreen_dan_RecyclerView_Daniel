package com.example.splashscreendanrecyclerviewdanielap.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.splashscreendanrecyclerviewdanielap.R
import com.example.splashscreendanrecyclerviewdanielap.adapter.PictureAdapter
import com.example.splashscreendanrecyclerviewdanielap.model.PictureModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    val item:MutableList<PictureModel> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initData()
        rvPicture.layoutManager = GridLayoutManager(this, 1,
            GridLayoutManager.VERTICAL, false)
        rvPicture.adapter = PictureAdapter(this, item)
    }

    private fun initData() {
        val name = resources.getStringArray(R.array.name_picture)
        val image = resources.obtainTypedArray(R.array.image_picture)
        for (i in name.indices){
            item.add(
                PictureModel(
                    name[i],
                    image.getResourceId(i, 0)
                )
            )
        }
        image.recycle()

    }
}