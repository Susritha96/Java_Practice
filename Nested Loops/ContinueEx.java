class ContinueEx {
   public static void main(String args[]) {
      int [] a = {1, 2, 3, 4, 5,6};
      for(int x : a ) {
         if( x == 3 ) {
            continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}