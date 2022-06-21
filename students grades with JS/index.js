const students = [
    {
        name: 'João',
        grade: 5,
        class: '1B'
    },
    {
        name: 'Marcus',
        grade: 10,
        class: '1B'
    },
    {
        name: 'Maria',
        grade: 8,
        class: '2D'
    },
    {
        name: 'Carla',
        grade: 2,
        class: '2C'
    }
]

const checkStudents = (studentsArray, average) => {
    let aboveAvgStudents = [];

    for(let i = 0; i < studentsArray.length; i++) {
        const { grade, name } = studentsArray[i];

        if(grade >= average){
            aboveAvgStudents.push(name);
        }
    }
    return aboveAvgStudents;
};

var average = 5;
const result = checkStudents(students, average);
console.log(result);