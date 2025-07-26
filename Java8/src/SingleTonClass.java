public class SingleTonClass {

private static SingleTonClass single_ton = null;

public String s;

private  SingleTonClass(){
    s="I'm singleton class";
}

public static SingleTonClass getSingle_ton(){
    if(single_ton == null){
        single_ton = new SingleTonClass();
    }
    return single_ton;
}

}
class TestSingleTon{
    public static void main(String[] args){
        SingleTonClass x = SingleTonClass.getSingle_ton();
        SingleTonClass y = SingleTonClass.getSingle_ton();
        SingleTonClass z = SingleTonClass.getSingle_ton();
        System.out.println("HashCode of x is "+ x.hashCode());
        System.out.println("HashCode of y is "+ y.hashCode());
        System.out.println("HashCode of z is "+ z.hashCode());
        if( x==y && y==z){
            System.out.println("both are pointing to single memory location");
        }
        else
        {
            System.out.println("both momemoring pointing to some other location");
        }
      //
    }
}