package com.example.whatsappclonejpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.whatsappclonejpc.presentation.userRegistration.UserRegistration
import com.example.whatsappclonejpc.ui.theme.WhatsAppCloneJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppCloneJPCTheme {
                UserRegistration()
            }
        }
    }
}

