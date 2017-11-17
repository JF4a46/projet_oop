DROP TABLE categorie;
DROP TABLE voiture;
DROP TABLE client;
DROP TABLE location;
DROP TABLE facturation;
DROP TABLE facturation_client;

CREATE TABLE categorie (
    id INTEGER PRIMARY KEY,
    description varchar(50),
    prix_jour DECIMAL(10,2)
);

CREATE TABLE voiture(
    id INTEGER PRIMARY KEY,
    categorie_id INTEGER,
    kilometrage INTEGER,
    description varchar(20),
    automatique BOOLEAN,
    disponible BOOLEAN,
    FOREIGN KEY(categorie_id) REFERENCES categorie(id)
);

CREATE TABLE client(
    id INTEGER PRIMARY KEY,
    nom varchar(25),
    prenom varchar(25),
    telephone_maison varchar(25),
    cellulaire varchar(25),
    telephone_bureau varchar(25),
    date_naissance date,
    courriel varchar(50),
    adresse varchar(100),
    permis_conduire varchar(25),
    classe_conduite varchar(5),
    programme_point BOOLEAN
);

CREATE TABLE location(
    numero_location INTEGER PRIMARY KEY,
    id_client INTEGER,
    id_voiture INTEGER,
    date_arrivee DATE,
    date_retour DATE,
    assurances BOOLEAN,
    kilometrage_illimite BOOLEAN,
    reservoirPlein BOOLEAN,
    retard BOOLEAN,
    bon_etat BOOLEAN,
    prise_possession BOOLEAN,
    FOREIGN KEY(id_voiture) REFERENCES voiture(id),
    FOREIGN KEY(id_client) REFERENCES client(id)
);

CREATE TABLE facturation(
    numero_transaction INTEGER PRIMARY KEY,
    couts DECIMAL(10,2),
    date_transaction DATE,
    type_paiement INTEGER,
    type_operation_banquaire INTEGER
);

CREATE TABLE facturation_client(
    id_facturation INTEGER,
    id_client INTEGER,
    FOREIGN KEY(id_facturation) REFERENCES facturation(numero_transaction),
    FOREIGN KEY(id_client) REFERENCES client(id)
);