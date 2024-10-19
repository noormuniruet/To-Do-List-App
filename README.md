# **To-Do List App with Room Database in Kotlin**  

A simple **To-Do List Android App** built using Kotlin, **Room Database**, **ViewModel**, and **LiveData**. The app allows users to:
- Add tasks  
- Delete tasks  
- Mark tasks as completed  
- View all tasks in a RecyclerView  
- Persist data locally using **Room**  

This project follows the MVVM (Model-View-ViewModel) architecture pattern to keep the code organized and easy to maintain.

---

## **Features**
- Add, update, and delete tasks.
- Mark tasks as completed with a checkbox.
- All tasks are saved locally using **Room Database**.
- Uses **View Binding** for easier UI management.
- Follows MVVM architecture for clean separation of concerns.

---

## **Getting Started**

### **Prerequisites**
Make sure you have the following installed:
- **Android Studio** (latest version)
- **Kotlin** enabled in your project
- Internet connection to sync Gradle dependencies

---

## **Installation**

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/noormuniruet/todo-list-app.git
   cd todo-list-app
   ```
   
2. **Open the Project** in **Android Studio**.

3. **Sync Gradle** to download dependencies:
   - In Android Studio, click **File > Sync Project with Gradle Files**.

4. **Run the App**:
   - Click the **Run** button or use `Shift + F10` to build and run the app on an emulator or a physical device.

---

## **Dependencies**

Add the following dependencies in your `app/build.gradle`:
```groovy
dependencies {
    implementation "androidx.room:room-runtime:2.5.2"
    kapt "androidx.room:room-compiler:2.5.2"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
    implementation 'androidx.recyclerview:recyclerview:1.3.1'
}
```

Enable KAPT in the same `build.gradle` file:
```groovy
plugins {
    id 'kotlin-kapt'
}
```

---

## **Project Structure**

```plaintext
app/
├── java/com/example/todolistapp
│   ├── MainActivity.kt            # Main Activity
│   ├── Task.kt                    # Task Entity (Room)
│   ├── TaskDao.kt                 # Data Access Object (DAO)
│   ├── TaskDatabase.kt            # Room Database Instance
│   ├── TaskRepository.kt          # Repository Layer
│   └── TaskViewModel.kt           # ViewModel Layer
├── res/layout
│   ├── activity_main.xml          # Main Activity Layout
│   └── item_task.xml              # RecyclerView Item Layout
```

---

## **How to Use the App**

1. **Add a Task**:  
   - Enter the task name in the text field and click the "Add" button.

2. **View Tasks**:  
   - All tasks will appear in a RecyclerView.

3. **Mark Task as Completed**:  
   - Use the checkbox to mark tasks as completed.

4. **Delete Task**:  
   - Click the "Delete" button next to a task to remove it.

---

## **Screenshots**

Include screenshots of your app here (if applicable):
- **Main Screen:**  
  ![Main Screen](path/to/screenshot1.png)

---

## **Contributing**

If you'd like to contribute to this project:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add feature'`).
4. Push to your branch (`git push origin feature-branch`).
5. Create a **Pull Request**.

---

## **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## **Contact**

If you have any questions or feedback, feel free to reach out:
- **Email**: noorfatimagrw965@gmail.com  

---

## **Acknowledgments**

- Android Developers Documentation  
- JetBrains Kotlin Documentation  

---
