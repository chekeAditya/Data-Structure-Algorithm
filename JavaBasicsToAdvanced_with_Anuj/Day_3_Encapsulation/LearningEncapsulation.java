package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_3_Encapsulation;

public class LearningEncapsulation {
    public static void main(String[] args) {

        Secret secret = new Secret();
//        secret.data = 10; //here we cannot change its data

        /* If you have to set the data then you can use setData function */
        secret.setData(4);
        /* For Getting the data you can use getData function */
        System.out.println(secret.getData());

    }
}


class Secret {
    private int data; //this data we can't extract it in another class

    /* For accessing this data you have setData & getData function */
    public void setData(int data) {
        // Here we can also add the condition
        if (data >= 100)
            this.data = data;
        else System.out.println("Not Allowed");
    }

    /* For returning the data we can use getData function */
    public int getData() {
        return data;
    }
}
