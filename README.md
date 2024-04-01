# JEE_TP2

Durant ce tp on a realise l'installation d'IntelliJ Ultimate. Ensuite, un projet Spring Boot a été créé en utilisant Spring Initializer, avec les dépendances requises telles que JPA, H2, Spring Web et Lombok, afin de faciliter le développement. L'entité JPA "Product" a été creer comprenant les attributs : id (Long), name (String), price (double) et quantity (int)

Par la suite, l'unité de persistance a été configurée dans le fichier application.properties pour utiliser la base de données H2, assurant une connexion correcte et fonctionnelle à la base de données intégrée. Une interface Repository JPA basée sur Spring Data a été créée pour l'entité Product, fournissant une abstraction efficace pour les opérations de base de données. Des tests ont été effectués sur les opérations de gestion de produits, notamment l'ajout, la consultation, la recherche, la mise à jour et la suppression des produits, tous réussis avec succès.

Enfin, une migration réussie de la base de données H2 vers MySQL a été effectuée, garantissant la continuité des opérations avec une base de données plus robuste et évolutive. Dans l'ensemble, l'ensemble des tâches a été mené à bien de manière méthodique et professionnelle, répondant ainsi aux exigences établies et assurant la qualité et la fonctionnalité du projet.

Ces etapes on ete refaites pour chaqu'un des cas de l'hopital ou du User avec ves roles en mettant en oeuvre les annotation @mannytomanny @onetoone @onetomany.
