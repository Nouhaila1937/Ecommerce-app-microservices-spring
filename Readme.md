Premier microservice
![img.png](img.png)
le /customers c'est le nom de la table donnée par restproperties
![img_1.png](img_1.png)
on ajoute le dossier config parce que lorsqu'on accède http://localhost:8083/customers on n e voit pas l'id 
![img_2.png](img_2.png)
le role de la projection c'est d'afficher les champs  qu'on veut uniquement
http://localhost:8083/customers/1?projection=email
![img_3.png](img_3.png)

2 ème SERVICE
http://localhost:8082/products/1
![img_4.png](img_4.png)

DIscovery service  on voie tout les services qu'on 'a lié
http://localhost:8761/
![img_5.png](img_5.png)


le chemin après configuration de discovery
![img_6.png](img_6.png)
![img_7.png](img_7.png)

partie de routage dynamique
![img_8.png](img_8.png)

