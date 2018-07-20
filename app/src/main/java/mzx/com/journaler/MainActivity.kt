package mzx.com.journaler

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_header.*
import mzx.com.fragment.ItemsFragment
import mzx.com.fragment.ManualFragment
import mzx.com.journaler.R.id.filter_menu
import mzx.com.journaler.R.id.pager
import mzx.com.journaler.R.layout.activity_main
import java.text.FieldPosition
import android.support.v4.view.PagerAdapter
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    //private val tag = "aaaa"
    override val tag = "Main activity"
    override  fun getLayout()= R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //pager.adapter = ViewPagerAdapter(supportFragmentManager)
        pager.adapter = ViewPagerAdapter(supportFragmentManager)
//        val fragment = ItemsFragment()
//        supportFragmentManager
//                .beginTransaction()
//                .add(R.id.fragment_container, fragment)
//                .commit()
//        filter_menu.setText("H")
//        filter_menu.setOnClickListener{
//            val userManualFrg = ManualFragment()
//            supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.fragment_container, userManualFrg)
//                    .addToBackStack("User manual")
//                    .commit()
//        }
    }

    private class ViewPagerAdapter(manager: FragmentManager): FragmentStatePagerAdapter(manager){
        override fun getItem(position: Int): Fragment {
            return ItemsFragment()
        }

        override fun getCount(): Int {
            return 5
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.drawing_menu -> {
                Log.v(tag, "Main menu.")
                return true
            }
            R.id.options_menu -> {
                Log.v(tag, "Options menu.")
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }


}



