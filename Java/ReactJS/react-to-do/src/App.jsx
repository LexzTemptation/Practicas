import React, {Fragment, useState, useRef} from "react";
import {v4 as uuidv4} from 'uuid';
import {ToDoList} from "./components/ToDoList";

export function App()
{
    const [todos, setTodos] = useState ([
        { id: 1, task: 'Tarea 1', completed: false },
    ]);

    const todoTaskRef = useRef();

    //Para el check
    const toggleToDo = (id) =>
    {
        const newTodos = [...todos];
        const todo = newTodos.find((todo) => todo.id === id);
        todo.completed = !todo.completed;
        setTodos(newTodos);
    }

    const handleToDoAdd = () => 
    {
        const task = todoTaskRef.current.value;
        if(task === "") return;

        setTodos((prevTodos) => 
        {
            return [...prevTodos, {id : uuidv4(), task, completed : false}];
        })

        todoTaskRef.current.value = null; // limpia el input
    };

    const handleClearAll = () => {

        const newTodos = todos.filter((todo) => !todo.completed);
        setTodos(newTodos);
    };

    return (
        <Fragment>
            <ToDoList todos={todos} toggleToDo={toggleToDo}/>
            <input class="form-control" ref={todoTaskRef} type="text" placeholder="Nueva tarea"/>
            <br/>
            <button class="btn btn-outline-success" onClick={handleToDoAdd}>➕</button>
            <br></br>
            <br></br>
            <button class="btn btn-outline-danger" onClick={handleClearAll}>🗑</button>
            <br></br>
            <br></br>
            <div>te quedan {todos.filter((todo) => !todo.completed).length} tareas por terminar</div>
        </Fragment>
    );
}
















