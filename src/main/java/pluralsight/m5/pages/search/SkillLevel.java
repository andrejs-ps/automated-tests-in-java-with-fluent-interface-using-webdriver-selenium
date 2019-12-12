package pluralsight.m5.pages.search;

public enum SkillLevel {

    BEGINNER("Beginner"), INTERMEDIATE("Intermediate"), ADVANCED("Advanced");

    private String value;

    SkillLevel(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }


}
