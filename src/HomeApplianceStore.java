class HomeApplianceStore {

    static private String name;
    static private String address ;
    static private Integer  employees;
    public String getname(){
        return name;
    }
    static public String  getaddress(){
        return  address;
    }
    static public Integer getemploees(){
        return  employees;
    }
    static public void  setname(String a){
        name=a;
    }
    static public void  setaddress(String a){
        address=a;
    }
    static public void  setemployees(Integer a){
        employees=a;
    }


    public static void main(String[] argv) {
        try {
            setname(argv[0]);
            setaddress(argv[1]);
            setemployees(Integer.parseInt(argv[2]));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        if (name != null && address != null && employees != null) {
            System.out.println("\nname "+name+"\naddress : "+ address +"\nemployees : "+employees);
        }
    }
}