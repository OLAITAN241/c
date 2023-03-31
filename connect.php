<?php

// connexion à la base de données MySQL
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "contact_base";

$conn = mysqli_connect($servername, $username, $password, $dbname);

// vérification de la connexion
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

// traitement du formulaire d'enregistrement
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $nom = $_POST['nom'];
    $email = $_POST['email'];
    $mot_de_passe = $_POST['mot_de_passe'];

    // requête SQL pour insérer l'utilisateur dans la table "utilisateurs"
    $sql = "INSERT INTO utilisateurs (nom, email, mot_de_passe) VALUES ('$nom', '$email', '$mot_de_passe')";

    if (mysqli_query($conn, $sql)) {
        echo "Enregistrement réussi";
    } else {
        echo "Erreur : " . mysqli_error($conn);
    }
}

// fermeture de la connexion à la base de données
mysqli_close($conn);

?>

<form action="" method="post">
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom"><br>

    <label for="email">Email :</label>
    <input type="email" id="email" name="email"><br>

    <label for="mot_de_passe">Mot de passe :</label>
    <input type="password" id="mot_de_passe" name="mot_de_passe"><br>

    <input type="submit" value="Enregistrer">
</form>
