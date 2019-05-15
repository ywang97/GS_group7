import React from 'react';
import TextInput from './TextInput.js';

class CardForm extends React.Component{
    render(){
        return(
            <form className='card-form'>
                <h2>Add a Card</h2>
                <TextInput name='username' label='Username'/>
                <TextInput name='message' label='Message'/>
            </form>
        )
    }
}