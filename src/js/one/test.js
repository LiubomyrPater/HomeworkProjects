function count_rabits() {
    for (var i = 1; i <= 3; i ++){
        alert('counts rabits: ' + i)
    }
}

function one() {
    var admin, name;
    name = 'John';
    admin = name;

    console.log('admin = ' + admin);
}

function second() {
    console.clear();
    var login, password, message, temp;
    login = prompt('Create login');
    password = prompt('Create password');
    console.log('Begin');
    temp = prompt('Who\'s there?');
    if (temp != login) {
        console.log('I don\'t know you')
    } else {
        temp = prompt('Password?');
        if (temp != password){
            console.log('Wrong password')
        } else {
            console.log('Welcome!')
        }
    }
}

function third() {
    user = {
        name: 'Пилип',
        surnrname: 'Шевченко'
    };
    user.name = 'Сергій';
    delete user.name
}

function fourth() {
    employeeSalaries={
        vasya: 100,
        petya: 200,
        oksana: 300
    };

    function sum(obj) {
        var sum = 0;
        for (var el in obj){
            if (obj.hasOwnProperty(el)){
                sum += parseFloat(obj[el])
            }
        }
        return sum;
    }

    summed = sum(employeeSalaries);
    console.log(summed)
}

function fifth() {
    action = prompt('input action, please');
    number_1 = 7;
    number_2 = 0;


    if (action === '-') {
        console.log(number_1 - number_2)
    } else if (action === '+') {
        console.log(number_1 + number_2)
    } else if (action === '/') {
        console.log(number_1 / number_2)
    } else if (action === '*') {
        console.log(number_1 * number_2)
    }
}

