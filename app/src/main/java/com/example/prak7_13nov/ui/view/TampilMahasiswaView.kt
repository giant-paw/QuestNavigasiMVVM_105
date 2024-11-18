package com.example.prak7_13nov.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prak7_13nov.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    navController: NavController
){
    Column (modifier = Modifier.fillMaxSize()){
        TampilData(
            param = "Nama",
            argu = mhs.nama
        )

        TampilData(
            param = "nim",
            argu = mhs.nim
        )

        TampilData(
            param = "Gender",
            argu = mhs.gender
        )

        TampilData(
            param = "Alamat",
            argu = mhs.alamat
        )

        TampilData(
            param = "Email",
            argu = mhs.email
        )

        TampilData(
            param = "No Telepon",
            argu = mhs.notelpon
        )

        Button(
            onClick = {
                navController.popBackStack()
            },
            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            Text("Kembali")
        }

    }
}

@Composable
fun TampilData(param: String, argu: String) {
    Column (
        modifier = Modifier.padding(16.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = param,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argu,
                modifier = Modifier.weight(2f))

        }
    }
}