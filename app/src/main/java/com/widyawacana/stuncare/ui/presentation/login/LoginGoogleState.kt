package com.widyawacana.stuncare.ui.presentation.login

import com.google.firebase.auth.AuthResult

data class LoginGoogleState(
    val success: AuthResult? = null,
    val error: String? = "",
    val loading: Boolean = true
)