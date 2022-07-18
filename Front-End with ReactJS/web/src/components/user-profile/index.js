import './style.css';

import { useState, useEffect } from 'react';
import api from '../../services/api';

const UserProfile = ({ user }) => {
    const [profile, setProfile] = useState('');

    useEffect(() => {
        //console.log("User: " + user);
        if(!user) {
            console.log("No user name typed!");
        }
        else {
            api.get("users/" + user)
            .then((response) => {
                //console.log(response);
                setProfile(response.data);
            })
            .catch((err) => {
                console.log("Error fetching API: " + err.message);
            })
        }
      }, [user]);
      
    return (
        <div className="user-container">
            <div className="user-pic">
                <img
                    src={profile.avatar_url}
                    alt="Profile avatar"
                />
            </div>
            <div className="user-info">
                <h1>{profile.name}</h1>
                <h3>Username: {profile.login}</h3>
                <h3>Company: {profile.company}</h3>
                <h3>Location: {profile.location}</h3>
                <h3>Website: <a href={profile.blog} target="_blank" rel="noreferrer">{profile.blog}</a></h3>
                <div className="user-badges">
                    <h5>Followers: <b>{profile.followers}</b></h5>
                    <h5>Following: <b>{profile.following}</b></h5>
                    <h5>Gists: <b>{profile.public_gists}</b></h5>
                    <h5>Repositories: <b>{profile.public_repos}</b></h5>
                </div>
            </div>
        </div>
    );
};

export default UserProfile;