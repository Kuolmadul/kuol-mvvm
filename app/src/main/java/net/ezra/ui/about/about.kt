package net.ezra.ui.about

import android.content.ClipData.Item
import android.content.res.Configuration
import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme
import net.ezra.R


@Composable
fun AboutScreen(navController: NavHostController) {


    Box(
        modifier = Modifier,

        ) {
//        Image(
//            painter = painterResource(id = R.drawable.dak), contentDescription = "",
//            modifier = Modifier
//////        .background(Color.Cyan)
//                .fillMaxSize()
////              .clip(RoundedCornerShape(50))
//                .size(200.dp),
////
//////    colorFilter = ColorFilter.tint(Color.Red),
//            contentScale = ContentScale.Crop
//            //contentScale = ContentScale.FillBounds
//
//        )


  LazyColumn{

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
                                navController.navigate(ROUTE_HOME) {
                                    popUpTo(ROUTE_ABOUT) { inclusive = true }
                                }
                            },
                        text = "Home",
                        textAlign = TextAlign.Center,
                        // color = MaterialTheme.colorScheme.onSurface
                        color = Color.Green
                    )

                }




                    Row{
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "")

                    }
                        Spacer(modifier = Modifier.width(100.dp))


                        Column {
                            Text(text = "Location")
                            Row {
                                Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            }
                        }


                        Spacer(modifier = Modifier.width(110.dp))



                        Row {



                            Row(
                                modifier = Modifier
                                    .size(20.dp)




                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.vin),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(50))
                                        .size(200.dp)
                                        .fillMaxSize()
                                )


                            }

                        }
                    }





                }

           }
    }


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

