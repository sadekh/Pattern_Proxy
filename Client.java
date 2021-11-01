public class Client {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
//Chaque fois que notre client appelle la méthode process(), il verra simplement le traitement et la configuration initiale restera toujours cachée



//Notez que nous appelons la méthode process() deux fois.La partie des paramètres ne se produira qu'une seule fois 
//- lorsque l'objet est initialisé pour la première fois.

//Pour chaque autre appel suivant, ce modèle ignorera la configuration initiale et seul le traitement aura lieu 
