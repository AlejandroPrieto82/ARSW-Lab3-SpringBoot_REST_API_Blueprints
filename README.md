# ARSW-Lab3-SpringBoot_REST_API_Blueprints
---

## Autor
**Samuel Alejandro Prieto Reyes**

---

# Parte 1 – Ejercicio básico

Para ilustrar el uso del framework Spring se configuró una aplicación de análisis de textos que hace uso de un verificador gramatical con correctores ortográficos en **inglés** y **español**.  
Mediante anotaciones se configuró cuál de los dos se inyecta en el `GrammarChecker`.

### Prueba de funcionamiento English
![Funcionamiento Ingles](/img/image-1.1.png)

### Prueba de funcionamiento Español
![Funcionamiento Espanol](/img/image-1.2.png)

---

# Parte 2 – Ejercicio Blueprints con Spring

En esta parte se configuró la aplicación bajo un esquema de **inyección de dependencias**, siguiendo el diagrama dado en el taller.

---

## Configuración de la aplicación con Spring

![Dependencias Spring En POM](/img/image-2.1.png)  
**Dependencias SPRING en POM**  

![Configuracion de Spring](/img/image-2.0.png)  
**Configuración de Spring**  

![Usando anotaciones para inyectar](/img/image-2.2.png)  
**Inyección con anotaciones**  

---

## Métodos getBluePrint() y getBlueprintsByAuthor()

Se completaron estas operaciones e implementaron en la capa de persistencia `InMemoryBlueprintPersistence`, junto con sus pruebas en `InMemoryPersistenceTest`.

![Metodos getBluePrint() y getBlueprintsByAuthor()](/img/image-2.3.png)  
**Métodos getBluePrint() y getBluePrintsByAuthor()**  

![Test 1](/img/image-2.4.png)  
![Test 2](/img/image-2.5.png)  
![Test 3](/img/image-2.6.png)  

---

## Programa de prueba con BlueprintServices

Se creó un programa que instancia `BlueprintServices` mediante Spring y prueba las operaciones: registrar planos, consultar planos y registrar planos específicos.

![Programa](/img/image-2.7.png)  
**Programa**  

---

## Filtros aplicados a las consultas de planos

Antes de retornar los planos consultados, se inyecta uno de los dos posibles filtros en `BlueprintServices`.  
Se puede intercambiar entre ellos simplemente cambiando la anotación `@Component` en la configuración.

- **(A) Filtrado de redundancias**: elimina puntos consecutivos repetidos.  
- **(B) Filtrado de submuestreo**: elimina uno de cada dos puntos del plano.  

![(A) Filtrado de redundancias](/img/image-2.8.png)  
**(A) Filtrado de redundancias**  

![(B) Filtrado de submuestreo:](/img/image-2.9.png)  
**(B) Filtrado de submuestreo**  

---

## Pruebas de filtros

Se agregaron pruebas para validar el comportamiento de ambos filtros.  
Al cambiar la anotación entre `(A)` o `(B)`, el programa retorna los planos procesados correctamente.

![Test Filtros 1](/img/image-2.10.png)  
**Test filtros 1**  

![Test Filtros 2](/img/image-2.11.png)  
**Test filtros 2**

---
# Obtener el java doc
Ejecutar el siguiente comando dentro de la carpeta ***1.Ejercicio Previo*** o ***2. Ejercicio Rest*** para obtener el java doc correspondiente
```bash
mvn javadoc:javadoc
```

**Ubicacion**  
`target/site/apidocs/index.html`