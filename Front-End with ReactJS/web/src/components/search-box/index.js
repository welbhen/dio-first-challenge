import './style.css';

import { useState } from 'react';

const SearchBox = ({ setUserForSearch }) => {
    const [user, setUser] = useState('');

    return (
        <header>
            <input className="input" onChange={(e) => setUser(e.target.value)} placeholder="Type the username..."/>
            <button className="btn" onClick={() => setUserForSearch(user)}>Search</button>
        </header>
    );
};

export default SearchBox;