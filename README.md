# tpassurencequalitelogiciel
## tp0
## Code corrigé de BankAccount.java
| Problème détecté                        | Correction                                                 |
| --------------------------------------- | ---------------------------------------------------------- |
| Taux d’intérêt négatif                  | Rejeté via `IllegalArgumentException` dans le constructeur |
            |
## Code : Matrix.java
| Méthode / Ligne                     | Problème dans les tests unitaires                              | Correction apportée                                            | Raison                                                        |
| ----------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | ------------------------------------------------------------- |
| `set(int i, int j, int value)`      | Provoquait `ArrayIndexOutOfBoundsException` avec i/j invalides | Ajout de `checkIndices(i, j)`                                  | Permet de tester proprement les cas limites (i < 0, i ≥ size) |
| `get(int i, int j)`                 | Même problème que `set()`                                      | Ajout de `checkIndices(i, j)`                                  | Évite les crashs inattendus lors de tests de lecture          |
| `public Matrix(int size)`           | Acceptait `size = 0`, ce qui cassait les tests `toString()`    | Rejette les tailles ≤ 0                                        | Empêche les matrices non valides dans les tests               |
