/**
 Мінімум:
 1.  У нас є масив products.
 Скільки в ньому елементів - не знаємо, але можемо прочитати з products.length .
 Напишіть код для отримання останнього елемента products.

 2.  Створіть масив styles з елементами «Джаз», «Блюз».
 Додайте в кінець значення «Рок-н-Ролл».
 Замініть передостаннє значення на «Класика». Код заміни передостаннього значення має працювати для масивів будь-якої довжини.
 Видаліть перше значення масиву і виведіть його на консоль.
 Додайте в початок значення «Реп» і «Реггі».

 3.  Створіть функцію find(arr, value), яка шукає в масиві arr значення value і повертає його номер,
 якщо знайдено, або -1, якщо не знайдено.

 4.  Створити масив чисел де буде не менше 20 значень, серед них повиннні бути як позитивні так і негативні значення.
 Вісортувати даний масив:
 а) від найменшого до найбільшого
 б) від найбільшого до найменшого
 Відфільтрувати лише позитивні (із нулем )та лише негативні в окремі масиви.

 5.  Створіть функцію filterRange (array, a, b), яка приймає масив чисел array і повертає новий масив,
 який містить тільки числа з array з діапазону від a до b.

 6.  Напишіть функцію camelize (str), яка перетворює такі рядки «my-short-string» в «myShortString».
 Тобто, дефіси видаляються, а всі слова після них отримують велику літеру.

 7.  Створити масив із 10 обєктів
 Student {
                yearOfStuding: <some data>,
                facultyName: <some data>
            }
 Створити окремий масив який матиме лише facultyName обєктів
 Порахувати сумарне значення yearOfStuding для всіх об'єктів
 */


function one() {
    let products=[];
    console.log(products.length);
    products.push(2,5,6);
    console.log(products.length);
    console.log(products.pop());
}

function two() {
    let styles = ["Jazz","Blues"]
    styles.push("Rock 'n' roll")
    console.log(styles)
    styles.splice((styles.length-2),1,"Classic")
    console.log(styles)
    console.log(styles.splice(0,1))
    console.log(styles)
    styles.unshift("Rep", "Reggi")
    console.log(styles)
}

function three(){}
function four(){}
function five(){}
function six(){}
function seven(){}

console.log("-------------ONE-------------")
one();
console.log("-------------END ONE-------------")
console.log("-------------TWO-------------")
two();
console.log("-------------END TWO-------------")
console.log("-------------THREE-------------")
three();
console.log("-------------END THREE-------------")
console.log("-------------FOUR-------------")
four();
console.log("-------------END FOUR-------------")
console.log("-------------FIVE-------------")
five();
console.log("-------------END FIVE-------------")
console.log("-------------SIX-------------")
six()
console.log("-------------END SIX-------------")
console.log("-------------SEVEN-------------")
seven();
console.log("-------------END SEVEN-------------")
