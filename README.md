# isa2024-healtcalc

## Práctica 1
Health calculator

<html>
<body>
<ol>
  <li>
    <h3>Caso de prueba para calcular el peso ideal (Hombre):</h3>
    <p>Entrada: Altura = 180 cm, Género = Masculino</p>
    <p>Resultado esperado: Peso ideal aproximado = 72.5 kg</p>
  </li>
  <li>
    <h3>Caso de prueba para calcular el peso ideal (Mujer):</h3>
    <p>Entrada: Altura = 160 cm, Género = Femenino</p>
    <p>Resultado esperado: Peso ideal aproximado = 56.0 kg</p>
  </li>
  <li>
    <h3>Caso de prueba para calcular la tasa metabólica basal (Hombre):</h3>
    <p>Entrada: Peso = 70 kg, Altura = 180 cm, Género = Masculino, Edad = 30 años</p>
    <p>Resultado esperado: TMB aproximada = 1680.0 kcal/día</p>
  </li>
  <li>
    <h3>Caso de prueba para calcular la tasa metabólica basal (Mujer):</h3>
    <p>Entrada: Peso = 60 kg, Altura = 160 cm, Género = Femenino, Edad = 25 años</p>
    <p>Resultado esperado: TMB aproximada = 1314.0 kcal/día</p>
  </li>
</ol>

</body>
</html>

![Captura resultados test](https://github.com/adrijubera/isa2024-healthcalc/blob/main/CapturaResultadosTest.png)
![Captura registro](https://github.com/adrijubera/isa2024-healthcalc/blob/main/CapturaRegistro.png)



## Práctica 2
![Diagrama de Casos de Uso](https://github.com/adrijubera/isa2024-healthcalc/blob/practica2/doc/DiagramaCasosUso.png)



## Práctica 3
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h2>Historia de Usuario 1: Cálculo del peso ideal de una persona</h2>
<p>Como usuario interesado en mantener un peso saludable,</p>
<p>Quiero poder calcular mi peso ideal,</p>
<p>Para tener una referencia de mi peso objetivo.</p>

<h3>Criterios de Aceptación:</h3>

<h4>Escenario 1: Calcular peso ideal con éxito</h4>
<p>Dado que soy un usuario de la calculadora de salud</p>
<p>Cuando ingreso mi altura y género</p>
<p>Entonces el sistema calcula mi peso ideal correctamente</p>

<h4>Escenario 2: Falta de información requerida</h4>
<p>Dado que soy un usuario de la calculadora de salud</p>
<p>Cuando intento calcular mi peso ideal sin ingresar mi altura y género</p>
<p>Entonces el sistema me muestra un mensaje de error indicando que la altura y el género son obligatorios</p>

<h2>Historia de Usuario 2: Cálculo de la tasa metabólica basal de una persona</h2>
<p>Como usuario interesado en conocer mi gasto calórico diario basal,</p>
<p>Quiero poder calcular mi tasa metabólica basal (TMB),</p>
<p>Para entender cuántas calorías necesito consumir para mantener mi peso actual.</p>

<h3>Criterios de Aceptación:</h3>

<h4>Escenario 1: Calcular TMB con éxito</h4>
<p>Dado que soy un usuario de la calculadora de salud</p>
<p>Cuando ingreso mi peso, altura y género</p>
<p>Entonces el sistema calcula mi tasa metabólica basal correctamente</p>

<h4>Escenario 2: Falta de información requerida</h4>
<p>Dado que soy un usuario de la calculadora de salud</p>
<p>Cuando intento calcular mi TMB sin ingresar mi peso, altura y género</p>
<p>Entonces el sistema me muestra un mensaje de error indicando que estos campos son obligatorios</p>

</body>
</html>


## Práctica 4: Interfaz gráfica de usuario

![Boceto](https://github.com/adrijubera/isa2024-healthcalc/blob/practica4/Boceto.png)

![Interfaz](https://github.com/adrijubera/isa2024-healthcalc/blob/practica4/CapturaInterfaz.png)


## Práctica 6: Patrones de diseño

Patrón singular:
![Singular](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/PatronSingular.pdf)

Patrón adapter:
![Adapter](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/PatronAdapter.pdf)

Patrón Observer:
![Observer](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/PatronObserver.pdf)

Patrón Adapter:
![Adapter](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/DiagramaClasesUML.pdf)