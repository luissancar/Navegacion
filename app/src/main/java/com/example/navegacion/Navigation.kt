package com.example.navegacion

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.navegacion.model.Routes

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
                navigationController.navigate(Routes.Pantalla02.route)
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
                navigationController.navigate(Routes.Pantalla03.route)
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
            .clickable { navigationController.navigate(Routes.Pantalla04.createRoute(10)) })
    }

}


@Composable
fun Screen04(navigationController: NavHostController, parametro: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Column (Modifier.align(Alignment.Center)){

            Text(
                text = parametro.toString(), modifier = Modifier
                    .clickable { navigationController.navigate(Routes.Pantalla05.createRoute("Hola")) }

            )
            Text(text = "Pantalla 5 sin parámetro", modifier = Modifier
                .clickable { navigationController.navigate("pantalla5") })
        }
    }

}


@Composable
fun Screen05(navigationController: NavHostController, parametroOpcional: String?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(
            text = parametroOpcional.toString(), modifier = Modifier
                .align(Alignment.Center)
        )
    }

}