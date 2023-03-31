<?php
    <form action="enregistrer_utilisateur.php" method="post">
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom"><br>

        <label for="email">Email :</label>
        <input type="email" id="email" name="email"><br>

        <label for="mot_de_passe">Mot de passe :</label>
        <input type="password" id="mot_de_passe" name="mot_de_passe"><br>

        <input type="submit" value="S'enregistrer">
    </form>

?>