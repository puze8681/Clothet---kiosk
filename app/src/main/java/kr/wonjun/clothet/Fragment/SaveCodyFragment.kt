package kr.wonjun.clothet.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_save_cody.view.*
import kr.wonjun.clothet.Activity.Cody.InStyleActivity
import kr.wonjun.clothet.Adapter.CodyRecyclerViewAdapter

import kr.wonjun.clothet.R
import org.jetbrains.anko.support.v4.startActivity


/**
 * A simple [Fragment] subclass.
 */
class SaveCodyFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_save_cody, container, false)
        val adapter = CodyRecyclerViewAdapter(context)
        view.savecody_recyclerView.adapter = adapter
        adapter.itemClick = object : CodyRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                startActivity<InStyleActivity>()
            }
        }
        view.savecody_recyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        return view
    }

    companion object {
        fun newInstance(): SaveCodyFragment = SaveCodyFragment()
    }
}
