package com.amigo.composecomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
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

//@Preview
//@Composable
//fun PreviewFunction() {
//    Column(
//        modifier = Modifier
//            .padding(top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding())
//    ) {
//        LazyColumn {
//            items(
//                getCategoryList()
//            ){
//                BlogCategory
//            }
//        }
//    }
//}

@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(48.dp)
                    .padding(10.dp)
                    .weight(.2f)

            )
            ItemDescription(title, subTitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            title, style = MaterialTheme.typography.headlineSmall
        )
        Text(
            subTitle, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Thin
        )
    }
}

data class Category(
    val img: Int, val title: String, val subTitle: String
)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_profile, "Programming", "Learn different language"))
    list.add(Category(R.drawable.ic_profile, "Technology", "News about new tech"))
    list.add(Category(R.drawable.ic_profile, "Science", "Explore scientific discoveries"))
    list.add(Category(R.drawable.ic_profile, "Health", "Tips for a healthy lifestyle"))
    list.add(Category(R.drawable.ic_profile, "Education", "Resources for learning"))
    list.add(Category(R.drawable.ic_profile, "Travel", "Discover new places"))
    list.add(Category(R.drawable.ic_profile, "Food", "Delicious recipes and tips"))
    list.add(Category(R.drawable.ic_profile, "Fitness", "Workout and fitness tips"))
    list.add(Category(R.drawable.ic_profile, "Finance", "Manage your finances better"))
    list.add(Category(R.drawable.ic_profile, "Art", "Explore creative arts"))
    list.add(Category(R.drawable.ic_profile, "Music", "Learn about music and instruments"))
    list.add(Category(R.drawable.ic_profile, "Movies", "Latest movie reviews"))
    list.add(Category(R.drawable.ic_profile, "Books", "Book recommendations"))
    list.add(Category(R.drawable.ic_profile, "Gaming", "News about video games"))
    list.add(Category(R.drawable.ic_profile, "Fashion", "Latest fashion trends"))
    list.add(Category(R.drawable.ic_profile, "Photography", "Tips for great photos"))
    list.add(Category(R.drawable.ic_profile, "History", "Learn about historical events"))
    list.add(Category(R.drawable.ic_profile, "Culture", "Explore different cultures"))
    list.add(Category(R.drawable.ic_profile, "Nature", "Discover the beauty of nature"))
    list.add(Category(R.drawable.ic_profile, "Animals", "Learn about wildlife"))
    list.add(Category(R.drawable.ic_profile, "DIY", "Do-it-yourself projects"))
    list.add(Category(R.drawable.ic_profile, "Parenting", "Tips for parents"))
    list.add(Category(R.drawable.ic_profile, "Relationships", "Advice for better relationships"))
    list.add(Category(R.drawable.ic_profile, "Career", "Tips for career growth"))
    list.add(Category(R.drawable.ic_profile, "Technology", "Emerging tech trends"))
    list.add(Category(R.drawable.ic_profile, "Space", "Explore the universe"))
    list.add(Category(R.drawable.ic_profile, "Environment", "Sustainability tips"))
    list.add(Category(R.drawable.ic_profile, "Sports", "Latest sports news"))
    list.add(Category(R.drawable.ic_profile, "Politics", "Updates on global politics"))
    list.add(Category(R.drawable.ic_profile, "Economy", "Insights into the economy"))
    list.add(Category(R.drawable.ic_profile, "Psychology", "Understand human behavior"))
    list.add(Category(R.drawable.ic_profile, "Coding", "Learn to code"))
    list.add(Category(R.drawable.ic_profile, "Startups", "Tips for entrepreneurs"))

    return list
}