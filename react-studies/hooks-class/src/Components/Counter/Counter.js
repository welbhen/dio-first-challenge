const Counter = () => {
  let quantity = 10;
  
  const increaseQuantity = () => {
    quantity += 1;
    document.getElementById("counter-box").innerHTML = quantity; // manually updating the element
  };

  return (
    <>
      <h1 id="counter-box">{quantity}</h1>
      <button onClick={increaseQuantity}>Increase</button>
    </>
  );
};
  
export default Counter;