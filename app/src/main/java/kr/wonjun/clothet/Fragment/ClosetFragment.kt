package kr.wonjun.clothet.Fragment

/**
 * Created by parktaejun on 2017. 9. 1..
 */
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.wonjun.clothet.R


class ClosetFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_closet, container, false)
        return view
    }

    companion object {
        fun newInstance(): ClosetFragment = ClosetFragment()
    }

}