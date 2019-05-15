import React from 'react';


function User(props) {
  return (
    <div className='user'>
      <i className='fa fa-user-o'/>
      <p>{props.name}</p>
    </div>
  );
}

export default User;