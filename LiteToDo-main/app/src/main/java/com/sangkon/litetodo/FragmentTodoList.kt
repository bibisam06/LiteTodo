package com.sangkon.litetodo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sangkon.litetodo.databinding.FragmentTodoBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.sangkon.litetodo.databinding.FragmentTodoListBinding

class FragmentTodoList : Fragment() {
    private lateinit var binding:FragmentTodoListBinding
    private val todoList: MutableList<Todo> = mutableListOf()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodoListBinding.inflate(inflater,container,false)
        todoList.add(Todo(date = "2024", task = "dd1"))
        todoList.add(Todo(date = "2024", task = "dd2"))
        todoList.add(Todo(date = "2024", task = "dd3"))
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding.todoList.layoutManager =LinearLayoutManager(requireContext())
        val todoAdapter: TodoAdapter = TodoAdapter()
        todoAdapter.setTodoList(todoList)
        binding.todoList.adapter = todoAdapter
    }
}
