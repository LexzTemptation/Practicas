import React from 'react'

export function ToDoItem({todo, toggleToDo}) 
{
    const {id, task, completed} = todo;

    const handleToDoClick = () => 
    {
        toggleToDo(id);
    };

  return (
    <li>
        <input class="form-check-label" type="checkbox" checked={completed} onChange={handleToDoClick}/> {/* Esto es para marcar como completada la tarea */}
        {task}
    </li>
  )
}

















