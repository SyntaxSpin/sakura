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

//TextField

//Units & Draws
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
//LazyComponents
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
//icons 
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search

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


/* Will Learn it Later
@Composable
fun Listify(itm : List<itm>){
LazyColumn{
           items(itm){  itm ->
                      Items(itm)
                      }
           }

}  */        
  }


