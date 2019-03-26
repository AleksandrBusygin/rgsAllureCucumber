#language: ru

Функционал: Покупка услуги на сайте РГС
Сценарий: Покупка страховки для выезда за рубеж

Когда выбрана услуга "Страхование"
Когда выбрана конакретная услуга "Страхование выезжающих за рубеж"
Когда выбран онлайн расчет страхования
Тогда переход на страницу заполнения данных страхователя
Когда заполнено поле количества поездок
Когда поле страны посещения заполнено значением "Испания"
Когда поле даты первой поездки заполнено датой, плюс две недели от текущей
Когда выбрано количество дней в сумме, палнируемых для нахождения за рубежом:"Не более 90 дней"
Когда поле ввода имени заполнено значением "PUTIN VLADIMIR"
Когда поле ввода даты рождения заполнено значением "07.10.1952"
Когда выбрана усуга "Активный отдых или спорт" активной(true): true
Когда дано согласие на обработку персональных данных
Когда нажата кнопка расчета
Тогда переход на страницу с итоговыми данными и ценой страховки
Тогда сравниваем полученные данные с теми, что вводили на странице заполнения данных:"Многократные поездки в течение года","Шенген","PUTIN VLADIMIR","07.10.1952","(включая активный отдых)"


