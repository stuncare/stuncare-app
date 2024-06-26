package com.widyawacana.stuncare.data.local.sharedpreferences

import android.content.Context
import com.widyawacana.stuncare.utils.PreferencesKey.NAME_KEY
import com.widyawacana.stuncare.utils.PreferencesKey.NAME_PREF
import com.widyawacana.stuncare.utils.PreferencesKey.PASSWORD_KEY

class SharedPreferencesManager(context: Context) {
    private val preferences = context.getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE)
    private val editor = preferences.edit()

    var name
        get() = preferences.getString(NAME_KEY, "")
        set(value) {
            editor.putString(NAME_KEY, value)
            editor.commit()
        }

    var password
        get() = preferences.getString(PASSWORD_KEY, "")
        set(value) {
            editor.putString(PASSWORD_KEY, value)
            editor.commit()
        }

    fun clear() {
        editor.clear()
        editor.commit()
    }
}