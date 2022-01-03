package Basic_To_Advanced_DataStructure.CodingTask.Solid_Principle;

public class Liskovs_Substitution_Principle {

    public void onButtonClick(ClickListener clickListener) {
        //Handling the changes and requirements here would be a wrong place     and an incorrect solution!
        clickListener.onClick();
    }
}

interface ClickListener {
    void onClick();
}


class SampleFragment implements ClickListener {
    @Override
    public void onClick() {
        decrementClickCount();
        //You should manage the logic here!
    }

    public void decrementClickCount() {

    }
}

class TestFragment implements ClickListener {
    @Override
    public void onClick() {
        incrementClickCount();
        //You should manage the logic here!
    }

    private void incrementClickCount() {

    }
}



