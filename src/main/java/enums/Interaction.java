package enums;

public enum Interaction {
    HELP("Help"),
    ABOUT_WIKIPEDIA("About Wikipedia"),
    COMMUNITY_PORTAL("Community portal"),
    RECENT_CHANGES("Recent changes"),
    CONTANCT_PAGE("Contact page");

    private String value;

    Interaction(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
