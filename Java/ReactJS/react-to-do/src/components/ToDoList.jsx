import React from 'react'
import {ToDoItem} from './ToDoItem';

export function ToDoList({ todos, toggleToDo }) 
{
    return (
    <ul>
        {todos.map((todo) => (
            <ToDoItem key={todo.id} todo={todo} toggleToDo={toggleToDo}/>
        ))}
    </ul>
    );
}
