package com.syntaxspin.sakura

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
//ScriptWrap's Shortcuts for code 
import androidx.compose.ui.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.*
import androidx.compose.ui.res.*
import androidx.compose.foundation.shape.*
import androidx.compose.material3.*
import androidx.compose.ui.layout.*

//Local Context
import androidx.compose.ui.platform.LocalContext
//Units & Draws
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
//LazyComponents
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
//icons 
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Home

//Theme
import com.syntaxspin.sakura.ui.theme.ThemeSakura

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent{
            ThemeSakura{
                 Surface( modifier = Modifier.fillMaxSize()){
                        Column{ Items()
                         dividerText("SearchBar (TextField)")
                         searchBar()
                         dividerText("Contact Lists")
                         Listy()
                         dividerText(" Compose Card ")
                         PartyCard()
                         }
                      }
                                                             }
                  }
}

@Composable
fun Name(name:String){
Text(
text= name ,
style = MaterialTheme.typography.titleMedium
)

}
@Composable
fun Desc(d:String){
Text(
text = d ,
color = MaterialTheme.colorScheme.secondary ,
style = MaterialTheme.typography.bodyMedium ,
)
}
@Composable 
fun Items(){
          Row(modifier = Modifier.padding(all = 8.dp)){
               Image(
                      painterResource(R.drawable.pfp),
                      contentDescription = "Profile Picture" ,
                      modifier = Modifier 
                      .size(50.dp)
                      .clip(CircleShape)
                      
                     )
              
          Spacer(modifier = Modifier .width(8.dp) .padding(top = 8.dp))
          Column{
           Name("ScriptWrap")
           Desc("Learning Compose from the Master Of Compose Aquiles Trindade")
           
                }
            }    
          }
@Composable
fun dividerText(txt:String){
Text(
text = txt ,
style = MaterialTheme.typography.labelSmall ,
modifier = Modifier .padding(16.dp)
)

}
@Composable
fun searchBar (modifier: Modifier = Modifier){
TextField(
value="" ,
onValueChange = {},
       leadingIcon = {
           Icon(
               imageVector = Icons.Default.Search,
               contentDescription = null
           )
       },
       colors = TextFieldDefaults.colors(
           unfocusedContainerColor = MaterialTheme.colorScheme.surface,
           focusedContainerColor = MaterialTheme.colorScheme.surface
       ),
       placeholder = {
           Text(text = "Search")
       },
       modifier = modifier
           .fillMaxWidth()
           .heightIn(min = 56.dp)
           .padding(16.dp)
   )


}
@Composable
fun Listy(){
LazyRow(modifier = Modifier.padding(8.dp)) {
items(6){item ->
Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
storyItem("Jensen Ackles" ,R.drawable.jea)
storyItem("Jenna Ortega" ,R.drawable.jo)
storyItem("Aquiles Trindade" ,R.drawable.at)
storyItem("Felipe Teixeira" ,R.drawable.ft)
storyItem("Rohit Kushvaha" ,R.drawable.rk)
storyItem("Vivek" ,R.drawable.vv)
}
}
}
}
@Composable
fun storyItem(text:String ,icon:Int ){
              Column(horizontalAlignment= Alignment.CenterHorizontally , modifier = Modifier.padding(8.dp)){
                    Image(
                      /* painter = painterResource(
                       LocalContext.current.resources.getIdentifier(icon, "drawable", LocalContext.current.packageName))*/
                      painter = painterResource(id = icon),
                        contentDescription = text ,
                        contentScale = ContentScale.Crop ,
                        modifier = Modifier
                        .size(88.dp)
                        .clip(CircleShape)
                        
              )
              Text(
              text= text ,
              style = MaterialTheme.typography.bodyMedium ,
              modifier = Modifier 
              .paddingFromBaseline(top = 24.dp , bottom = 8.dp)
              
              )
                    }
}
@Composable
fun PartyCard(){
Card(
modifier = Modifier 
.fillMaxWidth()
.padding(8.dp)
.height(100.dp)
){

}

}
  }


