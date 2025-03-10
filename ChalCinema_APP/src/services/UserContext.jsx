import { createContext, useContext, useReducer } from "react";

const userContext = createContext();

// Initial state of the user context
const initialState = {
    user_id : null,
    name: "",
    email: "",
    password: "",
    created_at: "",
    city: "",
};

// Reducer to manage state transitions
function reducer(state, action) {
    switch (action.type) {
        case "user/login":
            return {
                ...state,
                user_id: action.payload.user_id,
                name: action.payload.name,
                email: action.payload.email,
                password: action.payload.password,
            };
        case "user/register":
            return {
                ...state,
                user_id: action.payload.user_id,
                name: action.payload.first_name,
                email: action.payload.email,
                password: action.payload.password,
            };

        case "user/update":
            return {
                ...state,
                user_id: action.payload.user_id,
                name: action.payload.first_name,
                email: action.payload.email,
            };

        case "user/logout":
            return initialState;

        case "user/city":
            console.log(action.payload);
            return {
                ...state,
                city: action.payload,
            }

        default:
            return state;
    }
}

function UserProvider(props) {
    const [{ user_id, name, email, password, city }, dispatch] = useReducer(
        reducer,
        initialState
    );

    // Logout function to reset the user state
    const logout = () => {
        dispatch({ type: "user/logout" });
    };

    return (
        <userContext.Provider value={{ user_id, name, email, password, city, dispatch, logout }}>
            {props.children}
        </userContext.Provider>
    );
}

function useUser() {
    const context = useContext(userContext);
    return context;
}

export { UserProvider, useUser };
