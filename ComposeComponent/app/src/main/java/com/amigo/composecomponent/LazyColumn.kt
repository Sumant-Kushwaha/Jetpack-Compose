package com.amigo.composecomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun PreviewFunction(){
//    Column(
//        Modifier.padding(top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding())
//            .verticalScroll(rememberScrollState())
//    ) {
//        getCategory().map { item->
//            BlogCategory(item.img,item.title,item.subTitle)
//        }
//    }
    Column(
        Modifier.padding(top= WindowInsets.statusBars.asPaddingValues().calculateTopPadding())
    ) {
    LazyColumn {
        items(getCategory()){item->
            BlogCategory(item.img,item.title,item.subTitle)
        }
    }
    }
}


@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(5.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Row(
            Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "Profile",
                modifier=Modifier
                    .weight(.2f)
                    .size(48.dp),
                colorFilter = ColorFilter.tint(Color.Red)
            )
            ItemDescription(title, subTitle,modifier=Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String,subTitle: String,modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            subTitle,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp
        )
    }
}

data class Category(
    val img: Int,
    val title: String,
    val subTitle: String
)

fun getCategory(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_profile, "Doctor", "Have MBBS degree"))
    list.add(Category(R.drawable.ic_profile, "Engineer", "Builds and designs structures"))
    list.add(Category(R.drawable.ic_profile, "Teacher", "Educates students"))
    list.add(Category(R.drawable.ic_profile, "Artist", "Creates art and paintings"))
    list.add(Category(R.drawable.ic_profile, "Musician", "Plays musical instruments"))
    list.add(Category(R.drawable.ic_profile, "Chef", "Cooks delicious meals"))
    list.add(Category(R.drawable.ic_profile, "Writer", "Writes books and articles"))
    list.add(Category(R.drawable.ic_profile, "Photographer", "Captures moments"))
    list.add(Category(R.drawable.ic_profile, "Pilot", "Flies airplanes"))
    list.add(Category(R.drawable.ic_profile, "Nurse", "Provides medical care"))
    list.add(Category(R.drawable.ic_profile, "Scientist", "Conducts research"))
    list.add(Category(R.drawable.ic_profile, "Lawyer", "Practices law"))
    list.add(Category(R.drawable.ic_profile, "Farmer", "Grows crops"))
    list.add(Category(R.drawable.ic_profile, "Mechanic", "Repairs vehicles"))
    list.add(Category(R.drawable.ic_profile, "Electrician", "Installs electrical systems"))
    list.add(Category(R.drawable.ic_profile, "Plumber", "Fixes plumbing issues"))
    list.add(Category(R.drawable.ic_profile, "Carpenter", "Builds wooden structures"))
    list.add(Category(R.drawable.ic_profile, "Designer", "Designs graphics and products"))
    list.add(Category(R.drawable.ic_profile, "Architect", "Designs buildings"))
    list.add(Category(R.drawable.ic_profile, "Veterinarian", "Treats animals"))
    list.add(Category(R.drawable.ic_profile, "Dentist", "Takes care of teeth"))
    list.add(Category(R.drawable.ic_profile, "Firefighter", "Extinguishes fires"))
    list.add(Category(R.drawable.ic_profile, "Police Officer", "Maintains law and order"))
    list.add(Category(R.drawable.ic_profile, "Paramedic", "Provides emergency medical care"))
    list.add(Category(R.drawable.ic_profile, "Astronaut", "Explores space"))
    list.add(Category(R.drawable.ic_profile, "Journalist", "Reports news"))
    list.add(Category(R.drawable.ic_profile, "Actor", "Performs in movies and plays"))
    list.add(Category(R.drawable.ic_profile, "Director", "Directs movies and shows"))
    list.add(Category(R.drawable.ic_profile, "Entrepreneur", "Starts and runs businesses"))
    list.add(Category(R.drawable.ic_profile, "Software Developer", "Writes code"))
    list.add(Category(R.drawable.ic_profile, "Data Scientist", "Analyzes data"))
    list.add(Category(R.drawable.ic_profile, "AI Specialist", "Works on artificial intelligence"))
    list.add(Category(R.drawable.ic_profile, "Game Developer", "Creates video games"))
    list.add(Category(R.drawable.ic_profile, "Cybersecurity Expert", "Secures systems"))
    list.add(Category(R.drawable.ic_profile, "Digital Marketer", "Promotes products online"))
    list.add(Category(R.drawable.ic_profile, "Content Creator", "Creates online content"))
    list.add(Category(R.drawable.ic_profile, "Social Worker", "Helps communities"))
    list.add(Category(R.drawable.ic_profile, "Psychologist", "Studies human behavior"))
    list.add(Category(R.drawable.ic_profile, "Therapist", "Provides mental health support"))
    list.add(Category(R.drawable.ic_profile, "Coach", "Trains individuals or teams"))
    list.add(Category(R.drawable.ic_profile, "Athlete", "Competes in sports"))
    list.add(Category(R.drawable.ic_profile, "Librarian", "Manages libraries"))
    list.add(Category(R.drawable.ic_profile, "Translator", "Translates languages"))
    list.add(Category(R.drawable.ic_profile, "Tour Guide", "Guides tourists"))
    list.add(Category(R.drawable.ic_profile, "Barista", "Prepares coffee"))
    list.add(Category(R.drawable.ic_profile, "Tailor", "Makes and alters clothes"))
    list.add(Category(R.drawable.ic_profile, "Florist", "Arranges flowers"))
    list.add(Category(R.drawable.ic_profile, "Event Planner", "Organizes events"))
    return list
}