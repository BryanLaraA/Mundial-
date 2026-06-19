package selecciones;
public enum Grupos {
    A("Grupo A"),B("Grupo B"),C("Grupo C"),
    D("Grupo D"),E("Grupo E"),F("Grupo F"),
    G("Grupo G"),H("Grupo H"),I("Grupo I"),
    J("Grupo J"),K("Grupo K"),L("Grupo L");
    private String grupo;
    public String getGrupo(){
        return this.grupo;
    }
    Grupos(String grupo){
        this.grupo=grupo;
    }
}