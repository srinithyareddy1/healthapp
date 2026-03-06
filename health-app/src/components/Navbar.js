 import React from "react";
import { Link, useNavigate } from "react-router-dom";

function Navbar() {

  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("user");
    navigate("/");
  };

  return (
    <div style={{borderBottom:"1px solid black", padding:"10px", display:"flex", gap:"20px"}}>
      
      <Link to="/dashboard">Dashboard</Link>
      <Link to="/doctors">Doctors</Link>
      <Link to="/book">Book Appointment</Link>
      <Link to="/myappointments">My Appointments</Link>

      <button onClick={handleLogout}>Logout</button>

    </div>
  );
}


export default Navbar;