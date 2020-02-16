/**
    1. Реалізувати стрічковий буфер використовуючи функціїї з наступним синтаксисом:
    Створення об'єкта: var buffer = makeBuffer();.
    Виклик makeBuffer повинен повертати таку функцію buffer,
    яка при виклику buffer (value) додасть значення в деяке внутрішнє сховище,
    а при виклику без аргументів buffer () - поверне його.
    Ось приклад роботи:
                            function makeBuffer () {
                                / * ваш код * /
                            }
                            var buffer = makeBuffer();

                            // додати значення до буферу
                                buffer.add( 'JavaScript');
                                buffer.add( 'Вчити');
                                buffer.add( 'Потрібно!');

                            // отримати поточне значення
                                console.log(buffer.print());

                            // JavaScript Вчити Потрібно!
                            Буфер повинен перетворювати всі дані до стрічкового типу:
                                var buffer = makeBuffer ();
                                buffer.add(0);
                                buffer.add(1);
                                buffer.add(0);
                                console.log (buffer.print()); // '010'


    2. Реалізуйте метод buffer.clear (), який буде очищати поточний вміст буфера:
        function makeBuffer () {
        ... ваш код ...
        }
        var buffer = makeBuffer ();
        buffer.add("Тест");
        buffer.add("тебе не з'їсть");
        alert (buffer.print()); // Тест тебе не з'їсть
        buffer.clear ();
        alert (buffer.print()); // ""


    3. Написати скрипти Node де:
    Реалізувати у функціональному та прототипному стилі наступне задання:
    • Створити клас Robot від якого унаслідувати класами CoffeRobot, RobotDancer, RobotCoocker його властивості.
        В Robot створити метод work(), в якому слід описати роботу яку буде виконувати кожен з роботів.
        (тобто, work() повинна бути пронаслідувана)
    • Для Robot метод work() повинен виводити текст «Я Robot – я просто працюю».
    • Для CoffeRobot метод work() повинен виводити текст «Я CoffeRobot – я варю каву».
    • Для RobotDancer метод work() повинен виводити текст «Я RobotDancer – я просто танцюю».
    • Для RobotCoocker метод work() повинен виводити текст «Я RobotCoocker – я просто готую».
    • Створити екземпляри вищеописаних класів і викликати до кожного з них метод work().
    • Створити масив типу Robot, заповнити масив екземплярами вищеописаних класів.
        Циклом for пройтись по всіх елементах масиву і викликати в кожного метод work().

    Всі виводи направити в текстову консоль.*/


function one() {

    function makeBuffer(value) {
        let buf = value;
        return function (buf) {
            return buf;
        };
    }

    let buffer2 = makeBuffer();
    let buffer3 = makeBuffer();

    console.log(buffer2('fsfsdf'));
    console.log(buffer3('fdsfdsfdsfdsfsdfsdf'));
    console.log(buffer2)

}

function two() {

}

function three() {

}


console.log("-------------ONE-------------")
one();
console.log("-------------END ONE-------------")
console.log("-------------TWO-------------")
two();
console.log("-------------END TWO-------------")
console.log("-------------THREE-------------")
three();
console.log("-------------END THREE-------------")
