import React from "react";
import { useEffect, useState } from "react";
import DoctorCard from "../components/DoctorCard";
import { useNavigate } from "react-router-dom";
import Navbar from "../components/Navbar";


function Dashboard() {

    const [doctors, setDoctors] = useState([]);
    const navigate = useNavigate();
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        fetch("http://localhost:8080/appointments/doctors")
            .then(res => res.json())
            .then(data => {
                setDoctors(data);
                setLoading(false);
            });
    }, []);
    if (loading) {
  return <h2>Loading doctors</h2>;
}

    return (
        <div>
            <h2>Dashboard Page</h2>

            {doctors.map((doctor) => (
                <DoctorCard key={doctor.id} doctor={doctor} />
            ))}
            <button onClick={() => navigate("/appointments")}>
                View My Apoointments
            </button>
            <>
                <Navbar />

                <h1>Dashboard Page</h1>

                {doctors.map((doc) => (
                    <DoctorCard key={doc.id} doctor={doc} />
                ))}

            </>
        </div>
    );
}

export default Dashboard;