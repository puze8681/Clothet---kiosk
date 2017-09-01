package kr.wonjun.clothet.Activity.Shopping

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_closet.*
import kr.wonjun.clothet.R
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.toolbar.*
import org.jetbrains.anko.startActivity

class ShoppingMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_main)

        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayShowTitleEnabled(false)
        }

        intent = Intent(this@ShoppingMainActivity, ShoppingItemActivity::class.java)

        closet_category_1.setOnClickListener {
            startActivityForResult(intent, 1)
        }
        closet_category_2.setOnClickListener {
            startActivityForResult(intent, 2)
        }
        closet_category_3.setOnClickListener {
            startActivityForResult(intent, 3)
        }
        closet_category_4.setOnClickListener {
            startActivityForResult(intent, 4)
        }
        closet_category_5.setOnClickListener {
            startActivityForResult(intent, 5)
        }
        closet_category_6.setOnClickListener {
            startActivityForResult(intent, 6)
        }
    }
}
