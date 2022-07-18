import './styles/global.css';

import { useState } from 'react';

// Components:
import SearchBox from './components/search-box';
import UserProfile from './components/user-profile';
import RepoContainer from './components/repo-container';
import Footer from './components/footer';
import NoUser from './components/no-user';

const App = () => {  
  const [user, setUserForSearch] = useState('');
    
  return (
    <main className="App">
      <SearchBox setUserForSearch={setUserForSearch} />
      {
        !user ?
        <NoUser />
        :
        <>
          <UserProfile user={user} />
          <RepoContainer user={user} />
        </>
      }
      <Footer />
    </main>
  );
};

export default App;
