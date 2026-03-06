import { useLocation, useNavigate } from "react-router-dom";

function BookAppointment() {

  const location = useLocation();
  const navigate = useNavigate();

  const doctor = location.state?.doctor;

  const handleConfirm = () => {

    let appointments = JSON.parse(localStorage.getItem("appointments")) || [];

    appointments.push(doctor);

    localStorage.setItem("appointments", JSON.stringify(appointments));

    alert("Appointment Confirmed!");

    navigate("/myappointments");
  };

  if (!doctor) {
    return <h3>No doctor selected</h3>;
  }

  return (
    <div>

      <h2>Book Appointment</h2>

      <h3>{doctor.name}</h3>
      <p>{doctor.specialization}</p>

      <button onClick={handleConfirm}>
        Confirm Appointment
      </button>

    </div>
  );
}

export default BookAppointment;