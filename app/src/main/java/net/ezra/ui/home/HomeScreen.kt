package net.ezra.ui.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_ASSG

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {


    Box(modifier=Modifier,

    ) {
        Image(
            painter = painterResource(id = R.drawable.far), contentDescription = "",
            modifier = Modifier
////        .background(Color.Cyan)
                .fillMaxSize()
//              .clip(RoundedCornerShape(50))
                .size(200.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Crop
            //contentScale = ContentScale.FillBounds

        )


    }




    Spacer(modifier = Modifier.height(250.dp))

    LazyColumn(
    ) {


        item {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
                    .padding(top = 10.dp)

            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_ASSG) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Assg Screen",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
//                    color = Color.White
                )


                Spacer(modifier = Modifier.height(20.dp))






                Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
                    .padding(top = 10.dp)

            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_ABOUT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "About Screen",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
//                    color = Color.White
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Mit screen",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
                    //color = Color.White
                )


                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_SERVICES) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Services screen",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
                    // color = Color.White
                )

            }




                Box(
                    modifier = Modifier,
                    Alignment.Center

                ) {


//                Column (modifier=Modifier,

//
//                ){
//                    Image(painter = painterResource(id = R.drawable.logo), contentDescription ="" )
//
//                }


                    Image(
                        painter = painterResource(id = R.drawable.bib), contentDescription = "null",
                        modifier = Modifier
//        .background(Color.Cyan)
                            .clip(RoundedCornerShape(50))
                            .size(200.dp),
                        //.fillMaxSize() ,

//    colorFilter = ColorFilter.tint(Color.Red),
                        contentScale = ContentScale.Crop
//    contentScale = ContentScale.FillBounds
                    )



                    Column(
                        modifier = Modifier
//        .background(Color.Gray)
                            .fillMaxSize()
                            .padding(20.dp),

                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "Please register here if you do not have an acount",
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        var name by remember {
                            mutableStateOf(TextFieldValue(" "))
                        }
                        OutlinedTextField(
                            value = name,
                            onValueChange = { name = it },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Person,
                                    contentDescription = ""
                                )
                            },
                            label = { Text(text = "Enter name") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                            textStyle = androidx.compose.ui.text.TextStyle(Color.White),

                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color.Green,
                                unfocusedBorderColor = Color.Red,
                                focusedLabelColor = Color.Green,
                                cursorColor = Color.Green,
                                unfocusedLabelColor = Color.Red,
                                unfocusedLeadingIconColor = Color.Red,
                                unfocusedTextColor = Color.White,
                                focusedTextColor = Color.Green,


                                ),


                            )
                        Spacer(modifier = Modifier.height(10.dp))
//

                        var email by remember {
                            mutableStateOf(TextFieldValue(" "))
                        }
                        OutlinedTextField(
                            value = email,
                            onValueChange = { email = it },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = ""
                                )
                            },
                            label = { Text(text = "Enter email") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                            textStyle = androidx.compose.ui.text.TextStyle(Color.White),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color.Green,
                                unfocusedBorderColor = Color.Red,
                                focusedLabelColor = Color.Green,
                                cursorColor = Color.Green,
                                unfocusedLabelColor = Color.Red,
                                unfocusedLeadingIconColor = Color.Red,
                                unfocusedTextColor = Color.White,
                                focusedTextColor = Color.Green,


                                ),


                            )
                        Spacer(modifier = Modifier.height(10.dp))
//


                        var phone by remember {
                            mutableStateOf(TextFieldValue(" "))
                        }
                        OutlinedTextField(
                            value = phone,
                            onValueChange = { phone = it },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Phone,
                                    contentDescription = ""
                                )
                            },
                            label = { Text(text = "Enter number") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                            textStyle = androidx.compose.ui.text.TextStyle(Color.White),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color.Green,
                                unfocusedBorderColor = Color.Red,
                                focusedLabelColor = Color.Green,
                                cursorColor = Color.Green,
                                unfocusedLabelColor = Color.Red,
                                unfocusedLeadingIconColor = Color.Red,
                                unfocusedTextColor = Color.White,
                                focusedTextColor = Color.Green,


                                ),

                            )
                        Spacer(modifier = Modifier.height(10.dp))
//


                        var password by remember {
                            mutableStateOf(TextFieldValue(" "))
                        }
                        OutlinedTextField(
                            value = password,
                            onValueChange = { password = it },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Lock,
                                    contentDescription = ""
                                )
                            },
                            label = { Text(text = "Password") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                            textStyle = androidx.compose.ui.text.TextStyle(Color.White),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                focusedBorderColor = Color.Green,
                                unfocusedBorderColor = Color.Red,
                                focusedLabelColor = Color.Green,
                                cursorColor = Color.Green,
                                unfocusedLabelColor = Color.Red,
                                unfocusedLeadingIconColor = Color.Red,
                                unfocusedTextColor = Color.White,
                                focusedTextColor = Color.Green,

                                ),

                            )
                        Spacer(modifier = Modifier.height(10.dp))
//

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .padding(10.dp)
                                .padding(top = 10.dp)

                        ) {
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                modifier = Modifier

                                    .clickable {
                                        navController.navigate(ROUTE_ABOUT) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    },
                                text = "Visit our page",
                                textAlign = TextAlign.Center,
                                // color = MaterialTheme.colorScheme.onSurface
                                color = Color.Green
                            )




                            Spacer(modifier = Modifier.height(20.dp))


                        }


                    }
                }
            }
        }
    }



    @Composable
    fun PreviewLight() {
        HomeScreen(rememberNavController())
    }
}
