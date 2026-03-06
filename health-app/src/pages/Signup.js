import React, {useState} from "react";
import { Link } from "react-router-dom";
function Signup(){
    const [email,setEmail]=useState("");
    const [password,setPassword]=useState("");

    const handleSignup = async (e) => {
  e.preventDefault();

  const response = await fetch("http://localhost:8080/patients/register", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      name,
      email,
      password,
    }),
  });

  if (response.ok) {
    alert("Signup successful");
  } else {
    alert("Signup failed");
  }
};
    return (
        <div>
            <h2>Signup Page</h2>

            <form onSubmit={handleSignup}>
                <input
                  type="email"
                  placeholder="Enter Email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  />
                  <br>
                  </br>

                  <input
                  type="password"
                  placeholder="Enter Password"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  />
                  <br>
                  </br>
                  <button type="submit">Signup</button>
            </form>







            <Link to="/">
            <button>
                Back to Login
                </button></Link>
        </div>
    );
}

export default Signup;