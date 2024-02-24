import logo from "./logo.svg";
import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./Components/Home";
import Header from "./Components/Header";
import AssignTask from "./Components/AssignTask";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Header />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/assignTask" element={<AssignTask />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
