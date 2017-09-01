package kr.wonjun.clothet.Activity.Shopping

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kr.wonjun.clothet.R
import android.widget.Toast
import kr.wonjun.clothet.Activity.MainActivity
import android.R.attr.data
import android.support.v7.widget.GridLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_shopping_item.*
import kr.wonjun.clothet.Adapter.ShoppingItemAdapter
import kr.wonjun.clothet.Data.ShoppingItemData


class ShoppingItemActivity : AppCompatActivity() {

    var items: ArrayList<ShoppingItemData> = ArrayList()
    lateinit var adapter: ShoppingItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_item)

        intent = Intent(this@ShoppingItemActivity, ShoppingItemActivity::class.java)
        adapter = ShoppingItemAdapter(this, items)
        recyclerViewShoppingItem.adapter = adapter
        recyclerViewShoppingItem.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode){
            1->loadTShirt()
            2->loadPullOver()
            3->loadShirt()
            4->loadCoat()
            5->loadDress()
            6->loadPants()
        }

        adapter.itemClick = object : ShoppingItemAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                startActivityForResult(intent, requestCode)
            }
        }
    }

    private fun loadTShirt(){
    }

    private fun loadPullOver(){
    }

    private fun loadShirt(){
    }

    private fun loadCoat(){
    }

    private fun loadDress(){
    }

    private fun loadPants(){
    }
}