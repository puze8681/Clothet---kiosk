package kr.wonjun.clothet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initApp()

        splash_btn_login.setOnClickListener {
            startActivity<MainActivity>()
        }

        splash_btn_register.setOnClickListener {
            startActivity<RegisterActivity>()
        }
    }

    fun initApp(): Unit{
        translateIcon()
        alphaLayout()
    }

    fun translateIcon(): Unit {


        val icon: ImageView = findViewById(R.id.splash_img) as ImageView
        anim = AnimationUtils.loadAnimation(this, R.anim.translate)
        anim.reset()


        icon.clearAnimation()
        icon.startAnimation(anim)

        val thread: Thread = Thread {
            try {
                var term = 0
                while (term < 3000) {
                    Thread.sleep(60)
                    term += 100
                }
//                val loginIntent = Intent(this, LoginActivity::class.java)
//                loginIntent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
//                startActivity(loginIntent)
//                finish()
            } catch (e: InterruptedException) {
            } finally {
//                this.finish()
            }
        }
        thread.start()
    }

    fun alphaLayout(): Unit {

        val animlayout: LinearLayout = findViewById(R.id.login_window) as LinearLayout

        anim = AnimationUtils.loadAnimation(this, R.anim.alpha)
        anim.reset()

        animlayout.clearAnimation()
        animlayout.startAnimation(anim)

        val thread: Thread = Thread {
            try {
                var term = 0
                while (term < 3000) {
                    Thread.sleep(60)
                    term += 100
                }
//                val loginIntent = Intent(this, LoginActivity::class.java)
//                loginIntent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
//                startActivity(loginIntent)
//                finish()
            } catch (e: InterruptedException) {
            } finally {
//                this.finish()
            }
        }
        thread.start()
    }
}