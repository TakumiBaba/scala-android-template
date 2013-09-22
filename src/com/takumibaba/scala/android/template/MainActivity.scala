package com.takumibaba.scala.android.template

import android.app.Activity
import android.os.Bundle
import android.R
;

/**
 * Created with IntelliJ IDEA.
 * User: takumi
 * Date: 2013/09/22
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
class MainActivity extends Activity {
  /** Called when the activity is first created. */
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }

}
