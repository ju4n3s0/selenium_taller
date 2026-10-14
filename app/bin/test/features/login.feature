Feature: OrangeHRM Demo

  Scenario Outline: Login exitoso en OrangeHRMDemo
    Given acceso a la pagina de OrangeHRMDemo
    When ingreso nombre de "<usuario>" y "<contraseña>" y doy click en ingresar
    Then valido que haya ingresado

    Examples:
      | usuario | contraseña |
      | Admin   | admin123   |

  Scenario Outline: Login fallido con credenciales invalidas
    Given acceso a la pagina de OrangeHRMDemo
    When ingreso nombre de "<usuario>" y "<contraseña>" y doy click en ingresar
    Then valido que se muestre el mensaje de error "Invalid credentials"

    Examples:
      | usuario | contraseña |
      | Admin   | incorrecta |
      | Usuario | admin123   |
