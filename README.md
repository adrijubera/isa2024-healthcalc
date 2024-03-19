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
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Especificación del caso de uso: Calcular peso ideal</title>
</head>
<body>

<h1>Nombre del caso de uso: Calcular peso ideal</h1>

<h2>Actor principal</h2>
<p>Usuario</p>

<h2>Ámbito</h2>
<p>Sistema de la calculadora de salud</p>

<h2>Nivel</h2>
<p>Nivel del usuario</p>

<h2>Stakeholders e intereses</h2>
<ul>
<li>Usuario: Interesado en conocer su peso ideal para mantener una buena salud.</li>
<li>Desarrolladores del sistema: Interesados en implementar y mantener la funcionalidad de cálculo del peso ideal de manera precisa y eficiente.</li>
</ul>

<h2>Precondiciones</h2>
<p>El usuario debe proporcionar su altura y género.</p>

<h2>Garantías mínimas</h2>
<p>El sistema debe ser capaz de calcular el peso ideal del usuario de acuerdo con una fórmula estándar basada en la altura y el género.</p>

<h2>Garantía de éxito</h2>
<p>El sistema debe proporcionar un resultado válido y significativo del peso ideal del usuario.</p>

<h2>Escenario principal</h2>
<ol>
<li>El usuario selecciona la opción de "Calcular peso ideal" en la interfaz de la calculadora de salud.</li>
<li>El sistema solicita al usuario que ingrese su altura y género.</li>
<li>El usuario ingresa su altura y género en el sistema.</li>
<li>El sistema calcula el peso ideal del usuario utilizando una fórmula estándar.</li>
<li>El sistema muestra el peso ideal calculado al usuario.</li>
</ol>

<h2>Escenarios alternativos</h2>
<ul>
<li>
<p>El usuario no proporciona la altura o el género requeridos:</p>
<ol>
<li>El sistema muestra un mensaje de error indicando que la altura y el género son campos obligatorios.</li>
<li>El caso de uso termina.</li>
</ol>
</li>
<li>
<p>El sistema no puede calcular el peso ideal debido a una falla técnica:</p>
<ol>
<li>El sistema muestra un mensaje de error indicando que no se puede calcular el peso ideal en este momento debido a un problema técnico.</li>
<li>El caso de uso termina.</li>
</ol>
</li>
</ul>

<h2>Extensiones</h2>
<p>El usuario decide guardar el resultado del cálculo del peso ideal para su referencia futura:</p>
<ol>
<li>El sistema proporciona la opción de guardar el resultado en un archivo o enviarlo por correo electrónico.</li>
<li>El usuario elige la opción deseada.</li>
<li>El sistema guarda el resultado o envía el correo electrónico según la elección del usuario.</li>
<li>El caso de uso termina.</li>
</ol>

</body>
</html>
