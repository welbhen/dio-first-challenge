import { useState } from "react";

const SmartCounter = () => {
  const [quantity, setQuantity] = useState(1);

  return (
    <>
      <h1 id="counter-box">{quantity}</h1>
      <button onClick={() => setQuantity(quantity + 1)}>Increase</button>
    </>
  );
};
  
export default SmartCounter;