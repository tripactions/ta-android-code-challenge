package com.example.mytripactions

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import com.example.mytripactions.compose.TATheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TATheme {
                // TODO
                Text(
                    text = stringResource(id = R.string.app_name)
                )
            }
        }
    }
}