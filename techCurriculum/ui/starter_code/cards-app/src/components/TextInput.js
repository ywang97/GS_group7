import React from 'react';

function TextInput(props) {
    return(
        <div>
            <h2>{props.name}</h2>
            <h2>{props.text}</h2>
        </div>
    )
}
export default TextInput