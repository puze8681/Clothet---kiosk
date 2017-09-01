package kr.wonjun.clothet.Adapter

/**
 * Created by parktaejun on 2017. 9. 1..
 */

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kr.wonjun.clothet.Fragment.AlarmFragment
import kr.wonjun.clothet.Fragment.MyCodyFragment
import kr.wonjun.clothet.Fragment.NewsfeedFragment
import kr.wonjun.clothet.Fragment.SaveCodyFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NewsfeedFragment.newInstance()
            1 -> MyCodyFragment.newInstance()
            2 -> SaveCodyFragment.newInstance()
            3 -> AlarmFragment.newInstance()
            else -> AlarmFragment.newInstance()
        }
    }
    override fun getCount(): Int = 4
}
