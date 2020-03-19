package com.example.themeexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.processphoenix.ProcessPhoenix
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val PREF_NAME = "theme";

        val pref = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        val COLOR_NAME = "color-name"

        val colorName = pref.getString(COLOR_NAME, "")

        if("".equals(colorName)) {
            val editor = pref.edit()
            editor.putString(COLOR_NAME, "Purple")
            editor.apply();
        }

        if("Green".equals(colorName)) {
            setTheme(R.style.Green)

        }
        else if("Blue".equals(colorName))
        {
            setTheme(R.style.Blue)

        }
        else if("Red".equals(colorName))
        {
            setTheme(R.style.Red)
        }
        else
        {
            setTheme(R.style.PurpleTheme)
        }

        setContentView(R.layout.activity_main)

        if("Green".equals(colorName)) {
             ibtGreen.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))

        }
        else if("Blue".equals(colorName))
        {
            ibtBlue.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))

        }
        else if("Red".equals(colorName))
        {
            ibtRed.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))
        }
        else
        {
            ibtPurple.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))

        }

        ibtPurple.setOnClickListener {
            ibtGreen.setImageDrawable(null)
            ibtBlue.setImageDrawable(null)
            ibtRed.setImageDrawable(null)

            ibtPurple.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))
            val editor =pref.edit()
            editor.putString(COLOR_NAME,"Purple")
            editor.apply()
            recreate()
        }
        ibtGreen.setOnClickListener {
            ibtPurple.setImageDrawable(null)
            ibtBlue.setImageDrawable(null)
            ibtRed.setImageDrawable(null)

            ibtGreen.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))
            val editor =pref.edit()
            editor.putString(COLOR_NAME,"Green")
            editor.apply()
            recreate()
        }

        ibtBlue.setOnClickListener {
            ibtPurple.setImageDrawable(null)
            ibtGreen.setImageDrawable(null)
            ibtRed.setImageDrawable(null)

            ibtBlue.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))
            val editor =pref.edit()
            editor.putString(COLOR_NAME,"Blue")
            editor.apply()
            recreate()
        }

        ibtRed.setOnClickListener {
            ibtPurple.setImageDrawable(null)
            ibtGreen.setImageDrawable(null)
            ibtBlue.setImageDrawable(null)

            ibtRed.setImageDrawable(resources.getDrawable(R.drawable.ic_check_circle_black_24dp))
            val editor =pref.edit()
            editor.putString(COLOR_NAME,"Red")
            editor.apply()
            recreate()
        }




        }
}
