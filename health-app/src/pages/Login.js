import React, { useState } from "react";
import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { useContext } from "react";
import { AuthContext } from "../context/AuthContext";

function Login() {
    const [email,setEmail] = useState("");
    const [password,setPassword]=useState("");
    const { setIsLoggedIn}=useContext(AuthContext);

    const navigate = useNavigate();

    const handleLogin = async (e) => {
    e.preventDefault();

    try {

        const response = await fetch(
            `http://localhost:8080/patients/login?email=${email}&password=${password}`,
            {
                method: "POST"
            }
        );

        if(response.ok){
            const data = await response.json();
            console.log("Login success:", data);

            setIsLoggedIn(true);
            navigate("/dashboard");
        } else {
            alert("Invalid credentials");
        }

    } catch(error){
        console.error("Login error:", error);
    }
};
    return (
        <div>
            <h2>Login Page</h2>


            <form onSubmit={handleLogin}>
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
                <br></br>
                <button type="submit">Login</button>
            </form>
            <br>
            </br>
            <Link to ="/signup">
            <button>Go to Signup</button>
            </Link>










        </div>
    );
}
export default Login;