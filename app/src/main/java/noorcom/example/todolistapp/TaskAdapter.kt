package noorcom.example.todolistapp
import noorcom.example.todolistapp.databinding.ItemTaskBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class TaskAdapter(
    private var tasks: List<Task>,
    private val onDelete: (Task) -> Unit,
    private val onUpdate: (Task) -> Unit
) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.textViewTask.text = task.taskName
            binding.checkBox.isChecked = task.isCompleted

            binding.buttonDelete.setOnClickListener { onDelete(task) }
            binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
                onUpdate(task.copy(isCompleted = isChecked))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(tasks[position])
    }

    override fun getItemCount() = tasks.size

    fun updateData(newTasks: List<Task>) {
        tasks = newTasks
        notifyDataSetChanged()
    }
}

