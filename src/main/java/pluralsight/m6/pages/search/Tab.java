package pluralsight.m6.pages.search;

public enum Tab {
    ALL("All"), COURSES("Courses"), BLOG("Blog"), RESOURCES("Resources"), AUTHORS("Authors");


    private String value;

    Tab(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}