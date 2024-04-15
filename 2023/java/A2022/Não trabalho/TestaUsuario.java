public class TestaUsuario{
    public static void main(String[] args) {
        Usuario user = new Usuario("Rklmp", "André");

        user.posta("Coisinhas");
        System.out.println(user.getPost(0));


    }
}