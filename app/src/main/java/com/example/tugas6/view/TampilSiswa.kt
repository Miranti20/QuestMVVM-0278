package com.example.tugas6.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tugas6.R
import com.example.tugas6.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {

    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(R.string.alamat), statusUiSiswa.alamat)
    )

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        stringResource(id = R.string.detail),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    ) { isiRuang ->
    }
}

