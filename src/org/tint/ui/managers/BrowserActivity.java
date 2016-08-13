/*
 * Tint Browser for Android
 * 
 * Copyright (C) 2012 - to infinity and beyond J. Devauchelle and contributors.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package org.tint.ui.managers;

import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public abstract class BrowserActivity extends FragmentActivity{
	public static final int ACTIVITY_BOOKMARKS = 0;
	public static final int ACTIVITY_OPEN_FILE_CHOOSER = 1;
	
	public static final int CONTEXT_MENU_OPEN = Menu.FIRST + 10;
	public static final int CONTEXT_MENU_OPEN_IN_NEW_TAB = Menu.FIRST + 11;
	public static final int CONTEXT_MENU_OPEN_IN_BACKGROUND = Menu.FIRST + 12;
	public static final int CONTEXT_MENU_DOWNLOAD = Menu.FIRST + 13;
	public static final int CONTEXT_MENU_COPY = Menu.FIRST + 14;
	public static final int CONTEXT_MENU_SEND_MAIL = Menu.FIRST + 15;
	public static final int CONTEXT_MENU_SHARE = Menu.FIRST + 16;
	public abstract UIManager getUIManager();
}
