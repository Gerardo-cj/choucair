## Proyecto Base
Se requiere tener instalado y configurado:
 
-   JAVA 8 
-   MAVEN

Para realizar la ejecución de los features, se deberá identificar los **@Tags** de los **Features** y ejecutar el siguiente comando: 

        Ejecuta todos los Test configurados en el Runnerl
    -   mvn clean verify
    
        Ejecuta los escenarios que tengan la notaación o tag indicada en el parametro "@User" 
    -   mvn clean verify -Dcucumber.options="--tags @Users"


