package com.vsgaa.puzzlegame

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if3155.helloworld.model.Kotak

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Kotak>>()
    init {
        data.value = initData()
    }
    // Data ini akan kita ambil dari server di langkah selanjutnya
    private fun initData(): List<Kotak> {
        return listOf(
            Kotak("A"),
            Kotak("B"),
            Kotak("C"),
            Kotak("D"),
            Kotak("E"),
            Kotak("F"),
            Kotak("G"),
            Kotak("H"),
            Kotak("I"),
            Kotak("J"),
            Kotak("K"),
            Kotak("L"),
            Kotak("M"),
            Kotak("N"),
            Kotak("O"),
            Kotak(""),
        )
    }
    fun getData(): LiveData<List<Kotak>> = data


}