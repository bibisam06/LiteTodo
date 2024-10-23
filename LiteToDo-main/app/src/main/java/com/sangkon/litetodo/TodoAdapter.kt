package com.sangkon.litetodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangkon.litetodo.databinding.TodoCardViewBinding
import kotlinx.coroutines.processNextEventInCurrentThread

//todo -> cardview 로 변경
class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoHolder>() {

    //투두담는리스트
    private val todoList : MutableList<Todo> = mutableListOf()
    class TodoHolder (private val binding: TodoCardViewBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindData(todo : Todo){
            binding.todo = todo
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val binding = TodoCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.bindData(todoList[position])
    }

    override fun getItemCount(): Int = todoList.size

    fun setTodoList(list:List<Todo>){
        todoList.addAll(list)

    }
}