package noorcom.example.todolistapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.lifecycle.LiveData
import androidx.room.*

//@Dao
//interface TaskDao {
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insert(task: Task)
//
//    @Delete
//    suspend fun delete(task: Task)
//
//    @Update
//    suspend fun update(task: Task)
//
//    @Query("SELECT * FROM task_table ORDER BY id ASC")
//    fun getAllTasks(): LiveData<List<Task>>
//}
@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(task: Task): Long

    @Delete
    fun delete(task: Task): Int

    @Update
    fun update(task: Task): Int

    @Query("SELECT * FROM task_table ORDER BY id ASC")
    fun getAllTasks(): LiveData<List<Task>>
}

