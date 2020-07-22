class College{
void university(String university1){
System.out.println("University Selected "+university1);
}
void university(String university1,String university2){
System.out.println("Universities Selected "+university1+","+university2);
}
void university(String university1,String university2,String university3){
System.out.println("Universities Selected "+university1+", "+university2+"and "+university3);
}
}
class Student{
public static void main(String args[]){
College susritha = new College();
susritha.university("JNTUH");
susritha.university("JNTUH","KITS");
susritha.university("JNTUH","KITS","NIT");
}
}