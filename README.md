# Accidents-CAI

Proyecto de finalización de curso de Captura y Almacenamiento de Información.

Objetivo: Crear un backend que procese consultas específicas sobre una base de datos de accidentes

Consultas: 
- Accidentes ocurridos entre dos fechas
> <http://localhost:port/accidents?fromDate=2016-02-08T00:00:00&toDate=2016-02-09T00:00:00>

- Condiciones más comunes en los accidentes
> <http://localhost:port/commonconditions>

- Dado un punto geográfico y un radio (en kilómetros), devolver todos los accidentes ocurridos dentro del radio.
> <http://localhost:port/accidentsInRadius?longitude=-84.058723&latitude=39.865147&radiusInKm=10>

- Devolver los cinco 5 puntos más peligrosos (definiendo un determinado radio)
> <http://localhost:port/dangerousPoints?radiusInKm=1.0>

- Obtener la distancia promedio desde el inicio al fin del accidente
> <http://localhost:port/averageDistance>
