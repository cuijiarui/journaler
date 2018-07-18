package mzx.com.journaler

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_header.*
import mzx.com.fragment.ItemsFragment
import mzx.com.fragment.ManualFragment
import mzx.com.journaler.R.layout.activity_main



class MainActivity : BaseActivity() {
    //private val tag = "aaaa"
    override fun getActivityTitle() = R.string.app_name
    override val tag = "Main activity"
    override  fun getLayout(): Int {
        return activity_main
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = ItemsFragment()
        supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        filter_menu.setText("H")
        filter_menu.setOnClickListener{
            val userManualFrg = ManualFragment()
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, userManualFrg)
                    .addToBackStack("User manual")
                    .commit()
        }
    }







}
