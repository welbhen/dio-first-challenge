import './style.css';

import { useState, useEffect } from 'react';
import api from '../../services/api';

// Components:
import Repository from '../repository';

const RepoContainer = ({ user }) => {
  const [repo, setRepo] = useState('repos');
  const [profileData, setProfileData] = useState([]);

  useEffect(() => {
    console.log("Inside RepoContainer, user: " + user);
    if(!user) {
      console.log("No user name typed!");
    }
    else {
        api.get("users/" + user + "/" + repo)
        .then((response) => {
            //console.log(response.data);
            setProfileData(response.data);
        })
        .catch((err) => {
            console.log("Error fetching API: " + err.message);
        })
    }
  }, [user, repo]);

  return (
    <div className="repo-container">
        <div className="btn-container">
            <button onClick={() => setRepo('repos')} className="btn-options">Repositories</button>
            <button onClick={() => setRepo('starred')} className="btn-options">Starred repositories</button>
        </div>
        <div className="content-container">
          {profileData.map((repo, i) => (
            <Repository key={'repository' + i}  title={repo.name} fullName={repo.full_name} />
          ))}            
        </div>
    </div>
  );
};

export default RepoContainer;