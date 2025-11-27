package com.example.digikala_product

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.digikala_product.ui.theme.BlueMain
import com.example.digikala_product.ui.theme.Gray10
import com.example.digikala_product.ui.theme.Gray20
import com.example.digikala_product.ui.theme.MagentaMain
import com.example.digikala_product.ui.theme.YellowMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainUI()
        }
    }
}

@Composable
fun MainUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .padding(horizontal = 10.dp)
                .background(Color.Red)
        )
        Spacer(Modifier.height(45.dp))
        Image(
            painter = painterResource(R.drawable.product),
            "",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Spacer(Modifier.height(45.dp))
        Text(
            "گوشی موبایل آیفون",
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 14.dp),
            textAlign = TextAlign.End,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Spacer(Modifier.height(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {

            Text(
                text = "پرسش و پاسخ",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp),
                color = BlueMain
            )

            Text(
                text = "3",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp),
                color = BlueMain
            )

            Box(
                Modifier
                    .padding(horizontal = 8.dp)
                    .background(Color.LightGray, shape = CircleShape)
                    .size(5.dp)
            )

            Text(
                text = "دیدگاه کاربران",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp),
                color = BlueMain
            )

            Text(
                text = "8",
                fontSize = 14.sp,
                color = BlueMain
            )

            Box(
                Modifier
                    .padding(horizontal = 8.dp)
                    .size(5.dp)
                    .background(Color.LightGray, shape = CircleShape)
            )

            Text(
                text = "(11)",
                fontSize = 14.sp,
                color = Color.LightGray
            )

            Text(
                text = "4.2",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp)
            )

            Icon(
                Icons.Default.Star,
                contentDescription = "",
                tint = YellowMain,
                modifier = Modifier
                    .padding(end = 14.dp)
                    .size(18.dp)
            )

        }
        Spacer(Modifier.height(12.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Gray20)
                .height(7.dp)
        )
        Spacer(Modifier.height(12.dp))
        Text(
            "ویژگی های محصول",
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 14.dp),
            textAlign = TextAlign.End,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Spacer(Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ){
            Text("آمریکا",
                modifier = Modifier.padding(end = 5.dp),
                fontSize = 14.sp,
                color = Color.DarkGray)
            Text(":",
                modifier = Modifier.padding(end = 5.dp),
                fontSize = 14.sp,
                color = Color.Gray)
            Text("کشور تولید",
                modifier = Modifier.padding(end = 4.dp),
                fontSize = 14.sp,
                color = Color.Gray)
            Box(
                Modifier
                    .padding(start = 3.dp, end = 14.dp)
                    .background(Color.LightGray, shape = CircleShape)
                    .size(5.dp)
            )
        }
        Spacer(Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Gray20)
                .height(1.dp)
        )
        Spacer(Modifier.height(15.dp))
        Row(
            Modifier.padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "",
                tint = Color.LightGray,
                modifier = Modifier.size(26.dp)
            )

            Text(
                text = "مشخصات فنی",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold
            )

        }
        Spacer(Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Gray20)
                .height(1.dp)
        )
        Spacer(Modifier.height(15.dp))
        Row(
            Modifier.padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "",
                tint = Color.LightGray,
                modifier = Modifier.size(26.dp)
            )

            Text(
                text = "معرفی محصول",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                textAlign = TextAlign.End,
                fontWeight = FontWeight.Bold
            )

        }
        Spacer(Modifier.height(15.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(Gray10)
                .horizontalScroll(
                    rememberScrollState(),
                    reverseScrolling = true
                )
                .padding(10.dp)
        ) {

            for (item in 1..8) {

                Spacer(Modifier.width(10.dp))

                Card(
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {

                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Icon(
                            painter = painterResource(R.drawable.arrow),
                            contentDescription = "",
                            tint = Color.LightGray,
                            modifier = Modifier.size(26.dp)
                        )

                        Text(
                            text = "دسته بندی تستی",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(end = 8.dp),
                            fontWeight = FontWeight.Bold,
                            color = Color.DarkGray
                        )
                    }
                }
            }
        }
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(
                text = "نظر",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 4.dp, start = 14.dp),
                color = BlueMain

            )
            Text(
                text = "8",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 8.dp),
                color = BlueMain
            )
            Text(
                text = "دیدگاه کاربران",
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(end = 12.dp)
                    .fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End
            )
        }
        Spacer(Modifier.height(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(
                    rememberScrollState(),
                    reverseScrolling = true
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {

            for (i in 1..8) {

                Spacer(Modifier.width(8.dp))

                Card(
                    modifier = Modifier.width(280.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {

                    Spacer(Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {

                        Text(
                            text = "خریدار نیست",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 6.dp),
                            color = Color.Gray
                        )

                        Icon(
                            Icons.Outlined.Person,
                            "",
                            tint = Color.Gray,
                            modifier = Modifier.padding(end = 16.dp)
                        )

                    }

                    Text(
                        text = "به نظرم خیلی خوب بود و یکی از تجربه های خفن من هست(نظر تستی)",
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 20.dp, start = 10.dp, top = 10.dp),
                        textAlign = TextAlign.End,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(Modifier.height(40.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {

                        Text(
                            text = "امیرعلی امامی نیا",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )

                        Box(
                            Modifier
                                .padding(horizontal = 12.dp)
                                .size(5.dp)
                                .background(Color.Gray, shape = CircleShape)
                        )

                        Text(
                            text = "سی دقیقه قبل",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 20.dp),
                            color = Color.Gray
                        )

                    }

                    Spacer(Modifier.height(15.dp))

                }

                Spacer(Modifier.width(8.dp))

            }

        }

        Spacer(Modifier.height(20.dp))
        Card(
            Modifier.fillMaxWidth(),
            shape = RectangleShape,
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "220,000",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .padding(end = 6.dp),
                            color = Color.Gray
                        )

                        Text(
                            text = "56 %",
                            fontSize = 12.sp,
                            modifier = Modifier
                                .background(
                                    MagentaMain,
                                    shape = CircleShape
                                )
                                .padding(4.dp),
                            color = Color.White
                        )

                    }

                    Spacer(Modifier.height(6.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "تومان",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(end = 6.dp)
                        )

                        Text(
                            text = "97,000",
                            fontSize = 14.sp
                        )

                    }

                }

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd
                ) {

                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MagentaMain
                        )
                    ) {
                        Text(
                            text = "افزودن به سبد خرید",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }

            }
            Spacer(Modifier.height(20.dp))

        }

    }

}
@Composable
@Preview(showSystemUi = true)
fun PreviewMain(){
    MainUI()
}


