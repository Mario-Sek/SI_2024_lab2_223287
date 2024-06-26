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
 За Every Branch критериумот имаме 5 тест случаи:
 - во првиот поради null листата очекуваме излез со RuntimeException исклучок со точниот текст "allItems list can't be null!"
 - во вториот користиме аргументи меѓу кој barcode-от е null. Cо ова очекуваме излез со RuntimeException исклучок со точниот текст "No barcode!!"
 - во третиот користиме аргументи меѓу кој barcode-от содржи карактер кој не е број. Со ова очекуваме излез со RuntimeException исклучок со точниот текст "Invalid character in item barcode!"
 - во четвртиот ги користиме аргументите List.of(new Item("item1", "12345", 100, 0)); int payment4 = 50;
со ова очекуваме излез true бидеќи сумата е помала од payment-от
 - во петтиот ги користиме аргументите List.of(new Item("item1", "12345", 100, 0.1f)); int payment5 = 100;
со ова очекуваме излез false бидеќи сумата е поголема од payment-от

 За Multiple Condition критериумот имаме 4 тест случаи:
  
   Услов: (if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)== '0'))
 - Во првиот излезот е true. Условот е целосно исколнет а програмата ќе се терминира успешно благодарение на исполнетиов услов 
кој перфектно ја намалува цената од недоволна до доволна
 - Во вториот излезот е false. Условот е целосно исполнет но програмата дава false бидејќи и покрај извршениот услов немаме доволно голем payment.
 - Во третиот излезот е false. Условот не е исполнет заради баркодот со 1 што почнува. Програмата ке се терминира неуспешно само дека не влеговме во условот и немаме доволен payment.
 - Во четвртиот излезот е true. Условот не е исполнет заради discount-от кој е 0. Но програмата успешно ќе се терминира дека сепак имаме доволно голем payment. 

