public enum EnumIDE{
    Java("Eclipse"),
    LangageC("Code Block"),
    Cpp("Visual Studio");

    private static final String editeur;

    //constructeur de l'enum
    EnumIDE(String editeur){this.editeur = editeur;}

    //getter
    public String getEditeur(){return editeur;}

}