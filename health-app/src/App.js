import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom"


import Login from "./pages/Login";
import Signup from "./pages/Signup";
import Dashboard from "./pages/Dashboard";
import Doctors from "./pages/Doctors";
import ProtectedRoute from "./components/ProtectedRoute";
import Navbar from "./components/Navbar";
import BookAppointment from "./pages/BookAppointment";
import MyAppointments from "./pages/MyAppointments";

function App(){
  return (
    <BrowserRouter>
    <Navbar/>
    <Routes>
      <Route path="/" element={<Login />} />
      <Route path="/signup" element={<Signup />} />
      <Route path="/dashboard" element={
        <ProtectedRoute>
          <Dashboard/>

      </ProtectedRoute>} />
      <Route path="/doctors" element={<Doctors/>} />
      <Route path="/book" element={
        <ProtectedRoute>
        <BookAppointment />
      </ProtectedRoute>} />
      <Route path="/myappointments" element={<MyAppointments/>} />

    </Routes>




    </BrowserRouter>
  );
}
 export default App;