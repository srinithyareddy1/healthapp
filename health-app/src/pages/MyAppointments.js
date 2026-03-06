import { useEffect, useState } from "react";

function MyAppointments(){

  const [appointments,setAppointments] = useState([]);

  useEffect(()=>{

    const data = JSON.parse(localStorage.getItem("appointments")) || [];

    setAppointments(data);

  },[]);

  return(

    <div>

      <h2>My Appointments</h2>

      {appointments.length === 0 ? (
        <p>No appointments booked</p>
      ) : (
        appointments.map((doc,index)=>(
          <div key={index}>

            <h3>{doc.name}</h3>
            <p>{doc.specialization}</p>

          </div>
        ))
      )}

    </div>

  );

}

export default MyAppointments;