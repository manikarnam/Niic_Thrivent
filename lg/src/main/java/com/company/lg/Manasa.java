class Manasa{

int eid;
String name;
String company;
float sal;

Manasa(int e,String n,String c,float s){

eid=e;
name=n;
company=c;
sal=s;


}

void display(){

System.out.println(eid+" "+name+" "+company+" "+sal);
}

public static void main(String[] args){

Manasa m=new Manasa(4458,"ManasaMahalakshmi","Miracle",12000);
Manasa m1=new Manasa(4444,"ManiKaranam","Miracle",10000);
Manasa m2=new Manasa(4456,"satish","Miracle",15000);
Manasa m3=new Manasa(4455,"aruna","Miracle",10000);

m.display();
m1.display();
m2.display();
m3.display();

}
}