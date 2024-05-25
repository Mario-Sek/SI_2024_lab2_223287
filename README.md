# Марио Шекеровски 223287
![Alt text](https://github.com/Mario-Sek/SI_2024_lab2_223287/blob/master/cfg_223287.png)
# Цикломатска комплексност
Цикломатската комплексност е 10, таа се добива со формулата P+1. P претставува бројот на предикатни јазли.
Во случајов ги има 9:  (2, 5.2, 7, 9, 12.2, 14, 17, 23, 26)
# Тест случаи според критериумот Every Branch 
![Alt text](https://github.com/Mario-Sek/SI_2024_lab2_223287/blob/master/everyBranch.PNG)
# Тест случаи според критериумот Multiple Condition
1. 
item.getPrice() = 500
item.getDiscount() = 0.2
item.getBarcode() = "0000"
payment: 80

Очекуван излез: true

2.
item.getPrice() = 500
item.getDiscount() = 0.2
item.getBarcode() = "0000"
payment: 50

Очекуван излез: false

3. 
item.getPrice() = 500
item.getDiscount() = 0.2
item.getBarcode() = "1000"
payment: 80

Очекуван излез: false

4.
item.getPrice() = 500
item.getDiscount() = 0
item.getBarcode() = "1000"
payment: 600

Очекуван излез: true
