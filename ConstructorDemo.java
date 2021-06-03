class ConstructorDemo {

    private int id;
    private String name;
    private double c;
    
    ConstructorDemo(int id, String name,double c){
        this.id=id;
        this.name=name;
        this.c =c;
    }

    String getinfo(){
        return this.id+" "+ this.name+this.c;
    }
    ConstructorDemo(double c){
        this.c =c;

    }
    Double displaynumber(){
        return c;
    }

}