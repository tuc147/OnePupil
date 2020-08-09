import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  return (
   <form>
     <h1>One Pupil Login</h1>
     <input className="email" placeholder="Email"></input>
     <input className="password"placeholder="Password"></input>
     <button>Enter</button>
   </form>
  );
}

export default App;
