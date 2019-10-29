package com.example.wittaya2

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ซ่อน Title bar
        supportActionBar?.hide()
        // Buttton  btn = findViewById(R.id.btn_phrae);

        btn_surint.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.surint_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_surint),getString(R.string.content_surint)) }

        })
        btn_puttalung.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.puttalung_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_puttalung),getString(R.string.content_puttalung)) }

        })
        btn_sakonnacon.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.sakonnacon_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_sakonnacon),getString(R.string.content_sakonnacon)) }

        })
        btn_chainat.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.chainat_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_chainat),getString(R.string.content_chainat)) }

        })


    }

    fun setProvice (drawable :Drawable , header:String , content:String ){

        img_province.setImageDrawable(drawable)  //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติของจังหวัด
    }
}
