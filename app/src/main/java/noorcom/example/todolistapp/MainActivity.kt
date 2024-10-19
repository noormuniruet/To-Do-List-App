package noorcom.example.todolistapp
import noorcom.example.todolistapp.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val taskViewModel: TaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TaskAdapter(emptyList(), taskViewModel::delete, taskViewModel::update)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        taskViewModel.allTasks.observe(this, Observer { tasks ->
            adapter.updateData(tasks)
        })

        binding.buttonAdd.setOnClickListener {
            val taskName = binding.editTextTask.text.toString()
            if (taskName.isNotEmpty()) {
                taskViewModel.insert(Task(taskName = taskName))
                binding.editTextTask.text.clear()
            }
        }
    }
}

