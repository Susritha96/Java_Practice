class Sample<X>{
void show(X a){
System.out.println(a);
}
public static void main(String args[]){
Sample<Integer> i = new Sample<Integer>();
i.show(100);
Sample<Float> f = new Sample<Float>();
f.show(2.3f);
Sample<String> s = new Sample<String>();
s.show("hello");
Sample x = new Sample();
x.show(10);
x.show(4.5);
x.show("bye");
}
}