import './IfoodCounter.css';
import { useState, useEffect } from 'react';

const IfoodCounter = () => {
    const [value, setValue] = useState(1);
    const [btnClass, setBtnClass] = useState("counter-button-active");
    const [total, setTotal] = useState(10);

    useEffect(() => {
        setTotal(value * 10);
    }, [value]);

    const down= () => {
        if(value > 0) {
            setValue(value-1);
        }
        
        if(value <= 1) {
            setBtnClass("counter-button-inactive");
        }
    };

    const up = () => {
        setValue(value+1);
        setBtnClass("counter-button-active");
    };

    return (
        <>
            <div className="container-wrapper">
                <button onClick={down} className={btnClass}>-</button>
                <p>{value}</p>
                <button onClick={up} className="counter-button-active">+</button>
            </div>
            <p>Total: ${total}</p>
        </>
    );
};

export default IfoodCounter;