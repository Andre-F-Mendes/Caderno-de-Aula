import java.util.ArrayList;

public class Usuario {
    private String login;
    private String nome;
    private ArrayList <Postagem> postagens;

    public Usuario(String login, String nome){
        this.login = login;
        this.nome = nome;
        postagens = new ArrayList<>();
    }
    public String getLogin(){
        return this.login;
    }
    public String getNome(){
        return this.nome;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void posta(String conteudo){
        Postagem novaPostagem = new Postagem(conteudo);
        this.postagens.add(novaPostagem);
    }
    public Postagem getPost(int pos){
        return this.postagens.get(pos);
    }
    public boolean apaga(Postagem p){
        
        if(!this.postagens.contains(p)){
            return false;
        }
        else this.postagens.remove(p); return true;
    }
    public int getTotalPost(){
        return this.postagens.size();
    }
    /* public int buscaPost(String valor){

    } */
}
