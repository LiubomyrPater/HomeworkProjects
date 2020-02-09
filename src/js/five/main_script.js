/**
    - Створити HTML сторінку з реєстраційною формою.
    Для реєстрації повинні бути такі поля:
    Прізвище(lastName) , ім'я(firstName), вік(age), місце проживання(address), електронна адреса(email).

    1) Ваш код JS повинен здійснити валідацію поля вік, таким чином щоб він був числом в межах від 1 до 100 років включно.
    Емайл має перевіряти на валідність. Всі інші поля мають бути обов’язковими.
    Якщо якесь поле не відповідає валідації виводити відповідне повідомлення і не відправляти запит.
    запит на сервер http://localhost:8080/register

    2)Має бути кнопка щоб отримати список всіх користувачів і показати їх у вигляді таблиці на сторінці
    http://localhost:8080/users

    3)Має бути можливіcть отримати користувача за його id і зобразити на сторінці всі дані про користувача
    http://localhost:8080/users/3

    Для того щоб підняти сервер склонуйте собі проект https://github.com/Petryshakvasyl/simpleUser/tree/master і запустіть його
    метод мейн

    -Створіть асинхронну функцію getUsers (names), яка отримує на вхід масив логінів користувачів GitHub, запитує у
    GitHub інформацію про них і повертає масив об'єктів-користувачів.

    Інформація про користувача GitHub з логіном USERNAME доступна за посиланням:
    https://api.github.com/users/USERNAME.

        Важливі деталі:

    На кожного користувача має припадати один запит fetch.
    Запити не повинні чекати завершення один одного. Треба, щоб дані приходили якомога швидше.
    Якщо якийсь запит завершується помилкою або виявилося, що даних про запитуваній користувача немає,
    то функція повинна повертати null в масиві результатів.
 */
