package kt.hoan.instagram.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kt.hoan.instagram.R

open class BaseContext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baselayout)
    }
}