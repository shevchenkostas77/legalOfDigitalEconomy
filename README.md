1. Рон, Гермиона и Гарри проходили квесты. Рон сказал: "Я прошел больше всех квестов". Гермиона усомнилась: "Либо ты прошел не больше всех квестов, либо Гарри меньше всех". Гарри сказал: "Я прошел больше квестов, чем Гермиона". Кто прошел больше всех квестов, если прав только один из волшебников? 

Мой ответ: Гермиона;
Объяснение:
По условию прав только один из волшебников. Высказывание Гермионы единственное, где нет противоречий с двумя другими фразами. Если она говорит правду, то Рон и Гарри лгут. В данном случае все совпадает.
Если рассматривать, что правда за Роном или Гарри, то есть противоречия, где прав не только один волшебник.
Отсюда вывод, что права Гермиона, и она прошла больше всех квестов.


2. Четырехзначное число назовем "в тренде", если оно натуральное и в его записи есть только нечетные цифры. Сколько существует четырехзначных чисел “в тренде”? 

Мой ответ: 625;
Объяснение:
Всего существует 5 нечетных цифр: 1, 3, 5, 7, 9. На первую позицию нашего числа можно поставить каждую из 5 цифр. Аналогично, на 2, 3 и 4 позиции можно поставить по 5 нечетных цифр. Значит, общее количество чисел "в тренде" равно 5 * 5 * 5 * 5 = 625.
Ссылка на пример кода, написанный для решения этой задачи: 
https://github.com/shevchenkostas77/legalOfDigitalEconomy/commit/5a414898ffc2f4e0185a7c9667db31c223a9f6a4


3. В Зверополисе живут только всегда правдивые курочки и всегда лгущие индюшки. В программе Курятник-2 принимали участие 9 птиц у каждой был номер (номера от 1 до 9). Каждый участник сказал: "Птичка, чей номер равен последней цифре квадрата моего номера — курочка". По итогу оказалось, что не все кандидаты были индюшки, но и курочек среди них было не более трех. Сколько курочек участвовало в программе и какие у них номера? 

Мой ответ: В программе участвовала одна курочка №5;
Объяснение:
По условию задачи, делаем вывод, что курочек либо одна, либо две, либо три. Ноль их быть не может, опять же из условия задачи: не все кандидаты были индюшки.

Смотрим квадрат каждого числа:
12 = 1             
22 = 4
32 = 9
42 = 16
52 = 25
62 = 36
72 = 49
82 = 64
92 = 81
Каждому участнику соответствует определенный номер птички:
Участник №1 говорит о том, птичка №1 (12 = 1) – курочка.
Участник №2 говорит о том, птичка №4 (22 = 4) – курочка.
Участник №3 говорит о том, птичка №9 (32 = 9) – курочка.
Участник №4 говорит о том, птичка №6 (42 = 16) – курочка.
Участник №5 говорит о том, птичка №5 (52 = 25) – курочка.
Участник №6 говорит о том, птичка №6 (62 = 36) – курочка.
Участник №7 говорит о том, птичка №9 (72 = 49) – курочка.
Участник №8 говорит о том, птичка №4 (82 = 64) – курочка.
Участник №9 говорит о том, птичка №1 (92 = 81) – курочка.

Предположим, что Птичка №1 – курочка. Тогда №9 также является курочкой, так как сказала правду про №1. Про №9 сказали птички №7 и №3, тогда они также курочки.  
Получается уже четыре курочки, а их не больше трех. Значит, птички № 1, 3, 7 и 9 – индюшки.
Предположим, что Птичка №4 – курочка. Тогда №2 и №8 также курочки, так как, сказали правду про №4. Птичка №6 также курочка, по словам курочки №4.
Получается уже четыре курочки, а их не больше трех. Значит, птички № 2, 4, 6 и 8 – индюшки.
Методом исключения, единственной курочкой является №5. Она сказала правду сама про себя.


4. Мама купила большую упаковку киндер-сюрпризов для пятерых своих детей. В упаковке было 36 яиц. Половину яиц она отдала дочерям, и половину сыновьям. Дети поделили сюрпризы между собой поровну. Каждая дочь получила на три игрушки меньше, чем каждый сын. Сколько было мальчиков и сколько девочек в семье? 

Мой ответ: 2 мальчика и 3 девочки;
Объяснение:
Из условий задачи видим, что 18 яиц получили дочери и 18 яиц сыновья. Учитывая, что детей было 5 и каждая дочь получила на три игрушки меньше, чем сын, методом подбора, делаем вывод, что было трое дочерей и два сына, что полностью удовлетворяет всем условиям. Дочери разделили между собой по 6 яиц (3*6=18) и сыновья разделили по 9 яиц (2*9=18).

5. 25 жителей острова рыцарей и лжецов стоят в очереди за квасом. Каждый, кроме первого, заявил: "Впереди меня стоит лжец!". Первый в очереди сказал, что все, стоящие за ним, - лжецы. Сколько лжецов стоит в очереди? Примечание: рыцари никогда не лгут, лжецы всегда лгут.

Мой ответ: 13 лжецов;
Объяснение:
Берём второе условие задачи: «первый сказал, что все лжецы» (со 2 по 25 лжец).
Если номер 1 рыцарь, тогда, так как он говорит правду, все остальные действительно лжецы.
А если все лжецы, то это противоречит первому условию: передо мной стоит лжец. Значит перед каждым лжецом стоит лжец. Получается, лжец говорит правду, а этого не может быть, так как они всегда врут.
Отсюда делаем вывод, что номер 1 не может быть рыцарем. 
Теперь мы точно знаем, что номер 1 лжец.
Ещё мы выяснили, что со 2 по 25 жителей не могут быть все лжецами.
Проверяем, могут ли они быть рыцарями. Нет, не могут, потому что они говорят: передо мной стоит лжец. А они всегда говорят правду, и они все рыцари.
Получается со 2 по 25 жители не могут быть все лжецы и все рыцари. Но номер 1 точно лжец. И проверяем теперь версию через одного.
Мы знаем, что номер 1 лжец, а 2ой номер по условию говорит: передо мной лжец. Чтобы это было правдой, номер 2 должен быть рыцарем.
Номер 3 тоже говорит: передо мной лжец. Но номер 2, как мы уже выяснили, рыцарь. Поэтому номер 3 должен врать, и он лжец.
Ну и дальше по аналогии получается каждое нечётное число лжец, каждое четное рыцарь. Отсюда вывод: 13 лжецов и 12 рыцарей.


6. В офисной столовой меню не меняется годами. В меню есть 11 блюд. Новый сотрудник каждый день хочет заказывать такой набор блюд, который он ещё ни разу не заказывал. Сколько дней он сможет так питаться? Примечание: при заказе число блюд не важно - он может заказать все 11 блюд, а может заказать только одно или вовсе ни одного. 

Мой ответ: Новый сотрудник сможет так питаться 2048 дней;
Объяснение: По сути в задаче требуется посчитать количество подмножеств, множества, состоящего из 11 элементов. Для множества, состоящего из n элементов количество подмножеств равно 2^n. Значит, 2^11 = 2048 - общее количество дней.


7. Есть числа - палиндромы (читаются одинаково слева направо, а также справа налево, например, число 78387). Сколько существует таких пятизначных чисел?

Мой ответ: 900;
Объяснение: На первую позицию можно поставить одну из 9 цифр 1-9.
На вторую и третью позиции можно поставить одну из 10 цифр 0-9. Цифры на четвертой и пятой позициях дублируют цифры с 1 и 2 позиции. Значит общее количество нужных палиндромов равно 9 * 10 * 10 = 900.
Ссылка на пример кода, написанный для решения этой задачи: 
https://github.com/shevchenkostas77/legalOfDigitalEconomy/commit/5a414898ffc2f4e0185a7c9667db31c223a9f6a4




