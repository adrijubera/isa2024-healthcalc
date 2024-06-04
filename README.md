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
![Singular](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/PatronSingular.png)

Patrón adapter:
![Adapter](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/PatronAdapter.png)

Patrón Observer:
![Observer](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/PatronObserver.png)

Patrón Adapter:
![Adapter](https://github.com/adrijubera/isa2024-healthcalc/blob/practica6/design_patterns/DiagramaClasesUML.png)



## Práctica 7: Refactorings
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h2>1) Refactoring: Split Interface</h2>
<p>Bad smell: Interfaz con demasiadas responsabilidades</p>
<p>Refactorings aplicados: Split Interface</p>
<p>Tipo/categoría del refactoring: Class refactoring</p>
<p>Descripción del cambio: Dividí la interfaz Person en dos interfaces más específicas: PersonalInfo y HealthInfo. Esto separa las responsabilidades relacionadas con la información personal y la salud en interfaces distintas, mejorando la cohesión y facilitando la implementación de las clases que las implementan.</p>
<p>Número de cambios manuales: 3 cambios manuales, para las 3 clases</p>

<h2>2) Refactoring: Rename methods</h2>
<p>Bad smell: Nombres de método poco descriptivos o incoherentes.</p>
<p>Refactorings aplicados: Rename methods</p>
<p>Tipo/categoría del refactoring: Method refactoring</p>
<p>Descripción del cambio: Se han renombrado los métodos en las interfaces PersonalInfo y HealthInfo para que reflejen mejor su propósito específico. Por ejemplo, weight() se ha renombrado a getWeight() y calculateIdealWeight() se ha renombrado a calculateIdealBodyWeight(), entre otros.</p>
<p>Número de cambios manuales: 4 cambios manuales</p>

<h2>3) Refactoring: Extract class</h2>
<p>Bad smell: Funcionalidad de múltiples responsabilidades en una misma clase.</p>
<p>Refactorings aplicados: Extract class</p>
<p>Tipo/categoría del refactoring: Class refactoring</p>
<p>Descripción del cambio: Se ha extraído la funcionalidad relacionada con el cálculo de la salud de la clase Controlador a una nueva clase llamada HealthCalculator. Esto mejora la cohesión y la modularidad del código al separar las responsabilidades de cada clase.</p>
<p>Número de cambios manuales: 4 cambios manuales</p>

<h2>4) Refactoring: Introduce Parameter Object</h2>
<p>Bad smell: Método con muchos parámetros</p>
<p>Refactorings aplicados: Introduce Parameter Object</p>
<p>Tipo/categoría del refactoring: Method refactoring</p>
<p>Descripción del cambio: Se creó una nueva clase HealthParameters para agrupar los parámetros relacionados con la salud en un solo objeto. Esto simplifica los métodos que necesitaban muchos parámetros relacionados y mejora la cohesión del código.</p>
<p>Número de cambios manuales: 5 cambios manuales</p>

<h2>5) Refactoring: Replace Conditional with Polymorphism</h2>
<p>Bad smell: Uso excesivo de lógica condicional basada en género en la clase HealthCalculator</p>
<p>Refactorings aplicados: Replace Conditional with Polymorphism</p>
<p>Tipo/categoría del refactoring: Class refactoring</p>
<p>Descripción del cambio: Reemplazamos la lógica condicional que determinaba el género en la clase HealthCalculator con el uso de polimorfismo. Creamos una jerarquía de clases (GenderCalculator y subclases) para manejar las diferencias en los cálculos según el género.</p>
<p>Número de cambios manuales: Se hicieron varios cambios manuales en las clases Controlador, HealthCalculator, MaleCalculator, FemaleCalculator, GenderCalculator, y Vista. Estos cambios incluyeron la creación de nuevas clases, la definición de métodos abstractos en la clase base GenderCalculator, y la actualización de las referencias en la clase Controlador para usar la nueva jerarquía de clases. En total, se hicieron alrededor de 10 cambios manuales.</p>

</body>
</html>
