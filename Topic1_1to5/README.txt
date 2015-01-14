Topic0
Bootcamps

Welcome to my GitHub :bowtie:

Muñoz Lucas Martin - lucasmm_1990@hotmail.com



* in ths folder you will find code about the first five points of the Topic1.

* We found a pilaClass class is responsible for generate a dynamic list with each of 
the items you want to buy (in addition, owns printing methods). We also found 
a class called PilaConstruct which is responsible for loading the values on the stack. 
In the main we found an interactive menu with information about the items, price and items 
on sale. Once the user charge their cart,it is asked by the method of payment,
and depending of the Payment class,it took a series of data of the buyer.
Moreover this transaction carries a unique number that is generated and associated with Singeton class.

* Currently I have a problem in the code.First we load the cart, then we set the mode of payment 
and charge the corresponding information (depending on the method of payment chosen) the program stops running. 
When should actually go to a imprimir_descuentos function located in the PilaClass class. 
In the main call that instruction with Lista.pila1.imprimir_descuentos (op);