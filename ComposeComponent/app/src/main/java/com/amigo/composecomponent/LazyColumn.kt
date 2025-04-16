package com.amigo.composecomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun PreviewFunction() {
    Column {
        Box(modifier = Modifier
            .padding(top= WindowInsets.statusBars.asPaddingValues().calculateTopPadding())
        )
//        Column (
//            modifier = Modifier
//                .verticalScroll(rememberScrollState())
//        ) {
//            getCategoryList().map { item->
//                BlogCategory(item.img,item.title,item.subtitle)
//            }
//        }
        LazyColumn {
            items(getCategoryList()){item->
                BlogCategory(item.img,item.title,item.subtitle)
            }
        }
    }
}

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(58.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, modifier = Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String,subtitle: String,modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            subtitle,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(
    val img:Int,
    val title:String,
    val subtitle: String
)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_profile, "Programmer", "Learning Different Languages"))
    list.add(Category(R.drawable.ic_profile, "Designer", "Creating Beautiful UI"))
    list.add(Category(R.drawable.ic_profile, "Writer", "Crafting Engaging Stories"))
    list.add(Category(R.drawable.ic_profile, "Photographer", "Capturing Moments"))
    list.add(Category(R.drawable.ic_profile, "Musician", "Composing Melodies"))
    list.add(Category(R.drawable.ic_profile, "Chef", "Cooking Delicious Meals"))
    list.add(Category(R.drawable.ic_profile, "Teacher", "Educating Students"))
    list.add(Category(R.drawable.ic_profile, "Doctor", "Saving Lives"))
    list.add(Category(R.drawable.ic_profile, "Engineer", "Building Solutions"))
    list.add(Category(R.drawable.ic_profile, "Artist", "Painting Masterpieces"))
    list.add(Category(R.drawable.ic_profile, "Athlete", "Breaking Records"))
    list.add(Category(R.drawable.ic_profile, "Entrepreneur", "Starting Businesses"))
    list.add(Category(R.drawable.ic_profile, "Scientist", "Discovering Innovations"))
    list.add(Category(R.drawable.ic_profile, "Pilot", "Flying High"))
    list.add(Category(R.drawable.ic_profile, "Astronaut", "Exploring Space"))
    list.add(Category(R.drawable.ic_profile, "Actor", "Performing Roles"))
    list.add(Category(R.drawable.ic_profile, "Director", "Creating Films"))
    list.add(Category(R.drawable.ic_profile, "Gamer", "Playing Games"))
    list.add(Category(R.drawable.ic_profile, "Developer", "Writing Code"))
    list.add(Category(R.drawable.ic_profile, "Mechanic", "Fixing Machines"))
    list.add(Category(R.drawable.ic_profile, "Farmer", "Growing Crops"))
    list.add(Category(R.drawable.ic_profile, "Lawyer", "Defending Clients"))
    list.add(Category(R.drawable.ic_profile, "Nurse", "Caring for Patients"))
    list.add(Category(R.drawable.ic_profile, "Firefighter", "Extinguishing Fires"))
    list.add(Category(R.drawable.ic_profile, "Police Officer", "Maintaining Order"))
    list.add(Category(R.drawable.ic_profile, "Architect", "Designing Buildings"))
    list.add(Category(R.drawable.ic_profile, "Dancer", "Performing Choreography"))
    list.add(Category(R.drawable.ic_profile, "Singer", "Singing Songs"))
    list.add(Category(R.drawable.ic_profile, "Journalist", "Reporting News"))
    list.add(Category(R.drawable.ic_profile, "Librarian", "Organizing Books"))
    list.add(Category(R.drawable.ic_profile, "Veterinarian", "Treating Animals"))
    list.add(Category(R.drawable.ic_profile, "Plumber", "Fixing Pipes"))
    list.add(Category(R.drawable.ic_profile, "Electrician", "Wiring Systems"))
    list.add(Category(R.drawable.ic_profile, "Carpenter", "Building Furniture"))
    list.add(Category(R.drawable.ic_profile, "Tailor", "Sewing Clothes"))
    list.add(Category(R.drawable.ic_profile, "Barber", "Styling Hair"))
    list.add(Category(R.drawable.ic_profile, "Coach", "Training Athletes"))
    list.add(Category(R.drawable.ic_profile, "Consultant", "Providing Advice"))
    list.add(Category(R.drawable.ic_profile, "Researcher", "Conducting Studies"))

    return list
}