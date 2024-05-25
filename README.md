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
 payment = 80

Очекуван излез: true

2.
 item.getPrice() = 500
 item.getDiscount() = 0.2
 item.getBarcode() = "0000"
 payment = 50

Очекуван излез: false

3. 
 item.getPrice() = 500
 item.getDiscount() = 0.2
 item.getBarcode() = "1000"
 payment = 80

Очекуван излез: false

4.
 item.getPrice() = 500
 item.getDiscount() = 0
 item.getBarcode() = "1000"
 payment = 600

Очекуван излез: true
# Објаснување за напишаните тестови
 За Every Branch критериумот имам 4 тест случаи:
 - во првиот поради null листата очекуваме излез со исклучокот со точниот текст "allItems list can't be null!"
 - во вториот ги користиме аргументите List.of(new Item("item1", null, 100, 0)) int payment2 = 100;
со ова очекуваме излез со исклучокот со точниот текст "No barcode!!"
 - во третиот ги користиме аргументите List.of(new Item("item1", "12a45", 100, 0)); int payment3 = 100;
со ова очекуваме излез со исклучокот со точниот текст "Invalid character in item barcode!"
 - во четвртиот ги користиме аргументите List.of(new Item("item1", "12345", 100, 0)); int payment4 = 50;
со ова очекуваме излез true
 - во петтиот ги користиме аргументите List.of(new Item("item1", "12345", 100, 0.1f)); int payment5 = 100;
со ова очекуваме излез false
