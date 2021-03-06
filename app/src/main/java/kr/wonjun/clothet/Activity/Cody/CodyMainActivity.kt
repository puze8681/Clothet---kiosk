package kr.wonjun.clothet.Activity.Cody

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_cody_main.*
import kotlinx.android.synthetic.main.toolbar.*
import kr.wonjun.clothet.Adapter.ViewPagerAdapter
import kr.wonjun.clothet.R
import org.jetbrains.anko.startActivity
import kotlin.properties.Delegates


class CodyMainActivity : AppCompatActivity() {

    val tabIds = intArrayOf(R.id.main_newsfeed, R.id.main_my_cody, R.id.main_save_cody, R.id.main_alarm)
    val tabOff = intArrayOf(R.drawable.ic_newsfeed_off, R.drawable.ic_my_off, R.drawable.ic_save_off, R.drawable.ic_alram_off)
    val tabOn = intArrayOf(R.drawable.ic_newsfeed_on, R.drawable.ic_my_on, R.drawable.ic_save_on, R.drawable.ic_alram_on)
    var position: Int by Delegates.observable(0) { prop, old, new ->
        findViewById<ImageView>(tabIds[old]).setImageResource(tabOff[old])
        findViewById<ImageView>(tabIds[new]).setImageResource(tabOn[new])
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cody_main)

        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayShowTitleEnabled(false)
        }

        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        main_viewPager.adapter = viewPagerAdapter
        main_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                val weight: Float = (positionOffset + position + ((positionOffset + position) * 0.05)).toFloat()
                main_tab_margin.layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, weight)
            }

            override fun onPageSelected(pos: Int) {
                position = pos
            }

        })
        for (i in 0..3) {
            findViewById<ImageView>(tabIds[i]).setOnClickListener {
                main_viewPager.currentItem = i
            }
        }
    }
}
