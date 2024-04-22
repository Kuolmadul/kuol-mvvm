package net.ezra.ui.assg

import android.content.res.Configuration
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme
import net.ezra.R


@Composable
fun AssgScreen(navController: NavHostController) {

LazyColumn (modifier=Modifier
    .background(Color(0xffd7a41b))
){
    item() {

        Row {
                Text(text = "DASHBOARD",)
            Spacer(modifier = Modifier.width(250.dp))
            Icon(imageVector = Icons.Default.Notifications, contentDescription =""
            )
            }
Spacer(modifier = Modifier.height(20.dp))
        
        Row(modifier= Modifier
            .background(Color.White)
            .fillMaxSize()
        ) {

            Card (modifier= Modifier
                .size(170.dp)
                .clip(RoundedCornerShape(10)),
                colors =  CardDefaults.cardColors(Color(0xff195ef7))
            ){

                Spacer(modifier = Modifier.height(40.dp))
//                Image(painter = painterResource(id = R.drawable.far), contentDescription = "",
//                    modifier=Modifier
//                        .clip(RoundedCornerShape(100)),
//                            contentScale = ContentScale.Crop
// )
                Row (modifier= Modifier,
                    horizontalArrangement = Arrangement.Center,
                ){
               Image(painter = painterResource(id = R.drawable.wheel), contentDescription ="" ,
                   modifier= Modifier
                       .size(50.dp)
                       .clip(RoundedCornerShape(50)),

                   )}
                Text(text = "786",)
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Total Unit in Stock",)

            }



            Spacer(modifier = Modifier.width(20.dp))




            Card (modifier= Modifier
                .size(170.dp)
                .clip(RoundedCornerShape(10)),
                colors = CardDefaults.cardColors(Color(0xffe3ed6f))
            ){

                Spacer(modifier = Modifier.height(40.dp))
//                Image(painter = painterResource(id = R.drawable.far), contentDescription = "",
//                    modifier=Modifier
//                        .clip(RoundedCornerShape(100)),
//                            contentScale = ContentScale.Crop
// )
                Image(painter = painterResource(id = R.drawable.currency), contentDescription ="" ,
                    modifier= Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(50))
                )
                Text(text = "$565,430.00",)
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Total Inventory Value",)

            }

        }
Spacer(modifier = Modifier.height(3.dp))
Text(text = "Inventories")

        Spacer(modifier = Modifier.height(3.dp))

        Row {
            Column {
                Row {
                    Text(text = "No.of Tires")
                    Spacer(modifier = Modifier.width(250.dp))
                    Text(text = "Reorder level")
                }

                Row {
                    Text(text = "486")
                    Spacer(modifier = Modifier.width(190.dp))
                    Text(text = "1/12")
                }

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "View Stock")
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")

                }
            }
        }


        }



    }
}









@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AssgScreen(rememberNavController())
}

