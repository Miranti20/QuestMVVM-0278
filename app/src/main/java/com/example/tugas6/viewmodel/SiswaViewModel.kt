package com.example.tugas6.viewmodel

import androidx.lifecycle.ViewModel
import androidx.room.util.copy
import com.example.tugas6.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(nama=ls[0], gender=ls[1], alamat=ls[2])
        }
    }
}






