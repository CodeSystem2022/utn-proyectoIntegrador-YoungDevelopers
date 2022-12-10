# utn-java-proyect
## Repositorio dedicado al proyecto integrador de Programación II.

#### Grupo: 
 * YoungDevelopers
  
#### Integrantes:
 * Ceschin Agustín
 * Diaz Micaela
 * Montoya Lucas
 * Morbidelli Valentin
 * Rebolledo Lourdes
 * Rebolledo Lujan
 * Zambrana Ana

#### Documentación:
  - INTRODUCCIÓN:
    - Se realizó un proyecto en el lenguaje de programación JAVA a partir del hecho anteriormente en PSEint. El nuevo proyecto tiene como caracteristicas principales la posibilidad de llevar un registro antes de realizar el pedido, realizar un pedido por partes, hamburguesa, bebida y acompañamiento, además de luego obtener un ticket con el SUBTOTAL y TOTAL que incluye impuestos.
    - Se trabajó en distintas clases buscando una mayor prolijidad a la hora de presentar el proyecto, además de mayor sencillez a la hora de trabajar en grupo. En ellas distintos métodos que explayaremos más adelante en la documentación y son valiosos para la aplicación.

  - REGISTRO:
    - El registro se solicita al usuario através de un panel creado con JOptionPane, ya que es más intuitivo y fácil de usar para el usuario. En el mismo se solicita el nombre, número de teléfono y una confirmación. Si la confirmación es afirmativa el programa continua con el pedido, pero si es negativa se vuelven a pedir los datos con el mismo proceso, primero el nombre y luego el número de teléfono.
    - Los datos del usuario se almacenan en un objeto "User" para luego volver a ser utilizado de ser necesario. Para un manejo más sencillo de estos datos guardados en el objeto se utilizan los métodos GETTER y SETTER.

  - MENÚ DE PEDIDO:
    - En esta parte vamos a incluir la mayor parte de lo plasmado en código dentro de nuestro proyecto, el pedido de hamburguesas, bebidas y extras. Para comenzar hablaremos del ciclo que realiza cada vez que se llega a esta parte del código, se solicitado al usuario una opción y a partir de ella se entra a una opción.
    - Al ingresar por parte del usuario a una opción de hamburguesas, bebidas o extras, se le solicita una confirmación que tras ser aceptada se agrega al carro de compras. Este carro consta de una lista hecha a partir de un objeto utilizando un ArrayList. Con esta lista luego se mostrará la información de lo que tiene acumulado. 
    - El ciclo de ingreso a una opción finaliza cuando el usuario indica que ya no quiere pedir nada más, es decir que, el usuario tiene que usar la opción de cancelar indicada dentro de la aplicación para que esta continue y finalmente llegue al área de tiquets.
  
  - SISTEMA DE TIQUETS:
    - A partir del carro de compras se obtienen las distintas listas, estas se combinan y se suman los totales para obtener un SUBTOTAL al que luego se le aplican los impuestos correspondientes para así finalmente obtener un TOTAl que es brindado al usuario de la aplicación en su tiquet.
