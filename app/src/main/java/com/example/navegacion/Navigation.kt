package com.example.navegacion

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun Screen01(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Text(text = "Screen01", modifier = Modifier
            .align(Alignment.Center)
            .clickable
            {
                navigationController.navigate("pantalla02")
            }
        )
    }

}

@Composable
fun Screen02(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Text(text = "Screen02", modifier = Modifier
            .align(Alignment.Center)
            .clickable
            {
                navigationController.navigate("pantalla03")
            })
    }

}

@Composable
fun Screen03(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(text = "Screen03", modifier = Modifier
            .align(Alignment.Center)
            .clickable
            {
                navigationController.navigate("pantalla01")
            })
    }

}