const person1 = {
    name: "Mary",
    age: 30
};
const person2 = {
    name: "Carla",
    age: 26
};
const person3 = {
    name: "Bill",
    age: 86
};

function ageCalculator(years) {
    console.log(this.name);
    return `In ${years} years, ${this.name} will be ${this.age + years} years old.`;
};

var years = 15;
const result = ageCalculator.call(person2, years);
//const result = ageCalculator.apply(person2, [years]);
console.log(result);