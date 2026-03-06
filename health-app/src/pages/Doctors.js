import React from "react";
import DoctorCard from "../components/DoctorCard";

function Doctors() {

    const Doctors = [

        {
            name:"Dr Ravi",
            specialization:"Cardiologist",
            experience: 10
        },
        {
            name:"Dr Jyothi",
            specialization:"gynic",
            experience:8
        },
        {
            name:"Dr Reddy",
            specialization:"neuro",
            experience:"22"
        }





    ];


    return(
    <div>
        <h2>Doctors List</h2>

        {
            Doctors.map((doc, index) => (
                <DoctorCard
                key={index}
                name={doc.name}
                specialization={doc.specialization}
                experience={doc.experience}
                />
            ))
        }










    </div>
    );
}
export default Doctors;