/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package com.examples.customtouch.touchdelegate;

import android.app.Activity;
import android.os.Bundle;

public class TouchDelegateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TouchDelegateLayout layout = new TouchDelegateLayout(this);
		setContentView(layout);
	}
}
