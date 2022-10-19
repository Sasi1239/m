class student2 extends teacher{
      String sname;
      void studying(){
       System.out.println("studying");
}
       public static void main(String[] args)
{
       student2 s=new student2();
       s.teaching();
       s.studying();
}
}

