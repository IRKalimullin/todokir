package com.irk.todokir.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.irk.todokir.data.model.Task
import com.irk.todokir.ui.theme.TodokirTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodokirTheme {
                MainScreenList()
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun MainScreenList() {
    Box(
        modifier = Modifier
            .width(IntrinsicSize.Max)
            .height(IntrinsicSize.Max)
            .padding(12.dp)
    ) {

        Text(
            text = "Tasks",
            modifier = Modifier.align(Alignment.TopCenter)
        )
        LazyColumn(
            modifier = Modifier
                .width(IntrinsicSize.Max)
                .height(IntrinsicSize.Max)
        ){
            //TaskListItem()
        }



    }
}

//@Preview(showBackground = true)
@Composable
fun TaskListItem() {
    var task: Task = Task(
        id = 0,
        name = "task test",
        isDone = true,
        timestampOfTask = 123312,
        description = "asdasdad"
    )
    Row(
        modifier = Modifier
            .height(35.dp)
            .fillMaxSize()
    ) {
        Checkbox(checked = task.isDone,
            onCheckedChange = { task.isDone = it }
        )
        Text(
            text = task.name,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterVertically)

        )

    }
}


@Composable
fun GreetingPreview() {
    TodokirTheme {
        Greeting("Android")
    }
}