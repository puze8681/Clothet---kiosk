package kr.wonjun.clothet.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.wonjun.clothet.Activity.Cody.CodyMainActivity
import kr.wonjun.clothet.R
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToShopping.setOnClickListener {
            startActivity<CodyMainActivity>()
        }
    }
}
