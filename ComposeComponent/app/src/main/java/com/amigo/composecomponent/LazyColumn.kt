package com.amigo.composecomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun PreviewFunction() {
    Column {
        Box(Modifier.padding(top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()))
        BlogCategory(R.drawable.ic_profile, "Programmer", "Learning Different Languages")
    }
}

@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        Modifier.padding(start = 5.dp, end = 5.dp, top = 2.dp, bottom = 2.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Gray
                        ),
                        startX = 100f
                    )
                )
        ) {
            Row(
                Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(img),
                    "Image",
                    colorFilter = ColorFilter.tint(Color.Red),
                    modifier = Modifier
                        .size(48.dp)
                        .weight(.2f)
                )
                ItemDescription(title, subTitle, modifier = Modifier.weight(.8f))
            }
        }
    }
}

@Composable
fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
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
            fontWeight = FontWeight.Normal
        )
    }
}

data class Category(
    val img: Int,
    val title: String,
    val subTitle: String
)


fun getCategoryList(): List<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_profile, "Doctor", "Learning MBBS"))
    list.add(Category(R.drawable.ic_profile, "Engineer", "Building Structures"))
    list.add(Category(R.drawable.ic_profile, "Artist", "Creating Masterpieces"))
    list.add(Category(R.drawable.ic_profile, "Teacher", "Educating Students"))
    list.add(Category(R.drawable.ic_profile, "Scientist", "Exploring Innovations"))
    list.add(Category(R.drawable.ic_profile, "Chef", "Cooking Delicious Meals"))
    list.add(Category(R.drawable.ic_profile, "Pilot", "Flying High"))
    list.add(Category(R.drawable.ic_profile, "Writer", "Crafting Stories"))
    list.add(Category(R.drawable.ic_profile, "Musician", "Composing Music"))
    list.add(Category(R.drawable.ic_profile, "Photographer", "Capturing Moments"))
    list.add(Category(R.drawable.ic_profile, "Farmer", "Growing Crops"))
    list.add(Category(R.drawable.ic_profile, "Lawyer", "Fighting for Justice"))
    list.add(Category(R.drawable.ic_profile, "Nurse", "Caring for Patients"))
    list.add(Category(R.drawable.ic_profile, "Athlete", "Competing in Sports"))
    list.add(Category(R.drawable.ic_profile, "Designer", "Creating Visuals"))
    list.add(Category(R.drawable.ic_profile, "Mechanic", "Fixing Machines"))
    list.add(Category(R.drawable.ic_profile, "Carpenter", "Building Furniture"))
    list.add(Category(R.drawable.ic_profile, "Electrician", "Wiring Homes"))
    list.add(Category(R.drawable.ic_profile, "Plumber", "Fixing Pipes"))
    list.add(Category(R.drawable.ic_profile, "Architect", "Designing Buildings"))
    list.add(Category(R.drawable.ic_profile, "Veterinarian", "Treating Animals"))
    list.add(Category(R.drawable.ic_profile, "Firefighter", "Saving Lives"))
    list.add(Category(R.drawable.ic_profile, "Police Officer", "Maintaining Order"))
    list.add(Category(R.drawable.ic_profile, "Astronaut", "Exploring Space"))
    list.add(Category(R.drawable.ic_profile, "Entrepreneur", "Starting Businesses"))
    list.add(Category(R.drawable.ic_profile, "Psychologist", "Understanding Minds"))
    list.add(Category(R.drawable.ic_profile, "Librarian", "Organizing Books"))
    list.add(Category(R.drawable.ic_profile, "Journalist", "Reporting News"))
    list.add(Category(R.drawable.ic_profile, "Barber", "Styling Hair"))
    list.add(Category(R.drawable.ic_profile, "Tailor", "Sewing Clothes"))
    list.add(Category(R.drawable.ic_profile, "Dancer", "Performing Art"))
    list.add(Category(R.drawable.ic_profile, "Actor", "Portraying Characters"))
    list.add(Category(R.drawable.ic_profile, "Coach", "Training Athletes"))
    list.add(Category(R.drawable.ic_profile, "Gardener", "Maintaining Gardens"))
    list.add(Category(R.drawable.ic_profile, "Translator", "Converting Languages"))
    list.add(Category(R.drawable.ic_profile, "Programmer", "Writing Code"))
    list.add(Category(R.drawable.ic_profile, "Data Scientist", "Analyzing Data"))
    list.add(Category(R.drawable.ic_profile, "Game Developer", "Creating Games"))
    list.add(Category(R.drawable.ic_profile, "UI/UX Designer", "Improving User Experience"))
    list.add(Category(R.drawable.ic_profile, "Content Creator", "Producing Media"))
    list.add(Category(R.drawable.ic_profile, "Digital Marketer", "Promoting Brands"))
    list.add(Category(R.drawable.ic_profile, "Social Worker", "Helping Communities"))
    list.add(Category(R.drawable.ic_profile, "Environmentalist", "Protecting Nature"))
    list.add(Category(R.drawable.ic_profile, "Biologist", "Studying Life"))
    list.add(Category(R.drawable.ic_profile, "Chemist", "Experimenting with Chemicals"))
    list.add(Category(R.drawable.ic_profile, "Physicist", "Exploring Physics"))
    list.add(Category(R.drawable.ic_profile, "Mathematician", "Solving Problems"))
    list.add(Category(R.drawable.ic_profile, "Statistician", "Analyzing Numbers"))
    list.add(Category(R.drawable.ic_profile, "Economist", "Studying Economies"))
    return list
}