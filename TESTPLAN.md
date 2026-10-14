# Test Plan: Login OrangeHRM (Serenity BDD)

## Objetivo
Automatizar el login de OrangeHRM Demo con Serenity BDD, Cucumber y Screenplay.

## Entorno
- URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
- Herramientas: Serenity 4.2.32, Cucumber, JUnit 5, Gradle, Chrome, JDK 17.

## Casos
| ID | Escenario | Datos | Resultado esperado |
|---|---|---|---|
| 1 | Login exitoso | Admin / admin123 | Se muestra Dashboard |
| 2 | Login fallido | Admin / incorrecta | Mensaje Invalid credentials |
| 3 | Login fallido | Usuario / admin123 | Mensaje Invalid credentials |

## Arquitectura
- Feature: qué hace el usuario.
- StepDefinitions: conecta frases con tareas.
- Task Login: agrupa interacciones.
- ui: localizadores (Targets).
- Hooks: crea el escenario de actores.
- Runner: suite JUnit 5.

## Criterios
- Salida: 3 escenarios en verde, reporte en `app/target/site/serenity/index.html`.
