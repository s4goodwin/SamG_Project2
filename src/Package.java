public class Package {

    String description;
    int weight;
    Package next;

    public Package(String newDescription, int newWeight, Package newNext){
        description = newDescription;
        weight = newWeight;
        next = newNext;
    }

    public String toString(){                                   //why should it be void, when asked to return something?
        return "Package Contents: "+ description +" "+ weight +" ";
    }


}