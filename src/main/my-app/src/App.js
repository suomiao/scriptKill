import logo from './logo.svg';
// import { Router , Route}  from "react-router-dom";
import {
     Route, Routes
} from "react-router-dom";
import Login from './login/login'
import './App.css';

function App() {
  return (
    <div className="App">
        <Routes>
            <Route path="/" element={ <Login />} />

        </Routes>

    </div>
  );
}

export default App;
