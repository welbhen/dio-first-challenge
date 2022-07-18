import './style.css';

const Repository = ({title, fullName}) => {
    return (
        <div className="repo-element">
            <h3>{title}</h3>
            <small>full name:</small>
            <h5>{fullName}</h5>
        </div>
    );
};

export default Repository;