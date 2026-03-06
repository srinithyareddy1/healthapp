import { useNavigate } from "react-router-dom";

function DoctorCard({ doctor }) {

  const navigate = useNavigate();

  if (!doctor) {
    return null;
  }

  const handleBook = () => {
    navigate("/book", { state: { doctor: doctor } });
  };

  return (
    <div style={{
      border:"1px solid #ddd",
      padding:"20px",
      margin:"15px",
      borderRadius:"10px",
      display:"flex",
      justifyContent:"space-between",
      alignItems:"center"
    }}>

      <div>
        <h3>{doctor.name}</h3>
        <p>{doctor.specialization}</p>
      </div>

      <button onClick={handleBook}>
        Book Appointment
      </button>

    </div>
  );
}

export default DoctorCard;