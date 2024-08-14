# JUEGOS CREADOS EN JAVA
Este repositorio cuenta con diferentes juegos creados en el lenguaje Java para su mejor comprension y estudio del mismo. 

## Juego de gestión de colisiones

**Descripción del Juego:** 
Este juego es una versión similar al famoso juego del dinosaurio de Google. En él, el jugador controla un personaje que debe saltar sobre obstáculos utilizando la barra espaciadora. El juego cuenta con tres objetos principales: un personaje, un obstáculo y una nube.

- Personaje: El jugador debe hacer que el personaje salte sobre los obstáculos para evitar chocar con ellos.
- Obstáculo: Aparecen de manera continua, y el jugador debe esquivarlos para seguir avanzando.
- Nube: Se mueve de derecha a izquierda, aumentando su velocidad conforme el jugador avanza en niveles, lo que también acelera el ritmo del juego.

Durante el juego, se acumulan puntos basados en la habilidad del jugador para esquivar los obstáculos.

Al finalizar la partida, se muestra una ventana emergente que le pregunta al usuario si desea volver a jugar o salir del juego. Esta ventana también muestra los puntos acumulados durante la partida. Si el usuario decide volver a jugar, el juego se reinicia y comienza nuevamente desde cero.

![Imagen de la pantalla del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/juego%20de%20gestion%20de%20colisiones%20ventana%20principal.jpg?raw=true)
![Imagen de la pantalla de reincio](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/juego%20de%20gestion%20de%20colisiones%20ventana%20opciones.jpg?raw=true)

## Juego de gestión de colisiones version 2

**Descripción del Juego:** 
Este juego es una versión similar del juego de gestión de colisiones anterior, introduciendo nuevas características y dinámicas:

- Objetos del Juego: El juego ahora cuenta con dos objetos principales: un personaje y un obstáculo. A medida que el jugador avanza a través de los niveles, la velocidad del juego se intensifica, aumentando el desafío.

- Sistema de Vidas: A diferencia del juego anterior, este juego tiene un sistema de vidas. El jugador comienza con 4 vidas. Cuando el personaje choca con un obstáculo, el juego se detiene temporalmente y se muestra una ventana emergente que informa al usuario que ha perdido una vida. Al aceptar la ventana emergente, el juego continúa desde el punto en el que se detuvo, y el jugador puede seguir intentando superar los niveles.

- Niveles: El juego tiene 6 niveles diferentes. En cada nivel, el fondo cambia de color, proporcionando una experiencia visual variada y un indicativo claro de progresión.

- Ventana de Reinicio: Al finalizar el juego, se muestra una ventana emergente que le pregunta al usuario si desea volver a jugar o salir del juego. Si el usuario selecciona volver a jugar, el juego se reinicia desde el principio. Si selecciona salir, el juego termina.

![Imagen de la pantalla del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/juego%20de%20gestion%20de%20colisiones%20ventana%20principal%20version%202.jpg?raw=true)
![Imagen de la pantalla de perdio vida](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/juego%20de%20gestion%20de%20colisiones%20ventana%20perdio%20vida.jpg?raw=true)
![Imagen de la pantalla del reinicio](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/juego%20de%20gestion%20de%20colisiones%20ventana%20reinicio%20version%202.jpg?raw=true)

## Juego del laberinto

**Descripción del Juego:** 
Este es un juego de laberinto en su versión inicial, donde el objetivo principal es guiar al jugador hasta el recuadro negro situado en el otro extremo del laberinto. El jugador se desplaza a través del laberinto utilizando las flechas del teclado, con opciones para avanzar y regresar dentro del laberinto. La misión es alcanzar el recuadro negro para completar el nivel. Esta versión del juego es una implementación básica, sin planes de modificaciones futuras.
![Imagen de la pantalla del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/gameLaberinto.jpg?raw=true)

## TIC TAC TOE

**Descripción del Juego:** 
Este proyecto es una adaptación del clásico juego del gato. Es un juego para dos jugadores donde, al iniciar, se muestra una ventana principal que permite a cada jugador ingresar su nombre, si no se ingresa un nombre, se asignarán nombres predeterminados como "Jugador 1" y "Jugador 2".
![Pantalla principal del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/tictactoePrincipal.jpg?raw=true)

El juego permite a los jugadores marcar un recuadro con un círculo o una X (tache) al hacer clic en él. Además, el juego resalta el jugador cuyo turno es actualmente. Cuando un jugador gana, se muestra una ventana indicando el nombre del jugador ganador y la figura que ha usado (círculo o tache). En caso de empate, se muestra una ventana de empate.

![Pantalla panel del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/tictactoePanel.jpg?raw=true)
![Pantalla ganador del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/tictactoeGanador.jpg?raw=true)
![Pantalla empate del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/tictactoeEmpate.jpg?raw=true)

El juego también lleva un registro de los puntos de cada jugador. 
![Pantalla puntaje del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/tictactoePuntaje.jpg?raw=true)

Tras determinar el ganador o un empate, se presenta una ventana con dos botones: uno para comenzar otra partida y otro para salir del juego, pero este botón te regresa a la pantalla principal donde el jugador tiene que ingresar sus nombres. Si se desea salir completamente del juego, desde la ventana inicial se tiene que salir, dando clicl en el botón de la equis.


## Juego del ahorcado

**Descripción del Juego:** 
El tradicional "juego del ahorcado" es un juego de palabras en el que el jugador debe adivinar una palabra oculta, letra por letra. Si comete un error, se acerca a "ahorcarse", pero si acierta todas las letras, evita la ejecución. Este juego incluye cuatro grupos de palabras: *tabla periódica, colores, animales y países*. El jugador cuenta con 5 vidas, y al agotarlas, se muestra un mensaje de "juego terminado" y se reinicia el juego automáticamente.
El jugador puede ingresar directamente la letra, ya que el juego está programado para que, al iniciarse y cada vez que se verifica, el cuadro de texto esté listo para recibir una letra. 
Si el jugador desea otra palabra, puede utilizar el botón de "nuevo", que reinicia el juego y selecciona una nueva palabra de un grupo diferente.

![Pantalla principal del juego](https://github.com/Alejandraglezjaime/Juegos-en-Java/blob/master/assets/juegoDelAhorcado.jpg?raw=true)
