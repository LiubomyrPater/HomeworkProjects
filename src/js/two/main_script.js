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
    let styles = ["Jazz","Blues"];
    styles.push("Rock 'n' roll");
    console.log(styles);
    styles.splice((styles.length-2),1,"Classic");
    console.log(styles);
    console.log(styles.splice(0,1));
    console.log(styles);
    styles.unshift("Rep", "Reggi");
    console.log(styles);
}

function three(){
    let array = ["a","b","c","d","f"]
    function find(arr, value) {
        return arr.indexOf(value, 0);
    }
    console.log(find(array,"d"));
}

function four(){
    let arr_int = [1,4,5,3,6,4,0,78,8,4,3,-3,-773,-463,4,56,-32,-66323,62662,-5];
    function compareNumbers(a,b){
        return a > b ? 1 : a < b ? -1 : 0;
    }
    arr_int.sort(compareNumbers);
    console.log(arr_int);

    arr_int.reverse();
    console.log(arr_int);

    let arr_positiv = arr_int.filter(function (value) { if (value >= 0) return true });
    let arr_negative = arr_int.filter(function (value) { if (value < 0) return true });
    console.log(arr_positiv);
    console.log(arr_negative);
}

function five(){
    let arr_int = [1,4,5,3,6,4,0,78,8,4,3,-3,-773,-463,4,56,-32,-66323,62662,-5];
    function filterRange(array, a, b) {
        return array.filter(function (value){if (value >= a && value <= b) return true});
    }
    let new_arr = filterRange(arr_int,-32,78);
    console.log(new_arr);
}
function six(){
    function camelize(str) {
        return str
            .split('-')
            .map(
                (text, index) => index === 0 ? text : text[0].toUpperCase() + text.slice(1)
            )
            .join('')
    }
    console.log("my-short-string");
    console.log(camelize("my-short-string"));
}
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
